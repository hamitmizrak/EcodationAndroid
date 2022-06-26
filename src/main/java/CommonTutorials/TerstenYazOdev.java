package CommonTutorials;


import java.util.Scanner;

public class TerstenYazOdev {

    // kullanýcýdan alýnan veriyi tersten yazdýran algoritma ?
    // Hamit
    // timaH
    public static void reverseString() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir þey yazýnýz");
        String value = klavye.nextLine();
        String temp = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            temp += value.charAt(i);
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        reverseString();
    }
}
