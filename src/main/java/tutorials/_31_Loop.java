package tutorials;


import java.util.Random;

public class _31_Loop {
    public static void main(String[] args) {

        //for-while aras�ndaki farklar nelerdir?

        //Bilgisayar rastgele 1-10 aras�nda bir say� olu�tursun ve biz 4 hakk�m�zda bu say�y� bulmaya �al��al�m
        //her yanl���m�zda kalan hakk�m�z� bize s�ylesin ?

        //1-10 aras�ndaki say�lar� toplayan algoritma yaz�n�z ? (for)

        //i++
        //i=i+1
        //i+=1
        for (int i = 1; i <=10; i++) {
            System.out.print(i+" ");
        }

        System.out.println("\n**************");

        int k=1;
        while(k<=10){
            System.out.print(k+" ");
            k++;
        }

        //Rastgele olu�turulan 10 tane say�n�n (Random)
        //1.ad�m: toplamlar�
        //2.ad�m  �ift say�lar toplam�
        //3.ad�m: tek say�lar toplam�

        Random random=new Random();
        for (int i = 1; i <=10 ; i++) {
            int number= random.nextInt(1)+10;
            System.out.print(number+" ");
        }


    }
}
