package tutorials;


import java.util.Date;

public class _28_DynamicsDay {
    public static void main(String[] args) {

        //Sistem tarihinde (Date) günlerden bugun Pazartesi ise
        //Switch case
        //0=Pazar 1=Pazartesi
        int day=new Date().getDay();
        System.out.println(day);

        switch (day){
            case 0:
                System.out.println("pazar");
                break; //döngüyü kýr artýk çalýþma
            case 1:
                System.out.println("pazartesi");
                break; //döngüyü kýr artýk çalýþma
            case 2:
                System.out.println("salý");
                break; //döngüyü kýr artýk çalýþma
            case 3:
                System.out.println("çarþamba");
                break; //döngüyü kýr artýk çalýþma
            case 4:
                System.out.println("perþembe");
                break; //döngüyü kýr artýk çalýþma
            case 5:
                System.out.println("cuma");
                break; //döngüyü kýr artýk çalýþma
            case 6:
                System.out.println("cumartesi");
                break; //döngüyü kýr artýk çalýþma

            default:
                System.out.println("farklý gün");
                break;

        }


    }
}
