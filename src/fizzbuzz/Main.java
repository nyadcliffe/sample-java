package fizzbuzz;
import java.lang.reflect.Field;
public class Main {
    public static void main(String[] args) {
        Maker maker = new Maker();
        Class<?> class1 = maker.getClass();
        System.out.println(class1.getName());
        Field[] field = class1.getFields();
        for (Field field2 : field) {
            System.out.println(field2.getName());
            System.out.println(field2.toString());
        }
    }

}
