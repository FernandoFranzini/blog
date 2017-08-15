package sistema;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class MenuBean {

    private String pagina = "home.xhtml";

    public void entrarHome() {
        pagina = "home.xhtml";
    }

    public void entrarCadastro() {
        pagina = "cadastro.xhtml";
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }
}
