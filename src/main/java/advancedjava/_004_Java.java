package advancedjava;

import java.util.UUID;

public class _004_Java {
    public static void deneme(int sayi) {
        UUID uuid=UUID.randomUUID();
        System.out.println(uuid);

        int sum=0;
        if(sayi>=1){
            for (int i = 1; i <=sayi ; i++) {
                //sayi e�er 5 ise bunu es ge�sin (continue)
                if(i==5)
                    continue;
                //sayi e�er 10 b�y�kse i�lem yapmas�n
                if(i==10){
                    break;
                }
                //sum=sum+i;
                sum+=i;
            }
        }else{
            System.out.println("L�tfen 1 b�y�k say� giriniz");
        }
        System.out.println("SAy� toplam� : "+sum);
    }

    public static void main(String[] args) {
        deneme(5);
    }
}
