import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
    int album;
    String imie;
    String nazwisko;
    List<Double> oceny;
    Obecnosc obecnosc;

    public Student(int album, String imie, String nazwisko, List<Double> oceny, Obecnosc obecnosc) {
        this.album = album;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = oceny;
        this.obecnosc = obecnosc;
    }

    public Student() {

    }

    public Student(int album, String imie, String nazwisko) {
        this.album = album;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny=new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Student{" +
                "album=" + album +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", oceny=" + oceny +
                ", obecnosc=" + obecnosc +
                '}';
    }
    void dodajOcene(Double ocena){
        oceny.add(ocena);
    }

    static void sortujNazwiskiem(List<Student> students){
        //sortowanie nazwiskiem
        students.sort((o1, o2) -> o1.nazwisko.compareTo(o2.nazwisko));
    }
    static void sortujsrednia(List<Student> students){
        //sortowanie srednia
        students.sort((o1, o2) -> Double.compare(Student.srednia(o1), Student.srednia(o2)));
    }
    static void filtrujsrednia(List<Student> students){
        Predicate<Student> filtr = student -> Student.srednia(student) > 4;
        //filtracja studentow powyzej sredniej 4
        students.removeIf(filtr);
    }
    static String[] zamianaNaString(List<Student> students){
        Function<List<Student>,String[]> zamianaNaString = studen -> {
            String [] lista = new String[studen.size()];
            final int[] i = {0};
            studen.forEach(student -> {
                lista[i[0]]=student.toString();
                i[0]++;
            });
            return lista;
        };
        return zamianaNaString.apply(students);
    }
    static void nieobecnoscPrzedzial(int a,int b,List<Student> students){
        //ustawianie nieobecnosci w przedziale
        for(Student student:students.subList(a,b)){
            Student stu = students.get(students.indexOf(student));
            stu.obecnosc = Obecnosc.NIEOBECNY;
            students.set(students.indexOf(student),stu);
        }
    }
    static void dopisaniepiec(List<Student> students){
        Consumer<Student> dopisanie = student -> {
            if(student.obecnosc==Obecnosc.OBECNY){
                student.dodajOcene(5.0);
            }
        };
        students.forEach(dopisanie);
    }
    static double srednia(Student o){
       return o.oceny.stream()
               .mapToDouble(d -> d)
               .average()
               .orElse(0.0);
    }
}
