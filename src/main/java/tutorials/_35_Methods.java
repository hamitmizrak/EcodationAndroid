package tutorials;
public class _35_Methods {

    //voidliparametresiz
    public static void voidliParametresiz(){
        System.out.println("voidliparametresiz");
    }



    //voidliparametreli
    public static void voidliParametreli(String data){
        System.out.println("voidliparametreli: "+data);
    }

    //voidsizparametresiz
    public static String voidsizParametresiz(){
        return "voidsizparametresiz";
    }

    public static double voidsizParametreli(int number){
        return Math.pow(2,number);
    }

    //Overloading
    public static double voidsizParametreli(double name){
        return name;
    }


    public static void main(String[] args) {
        voidliParametresiz();
        voidliParametreli("Hamit Mýzrak");

        String value= voidsizParametresiz();
        System.out.println(value);

       double value2= voidsizParametreli(4);
        System.out.println(value2);

    }

}
