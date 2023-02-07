import java.io.*;
import java.util.Random;

public class WatekCzytajacy implements Runnable {

    @Override
    public void run() {
        try {
            BufferedReader br;
            synchronized (Dane.lock3) {
                Dane.liczbaWatkow++;
                System.out.println(Dane.liczbaWatkow);
                File file = new File("src/plik" + Dane.liczbaWatkow + ".txt");
                FileReader fr = null;
                fr = new FileReader(file);
                br = new BufferedReader(fr);
            }
            int i = 0;
            int c = 1;
            Random rand = new Random();
            while (c != -1) {
                try {
                    Thread.sleep(rand.nextInt(10));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (Dane.lock) {
                    while((c = br.read())!=' ' && c!='\n' && c!=13 && c!=-1) {
                        synchronized (Dane.lock2) {
                            Dane.lock2.wait();
                            if (c != 13 && c != -1) {
                                Dane.znak = (char) c;
                                System.out.println(i++ + "     " + c);
                            }
                        }
                    }
                }
            }
            synchronized (Dane.lock3) {
                System.out.println(Dane.liczbaWatkow);
                Dane.liczbaWatkow--;
            }
            System.out.println("Pisz koniec");
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
