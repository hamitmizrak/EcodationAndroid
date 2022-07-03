package kalitim2;

public class KitapMainClass {
    public static void main(String[] args) {

        DiniKitap diniKitap=new DiniKitap(4, "kitapAdi", "kitapFiyati", "kelam");
        System.out.println(diniKitap);
        diniKitap.anaMethod();
    }
}
