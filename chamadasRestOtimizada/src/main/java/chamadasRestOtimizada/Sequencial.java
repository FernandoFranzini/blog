package chamadasRestOtimizada;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Emula chamada remota sequencial.
 * @author Fernando Franzini
 * @version 1.0 -02/05/17
 * @since 02/05/17
 */
public class Sequencial {
    public static void main(String[] args) {
        // formatados de dadas
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        // Mock de chamada de web services com 5 segundos.
        Rest servico1 = () -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
            }
            return "serviço 1";
        };
        Rest servico2 = () -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
            }
            return "serviço 2";
        };
        Rest servico3 = () -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
            }
            return "serviço 3";
        };

        // Invocando web services sequencial
        System.out.println("inicio -" + sdf.format(new Date()));
        System.out.println("-->" + servico1.metodoRemoto());
        System.out.println("-->" + servico2.metodoRemoto());
        System.out.println("-->" + servico3.metodoRemoto());
        System.out.println("final - " + sdf.format(new Date()));
    }
}
