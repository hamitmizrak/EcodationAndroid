package tutorials;


public class _27_Conditional_switchcase {
    public static void main(String[] args) {

        //if else
        int number = 5;
        if (number == 1) {
            System.out.println("sayý 1");
        }  else if (number == 2) {
            System.out.println("sayý 2");
        }  else if (number == 3) {
            System.out.println("sayý 3");
        } else if (number == 4) {
            System.out.println("sayý 4");
        } else if (number == 5) {
            System.out.println("sayý 5");
        } else if (number == 6) {
            System.out.println("sayý 6");
        } else{
            System.out.println("Farklý sayýlardýr");
        }
        System.out.println("**************************");
        switch (number){
            case 1:
                System.out.println("sayý 1");
                break; //döngüyü kýr artýk çalýþma
            case 2:
                System.out.println("sayý 2");
                break; //döngüyü kýr artýk çalýþma
            case 3:
                System.out.println("sayý 3");
                break; //döngüyü kýr artýk çalýþma
            case 4:
                System.out.println("sayý 4");
                break; //döngüyü kýr artýk çalýþma
            case 5:
                System.out.println("sayý 5");
                break; //döngüyü kýr artýk çalýþma
            case 6:
                System.out.println("sayý 6");
                break; //döngüyü kýr artýk çalýþma

            default:
                System.out.println("Farklý sayýlardýr");
                break;

        }

    }
}
