import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Student extends TestClass{

    @IgnoreEquals
    int indeks;
    @IgnoreEquals
    List<Float> oceny;
    String imie;
    String nazwisko;
    @IgnoreEquals
    String stopien_studiow;
    static List<Field> fields;
    static{
        fields=new ArrayList<>();
        for(Field field: Student.class.getDeclaredFields()){
            if(!field.isAnnotationPresent(IgnoreEquals.class)){
                fields.add(field);
            }
        }
    }
    public Student(int indeks, List<Float> oceny, String imie, String nazwisko, String stopien_studiow) {
        this.indeks = indeks;
        this.oceny = oceny;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stopien_studiow = stopien_studiow;
    }
    public Student() {
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        List<Boolean> result=new ArrayList<>();
        for(Field field:fields){
            try {
                result.add(field.get(this).equals(field.get(o)));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return !result.contains(false);
    }
}
