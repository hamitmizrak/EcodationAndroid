package commontutorials;
import java.util.Scanner;

// Kullanýcýdan alýnan bilgilere göre doðru kullanýcý adý ve þifre girerse sisteme giriþ saðlanacak
// yoksa deneme hakký 4"ten baþlayarak aþaðýya doðru azalacak
// deneme hakký eðer 0 olursa sistemden atacak ve hesabýný bloke konulacak. Dizi ile yapmaya çalýþalým.
// defaultta
// kullanýcý ad: admin
// þifre:root
public class _06_IsLogin {
    //static sabit deðiþkenler,counter,dedaultEmail,defaultSifre
    private static int counter = 4;
    private static String defaultEmail ="root";
    private static String defaultSifre = "123";

    // Klavye method
    public static String[] LoginDizi() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Kullanýcý emaili giriniz");
        String email = klavye.nextLine();
        System.out.println("Kullanýcý þifre giriniz");
        String sifre = klavye.nextLine();
        String[] dizi = {email, sifre};
        return dizi;
    }

    //admin method sayfasý
    public static void adminMethod() {
        System.out.println("******************************************************************************");
        System.out.println("ADMÝN SAYFASI");
        System.exit(0);
    }

    //loginMethod
    public static void loginMethod(){
        try {
            int kalanhak = 4;
            while (true) {
                if (kalanhak >= 0) {
                    String[] dizi = LoginDizi();
                    if (dizi[0].equals(defaultEmail) && dizi[1].equals(defaultSifre)) {
                        System.out.println("Þifreniz ve emailiniz doðrudur Admin sayfasýna yönlendiriliyorsunuz...");
                        adminMethod();
                    } else {
                        kalanhak--;
                        System.out.println("Kalan Hakkýnýz: " + kalanhak);
                        if (kalanhak == 0) {
                            System.out.println(
                                    "Kartýnýz Bloke oldu Lütfen Müþteri Hizmetrelini arayýnýz 0850 00000 55522 ");
                            System.exit(0);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // PSVM
    public static void main(String[] args) {
        loginMethod();
    }
}
