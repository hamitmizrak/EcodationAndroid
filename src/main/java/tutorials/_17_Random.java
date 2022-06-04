package tutorials;

import java.util.Random;

public class _17_Random {
    public static void main(String[] args) {

        //Math
        System.out.println("Rastgele sayý: "+ Math.round(Math.random()*4+1));

        //Object
        Random random=new Random();
        int sayi=random.nextInt(4)+1;
        System.out.println("Rastgele sayý: "+sayi);

        Random random2=new Random();
        //10 tane rastgele sayý olsun
        for (int i = 1; i <=10 ; i++) {
            int sayi2=random2.nextInt(4)+1;
            System.out.print(sayi2+" ");
        }
    }
}
