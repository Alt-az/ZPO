/**
 * wyjatek klasy regal
 */
public class RegalException extends Exception {
    /**
     * metoda do wyrzucania wyjatku wraz z wiadomoscia
     * @param message przyjmuje wiadomosc
     */
    public RegalException(String message) {
        super(message);
    }
}
