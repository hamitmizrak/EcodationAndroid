package tutorials;

import javax.swing.*;
import java.util.Scanner;

public class _12_UserData {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi=klavye.nextInt();
        System.out.println(sayi*sayi);

    }
}
