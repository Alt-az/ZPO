@DefaultStudent(name="Jan", surname="Nowak")
public class Student extends TestClass{

    private String name;
    private String surname;
    private String birthdate;
    private int []grades;
    static DefaultStudent s;
    static {
        Class<Student> c=Student.class;
        s=(DefaultStudent)c.getAnnotation(DefaultStudent.class);
    }
    public Student() {
        this.name = s.name();
        this.surname = s.surname();
        this.birthdate = s.birthdate();
        this.grades = s.grades();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}
