import java.io.*;

public class WatekPiszacy implements Runnable{
    @Override
    public void run() {
        File file =new File("src/wynik.txt");
        try {
            FileWriter fileWriter=new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            while(Dane.executor.getActiveCount()>1) {
                synchronized (Dane.lock2) {
                    if(Dane.znak!=13 && Dane.znak!=' ' && Dane.znak!='\n'){
                        printWriter.print(Dane.znak);
                        System.out.println("Czyta: " + Dane.znak);
                        Dane.znak=' ';
                        printWriter.flush();
                    }
                    Dane.lock2.notify();
                }
                Thread.sleep(10);
            }
            System.out.println("Czytaj end");
            Dane.executor.shutdown();
            printWriter.close();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
