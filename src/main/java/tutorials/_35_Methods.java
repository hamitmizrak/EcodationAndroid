package tutorials;

import java.util.Scanner;

public class _35_Methods {

    //voidliparametresiz
    public static void voidliParametresiz() {
        System.out.println("voidliparametresiz");
    }


    //voidliparametreli
    public static void voidliParametreli(String data) {
        System.out.println("voidliparametreli: " + data);
    }

    //voidsizparametresiz
    public static String voidsizParametresiz() {
        return "voidsizparametresiz";
    }

    public static double voidsizParametreli(int number) {
        return Math.pow(2, number);
    }

    //Overloading
    public static double voidsizParametreli(double name) {
        return name;
    }


    //bir ��genin hipoten�s�n�n kullan�c�dan al�nan iki kenar�na g�re hipoten�s�n�  hesaplayan method yaz�n�z ?
    //Scanner voidsiz parametreli metot

    public static double hipotenus(double x1, double x2) {
        return Math.sqrt(Math.pow(x1, 2) + Math.pow(x2, 2));
    }

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("1.say� giriniz");
        double number1 = klavye.nextDouble();

        System.out.println("2.say� giriniz");
        double number2 = klavye.nextDouble();

        double result = hipotenus(number1, number2);
        System.out.println(result);

       /*
        voidliParametresiz();
        voidliParametreli("Hamit M�zrak");

        String value= voidsizParametresiz();
        System.out.println(value);

        double value2= voidsizParametreli(4);
        System.out.println(value2);
        */

    }

}
