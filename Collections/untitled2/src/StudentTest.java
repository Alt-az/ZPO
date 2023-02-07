import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class StudentTest {
    ArrayList<StudentByAlbum> obecnosci1;
    ArrayList<StudentByAlbum> obecnosci1expected;
    ArrayList<StudentByNames> obecnosci2;
    ArrayList<StudentByNames> obecnosci2expected;
    ArrayList<StudentByGrades> obecnosci3;
    ArrayList<StudentByGrades> obecnosci3expected;
    ArrayList<Student> obecnosci;
    ArrayList<Student> obecnosciexpected;
    @Before
    public void setUp() throws Exception {
        obecnosci1 = new ArrayList<StudentByAlbum>();
        obecnosci1.add(new StudentByAlbum(235979,"Piotr","Spetany",new ArrayList<>(Arrays.asList(4.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosci1.add(new StudentByAlbum(235312,"Marek","Szarek",new ArrayList<>(Arrays.asList(2.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosci1.add(new StudentByAlbum(235123,"Darek","Garek",new ArrayList<>(Arrays.asList(2.5f,3.5f,4.5f,5f,4f,4.5f,3.5f))));
        obecnosci1.add(new StudentByAlbum(235975,"Michal","Garnek",new ArrayList<>(Arrays.asList(3.0f,3f,2f, 3.5f, 4.5f,3f))));
        obecnosci1.add(new StudentByAlbum(235314,"Marcel","Oparek",new ArrayList<>(Arrays.asList(2f,2f,2.5f, 3.5f, 4.5f,5f))));
        obecnosci1.add(new StudentByAlbum(235122,"Dariusz","Torun",new ArrayList<>(Arrays.asList(2.5f,3f,5f,5f,4.5f,4f,2.5f))));
        obecnosci1.add(new StudentByAlbum(235971,"Arek","Wrobel",new ArrayList<>(Arrays.asList(4f,4.5f,5f, 3f, 3f,2.5f))));
        obecnosci1.add(new StudentByAlbum(235974,"Robert","Szpak",new ArrayList<>(Arrays.asList(5f,5f,4f, 2.5f, 3.5f,2.5f))));
        obecnosci1.add(new StudentByAlbum(235316,"Ula","Szczaw",new ArrayList<>(Arrays.asList(2f,5f,4f, 2.5f, 2f,2.5f))));
        obecnosci1.add(new StudentByAlbum(235128,"Ola","Pszczolka",new ArrayList<>(Arrays.asList(2f,2f,2f,5f,4.5f,4f,3.5f))));
        obecnosci1.add(new StudentByAlbum(235125,"Tomasz","Tuba",new ArrayList<>(Arrays.asList(3f,3.5f,4f,5f,3.5f,2.5f,2.5f))));
        obecnosci1expected = new ArrayList<StudentByAlbum>();
        obecnosci1expected.add(new StudentByAlbum(235122,"Dariusz","Torun",new ArrayList<>(Arrays.asList(2.5f,3f,5f,5f,4.5f,4f,2.5f))));
        obecnosci1expected.add(new StudentByAlbum(235123,"Darek","Garek",new ArrayList<>(Arrays.asList(2.5f,3.5f,4.5f,5f,4f,4.5f,3.5f))));
        obecnosci1expected.add(new StudentByAlbum(235125,"Tomasz","Tuba",new ArrayList<>(Arrays.asList(3f,3.5f,4f,5f,3.5f,2.5f,2.5f))));
        obecnosci1expected.add(new StudentByAlbum(235128,"Ola","Pszczolka",new ArrayList<>(Arrays.asList(2f,2f,2f,5f,4.5f,4f,3.5f))));
        obecnosci1expected.add(new StudentByAlbum(235312,"Marek","Szarek",new ArrayList<>(Arrays.asList(2.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosci1expected.add(new StudentByAlbum(235314,"Marcel","Oparek",new ArrayList<>(Arrays.asList(2f,2f,2.5f, 3.5f, 4.5f,5f))));
        obecnosci1expected.add(new StudentByAlbum(235316,"Ula","Szczaw",new ArrayList<>(Arrays.asList(2f,5f,4f, 2.5f, 2f,2.5f))));
        obecnosci1expected.add(new StudentByAlbum(235971,"Arek","Wrobel",new ArrayList<>(Arrays.asList(4f,4.5f,5f, 3f, 3f,2.5f))));
        obecnosci1expected.add(new StudentByAlbum(235974,"Robert","Szpak",new ArrayList<>(Arrays.asList(5f,5f,4f, 2.5f, 3.5f,2.5f))));
        obecnosci1expected.add(new StudentByAlbum(235975,"Michal","Garnek",new ArrayList<>(Arrays.asList(3.0f,3f,2f, 3.5f, 4.5f,3f))));
        obecnosci1expected.add(new StudentByAlbum(235979,"Piotr","Spetany",new ArrayList<>(Arrays.asList(4.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosci2 = new ArrayList<StudentByNames>();
        obecnosci2.add(new StudentByNames(235979,"Piotr","Spetany",new ArrayList<>(Arrays.asList(4.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosci2.add(new StudentByNames(235312,"Marek","Szarek",new ArrayList<>(Arrays.asList(2.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosci2.add(new StudentByNames(235123,"Darek","Garek",new ArrayList<>(Arrays.asList(2.5f,3.5f,4.5f,5f,4f,4.5f,3.5f))));
        obecnosci2.add(new StudentByNames(235975,"Michal","Garnek",new ArrayList<>(Arrays.asList(3.0f,3f,2f, 3.5f, 4.5f,3f))));
        obecnosci2.add(new StudentByNames(235314,"Marcel","Oparek",new ArrayList<>(Arrays.asList(2f,2f,2.5f, 3.5f, 4.5f,5f))));
        obecnosci2.add(new StudentByNames(235122,"Dariusz","Torun",new ArrayList<>(Arrays.asList(2.5f,3f,5f,5f,4.5f,4f,2.5f))));
        obecnosci2.add(new StudentByNames(235971,"Arek","Wrobel",new ArrayList<>(Arrays.asList(4f,4.5f,5f, 3f, 3f,2.5f))));
        obecnosci2.add(new StudentByNames(235974,"Robert","Szpak",new ArrayList<>(Arrays.asList(5f,5f,4f, 2.5f, 3.5f,2.5f))));
        obecnosci2.add(new StudentByNames(235316,"Ula","Szczaw",new ArrayList<>(Arrays.asList(2f,5f,4f, 2.5f, 2f,2.5f))));
        obecnosci2.add(new StudentByNames(235128,"Ola","Pszczolka",new ArrayList<>(Arrays.asList(2f,2f,2f,5f,4.5f,4f,3.5f))));
        obecnosci2.add(new StudentByNames(235125,"Tomasz","Tuba",new ArrayList<>(Arrays.asList(3f,3.5f,4f,5f,3.5f,2.5f,2.5f))));
        obecnosci2expected = new ArrayList<StudentByNames>();
        obecnosci2expected.add(new StudentByNames(235123,"Darek","Garek",new ArrayList<>(Arrays.asList(2.5f,3.5f,4.5f,5f,4f,4.5f,3.5f))));
        obecnosci2expected.add(new StudentByNames(235975,"Michal","Garnek",new ArrayList<>(Arrays.asList(3.0f,3f,2f, 3.5f, 4.5f,3f))));
        obecnosci2expected.add(new StudentByNames(235314,"Marcel","Oparek",new ArrayList<>(Arrays.asList(2f,2f,2.5f, 3.5f, 4.5f,5f))));
        obecnosci2expected.add(new StudentByNames(235128,"Ola","Pszczolka",new ArrayList<>(Arrays.asList(2f,2f,2f,5f,4.5f,4f,3.5f))));
        obecnosci2expected.add(new StudentByNames(235979,"Piotr","Spetany",new ArrayList<>(Arrays.asList(4.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosci2expected.add(new StudentByNames(235312,"Marek","Szarek",new ArrayList<>(Arrays.asList(2.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosci2expected.add(new StudentByNames(235316,"Ula","Szczaw",new ArrayList<>(Arrays.asList(2f,5f,4f, 2.5f, 2f,2.5f))));
        obecnosci2expected.add(new StudentByNames(235974,"Robert","Szpak",new ArrayList<>(Arrays.asList(5f,5f,4f, 2.5f, 3.5f,2.5f))));
        obecnosci2expected.add(new StudentByNames(235122,"Dariusz","Torun",new ArrayList<>(Arrays.asList(2.5f,3f,5f,5f,4.5f,4f,2.5f))));
        obecnosci2expected.add(new StudentByNames(235125,"Tomasz","Tuba",new ArrayList<>(Arrays.asList(3f,3.5f,4f,5f,3.5f,2.5f,2.5f))));
        obecnosci2expected.add(new StudentByNames(235971,"Arek","Wrobel",new ArrayList<>(Arrays.asList(4f,4.5f,5f, 3f, 3f,2.5f))));
        obecnosci3 = new ArrayList<StudentByGrades>();
        obecnosci3.add(new StudentByGrades(235979,"Piotr","Spetany",new ArrayList<>(Arrays.asList(4.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosci3.add(new StudentByGrades(235312,"Marek","Szarek",new ArrayList<>(Arrays.asList(2.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosci3.add(new StudentByGrades(235123,"Darek","Garek",new ArrayList<>(Arrays.asList(2.5f,3.5f,4.5f,5f,4f,4.5f,3.5f))));
        obecnosci3.add(new StudentByGrades(235975,"Michal","Garnek",new ArrayList<>(Arrays.asList(3.0f,3f,2f, 3.5f, 4.5f,3f))));
        obecnosci3.add(new StudentByGrades(235314,"Marcel","Oparek",new ArrayList<>(Arrays.asList(2f,2f,2.5f, 3.5f, 4.5f,5f))));
        obecnosci3.add(new StudentByGrades(235122,"Dariusz","Torun",new ArrayList<>(Arrays.asList(2.5f,3f,5f,5f,4.5f,4f,2.5f))));
        obecnosci3.add(new StudentByGrades(235971,"Arek","Wrobel",new ArrayList<>(Arrays.asList(4f,4.5f,5f, 3f, 3f,2.5f))));
        obecnosci3.add(new StudentByGrades(235974,"Robert","Szpak",new ArrayList<>(Arrays.asList(5f,5f,4f, 2.5f, 3.5f,2.5f))));
        obecnosci3.add(new StudentByGrades(235316,"Ula","Szczaw",new ArrayList<>(Arrays.asList(2f,5f,4f, 2.5f, 2f,2.5f))));
        obecnosci3.add(new StudentByGrades(235128,"Ola","Pszczolka",new ArrayList<>(Arrays.asList(2f,2f,2f,5f,4.5f,4f,3.5f))));
        obecnosci3.add(new StudentByGrades(235125,"Tomasz","Tuba",new ArrayList<>(Arrays.asList(3f,3.5f,4f,5f,3.5f,2.5f,2.5f))));
        obecnosci3expected = new ArrayList<StudentByGrades>();
        obecnosci3expected.add(new StudentByGrades(235316,"Ula","Szczaw",new ArrayList<>(Arrays.asList(2f,5f,4f, 2.5f, 2f,2.5f))));
        obecnosci3expected.add(new StudentByGrades(235975,"Michal","Garnek",new ArrayList<>(Arrays.asList(3.0f,3f,2f, 3.5f, 4.5f,3f))));
        obecnosci3expected.add(new StudentByGrades(235314,"Marcel","Oparek",new ArrayList<>(Arrays.asList(2f,2f,2.5f, 3.5f, 4.5f,5f))));
        obecnosci3expected.add(new StudentByGrades(235128,"Ola","Pszczolka",new ArrayList<>(Arrays.asList(2f,2f,2f,5f,4.5f,4f,3.5f))));
        obecnosci3expected.add(new StudentByGrades(235125,"Tomasz","Tuba",new ArrayList<>(Arrays.asList(3f,3.5f,4f,5f,3.5f,2.5f,2.5f))));
        obecnosci3expected.add(new StudentByGrades(235312,"Marek","Szarek",new ArrayList<>(Arrays.asList(2.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosci3expected.add(new StudentByGrades(235971,"Arek","Wrobel",new ArrayList<>(Arrays.asList(4f,4.5f,5f, 3f, 3f,2.5f))));
        obecnosci3expected.add(new StudentByGrades(235974,"Robert","Szpak",new ArrayList<>(Arrays.asList(5f,5f,4f, 2.5f, 3.5f,2.5f))));
        obecnosci3expected.add(new StudentByGrades(235122,"Dariusz","Torun",new ArrayList<>(Arrays.asList(2.5f,3f,5f,5f,4.5f,4f,2.5f))));
        obecnosci3expected.add(new StudentByGrades(235979,"Piotr","Spetany",new ArrayList<>(Arrays.asList(4.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosci3expected.add(new StudentByGrades(235123,"Darek","Garek",new ArrayList<>(Arrays.asList(2.5f,3.5f,4.5f,5f,4f,4.5f,3.5f))));
        obecnosci = new ArrayList<Student>();
        obecnosci.add(new Student(235979,"Piotr","Spetany",new ArrayList<>(Arrays.asList(4.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosci.add(new Student(235312,"Marek","Szarek",new ArrayList<>(Arrays.asList(2.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosci.add(new Student(235123,"Darek","Garek",new ArrayList<>(Arrays.asList(2.5f,3.5f,4.5f,5f,4f,4.5f,3.5f))));
        obecnosci.add(new Student(235975,"Michal","Garnek",new ArrayList<>(Arrays.asList(3.0f,3f,2f, 3.5f, 4.5f,3f))));
        obecnosci.add(new Student(235314,"Marcel","Oparek",new ArrayList<>(Arrays.asList(2f,2f,2.5f, 3.5f, 4.5f,5f))));
        obecnosci.add(new Student(235122,"Dariusz","Torun",new ArrayList<>(Arrays.asList(2.5f,3f,5f,5f,4.5f,4f,2.5f))));
        obecnosci.add(new Student(235971,"Arek","Wrobel",new ArrayList<>(Arrays.asList(4f,4.5f,5f, 3f, 3f,2.5f))));
        obecnosci.add(new Student(235974,"Robert","Szpak",new ArrayList<>(Arrays.asList(5f,5f,4f, 2.5f, 3.5f,2.5f))));
        obecnosci.add(new Student(235316,"Ula","Szczaw",new ArrayList<>(Arrays.asList(2f,5f,4f, 2.5f, 2f,2.5f))));
        obecnosci.add(new Student(235128,"Ola","Pszczolka",new ArrayList<>(Arrays.asList(2f,2f,2f,5f,4.5f,4f,3.5f))));
        obecnosci.add(new Student(235125,"Tomasz","Tuba",new ArrayList<>(Arrays.asList(3f,3.5f,4f,5f,3.5f,2.5f,2.5f))));
        obecnosciexpected = new ArrayList<Student>();
        obecnosciexpected.add(new Student(235123,"Darek","Garek",new ArrayList<>(Arrays.asList(2.5f,3.5f,4.5f,5f,4f,4.5f,3.5f))));
        obecnosciexpected.add(new Student(235975,"Michal","Garnek",new ArrayList<>(Arrays.asList(3.0f,3f,2f, 3.5f, 4.5f,3f))));
        obecnosciexpected.add(new Student(235314,"Marcel","Oparek",new ArrayList<>(Arrays.asList(2f,2f,2.5f, 3.5f, 4.5f,5f))));
        obecnosciexpected.add(new Student(235128,"Ola","Pszczolka",new ArrayList<>(Arrays.asList(2f,2f,2f,5f,4.5f,4f,3.5f))));
        obecnosciexpected.add(new Student(235979,"Piotr","Spetany",new ArrayList<>(Arrays.asList(4.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosciexpected.add(new Student(235312,"Marek","Szarek",new ArrayList<>(Arrays.asList(2.5f,5f,4.5f, 3.5f, 3f,2.5f))));
        obecnosciexpected.add(new Student(235316,"Ula","Szczaw",new ArrayList<>(Arrays.asList(2f,5f,4f, 2.5f, 2f,2.5f))));
        obecnosciexpected.add(new Student(235974,"Robert","Szpak",new ArrayList<>(Arrays.asList(5f,5f,4f, 2.5f, 3.5f,2.5f))));
        obecnosciexpected.add(new Student(235122,"Dariusz","Torun",new ArrayList<>(Arrays.asList(2.5f,3f,5f,5f,4.5f,4f,2.5f))));
        obecnosciexpected.add(new Student(235125,"Tomasz","Tuba",new ArrayList<>(Arrays.asList(3f,3.5f,4f,5f,3.5f,2.5f,2.5f))));
        obecnosciexpected.add(new Student(235971,"Arek","Wrobel",new ArrayList<>(Arrays.asList(4f,4.5f,5f, 3f, 3f,2.5f))));
    }

    @Test
    public void Method1Test() {
        Collections.sort(obecnosci1);
        for(int i=0;i< (obecnosci1.size() - 1);i++){
            assertEquals(obecnosci1.get(i).compareTo(obecnosci1.get(i+1)),-1);
        }
        Collections.sort(obecnosci2);
        for(int i=0;i< (obecnosci2.size() - 1);i++){
            assertEquals(obecnosci2.get(i).compareTo(obecnosci2expected.get(i)),0);
        }
        Collections.sort(obecnosci3);
        for(int i=0;i< (obecnosci3.size() - 1);i++){
            assertEquals(obecnosci3.get(i).compareTo(obecnosci3.get(i+1)),-1);
        }
        assertEquals(obecnosci1.get(0).compareTo(obecnosci1expected.get(0)),0);
        assertEquals(obecnosci1.get(1).compareTo(obecnosci1expected.get(0)),1);
        assertEquals(obecnosci1.get(0).compareTo(obecnosci1expected.get(1)),-1);
        assertEquals(obecnosci2.get(0).compareTo(obecnosci2expected.get(0)),0);
        assertEquals(obecnosci2.get(1).compareTo(obecnosci2expected.get(0)),9);
        assertEquals(obecnosci2.get(0).compareTo(obecnosci2expected.get(1)),-9);
        assertEquals(obecnosci3.get(0).compareTo(obecnosci3expected.get(0)),0);
        assertEquals(obecnosci3.get(1).compareTo(obecnosci3expected.get(0)),1);
        assertEquals(obecnosci3.get(0).compareTo(obecnosci3expected.get(1)),-1);
    }
    @Test
    public void Method2Test() {
        Collections.sort(obecnosci, new KomparatorByAlbum());
        for(int i=0;i< (obecnosci.size() - 1);i++){
            assertEquals(new KomparatorByAlbum().compare(obecnosci.get(i),obecnosci.get(i+1)),-1);
        }
        assertEquals(new KomparatorByAlbum().compare(obecnosci.get(0),obecnosci.get(0)),0);
        assertEquals(new KomparatorByAlbum().compare(obecnosci.get(1),obecnosci.get(0)),1);
        assertEquals(new KomparatorByAlbum().compare(obecnosci.get(0),obecnosci.get(1)),-1);
        Collections.sort(obecnosci,new KomparatorByNames());
        assertEquals(new KomparatorByNames().compare(obecnosci.get(0),obecnosciexpected.get(0)),0);
        assertEquals(new KomparatorByNames().compare(obecnosci.get(1),obecnosciexpected.get(0)),9);
        assertEquals(new KomparatorByNames().compare(obecnosci.get(0),obecnosciexpected.get(1)),-9);
        for(int i=0;i< (obecnosci.size() - 1);i++){
            assertEquals(new KomparatorByNames().compare(obecnosci.get(i),obecnosciexpected.get(i)),0);
        }
        Collections.sort(obecnosci,new KomparatorByGrades());
        for(int i=0;i< (obecnosci.size() - 1);i++){
            assertEquals(new KomparatorByGrades().compare(obecnosci.get(i),obecnosci.get(i+1)),-1);
        }
        assertEquals(new KomparatorByGrades().compare(obecnosci.get(0),obecnosci.get(0)),0);
        assertEquals(new KomparatorByGrades().compare(obecnosci.get(1),obecnosci.get(0)),1);
        assertEquals(new KomparatorByGrades().compare(obecnosci.get(0),obecnosci.get(1)),-1);
    }
    @Test
    public void Method3Test() {
        Collections.sort(obecnosci,(Student o1, Student o2)->Integer.compare(o1.numerAlbumu, o2.numerAlbumu));
        assertEquals(new KomparatorByAlbum().compare(obecnosci.get(0),obecnosci.get(0)),0);
        assertEquals(new KomparatorByAlbum().compare(obecnosci.get(1),obecnosci.get(0)),1);
        assertEquals(new KomparatorByAlbum().compare(obecnosci.get(0),obecnosci.get(1)),-1);
        for(int i=0;i< (obecnosci.size() - 1);i++){
            assertEquals(new KomparatorByAlbum().compare(obecnosci.get(i),obecnosci.get(i+1)),-1);
        }
        Collections.sort(obecnosci,(Student o1, Student o2)-> {
            if(o1.nazwisko.compareTo(o2.nazwisko)==0){
                return o1.imie.compareTo(o2.imie);
            }
            else {
                return o1.nazwisko.compareTo(o2.nazwisko);
            }
        });
        assertEquals(new KomparatorByNames().compare(obecnosci.get(0),obecnosciexpected.get(0)),0);
        assertEquals(new KomparatorByNames().compare(obecnosci.get(1),obecnosciexpected.get(0)),9);
        assertEquals(new KomparatorByNames().compare(obecnosci.get(0),obecnosciexpected.get(1)),-9);
        for(int i=0;i< (obecnosci.size() - 1);i++){
            assertEquals(new KomparatorByNames().compare(obecnosci.get(i),obecnosciexpected.get(i)),0);
        }
        Collections.sort(obecnosci,(Student o1, Student o2)->Float.compare(StudentByGrades.mean(o1),StudentByGrades.mean(o2)));
        assertEquals(new KomparatorByGrades().compare(obecnosci.get(0),obecnosci.get(0)),0);
        assertEquals(new KomparatorByGrades().compare(obecnosci.get(1),obecnosci.get(0)),1);
        assertEquals(new KomparatorByGrades().compare(obecnosci.get(0),obecnosci.get(1)),-1);
        for(int i=0;i< (obecnosci.size() - 1);i++){
            assertEquals(new KomparatorByGrades().compare(obecnosci.get(i),obecnosci.get(i+1)),-1);
        }
    }
}