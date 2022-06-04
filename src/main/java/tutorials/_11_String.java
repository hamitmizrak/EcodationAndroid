package tutorials;

import lombok.extern.log4j.Log4j2;


public class _11_String {
    public static void main(String[] args) {
        //String:
        String kelime="Android java firebase java deneme";
        System.out.println(kelime);

        System.out.println("bosluklari al: "+kelime.trim());
        System.out.println("Karakter sayisi: "+kelime.length());
        System.out.println("bosluklari al: "+kelime.trim().length());

        System.out.println("Başlama: "+kelime.startsWith("k"));
        System.out.println("Bitis: "+kelime.endsWith(" "));

        System.out.println("Küçük karakter: "+kelime.toLowerCase());
        System.out.println("Büyük karakter: "+kelime.toUpperCase());

        System.out.println("ilk karakter "+kelime.charAt(0));
        System.out.println("indexOf "+kelime.indexOf("java"));
        System.out.println("lastIndexOf "+kelime.lastIndexOf("java"));

        String kelimeYeni="Yeni Kelime";
        System.out.println(kelime.replace(kelime,kelimeYeni));

        System.out.println("Geçiyor mu "+kelime.contains("firebase"));

        System.out.println(kelime.substring(1));
        System.out.println(kelime.substring(0,4));  //0<=X<= (4-1)
        System.out.println(kelime.concat(" -sona ekleme"));  //0<=X<= (4-1)

        System.out.println("Dolu mu Boş mu: " +kelime.isEmpty());  //0<=X<= (4-1)

    }
}
