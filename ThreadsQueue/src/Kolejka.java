import java.util.*;

public class Kolejka {
    static public Deque<Integer> Q1;
    static public Deque<Integer> Q2;
    static int N;
    static int M;
    public static final class LockThread{};
    static final LockThread lock;
    static final LockThread lock2;
    static final LockThread lock3;
    static final LockThread lock4;
    static final LockThread lock5;
    static final LockThread lock6;
    static boolean flag1;
    static boolean flag2;
    static int turnIsFor;
    static{
        Q1=new ArrayDeque<>();
        Q2=new ArrayDeque<>();
        N=10;
        M=10;
        lock=new LockThread();
        lock2=new LockThread();
        lock3= new LockThread();
        lock4= new LockThread();
        lock5= new LockThread();
        lock6= new LockThread();
        turnIsFor=1;
        flag1=false;
        flag2=false;
    }
}
