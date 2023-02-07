import java.util.ArrayList;
import java.util.Comparator;

public class StudentByGrades extends Student implements Comparable<Student> {

    public StudentByGrades(int numerAlbumu, String imie, String nazwisko, ArrayList<Float> oceny) {
        super(numerAlbumu, imie, nazwisko, oceny);
    }

    static public float mean(Student st){
        float suma=0;
        for(float num:st.oceny){
            suma+=num;
        }
        return (suma/st.oceny.size());
    }

    @Override
    public int compareTo(Student o) {
        return Float.compare(mean(this),mean(o));
    }
}
