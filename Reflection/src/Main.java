import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Student student=new Student();
        student.setBirthdate("13-06-2001");
        student.setName("Piotr");
        student.setSurname("Spetany");
        student.setGrades(new int[]{1,3,4,5});
        System.out.println(student.toString());
        Lecturer lecturer=new Lecturer();
        lecturer.setBirthdate("13-06-2001");
        lecturer.setName("Mariusz");
        lecturer.setSurname("Snyk");
        lecturer.setHireDate("13-11-1988");
        lecturer.setTitle("Prof.dr.hab");
        System.out.println(lecturer.toString());
        System.out.println(Calculator.Count());
    }
}