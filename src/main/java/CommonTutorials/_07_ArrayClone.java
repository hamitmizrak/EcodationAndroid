package CommonTutorials;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// kullanýcýdan alýnan sayý kadar dizi elemaný olsun rastgele 1-10 arasýndaki
// bu diziyi bir diziye atayalým sonra bu diziyi baþka bir diziye clone edelim.
// clonelanmýþ bu dizi bu sayýlarý küçükten  büyüðe doðru sýralayýn
// en küçük sayýyý ve en büyük sayýyý bulalým ? ( diziyele yapalým)
public class _07_ArrayClone {

    //kullacýdan  eleman sayýsýný almak
    public static int userNumber(){
        Scanner klavye=new Scanner(System.in);
        System.out.println("Dizi eleman sayýsýný giriniz");
        int number=klavye.nextInt();
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
        int[] clone = new int[dizi.length];
        for (int i = 0; i < dizi.length; i++) {
            clone[i] = dizi[i];
        }
        Arrays.sort(clone);
        for (int temp : clone) {
            System.out.print(temp + " ");
        }
        System.out.println("\nen küçük sayý: " + clone[0]);
        System.out.println("en büyük sayý: " + clone[clone.length - 1]);
    }

    public static void main(String[] args) {

        resultArraySortingBigNumber(returnRandomArray());

    }

}
