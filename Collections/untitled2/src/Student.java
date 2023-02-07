import java.util.ArrayList;

public class Student {
    int numerAlbumu;
    String imie;
    String nazwisko;
    ArrayList<Float> oceny;

    public Student(int numerAlbumu, String imie, String nazwisko,ArrayList<Float> oceny) {
        this.numerAlbumu = numerAlbumu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny=oceny;
    }

    public String toString(){
        return imie+" "+nazwisko+" " +numerAlbumu;
    }
    public void dodajOcene(float ocena){
        oceny.add((float) ocena);
    }


}

