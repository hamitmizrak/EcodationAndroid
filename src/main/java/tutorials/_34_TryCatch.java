package tutorials;

import java.io.IOException;

public class _34_TryCatch {
    public static void main(String[] args) {

        //exception handling
        try {
            //sayý/0=  Sýnýrsýz
            int number = 4 / 0;
            System.out.println(number);
        } catch (ArithmeticException ai) {
            ai.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Her durumuda bu satýr çalýþacak. db.closed() port.closed()");
        }
        System.out.println("diðer satýr");
    }
}
