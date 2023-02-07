import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestClass {
//    public static boolean isGetter(Method method){
//        if(!method.getName().startsWith("get"))      return false;
//        if(method.getParameterTypes().length != 0)   return false;
//        if(void.class.equals(method.getReturnType())) return false;
//        return true;
//    }
//
//    public static boolean isSetter(Method method){
//        if(!method.getName().startsWith("set")) return false;
//        if(method.getParameterTypes().length != 1) return false;
//        return true;
//    }
    public String toString() {
        Class<?> classByReflection = null;
        try {
            classByReflection = Class.forName(this.getClass().getSimpleName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String result= "";
        for (Method method : classByReflection.getDeclaredMethods()) {
            if(method.getName().startsWith("get")){
                try {
                    result=result.concat(method.invoke(this)+"\t");
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return result;
    }

}
