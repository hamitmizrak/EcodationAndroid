package tutorials;


import java.util.Date;
import java.util.Scanner;

public class _29_PasswordRePassword {
    public static void main(String[] args) {

        //Kullan�c� taraf�ndan �ifre ve (Scanner)
        // �ifre tekrar� al�cak ikisi kar��la�t�racak e�itse e�it diyecek yoksa de�ildir

        Scanner klavye=new Scanner(System.in);
        String password,rePassword;

        System.out.println("�ifre giriniz");
        password=klavye.nextLine();

        System.out.println("�ifre tekrar�n� giriniz");
        rePassword=klavye.nextLine();

        if(password.equals(rePassword)){
            System.out.println("�ifreler ayn�d�r");
        }else{
            System.out.println("�ifreler farkl�");
        }

    }
}
