/**
 * wyjatek klasy polka
 */
public class PolkaException extends Exception {
    /**
     * metoda do wyrzucania wyjatku wraz z wiadomoscia
     * @param message przyjmuje wiadomosc
     */
    public PolkaException(String message) {
        super(message);
    }
}