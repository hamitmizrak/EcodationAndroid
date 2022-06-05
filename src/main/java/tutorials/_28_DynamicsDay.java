package tutorials;


import java.util.Date;

public class _28_DynamicsDay {
    public static void main(String[] args) {

        //Sistem tarihinde (Date) g�nlerden bugun Pazartesi ise
        //Switch case
        //0=Pazar 1=Pazartesi
        int day=new Date().getDay();
        System.out.println(day);

        switch (day){
            case 0:
                System.out.println("pazar");
                break; //d�ng�y� k�r art�k �al��ma
            case 1:
                System.out.println("pazartesi");
                break; //d�ng�y� k�r art�k �al��ma
            case 2:
                System.out.println("sal�");
                break; //d�ng�y� k�r art�k �al��ma
            case 3:
                System.out.println("�ar�amba");
                break; //d�ng�y� k�r art�k �al��ma
            case 4:
                System.out.println("per�embe");
                break; //d�ng�y� k�r art�k �al��ma
            case 5:
                System.out.println("cuma");
                break; //d�ng�y� k�r art�k �al��ma
            case 6:
                System.out.println("cumartesi");
                break; //d�ng�y� k�r art�k �al��ma

            default:
                System.out.println("farkl� g�n");
                break;

        }


    }
}
