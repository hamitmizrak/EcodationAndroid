package tutorials;


import java.util.Random;

public class _33_ExamplesOddEven {
    public static void main(String[] args) {


        //Rastgele oluþturulan 10 tane sayýnýn (Random)
        //1.adým: toplamlarý
        //2.adým  çift sayýlar toplamý
        //3.adým: tek sayýlar toplamý
        int sum = 0, evenSum = 0, oddSum = 0;
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int number = random.nextInt(10) + 1;
            System.out.print(number + " ");
            sum=sum+number;

            if(number%2==0){//çift sayýlar
                evenSum+=number;
            }else{
                oddSum=oddSum+number;
            }

        }
        System.out.println("\nBütün sayýlar Toplamlarý: "+sum);
        System.out.println("Çift sayýlar toplamlarý: "+evenSum);
        System.out.println("Tek sayýlar toplamlarý: "+oddSum);

    }
}
