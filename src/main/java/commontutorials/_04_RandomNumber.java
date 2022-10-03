package commontutorials;

import java.util.Random;

// step-1 1-10 arasında rastgele sayı üreten 5 tane sayı üreten  bir algoritma ?
// step-2 bu sayı toplamları hesaplayın ?
// step-3 bu sayı kaç tane tek veya çift  hesaplayın ?
public class _04_RandomNumber {

    //debug

    public  void randomNumber(){
        Random random=new Random();
        String temp="";
        int sum=0,evenCounter=0,oddCounter=0;
        try {
            for (int i = 1; i <=5 ; i++) {
                int number=random.nextInt(10)+1;
                temp+=number+" - ";
                sum+=number;

                if(number%2==0)
                    evenCounter++;
                else
                    oddCounter++;
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
        System.out.println(temp);
        System.out.println("toplam: "+sum);
        System.out.println("tek sayı adedi: "+oddCounter);
        System.out.println("çift sayı adedi: "+evenCounter);
    }

    public static void main(String[] args) {
        _04_RandomNumber instance=new _04_RandomNumber ();
        instance.randomNumber();
    }

}
