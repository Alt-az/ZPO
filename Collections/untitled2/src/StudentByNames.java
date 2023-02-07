import java.util.ArrayList;
import java.util.Comparator;

public class StudentByNames extends Student implements Comparable<Student> {


    public StudentByNames(int numerAlbumu, String imie, String nazwisko, ArrayList<Float> oceny) {
        super(numerAlbumu, imie, nazwisko, oceny);
    }

    @Override
    public int compareTo(Student o) {
        if(nazwisko.compareTo(o.nazwisko)==0){
            return imie.compareTo(o.imie);
        }
        else {
            return nazwisko.compareTo(o.nazwisko);
        }
    }
}
