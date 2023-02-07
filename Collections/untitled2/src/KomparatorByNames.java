import java.util.Comparator;

public class KomparatorByNames implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.nazwisko.compareTo(o2.nazwisko)==0){
            return o1.imie.compareTo(o2.imie);
        }
        else {
            return o1.nazwisko.compareTo(o2.nazwisko);
        }
    }
}
