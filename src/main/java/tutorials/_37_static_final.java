package tutorials;
public class _37_static_final {
    public static final int SAYI_DEGISKEN=45;

    //formatter
    public static void main(String[] args) {
     final  int sayi=44; //sabit de�i�kenlerde kullanabiliyoruz.
        //class   ==> extends yapamay�z
        //metotda ==> override yapamay�z
        System.out.println(sayi);
        System.out.println(_37_static_final.SAYI_DEGISKEN);

        //class static yapay�z ancak inner class hari�
    }

}
