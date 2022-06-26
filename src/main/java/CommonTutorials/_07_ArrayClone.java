package CommonTutorials;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// kullanýcýdan alýnan sayý kadar dizi elemaný olsun rastgele 1-10 arasýndaki
// bu diziyi bir diziye atayalým sonra bu diziyi baþka bir diziye clone edelim.
// clonelanmýþ bu dizi bu sayýlarý küçükten  büyüðe doðru sýralayýn
// en küçük sayýyý ve en büyük sayýyý bulalým ? ( diziyele yapalým)
// bu sayýlarýn toplamýný
// bu sayýlarýn ortalamasý
// tek sayýlar kaç tane ve tek sayý toplamlarý
// çift sayýlar  kaç tane ve çift sayý toplamlarý
// dizilerde en büyük 2. sayý bulalým

public class _07_ArrayClone {

    //kullacýdan  eleman sayýsýný almak
    public static int userNumber() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Dizi eleman sayýsýný giriniz");
        int number = klavye.nextInt();
        return number;
    }

    //rastgele 1-10 arasýndaki  5 tane sayýyý bir diziye atayan method
    public static int[] returnRandomArray() {
        int[] dizi = new int[userNumber()];
        Random random = new Random();
        for (int i = 0; i < dizi.length; i++) {
            int number = random.nextInt(10) + 1;
            dizi[i] = number;
        }
        return dizi;
    }

    public static void resultArraySortingBigNumber(int[] dizi) {

        //clone alýnacak
        int[] clone = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            clone[i] = dizi[i];
        }

        //diziyi sýralasýn
        Arrays.sort(clone);
        for (int temp : clone) {
            System.out.print(temp + " ");
        }

        //sayý toplamý ve ortalamasý
        double sum=0,average=0;
        for (int i = 0; i < clone.length; i++) {
            sum+=clone[i];
        }

        System.out.println("\nen küçük sayý: " + clone[0]);
        System.out.println("en büyük sayý: " + clone[clone.length - 1]);
        System.out.println("toplamlarý: " + sum);
        System.out.println("ortalama: " + sum/clone.length);
    }

    //PSVM
    public static void main(String[] args) {
        resultArraySortingBigNumber(returnRandomArray());
    }
}
