package tutorials;


public class _27_Conditional_switchcase {
    public static void main(String[] args) {

        //if else
        int number = 5;
        if (number == 1) {
            System.out.println("say� 1");
        }  else if (number == 2) {
            System.out.println("say� 2");
        }  else if (number == 3) {
            System.out.println("say� 3");
        } else if (number == 4) {
            System.out.println("say� 4");
        } else if (number == 5) {
            System.out.println("say� 5");
        } else if (number == 6) {
            System.out.println("say� 6");
        } else{
            System.out.println("Farkl� say�lard�r");
        }
        System.out.println("**************************");
        switch (number){
            case 1:
                System.out.println("say� 1");
                break; //d�ng�y� k�r art�k �al��ma
            case 2:
                System.out.println("say� 2");
                break; //d�ng�y� k�r art�k �al��ma
            case 3:
                System.out.println("say� 3");
                break; //d�ng�y� k�r art�k �al��ma
            case 4:
                System.out.println("say� 4");
                break; //d�ng�y� k�r art�k �al��ma
            case 5:
                System.out.println("say� 5");
                break; //d�ng�y� k�r art�k �al��ma
            case 6:
                System.out.println("say� 6");
                break; //d�ng�y� k�r art�k �al��ma

            default:
                System.out.println("Farkl� say�lard�r");
                break;

        }

    }
}
