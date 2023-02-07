import java.util.*;

/**
 * klasa regal zawierajca ksiazki
 */
public class Regal<T extends Book> {

    /**
     * zbior polek
     */
    Set<Polka<T>> polki;

    /**
     * konstruktor regalu
     */
    public Regal() {
        this.polki = new HashSet<>();
    }

    /**
     * metoda do pobierania polki wedlug numberu
     * @param numerPolki  przyjmuje numer polki
     * @return Polka zwraca polke
     * @throws RegalException wyrzuca wyjatek
     */
    public Polka<T> pobierzPolke(int numerPolki) throws RegalException {
        List<Polka<T>> polki = new ArrayList<>(this.polki);
        Polka<T> polka = polki.get(numerPolki);
        if(polka == null) {
            throw new RegalException("Nie ma takiej polki");
        }
        return polka;
    }
}
