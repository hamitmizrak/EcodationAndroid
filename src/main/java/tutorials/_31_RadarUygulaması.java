package tutorials;


import java.util.Scanner;

public class _31_RadarUygulamasý {
    public static void main(String[] args) {

       //Trafikte Radar uygulamasýnda eðer hýzýmýz 90 üstünde ise hýzlý gidiyorsunuz diye yazsýn ve para cezasý 800 TL
       //Trafikte Radar uygulamasýnda eðer hýzýmýz 100 üstünde ise hýzlý gidiyorsunuz diye yazsýn ve para cezasý 1200 TL
        Scanner klavye=new Scanner(System.in);
        System.out.println("Hýzýnýz");
        int speed= klavye.nextInt();
        int total=0;


        if(90<=speed && speed<=99){
            total=800;
            System.out.println(total);
        }else if(100<=speed && speed<=180){
            total=1200;
            System.out.println(total);
        }else{
            System.out.println("Ceza kesilmedi");
        }



    }
}
