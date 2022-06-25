package CommonTutorials;

import java.util.Scanner;

// Kullanýcý tarafýndan alýnan bir sayý negatif mi pozitif mi ?
public class _03_isNegativeisPositive {

    //kullanýcýdan veri almak
    public static int dataScanner() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("++++++++++++++\nsayý giriniz");
        int data = klavye.nextInt();
        return data;
    }

    //radar method
    public static void isNumber() {
        int number = dataScanner();

        if (number >= 0) {
            System.out.println("pozitif");
            //System.exit(0);
            return;
        } else {
            System.out.println("negatif");
        }
    }

    public static void main(String[] args) {
        while (true) {
            isNumber();
        }
    }
}
