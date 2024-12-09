import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();

       Runnable h1 = new AlfanumericoTarea(Tipo.NUMERO);
       Runnable h2 = new AlfanumericoTarea(Tipo.STRING);

       executor.execute(h1);
       executor.execute(h2);
       executor.shutdown();


       
    }
}