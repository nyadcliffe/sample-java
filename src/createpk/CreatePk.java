package createpk;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CreatePk {

    public static void main(String[] args) {
        CreatePk createPk = new CreatePk();
        System.out.println(createPk.getId());
    }

    private String nowDate() {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        return df.format(date).toString();
    }

    private String getId() {
        return nowDate() + "." + this.hashCode();
    }
}
