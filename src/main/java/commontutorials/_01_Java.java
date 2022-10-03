package commontutorials;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _01_Java {
    public static void main(String[] args) {
        //common rules
        int _$numberValue516 = 44;

        int x = 4, y = 5, k;
        k = 3 * x + 4 * y;
        // System.out.println(k);
        System.out.println("***************************************************************");
        //String
        String kelime = "ben Android öðreniyorum";
        System.out.println(kelime);
        System.out.println(kelime.length());
        System.out.println(kelime.trim());
        System.out.println(kelime.trim().length());
        System.out.println(kelime.toLowerCase());
        System.out.println(kelime.toUpperCase());
        System.out.println(kelime.startsWith("b"));
        System.out.println(kelime.endsWith(" "));
        System.out.println(kelime.charAt(0));
        System.out.println(kelime.charAt(kelime.length() - 1));

        System.out.println(kelime.substring(1));
        System.out.println(kelime.substring(1, 5)); //1<=X<4-1
        System.out.println(kelime.contains("öðreniyorum")); //1<=X<4-1
        System.out.println(kelime.replace(kelime, "deneme")); //1<=X<4-1
        System.out.println(kelime.equals("ben android öðreniyorum"));
        System.out.println(kelime.equalsIgnoreCase("ben android öðreniyorum"));
        System.out.println("***************************************************************");

        //System
       // System.out.print("ayný satýrda devam eder");
        //System.out.println("alt satýra geçer");
        //System.in() //input
        //System.exit(0);
        // System.out.printf();
        System.out.println("***************************************************************");
        //Math
        System.out.println( Math.abs(-4));
        System.out.println( Math.pow(2,5));
        System.out.println( Math.sqrt(16));
        System.out.println( Math.min(2,-55));
        System.out.println( Math.max(2,-55));
        System.out.println( Math.floor(5.9));
        System.out.println( Math.ceil(5.1));
        System.out.println( Math.round(5.5));

        System.out.println("***************************************************************");

        System.out.println( Math.round(Math.random()*4+1) );

        Random random=new Random();
        int sayi=random.nextInt(4)+1;
        System.out.println(sayi);

        System.out.println("***************************************************************");
        String str="Merhabalar";
        int decimal=44;
        float virgul=34.44f;
        System.out.printf("%25s %d %5.1f",str,decimal,virgul);

        System.out.println("***************************************************************");
        //birleþtirme
        String str1="Malatya",str2="yeþilyurt",str3="battalgazi";
        System.out.println(str1+str2+str3);
        System.out.println(str1.concat(str2).concat(str3));
        StringBuilder builder=new StringBuilder();
        builder.append(str1).append(str2).append(str3);
        String format=builder.toString();
        System.out.println(format);
        System.out.println("***************************************************************");

        //parçalama
        String kelime44="Javase Android+ firebase &data";
       String [] dizi= kelime44.split(" ");
       for(String temp:dizi){
           System.out.println(temp);
       }

        System.out.println("***************************************************************");
        StringTokenizer tokenizer=new StringTokenizer(kelime44);
       while(tokenizer.hasMoreTokens()){
           System.out.println(tokenizer.nextToken());
       }

        System.out.println("***************************************************************");
        Scanner klavye=new Scanner(System.in);
        System.out.println("Bir sayý giriniz");
        int number=klavye.nextInt();
        System.out.println(number);

    }
}
