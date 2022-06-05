package tutorials;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class _22_Date {
    public static void main(String[] args) {

        //Date
        Date tarih1=new Date();
        System.out.println(tarih1);
        System.out.println("saat: "+tarih1.getHours());
        System.out.println("dakika: "+tarih1.getMinutes());
        System.out.println("saniye: "+tarih1.getSeconds());
        System.out.println("ay: "+tarih1.getMonth()); // 0 1 2 3 4 5=haziran 6 7 8 9 10 11

        System.out.println("***************************");
        Date tarih2=new Date("2015/11/15");
        System.out.println(tarih2);

        //kýsa ve öz tarih almak
        System.out.println(new Date(System.currentTimeMillis()));

    }
}
