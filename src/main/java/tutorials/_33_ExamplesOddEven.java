package tutorials;


import java.util.Random;

public class _33_ExamplesOddEven {
    public static void main(String[] args) {


        //Rastgele olu�turulan 10 tane say�n�n (Random)
        //1.ad�m: toplamlar�
        //2.ad�m  �ift say�lar toplam�
        //3.ad�m: tek say�lar toplam�
        int sum = 0, evenSum = 0, oddSum = 0;
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int number = random.nextInt(10) + 1;
            System.out.print(number + " ");
            sum=sum+number;

            if(number%2==0){//�ift say�lar
                evenSum+=number;
            }else{
                oddSum=oddSum+number;
            }

        }
        System.out.println("\nB�t�n say�lar Toplamlar�: "+sum);
        System.out.println("�ift say�lar toplamlar�: "+evenSum);
        System.out.println("Tek say�lar toplamlar�: "+oddSum);

    }
}
