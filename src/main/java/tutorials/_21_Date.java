package tutorials;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.StringTokenizer;

public class _21_Date {
    public static void main(String[] args) {

        Locale locale=new Locale("tr","TR");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss",locale);

        //Date
        Date tarih1=new Date();
        String format=simpleDateFormat.format(tarih1);
        System.out.println(format);

        //Calendar
        Calendar calendar=Calendar.getInstance();
        String format2=simpleDateFormat.format(calendar.getTime());
        System.out.println(format2);

    }
}
