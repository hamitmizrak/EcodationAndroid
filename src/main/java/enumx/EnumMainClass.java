package enumx;

public class EnumMainClass {

    public static void main(String[] args) {
        //Enum java 5 ile gelmiþtir
        // tür güvenliði(type safe) saðlar

        Gunler gunler = Gunler.PAZARTESI;
        System.out.println(gunler);

        //ordinal sýfýrdan baþlar
        System.out.println("Sýra: " + gunler.ordinal());

        //name
        System.out.println("name: " + gunler.name());

         //values ==> dizi
        System.out.println(Gunler.values()[0]);

        //normal
        System.out.println(Gunler.CARSAMBA);

        //string'e cevrilmiþ enum
        String data = Gunler.SALI.toString();
        System.out.println(data);

        System.out.println("******************");
        for (Gunler temp : Gunler.values()) {
            System.out.print(temp + " ");
        }
    }
}
