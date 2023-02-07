public class Lecturer extends TestClass{
    private String name;
    private String surname;
    private String birthdate;
    private String title;
    private String hireDate;

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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
