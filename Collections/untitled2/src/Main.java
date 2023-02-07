import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
interface Comparator<Student>{
    public int compare(Student o1, Student o2);
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> obecnosci = new ArrayList<Student>();
        obecnosci.add(new Student(235979,"Piotr","Spetany",new ArrayList<>(Arrays.asList(4.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosci.add(new Student(235312,"Marek","Szarek",new ArrayList<>(Arrays.asList(2.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosci.add(new Student(235123,"Darek","Garek",new ArrayList<>(Arrays.asList(2.5f,3.5f,4.5f,5f,4f,4.5f,3.5f))));

        Collections.sort(obecnosci,(Student o1, Student o2)->Integer.compare(o1.numerAlbumu, o2.numerAlbumu));
        Collections.sort(obecnosci,(Student o1, Student o2)->Float.compare(StudentByGrades.mean(o1),StudentByGrades.mean(o2)));
        Collections.sort(obecnosci,(Student o1, Student o2)-> {
            if(o1.nazwisko.compareTo(o2.nazwisko)==0){
                return o1.imie.compareTo(o2.imie);
            }
            else {
                return o1.nazwisko.compareTo(o2.nazwisko);
            }
        });
    }
}