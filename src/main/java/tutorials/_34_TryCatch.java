package tutorials;

import java.io.IOException;

public class _34_TryCatch {
    public static void main(String[] args) {

        //exception handling
        try {
            //say�/0=  S�n�rs�z
            int number = 4 / 0;
            System.out.println(number);
        } catch (ArithmeticException ai) {
            ai.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Her durumuda bu sat�r �al��acak. db.closed() port.closed()");
        }
        System.out.println("di�er sat�r");
    }
}
