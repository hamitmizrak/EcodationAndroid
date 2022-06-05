package tutorials;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class _23_Date {
    public static void main(String[] args) {

        //LocalDate: yýl ay gün
        LocalDate myObj1 = LocalDate.now();  // Create a date object
        System.out.println(myObj1);  // Display the current date

        System.out.println("*******************");

        //LocalTime: saat dakika saniye
        LocalTime myObj2 = LocalTime.now();
        System.out.println(myObj2);

        //LocalDateTime: yýl ay gün /saat dakika saniye
        LocalDateTime myObj3 = LocalDateTime.now();
        System.out.println(myObj3);

    }
}
