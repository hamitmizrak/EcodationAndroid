package tutorials;


public class _25_Conditional_if_else {
    public static void main(String[] args) {

        //if else
        int number = 5;
        if (number >= 15) {
            System.out.println("say� 15 veya b�y�kt�r");
        } else {
            System.out.println("K���kt�r");
        }

        //Ternary
        String result= (number >= 15) ? "say� 15 veya b�y�kt�r":"K���kt�r" ;
        System.out.println(result);



    }
}
