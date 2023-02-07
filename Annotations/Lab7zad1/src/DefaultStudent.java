import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DefaultStudent {
    String name() default "Piotr";
    String surname() default "Spetany";
    String birthdate() default "13-06-2001";
    int[] grades() default {3,4,5,5};
}
