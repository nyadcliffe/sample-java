package fizzbuzz;

import static org.junit.Assert.fail;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.Test;

public class MakerTest {

    @Test
    public void test() {
        Maker maker = new Maker();
        Class<?> class1 = maker.getClass();
        Method method = null;
        try {
            method = class1.getDeclaredMethod("execute", new Class[]{int.class});
        } catch (SecurityException e1) {
            fail();
            e1.printStackTrace();
        } catch (NoSuchMethodException e1) {
            e1.printStackTrace();
            fail();
        }
        for (int i = 1; i < 100; i++) {
            try {
                System.out.println(method.invoke(maker, new Object[]{new Integer(i)}));
            } catch (SecurityException e) {
                e.printStackTrace();
                fail();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                fail();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                fail();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
                fail();
            }
        }
    }

}
