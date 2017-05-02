package chamadasRestOtimizada;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sequencial {
    public static void main(String[] args) {
        // formatados de dadas
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        // Mock de chamada de web services com 5 segundos.
        WebServices servico1 = () -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "serviço 1";
        };
        WebServices servico2 = () -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "serviço 2";
        };
        WebServices servico3 = () -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "serviço 3";
        };
        // Invocando web services sequencial
        System.out.println("inicio -" + sdf.format(new Date()));
        System.out.println("-->" + servico1.metodoRemoto());
        System.out.println("-->" + servico2.metodoRemoto());
        System.out.println("-->" + servico3.metodoRemoto());
        System.out.println(sdf.format(new Date()));
    }
}
