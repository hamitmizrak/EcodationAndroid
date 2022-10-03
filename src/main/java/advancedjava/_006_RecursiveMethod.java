package advancedjava;

import java.util.Scanner;

class HamitMizrakException extends RuntimeException{
    public HamitMizrakException(String message) {
        super(message);
    }
}

public class _006_RecursiveMethod {
    //kullanýcýdan alýna bir sayýný faktöriyelini hesaplayan algoritma
    //scanner global
    private static Scanner klavye=new Scanner(System.in);
    private static int result(){
        System.out.println("\nLütfen bir sayý giriniz");
        return klavye.nextInt();
    }

    private static Integer facMethot(int number) {
        if (number < 0)
            throw new HamitMizrakException("Sýfýrdan Küçük sayý giremezsiniz");
        if (number == 1 || number == 0) {
            return 1;
        }
        // 4.3.2.1
        return number * facMethot(number - 1);
    }

    public static void main(String[] args) {
        //kullanýcý secret key yani 8 sayýsýný girerse hesaplamasýn onun hariçinde
        //sürekli hesaplamalar yapsýn
        while(true){
            int temp=result();
            System.out.println(facMethot(temp));
        }
    }
}
