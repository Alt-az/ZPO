import java.util.Random;

public class C extends Thread{
    public void run() {
        Random rand = new Random();
        int a=0;
        while(true) {
            try {
                Thread.sleep(rand.nextInt(5) + 1);
                synchronized (Kolejka.lock4) {
                    while (Kolejka.Q2.isEmpty()) {
                        Kolejka.lock4.wait();
                    }
                }
                synchronized (Kolejka.lock6) {
                    a = Kolejka.Q2.pop();
                }
                synchronized (Kolejka.lock3) {
                    Kolejka.lock3.notifyAll();
                }
                if (a == -1) {
                    return;
                }
                System.out.println(a);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
