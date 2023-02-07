import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student=new Student(235979, Arrays.asList(2F,2.5F, 3.5F, 4.5F),"Piotr","Spetany",true);
        Student student2=new Student(236556, Arrays.asList(2F,2.5F, 4F, 4.5F),"Piotr","Szczepan",true);
        Student []students=new Student[2];
        students[0]=student;
        students[1]=student2;
        Student.sort(students);
        for(Student stu: students){
            System.out.println(stu.toString());
        }
    }
}