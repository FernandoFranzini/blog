package javascript;

import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/**
 * Carrega todo programa swing no arquivo js.
 * @author Fernando Franzini
 * @version 1.0 - 16/05/17
 * @since 16/05/17
 */
public class MainJS {
    public static void main(String[] args) {
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        try {
            engine.eval(new FileReader(MainJS.class.getResource("/javascript/sistema.js").getPath()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
