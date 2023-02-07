import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws RegalException {
        ArrayList<Student> students=new ArrayList<>();
//        students.add(new Student(235979,"Piotr","Spetany", Arrays.asList(2.0, 3.0, 3.0, 4.0),Obecnosc.OBECNY));
//        students.add(new Student(235887,"Marek","Nowak", Arrays.asList(4.0, 5.0, 3.5, 2.5),Obecnosc.OBECNY));
        students.add(new Student(1, "Jan", "Kowalski"));
        students.add(new Student(2, "Anna", "Nowak"));
        students.add(new Student(3, "Piotr", "Wiśniewski"));
        students.add(new Student(4, "Agnieszka", "Dąbrowska"));
        students.add(new Student(5, "Marcin", "Zieliński"));
        students.get(0).dodajOcene(3.0);
        students.get(0).dodajOcene(4.5);
        students.get(0).dodajOcene(5.0);
        students.get(1).dodajOcene(2.5);
        students.get(1).dodajOcene(3.5);
        students.get(2).dodajOcene(4.0);
        students.get(2).dodajOcene(4.5);
        students.get(3).dodajOcene(5.0);
        students.get(3).dodajOcene(5.0);
        students.get(4).dodajOcene(2.5);
        students.get(4).dodajOcene(3.0);
        System.out.println(students.toString());
        Student.sortujNazwiskiem(students);
        System.out.println(students.toString());
        Student.sortujsrednia(students);
        System.out.println(students.toString());
        Student.nieobecnoscPrzedzial(0,3,students);
//        students.subList(4,8).forEach(student -> {
//            Student stu = students.get(students.indexOf(student));
//            stu.obecnosc = Obecnosc.NIEOBECNY;
//            students.set(students.indexOf(student),stu);
//        });
        //dopisanie oceny 5 studentom z obecnoscia
        Student.dopisaniepiec(students);
        //zamiana na string
        String [] strings=Student.zamianaNaString(students);
        for(String st:strings){
            System.out.println(st);
        }
        Student.filtrujsrednia(students);
        System.out.println(students);
        Czytelnia<Book> czytelnia=new Czytelnia<>();
        czytelnia.stol.polozKsiazke(new Book());
        czytelnia.stol.polozKsiazke(new Book());
        czytelnia.stol.polozKsiazke(new Book());
        czytelnia.stol.polozKsiazke(new Book());
        czytelnia.stol.polozKsiazke(new Book());
        System.out.println(czytelnia.stol);
        czytelnia.zStolNaPolke();
        System.out.println(czytelnia.regal.polki);
        czytelnia.zPolkiNaStol(0);
        System.out.println(czytelnia.stol);
    }
}