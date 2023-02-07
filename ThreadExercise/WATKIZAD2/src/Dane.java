import java.util.concurrent.ThreadPoolExecutor;

public class Dane {
    static char znak;
    static final Object lock;
    static final Object lock2;
    static final Object lock3;
    static final Object lock4;
    static boolean isThere;
    static int liczbaWatkow;

    static ThreadPoolExecutor executor;
    static{
        lock=new Object();
        lock2=new Object();
        lock3=new Object();
        lock4=new Object();
        isThere=false;
        liczbaWatkow=0;
        znak=13;
    }
}
