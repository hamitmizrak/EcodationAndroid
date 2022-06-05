package tutorials;


public class _25_Conditional_if_else {
    public static void main(String[] args) {

        //if else
        int number = 5;
        if (number >= 15) {
            System.out.println("sayý 15 veya büyüktür");
        } else {
            System.out.println("Küçüktür");
        }

        //Ternary
        String result= (number >= 15) ? "sayý 15 veya büyüktür":"Küçüktür" ;
        System.out.println(result);



    }
}
