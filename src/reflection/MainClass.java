package reflection;

import java.lang.reflect.Field;

public class MainClass {

    public static void main(String[] args) {
        ReflectionBean reflectionBean = new ReflectionBean();
        Class<?> class1 = reflectionBean.getClass();
        Field[] field = class1.getFields();
        for (Field field2 : field) {
            System.out.println(field2.toString());
        }
    }

}
