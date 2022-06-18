package tutorials;
import java.util.Scanner;
public class _40_MultiArrayExamples {
    //kullanýcýdan alýncak 5 tane sayýyý diziye atayalým
    //1-)eleman toplamlarý
    //2-)tek sayýlarý  toplamlarý
    //3-)çift sayýlarý  toplamlarý
    //4-)ortalamasý
    public static int[] resultArray() {
        Scanner klavye = new Scanner(System.in);
        int[] dizi = new int[5];
        int sum=0,oddArray=0,evenArray=0;
        int number = 0;

        for (int i = 0; i <dizi.length; i++) {
            System.out.println((i+1) + ". sayýyý giriniz");
            number = klavye.nextInt();
            dizi[i] = number;
            sum+=dizi[i];
            if(dizi[i]%2==0){
                evenArray+=dizi[i];
            }else{
                oddArray+=dizi[i];
            }
        }

        for (int temp : dizi) {
            System.out.print(temp + " ");
        }
        System.out.println("\ntoplamlarý: "+sum);
        System.out.println("tek sayý toplamlarý: "+oddArray);
        System.out.println("çift sayý toplamlarý: "+evenArray);
        return dizi;
    }

    public static void main(String[] args) {
        int [] arr=resultArray();
    }
}
