package tutorials;


import java.util.Random;

public class _31_Loop {
    public static void main(String[] args) {

        //for-while arasýndaki farklar nelerdir?

        //Bilgisayar rastgele 1-10 arasýnda bir sayý oluþtursun ve biz 4 hakkýmýzda bu sayýyý bulmaya çalýþalým
        //her yanlýþýmýzda kalan hakkýmýzý bize söylesin ?

        //1-10 arasýndaki sayýlarý toplayan algoritma yazýnýz ? (for)

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

        //Rastgele oluþturulan 10 tane sayýnýn (Random)
        //1.adým: toplamlarý
        //2.adým  çift sayýlar toplamý
        //3.adým: tek sayýlar toplamý

        Random random=new Random();
        for (int i = 1; i <=10 ; i++) {
            int number= random.nextInt(1)+10;
            System.out.print(number+" ");
        }


    }
}
