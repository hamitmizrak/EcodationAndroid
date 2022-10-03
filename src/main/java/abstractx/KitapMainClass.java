package abstractx;

public class KitapMainClass {
    public static void main(String[] args) {

        // abstract'ta ana kitap instance oluşturamayız
        //Kitap kitap1=new Kitap();
        Kitap kitap2=new DiniKitap();//Polymorphism
        Kitap kitap3=new RomanKitabi();//Polymorphism


        System.out.println("***********************");

        DiniKitap diniKitap=new DiniKitap(4, "kitapAdi", "750", "kelam");
        System.out.println(diniKitap);
        diniKitap.govdeliMethod();//Polymorphism
        diniKitap.govdesizMethod(); //Polymorphism

        System.out.println("***********************");

        RomanKitabi romanKitabi=new RomanKitabi();
        romanKitabi.setId(44);
        romanKitabi.setKitapAdi("roman adı");
        romanKitabi.setKitapFiyati("500");
        System.out.println(romanKitabi);//Polymorphism
        romanKitabi.govdesizMethod();//Polymorphism

    }
}
