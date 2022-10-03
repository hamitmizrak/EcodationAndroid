package advancedjava;

import java.util.Scanner;
import java.util.UUID;

public class _005_IterativeMethod {
    //kullanýcýdan alýna bir sayýný faktöriyelini hesaplayan algoritma
    //scanner global
   private static  Scanner klavye=new Scanner(System.in);
    private static int result(){
        System.out.println("\nLütfen bir sayý giriniz");
        return klavye.nextInt();
    }

    private static void facMethot(){
        int number=result();
        if(number>=8){
            System.out.println("sonsuz ..lütfen 8 küçük bir sayý giriniz");
        }else if(number<0){
            System.out.println("negatif sayý giremezsiniz");
        } else{
            // 4.3.2.1
            int temp=1;
            for (int i = number; i >=1 ; i--) {
                temp*=i;
            }
            System.out.println(number+ " sayýsýnýn Faktöriyel sonucu: "+temp);
        }
    }

    public static void main(String[] args) {
        //kullanýcý secret key yani 8 sayýsýný girerse hesaplamasýn onun hariçinde
        //sürekli hesaplamalar yapsýn
        while(true){
            facMethot();
        }
    }
}
