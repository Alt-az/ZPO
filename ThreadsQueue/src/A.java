import java.util.Random;

public class A extends Thread{
    public void run() {
        Random rand = new Random();
        for(int i=0;i<50;i++){
            try {
                Thread.sleep(rand.nextInt(5) + 1);
                synchronized (Kolejka.lock) {
                    while (Kolejka.Q1.size() >= Kolejka.N) {
                        Kolejka.lock.wait();
                    }
                }
                int a = rand.ints(1, 10).findFirst().getAsInt();
                int b = rand.ints(1, 10).findFirst().getAsInt();
                synchronized (Kolejka.lock5) {
                    Kolejka.Q1.add(a);
                    Kolejka.Q1.add(b);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (Kolejka.lock2) {
                Kolejka.lock2.notifyAll();
            }
        }
        synchronized (Kolejka.lock5) {
            Kolejka.Q1.add(0);
            Kolejka.Q1.add(0);
        }
    }
}
