package advancedjava;

import java.util.UUID;

public class _004_Java {
    public static void deneme(int sayi) {
        UUID uuid=UUID.randomUUID();
        System.out.println(uuid);

        int sum=0;
        if(sayi>=1){
            for (int i = 1; i <=sayi ; i++) {
                //sayi eðer 5 ise bunu es geçsin (continue)
                if(i==5)
                    continue;
                //sayi eðer 10 büyükse iþlem yapmasýn
                if(i==10){
                    break;
                }
                //sum=sum+i;
                sum+=i;
            }
        }else{
            System.out.println("Lütfen 1 büyük sayý giriniz");
        }
        System.out.println("SAyý toplamý : "+sum);
    }

    public static void main(String[] args) {
        deneme(5);
    }
}
