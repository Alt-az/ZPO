package lab01a;


import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class PeselAplicationUnitTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void blednyPesel() {
        assertFalse(Kalkulator.sprawdzPesel("01261308516"));
    }

    @Test
    public void sprawdzPesel() {
        assertTrue(Kalkulator.sprawdzPesel("01261308519"));
    }
    @Test
    public void okreslPlecTest() {
        assertEquals(Kalkulator.okreslPlec("01261308519"),"Meska");
    }
    @Test
    public void okreslDateUrodzeniaTest() {
        assertEquals(Kalkulator.okreslDateUrodzenia("01261308519"),"2001-06-13");
    }
    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test(expected=NumberFormatException.class)
    public void sprawdzPeselExeption1() {
        exception.expect(NumberFormatException.class);
        exception.expectMessage("PESEL jest 11 cyfrowa liczba");
        Kalkulator.sprawdzPesel("asd");

    }
    @Rule
    public ExpectedException exception2 = ExpectedException.none();
    @Test(expected=NullPointerException.class)
    public void sprawdzPeselExeption2() {
        exception.expect(NullPointerException.class);
        exception.expectMessage("Pesel jest nullem");
        Kalkulator.sprawdzPesel(null);

    }
}