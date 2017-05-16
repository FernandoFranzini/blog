package javascript;

import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

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
