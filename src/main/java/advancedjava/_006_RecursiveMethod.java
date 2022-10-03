package advancedjava;

import java.util.Scanner;

class HamitMizrakException extends RuntimeException{
    public HamitMizrakException(String message) {
        super(message);
    }
}

public class _006_RecursiveMethod {
    //kullan�c�dan al�na bir say�n� fakt�riyelini hesaplayan algoritma
    //scanner global
    private static Scanner klavye=new Scanner(System.in);
    private static int result(){
        System.out.println("\nL�tfen bir say� giriniz");
        return klavye.nextInt();
    }

    private static Integer facMethot(int number) {
        if (number < 0)
            throw new HamitMizrakException("S�f�rdan K���k say� giremezsiniz");
        if (number == 1 || number == 0) {
            return 1;
        }
        // 4.3.2.1
        return number * facMethot(number - 1);
    }

    public static void main(String[] args) {
        //kullan�c� secret key yani 8 say�s�n� girerse hesaplamas�n onun hari�inde
        //s�rekli hesaplamalar yaps�n
        while(true){
            int temp=result();
            System.out.println(facMethot(temp));
        }
    }
}
