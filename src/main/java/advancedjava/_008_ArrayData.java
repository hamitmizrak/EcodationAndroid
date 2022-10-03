package advancedjava;

import java.util.Arrays;
import java.util.Random;

public class _008_ArrayData {
    public static void main(String[] args) {
        //eleman sayýsý belli olan verileri saklamak
        int[] dizi=new int[10];
        int evenSum=0,evenCounter=0;
        Random random=new Random();
        for (int i = 0; i <10 ; i++) {
            int temp= random.nextInt(9)+1;
            dizi[i]=temp;
        }
        Arrays.sort(dizi);
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i]+" ");

            if(dizi[i]%2==0){
                evenCounter++;
                evenSum+=dizi[i];
            }else{

            }
        }

        System.out.println("\nÇift sayý adeti: "+evenCounter);
        System.out.println("Çift sayý toplamý: "+evenSum);

       /* System.out.println("");
        for (int data:dizi) {
            System.out.print(data+" ");
        }*/

        // Reflection nedir ?
        // Annotation nedir ?
        // proxy nedir ?
        // Semphore nedir ?
    }
}
