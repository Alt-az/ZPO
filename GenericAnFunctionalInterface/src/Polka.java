
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * klasa polka zawierajca ksiazki
 */
public class Polka<T extends Book> {
    /**
     * Liste zawierajaca ksiazki
     */
    List<T> ksiazki;
    /**
     * maksymalna suma stron książek znajdujących się na półce
     */
    int maxNumberOfPages;

    /**
     * @param maxNumberOfPages maksymalna suma stron książek
     */
    public Polka(int maxNumberOfPages) {
        this.maxNumberOfPages = maxNumberOfPages;
        ksiazki = new ArrayList<>();
    }

    /**
     * metoda do wziecia ksiazki
     * @param index numer ksiazki na polce
     * @return Book zwraca ksiazke
     * @throws PolkaException wyrzuca wyjatek polka
     */
    public T wezKsiazke(Integer index) throws PolkaException {
        int tmp = Objects.requireNonNullElse(index, 0);
        if (tmp < 0 || tmp >= ksiazki.size()) {
            throw new PolkaException("Niedozwolony indeks książki");
        }
        return ksiazki.remove(tmp);
    }

    /**
     * metoda do wziecia ksiazki z polki
     * @return Book zwraca ksiazke
     * @throws PolkaException wyrzuca wyjatek polka
     */
    public T wezKsiazke() throws PolkaException {
        if(ksiazki == null) {
            throw new PolkaException("Półka jest pusta!");
        }
        if (ksiazki.size() < 1) {
            throw new PolkaException("Półka jest pusta!");
        }
        return ksiazki.remove(0);
    }

    /**
     * metoda do polozenia ksiazki na polce
     * @param index numer ksiazki na polce
     * @param book przyjmuje ksiazke
     * @throws PolkaException wyrzuca wyjatek polka
     */
    public void polozKsiazke(Integer index, T book) throws PolkaException {
        int tmp = Objects.requireNonNullElse(index, 0);
        if (ksiazki.stream().mapToInt(Book::getNumberOfPages).sum() + book.getNumberOfPages() > maxNumberOfPages) {
            throw new PolkaException("Przekroczono maksymalna liczbe stron");
        }
        ksiazki.add(tmp, book);
    }

    /**
     * metoda do polozenia ksiazki na polce
     * @param book przyjmuje ksiazke
     * @throws PolkaException wyrzuca wyjatek polka
     */
    public void polozKsiazke(T book) throws PolkaException {
        if (ksiazki.stream().mapToInt(Book::getNumberOfPages).sum() + book.getNumberOfPages() > maxNumberOfPages) {
            throw new PolkaException("Półka jest pełna!");
        }
        ksiazki.add(book);
    }

    /**
     * zmienia polke na stringa
     * @return String
     */
    public String toString() {
        return ksiazki.toString();
    }
}
