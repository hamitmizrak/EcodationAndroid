package advancedjava;

import java.util.Scanner;
import java.util.UUID;

public class _005_IterativeMethod {
    //kullan�c�dan al�na bir say�n� fakt�riyelini hesaplayan algoritma
    //scanner global
   private static  Scanner klavye=new Scanner(System.in);
    private static int result(){
        System.out.println("\nL�tfen bir say� giriniz");
        return klavye.nextInt();
    }

    private static void facMethot(){
        int number=result();
        if(number>=8){
            System.out.println("sonsuz ..l�tfen 8 k���k bir say� giriniz");
        }else if(number<0){
            System.out.println("negatif say� giremezsiniz");
        } else{
            // 4.3.2.1
            int temp=1;
            for (int i = number; i >=1 ; i--) {
                temp*=i;
            }
            System.out.println(number+ " say�s�n�n Fakt�riyel sonucu: "+temp);
        }
    }

    public static void main(String[] args) {
        //kullan�c� secret key yani 8 say�s�n� girerse hesaplamas�n onun hari�inde
        //s�rekli hesaplamalar yaps�n
        while(true){
            facMethot();
        }
    }
}
