/**
 * klasa Book jest podstawowa ksiazka
 */
public class Book {
    /**
     * String zawierajacy autora
     */
    String author;
    /**
     * String zawierajacy tytul
     */
    String title;
    /**
     * int zawierajacy liczbe stron ksiazki
     */
    int numberOfPages;

    /**
     *
     * @return zwraca autora
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author przyjmuje autora i go dodaje
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return zwraca tytul
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title ustawia tytul
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return zwraca liczbe stron
     */
    public int getNumberOfPages() {
        return numberOfPages;
    }

    /**
     * @param numberOfPages ustawia liczbe stron
     */
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    /**
     * konstruktor ksiazki
     */
    public Book() {
        title = "Zeszyt";
    }

    /**
     * @param author przyjmuje autora
     * @param title przyjmuje tytul
     * @param numberOfPages przyjmuje liczbe stron
     */
    public Book(String author, String title, int numberOfPages) {
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    /**
     * @return zwraca ksiazke w formie stringa
     */
    public String toString() {
        return "| " + author + " | " + title + " | " + numberOfPages + " |";
    }
}
