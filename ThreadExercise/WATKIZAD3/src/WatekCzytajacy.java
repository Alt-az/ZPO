import java.io.*;
import java.util.Random;

public class WatekCzytajacy implements Runnable {

    @Override
    public void run() {
        int watek;
        try {
            BufferedReader br;
            synchronized (Dane.lock3) {
                Dane.liczbaWatkow++;
                watek=Dane.liczbaWatkow;
                System.out.println(Dane.liczbaWatkow);
                File file = new File("src/plik" + Dane.liczbaWatkow + ".txt");
                FileReader fr = null;
                fr = new FileReader(file);
                br = new BufferedReader(fr);
            }
            int i = 0;
            int c = 0;
            Random rand = new Random();
            while (c != -1) {
                synchronized (Dane.lock) {
                    while((c = br.read())!=-1) {
                        synchronized (Dane.lock2) {
                            Dane.lock2.wait();
                            Dane.znak = (char) c;
                            if(c == 13 || c=='\n'){
                                break;
                            }
                            System.out.println(i++ + "     " + c);
                        }
                    }
                }
                Thread.sleep(10L *watek);
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
