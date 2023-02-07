import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    WylosowaneLiczby liczby=new WylosowaneLiczby();
    int [] wylosowaneliczby2=new int[6];
    List<Integer> liczby3 = new ArrayList<>();
    List<Integer> liczby4=new ArrayList<>();
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        liczby.losuj();
        Arrays.sort(liczby.wylosowane);
        Random random = new Random();
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
        for(int i=0;i< wylosowaneliczby2.length;i++){
            wylosowaneliczby2[i]=liczby2[i];
        }
        Arrays.sort(wylosowaneliczby2);
        for(int i=0;i<6;i++){
            liczby3.add(random.nextInt(49) + 1);
        }
        liczby3.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        });
        liczby4=Stream.generate(()->new Random().nextInt(49)+1).limit(5).distinct().sorted().collect(Collectors.toList());
    }
    @org.junit.jupiter.api.Test
    void method1test() {
        for(int i=0;i< (liczby.wylosowane.length - 1);i++){
            assertTrue(liczby.wylosowane[i]<liczby.wylosowane[i+1]);
        }
        for(int i=0;i<liczby.wylosowane.length;i++){
            assertTrue(liczby.wylosowane[i]>0 && liczby.wylosowane[i]<50);
            for (int j = i-1; j >= 0; j--) {
                assertNotEquals(liczby.wylosowane[i],liczby.wylosowane[j]);
            }
        }
    }
    @org.junit.jupiter.api.Test
    void method2test() {
        for(int i=0;i< (wylosowaneliczby2.length - 1);i++){
            assertTrue(wylosowaneliczby2[i]<wylosowaneliczby2[i+1]);
        }
        for(int i=0;i<wylosowaneliczby2.length;i++){
            assertTrue(wylosowaneliczby2[i]>0 && wylosowaneliczby2[i]<50);
            for (int j = i-1; j >= 0; j--) {
                assertNotEquals(wylosowaneliczby2[i],wylosowaneliczby2[j]);
            }
        }
    }
    @org.junit.jupiter.api.Test
    void method3test() {
        for(int i=0;i< (liczby3.size() - 1);i++){
            assertTrue(liczby3.get(i)<liczby3.get(i+1));
        }
        for(int i=0;i<liczby3.size();i++){
            assertTrue(liczby3.get(i)>0 && liczby3.get(i)<50);
            for (int j = i-1; j >= 0; j--) {
                assertNotEquals(liczby3.get(i),liczby3.get(j));
            }
        }
    }
    @org.junit.jupiter.api.Test
    void method4test() {
        for(int i=0;i< (liczby4.size() - 1);i++){
            assertTrue(liczby4.get(i)<liczby4.get(i+1));
        }
        for(int i=0;i<liczby4.size();i++){
            assertTrue(liczby4.get(i)>0 && liczby4.get(i)<50);
            for (int j = i-1; j >= 0; j--) {
                assertNotEquals(liczby4.get(i),liczby4.get(j));
            }
        }
    }
}