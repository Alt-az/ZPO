package lab01a;
/**
 * 
 * @author Piotr Spętany
 * 
 * @version 1.0
 *
 */
import java.time.LocalDate;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;
 /**
 * 
 * Kalkulator class used for all kinds of PESEL processing
 *
 */
public class Kalkulator {
	/**
	 * Returns a birthdate calculated from PESEL
	 * @param PESEL is person indentification number
	 * @return date in String
	 */
    static public String okreslDateUrodzenia(String PESEL) {
        String[] numbers = PESEL.split("");
        int miesiac = Integer.parseInt(numbers[2]) * 10 + Integer.parseInt(numbers[3]);
        int rok;
        if (miesiac > 20 && miesiac < 80) {
            miesiac -= 20;
            rok = 2000;
        } else if (miesiac > 80) {
            miesiac -= 80;
            rok = 1800;
        } else {
            rok = 1900;
        }
        int dzien = Integer.parseInt(numbers[4]) * 10 + Integer.parseInt(numbers[5]);
        rok += Integer.parseInt(numbers[0]) * 10 + Integer.parseInt(numbers[1]);
        LocalDate dob = LocalDate.of(rok, miesiac, dzien);
        return dob.toString();
    }
	/**
	 * Returns gender calculated from PESEL
	 * @param PESEL is a person indentification number
	 * @return gender in String
	 */
    static public String okreslPlec(String PESEL) {
        String[] numbers = PESEL.split("");
        int num = Integer.parseInt(numbers[9]);
        if (num % 2 == 0) {
            return "Zenska";
        } else {
            return "Meska";
        }
    }
	/**
	 * Checks if PESEL is correct
	 * @param PESEL is person indentification number
	 * @return boolean if PESEL is correct number true if not false
	 */
    static public boolean sprawdzPesel(String PESEL) throws NullPointerException {
        String[] numbers=PESEL.split("");
        try {
            Long.parseLong(PESEL);
        } catch (Exception ex) {
            throw new NumberFormatException();
        }
        if(numbers.length!=11){
            try {
                throw new IncorrectSizeExeption("Incorrect Size");
            } catch (IncorrectSizeExeption e) {
                throw new RuntimeException(e);
            }
        }
        int sum=0;
        int iloczyn;
        int []check=new int[]{1,3,7,9,1,3,7,9,1,3};
        for(int i=0;i<10;i++){
            iloczyn=Integer.parseInt(numbers[i])*check[i];
            if(iloczyn>=10){
                iloczyn%=10;
            }
            sum+=iloczyn;
        }
        if(sum>=10){
            sum%=10;
        }
        sum=10-sum;
        if(sum!=Integer.parseInt(numbers[10])){
            return false;
        }
        int miesiac = Integer.parseInt(numbers[2]) * 10 + Integer.parseInt(numbers[3]);
        int rok;
        if (miesiac > 20 && miesiac < 80) {
            miesiac -= 20;
            rok = 2000;
        } else if (miesiac > 80) {
            miesiac -= 80;
            rok = 1800;
        } else {
            rok = 1900;
        }
        if (miesiac >= 1 && miesiac <= 12) {
            int dzien = Integer.parseInt(numbers[4]) * 10 + Integer.parseInt(numbers[5]);
            rok += Integer.parseInt(numbers[0]) * 10 + Integer.parseInt(numbers[1]);
            LocalDate dob=LocalDate.of(rok, miesiac, dzien);
            try {
                LocalDate.parse(dob.toString(), ISO_LOCAL_DATE);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        } else {
            return false;
        }
        return true;
    }
}