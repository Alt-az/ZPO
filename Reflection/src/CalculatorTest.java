import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void count() throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream("asd".getBytes()));
        InputMismatchException thrown =
            Assertions.assertThrows(InputMismatchException.class,
                    Calculator::Count);
            Assertions.assertEquals("Wrong input",
            thrown.getMessage());
        System.setIn(new ByteArrayInputStream("2 asd 2".getBytes()));
        InputMismatchException thrown2 =
                Assertions.assertThrows(InputMismatchException.class,
                        Calculator::Count);
        Assertions.assertEquals("Wrong input",
                thrown.getMessage());
        System.setIn(new ByteArrayInputStream("2 dziel 0".getBytes()));
        InvocationTargetException thrown3 =
                Assertions.assertThrows(InvocationTargetException.class,
                        Calculator::Count);
        Assertions.assertEquals("Wrong input",
                thrown.getMessage());
        System.setIn(new ByteArrayInputStream("2 plus 2".getBytes()));
        assertEquals(4,Calculator.Count());
        System.setIn(new ByteArrayInputStream("2 minus 2".getBytes()));
        assertEquals(0,Calculator.Count());
        System.setIn(new ByteArrayInputStream("2 razy 2".getBytes()));
        assertEquals(4,Calculator.Count());
        System.setIn(new ByteArrayInputStream("pierwiastek 4".getBytes()));
        assertEquals(2,Calculator.Count());
    }

}