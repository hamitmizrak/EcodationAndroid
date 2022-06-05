package tutorials;


import java.util.Date;
import java.util.Scanner;

public class _29_PasswordRePassword {
    public static void main(String[] args) {

        //Kullanýcý tarafýndan þifre ve (Scanner)
        // þifre tekrarý alýcak ikisi karþýlaþtýracak eþitse eþit diyecek yoksa deðildir

        Scanner klavye=new Scanner(System.in);
        String password,rePassword;

        System.out.println("Þifre giriniz");
        password=klavye.nextLine();

        System.out.println("Þifre tekrarýný giriniz");
        rePassword=klavye.nextLine();

        if(password.equals(rePassword)){
            System.out.println("Þifreler aynýdýr");
        }else{
            System.out.println("Þifreler farklý");
        }

    }
}
