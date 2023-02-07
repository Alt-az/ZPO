import java.util.Comparator;

public class KomparatorByGrades implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(StudentByGrades.mean(o1),StudentByGrades.mean(o2));
    }
}
