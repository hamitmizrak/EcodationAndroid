package tutorials;

import java.util.Scanner;

public class _32_return_break_continue {
    public static void main(String[] args) {

         //return : metotu kýrmak gelir
        //break: döngüyü kýrar
        //continue: sadece o döngüde çalýþmasýn sonra devam etsin

        //Kullanýcý tarafýndan verilen bir sayýya kadar toplamlarý hesaplanasýn
        //Eðer verilen sayýda 10 varsa bu toplamaya eklenmesin
        //Eðer kullanýcý secretKEy adýnda yani 44 vermiþse sistemden hemen çýksýn(HÝç toplamasýn)

        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir sayý giriniz");
        int number= klavye.nextInt();
        int sum=0;
        for (int i = 1; i <=number ; i++) {
            if(number==44){
                System.out.println("SecretKey verdiniz sistemden çýkýlýyor");
                break;
            }

            if(i==10)
                continue;

            sum=sum+i;
        }

        System.out.println("Toplamlarý: "+sum);

        //try catch
        //metotlarý
        //final
        //static
        //diziler
    }
}
