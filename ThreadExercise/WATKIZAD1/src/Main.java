import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
        Dane.executor=executor;
        executor.submit(new WatekCzytajacy());
        executor.submit(new WatekCzytajacy());
        executor.submit(new WatekCzytajacy());
        executor.submit(new WatekPiszacy());
    }
}