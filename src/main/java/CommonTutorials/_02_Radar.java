package CommonTutorials;

import java.util.Scanner;

// Kullanýcý tarafýndan alýnan bir sayýya göre ceza kesilecektir.
// Hýzý:79 kadar ise para cezasý  : 0 TL      ==>  1<=speed<=79
// Hýzý:80 ise para cezasý : 800 TL hýzlýsýnýz   ==>  80<=speed<=94
// Hýzý:95 ise para cezasý : 1200 TL çok hýzlýsýnýz   ==>  95<=speed<=119
// Hýzý:120 ise para cezasý: 2000 TL  tehlikeli hýzlýsýnýz ==>  speed>=120
// Soför kaç kere trafik cezasý yediðini ve toplam para cezasýný
// ve eðer toplam ceza sayýsý 5 ve üstüne ise ehliyetine el konulsun  hesaplayan algoritma yazalým ?
public class _02_Radar {

    private static int AMOUNT = 0;
    private static int HOW_MANY = 0;


    public static int dataScanner() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("++++++++++++++\nHýzýnýzý giriniz");
        int data = klavye.nextInt();
        return data;
    }

    public static void radar() {
        int speed = dataScanner();

        if (HOW_MANY >= 5) {
            System.out.println("Ehliyetine el konuldu");
            System.exit(0);
            //return;
        } else {
            if (80 <= speed && speed <= 94) {
                AMOUNT = AMOUNT + 800;
                HOW_MANY++;
                System.out.println("+++++++++\nHýzýnýz: " + speed + " yavaþlayýn:\npara cezasý:800TL \ntoplam para cezanýz: " + AMOUNT + "\ntoplam ceza sayýsý: " + HOW_MANY);
            } else if (95 <= speed && speed <= 119) {
                AMOUNT += 1200;
                HOW_MANY++;
                System.out.println("+++++++++\nHýzýnýz: " + speed + " yavaþlayýn:\npara cezasý:1200TL \ntoplam para cezanýz: " + AMOUNT + "\ntoplam ceza sayýsý: " + HOW_MANY);
            } else if (speed >= 120) {
                AMOUNT += 2000;
                HOW_MANY++;
                System.out.println("+++++++++\nHýzýnýz: " + speed + " yavaþlayýn:\npara cezasý:2000TL \ntoplam para cezanýz: " + AMOUNT + "\ntoplam ceza sayýsý: " + HOW_MANY);
            }
        }
    }

    public static void main(String[] args) {
        while (true) {
            radar();
        }
    }
}
