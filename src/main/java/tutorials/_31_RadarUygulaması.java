package tutorials;


import java.util.Scanner;

public class _31_RadarUygulamas� {
    public static void main(String[] args) {

       //Trafikte Radar uygulamas�nda e�er h�z�m�z 90 �st�nde ise h�zl� gidiyorsunuz diye yazs�n ve para cezas� 800 TL
       //Trafikte Radar uygulamas�nda e�er h�z�m�z 100 �st�nde ise h�zl� gidiyorsunuz diye yazs�n ve para cezas� 1200 TL
        Scanner klavye=new Scanner(System.in);
        System.out.println("H�z�n�z");
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
