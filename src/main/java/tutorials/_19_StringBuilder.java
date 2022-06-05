package tutorials;


public class _19_StringBuilder {
    public static void main(String[] args) {

         //Builder birle�tirme
        //String birle�tirmesi

        String adi="Hamit",soyadi="M�zrak";

        //1-)birle�tirme
        String birlestirme1=adi+soyadi;
        System.out.println(birlestirme1);

        System.out.println("***************************");

        //2-)birle�tirme
        String birlestirme2=adi.concat(soyadi);
        System.out.println(birlestirme2);

        System.out.println("***************************");

        //3-)birle�tirme
        StringBuilder birlestirme3=new StringBuilder();
        birlestirme3.append(adi).append(soyadi);
        String stringTo=birlestirme3.toString();
        System.out.println(stringTo);

        System.out.println("***************************");

        //4-)birle�tirme
        StringBuffer birlestirme4=new StringBuffer();
        birlestirme4.append(adi).append(soyadi);
        String stringTo2=birlestirme4.toString();
        System.out.println(stringTo2);



    }
}
