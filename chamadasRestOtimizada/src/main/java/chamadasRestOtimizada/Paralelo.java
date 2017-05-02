package chamadasRestOtimizada;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Emula chamada remota em paralelo usando Java Future.
 * @author Fernando Franzini
 * @version 1.0 -02/05/17
 * @since 02/05/17
 */
public class Paralelo {
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
        
        // Chamadas futuras
        Callable<String> operacao1 = () ->  {return servico1.metodoRemoto();};
        Callable<String> operacao2 = () ->  {return servico2.metodoRemoto();};
        Callable<String> operacao3 = () ->  {return servico3.metodoRemoto();};
        
        //  Pool de threads
        ExecutorService pool = Executors.newFixedThreadPool(3);
        
        // Invocando web services em paralelo
        System.out.println("inicio -" + sdf.format(new Date()));
        Future<String> future1 = pool.submit(operacao1);
        Future<String> future2 = pool.submit(operacao2);
        Future<String> future3 = pool.submit(operacao3);
        try {
            // Coordenando o resultado
            System.out.println("-->" + future1.get());
            System.out.println("-->" + future2.get());
            System.out.println("-->" + future3.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(sdf.format(new Date()));       
    }
}
