public class Student extends TestClass{
    private String name;
    private String surname;
    private String birthdate;
    private int []grades;

    private int unaccesable;

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

    public void setUnaccesable(int unaccesable) {
        this.unaccesable = unaccesable;
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

//    public int[] getGrades() {
//        return grades;
//    }
}
