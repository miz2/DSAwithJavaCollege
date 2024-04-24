import java.text.DateFormat;
import java.util.*;

public class DateTypes {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        Calendar cd=Calendar.getInstance();
        cd.setTime(date);
        cd.add(Calendar.MONTH, 10);
        System.out.println(cd.getTime());
        // format date \
        DateFormat df= DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(df.format(cd.getTime()));
    }
}
