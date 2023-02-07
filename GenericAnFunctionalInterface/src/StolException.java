/**
 * wyjatek klasy stol
 */
class StolException extends RuntimeException {
    /**
     * metoda do wyrzucania wyjatku wraz z wiadomoscia
     * @param errorMessage
     */
    public StolException(String errorMessage) {
        super(errorMessage);
    }
}
