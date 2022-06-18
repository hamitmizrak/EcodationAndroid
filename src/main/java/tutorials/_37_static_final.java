package tutorials;
public class _37_static_final {
    public static final int SAYI_DEGISKEN=45;

    //formatter
    public static void main(String[] args) {
     final  int sayi=44; //sabit deðiþkenlerde kullanabiliyoruz.
        //class   ==> extends yapamayýz
        //metotda ==> override yapamayýz
        System.out.println(sayi);
        System.out.println(_37_static_final.SAYI_DEGISKEN);

        //class static yapayýz ancak inner class hariç
    }

}
