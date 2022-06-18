package tutorials;

import java.util.Arrays;
import java.util.Random;

public class _38_Array {
    //5 tane random sayýyý diziye atayan algoritma yazalým ekranda bu sayýlarý gösterelim
    //method ile yapmak
    //dizilerle yapmak
    public static int[] randomArray(){
        int [] dizi=new int[5];
        for (int i = 0; i < 5; i++) {
            Random random=new Random();
            dizi[i]=random.nextInt(5)+1;
        }

        for (int temp:dizi) {
            System.out.print( temp+" ");
        }
        return dizi;
    }



    public static void main(String[] args) {
        /*int[] arr=new int[8];
        //diziler sýfýrýncý indiste baþlar
        arr[0]=4;
        arr[1]=8;
        arr[4]=9;
        arr[5]=5;
        arr[6]=8;
        arr[7]=7;*/

        int[] arr= {4,8,9,5,8,7};

        Arrays.sort(arr);
        //System.out.println(arr[2]);

        //iterative for
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n************************");

        //forEach
        for( int temp  : arr ){
            System.out.print(temp+" ");
        }
        System.out.println("\n************************");
        //Arrays.asList(arr).forEach(System.out::println);
        randomArray();

    }
}
