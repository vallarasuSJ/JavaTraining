package H_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class H_Date {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(date));

        SimpleDateFormat simpleDateFormat1=new SimpleDateFormat("E MM-dd-yyyy");
        System.out.println(simpleDateFormat1.format(date));
    }
}
