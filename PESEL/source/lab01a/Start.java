package lab01a;

/**
 * 
 * @author Piotr Spętany
 * 
 * @version 1.0
 *
 */
 /**
 * 
 * Main class Start containing main method
 *
 */
 

public class Start {
	 /**
	 * Main method used to launch program
	 * @param args command line arguments
	 *
	 */
    public static void main(String[] args) {
        Aplikacja app=new Aplikacja();
        if(!app.pobierzNumer()){
            System.out.println("Zly Pesel");
        }
        else{
            app.wyswietlDane();
        }
    }
}