
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

/**
 * klasa stol zawierajca ksiazki
 */
public class Stol<T>{
    /**
     * Lifo na ksiazki
     */
    Deque<T> stol;
    /**
     * maksymalna wielkosc stosu
     */
    int M;

    /**
     * konstruktor stolu
     * @param M przyjmuje maksymalna wielkosc stosu
     */
    Stol(int M) {
        stol = new ArrayDeque<>();
        this.M = M;
    }

    /**
     * metoda do kladzenia ksiazke na stole
     * @param book przyjmuje ksizke
     */
    public void polozKsiazke(T book) {
        if (stol.size() == M) {
            throw new StolException("Pelen stol");
        }
        stol.push(book);
    }

    /**
     * metoda do brania ksiazki ze stolu
     * @return Book zwraca ksiazke
     */
    public T wezKsiazke() {
        if (stol.size() == 0) {
            throw new StolException("Pusty stol");
        }
        return stol.pop();
    }

    @Override
    public String toString() {
        return "Stol{" +
                "stol=" + stol +
                ", M=" + M +
                '}';
    }
}
