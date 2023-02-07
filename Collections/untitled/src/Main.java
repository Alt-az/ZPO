import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.DoubleStream.generate;

public class Main {
    public static void main(String[] args) {
    Random random = new Random();
    WylosowaneLiczby liczby=new WylosowaneLiczby();
    liczby.losuj();
    Arrays.sort(liczby.wylosowane);
    System.out.println(Arrays.toString(liczby.wylosowane));
    int[] liczby2=new int[49];
    for(int i=0;i<49;i++){
        liczby2[i]=i+1;
    }
    for(int i=0;i<49;i++){
        int k=random.nextInt(49);
        int u=random.nextInt(49);
        int tmp=liczby2[k];
        liczby2[k]=liczby2[u];
        liczby2[u]=tmp;
    }
    int [] wylosowaneliczby2=new int[6];
    for(int i=0;i< wylosowaneliczby2.length;i++){
        wylosowaneliczby2[i]=liczby2[i];
    }
    Arrays.sort(wylosowaneliczby2);
    System.out.println(Arrays.toString(wylosowaneliczby2));
    List<Integer> liczby3 = new ArrayList<>();
    for(int i=0;i<6;i++){
        liczby3.add(random.nextInt(49) + 1);
    }
    System.out.println(liczby3);
    liczby3.sort(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return Integer.compare(o1,o2);
        }
    });
    System.out.println(liczby3);
    List<String> list = new ArrayList<>();
    Stream.generate(()->new Random().nextInt(49)+1).limit(5).distinct().sorted().forEach(i->System.out.print(i+" "));
    }
}