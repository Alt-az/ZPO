/**
 * klasa czytelnia wedlug wzorca singleton
 */
//<T extends Book> określa że T mogą być jedynie klasa Book i jego dziecmi
public class Czytelnia<T extends Book> {
    /**
     * obiekt klasy stol
     */
    Stol<T> stol;
    /**
     * obiekt klasy regal
     */
    Regal<T> regal;
    //tutaj uzyto <? super T> . Użycie wildcardu <? super T>
    //jest potrzebne, ponieważ metody addAll wymagają, aby elementy dodawane do listy były typu T lub ich podtypu
    void zPolkiNaStol(int index) throws RegalException {
        stol.stol.addAll(regal.pobierzPolke(index).ksiazki);
        regal.pobierzPolke(index).ksiazki.clear();
    }
    void zStolNaPolke(){
        Polka<T> polka=new Polka<T>(50000);
        polka.ksiazki.addAll(stol.stol);
        regal.polki.add(polka);
        stol.stol.clear();
    }
    /**
     * konstruktor domyslny klasy czytelnia
     */
    Czytelnia() {
        stol = new Stol<>(5);
        regal = new Regal<>();
    }
}
