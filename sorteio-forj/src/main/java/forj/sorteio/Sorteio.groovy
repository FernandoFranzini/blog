package forj.sorteio

import javafx.application.Application
import javafx.scene.control.Alert
import javafx.scene.control.Alert.AlertType
import javafx.stage.Stage

/**
 * Faz o sorteio mensal de cursos, usando Groovy e JavaFX.
 * @author Fernando Franzini
 * @version 1.0 - 09/05/17
 * @since 09/05/17
 */
class Sorteio extends Application {

    /**
     * Executa o sorteio mensal.
     * @param args argumentos da jvm.
     */
    static main(args) {
        launch(Sorteio.class, args);
    }

    /**
     * Gera o fonte de dados de participantes.
     * @return lista de participantes.
     */
    def getParticipantes() {
        def pts = []
        pts << new Expando()
        pts << new Expando([nome:"Nome2", email:"nome2gmail.com"])
        pts << new Expando([nome:"Nome3", email:"nome3@gmail.com"])
        pts << new Expando([nome:"Nome4", email:"nome4@gmail.com"])
        pts << new Expando([nome:"Nome5", email:"nome5@gmail.com"])
        pts
    }

    /** {@inheritDoc} */
    @Override
    void start(Stage primaryStage) throws Exception {
        def lista =  getParticipantes()
        def  i = Math.abs(new Random().nextInt() % lista.size())
        println i
        def sortudo  =  lista[i]
        def alert = new Alert(AlertType.INFORMATION)
        alert.title  = "Sorteio FORJ"
        alert.headerText = "Sorteiado foi:"
        alert.contentText = sortudo.nome + " - " + sortudo.email
        alert.showAndWait()
        System.exit(0)
    }
}
