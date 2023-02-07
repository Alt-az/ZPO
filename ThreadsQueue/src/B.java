import java.util.Random;

public class B extends Thread{
    public void run() {
        Random rand = new Random();
        int a=0;
        int b=0;
        while(true) {
            try {
                synchronized (Kolejka.lock2) {
                    while (Kolejka.Q1.size() < 2) {
                        Kolejka.lock2.wait();
                    }
                }
                synchronized (Kolejka.lock5) {
                    a = Kolejka.Q1.pop();
                    b = Kolejka.Q1.pop();
                }
                synchronized (Kolejka.lock) {
                    Kolejka.lock.notifyAll();
                }
                if (a == 0 && b == 0) {
                    synchronized (Kolejka.lock6) {
                        Kolejka.Q2.add(-1);
                    }
                    return;
                }
                Thread.sleep(rand.nextInt(5) + 1);
                int what = rand.nextInt(3);
                int result = 0;
                switch (what) {
                    case 0:
                        result = a + b;
                        break;
                    case 1:
                        result = a * b;
                        break;
                    case 2:
                        result = a / b;
                        break;
                }
                synchronized (Kolejka.lock3) {
                    while (Kolejka.Q2.size() >= Kolejka.M) {
                        Kolejka.lock3.wait();
                    }
                    synchronized (Kolejka.lock6) {
                        Kolejka.Q2.add(result);
                    }
                }
                synchronized (Kolejka.lock4) {
                    Kolejka.lock4.notifyAll();
                }

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
