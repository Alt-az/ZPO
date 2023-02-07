/**
 * klasa do budowania regalu
 */
public class RegalBuilder {
    /**
     * regal
     */
    Regal regal = new Regal();

    /**
     * metoda do dodawania polek
     * @param polka przyjmuje polke
     */
    public void add(Polka polka) {
        regal.polki.add(polka);
    }

    /**
     * @return Regal zwraca regal
     */
    public Regal toRegal() {
        return regal;
    }
}
