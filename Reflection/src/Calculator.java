import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Calculator {
    static public float plus(float first,float second){
        return first+second;
    }
    static public float minus(float first,float second){
        return first-second;
    }
    static public float razy(float first,float second){
        return first*second;
    }
    static public float dziel(float first,float second){
        if(second==0){
            throw new ArithmeticException("Can't divide by zero");
        }
        return first/second;
    }
    static public float pierwiastek(float first){
        return (float) sqrt(first);
    }
    static public float Count() throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scan = new Scanner(System.in);
        String kalkulation=scan.nextLine();
        Class<?> classByReflection = null;
        try {
            classByReflection = Class.forName("Calculator");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String[] splitted=kalkulation.split(" ");
        if(splitted.length==3 || splitted.length==2) {
            if (kalkulation.contains("plus") || kalkulation.contains("minus") || kalkulation.contains("razy") || kalkulation.contains("dziel")) {
                float firstNum = Float.parseFloat(splitted[0]);
                float secondNum = Float.parseFloat(splitted[2]);
                Method method = classByReflection.getMethod(splitted[1], float.class, float.class);
                return (float) method.invoke(null, firstNum, secondNum);
            } else if (kalkulation.contains("pierwiastek")) {
                float firstNum = Float.parseFloat(splitted[1]);
                Method method = classByReflection.getMethod(splitted[0], float.class);
                return (float) method.invoke(null, firstNum);
            }
        }
        throw new InputMismatchException("Wrong input");
    }
}
