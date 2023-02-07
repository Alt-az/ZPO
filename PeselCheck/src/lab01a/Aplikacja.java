package lab01a;
/**
 * 
 * @author Piotr Spętany
 * 
 * @version 1.0
 *
 */
import java.util.Scanner;
 /**
 * 
 * Aplikacja class used to keep and process PESEL
 *
 */
public class Aplikacja{
	/**
	 * 
	 * String containing PESEL
	 *
	 */
    String PESEL;
    Aplikacja(){}
	/**
	 * Setter to PESEL
	 * @return true if PESEL is correct false if wrong
	 */
    public boolean pobierzNumer(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj PESEL");
        PESEL = scan.nextLine();
        return Kalkulator.sprawdzPesel(PESEL);
    }
	/**
	 * displays PESEL and processed data
	 */
    public void wyswietlDane(){
        System.out.println("PESEL:" + PESEL + " Data urodzenia:" + Kalkulator.okreslDateUrodzenia(PESEL) + " plec:" + Kalkulator.okreslPlec(PESEL));
    }
}