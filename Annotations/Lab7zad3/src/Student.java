import java.lang.reflect.Field;
import java.util.*;

public class Student extends TestClass implements Comparable<Student>{

    int indeks;
    @CompareOrder(3)
    List<Float>oceny;
    @CompareOrder(2)
    String imie;
    @CompareOrder(1)
    String nazwisko;
    boolean stacjonarny;
    static HashMap<Integer,Field> fields;
    static List<Integer> keyinorder;
    static{
        fields=new HashMap<>();
        for(Field field: Student.class.getDeclaredFields()){
            if(field.isAnnotationPresent(CompareOrder.class)){
                CompareOrder c=field.getAnnotation(CompareOrder.class);
                fields.put(c.value(),field);
            }
        }
        keyinorder = new ArrayList<>(fields.keySet());
        Collections.sort(keyinorder);
    }
    public Student(int indeks, List<Float> oceny, String imie, String nazwisko, boolean stacjonarny) {
        this.indeks = indeks;
        this.oceny = oceny;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stacjonarny = stacjonarny;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
    private double calculateAverage(List <Float> marks) {
        Float sum = 0F;
        if(!marks.isEmpty()) {
            for (Float mark : marks) {
                sum += mark;
            }
            return sum.doubleValue() / marks.size();
        }
        return sum;
    }
    static void sort(Student[] list){
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j].compareTo(list[j + 1])>0) {
                    Student temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }
    @Override
    public int compareTo(Student o) {
        for(Integer key:keyinorder) {
            Object obj1;
            Object obj2;
            try {
                obj1 = fields.get(key).get(this);
                obj2 = fields.get(key).get(o);
                if(obj1 instanceof String stringValue && obj2 instanceof String stringValue2){
                    if(stringValue.compareTo(stringValue2)!=0){
                        return stringValue.compareTo(stringValue2);
                    }
                }
                else if(obj1 instanceof Integer integerValue && obj2 instanceof Integer integerValue2){
                    if(integerValue.compareTo(integerValue2)!=0){
                        return integerValue.compareTo(integerValue2);
                    }
                }
                else if(obj1 instanceof Boolean booleanValue && obj2 instanceof Boolean booleanValue2){
                    if(booleanValue.compareTo(booleanValue2)!=0){
                        return booleanValue.compareTo(booleanValue2);
                    }
                }
                else if(obj1 instanceof List<?> listValues && obj2 instanceof List<?> listValues2){
                    if(calculateAverage((List<Float>) listValues)!=calculateAverage((List<Float>) listValues2)){
                        if(calculateAverage((List<Float>) listValues)>calculateAverage((List<Float>) listValues2)){
                            return 1;
                        }
                        else {
                            return -1;
                        }
                    }
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return 0;
    }
}
