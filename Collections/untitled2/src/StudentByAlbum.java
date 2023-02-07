import java.util.ArrayList;
import java.util.Comparator;

public class StudentByAlbum extends Student implements Comparable<Student> {


    public StudentByAlbum(int numerAlbumu, String imie, String nazwisko, ArrayList<Float> oceny) {
        super(numerAlbumu, imie, nazwisko, oceny);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(numerAlbumu, o.numerAlbumu);
    }

}
