package advancedjava;

public class _001_Java {
    // Senkron  :  Ayn� anda sadece 1 i� yapabilme yetene�idir.
    // Asenkron :  Ayn� anda birden fazla  i� yapabilme yetene�idir.

    public String publicData="public";
    protected String protectedData="protected";
    private String privateData="private";
    String defaultData="default";

    static  int counter = 0;
   // static final int counter = 0;

    static{
        counter++;
    }



    // main method
    // public
    // protected
    // private
    // - (default,friendly)
    public static void main(String[] args) {
        System.out.println(args.length);

        String _$degiskenAdi44="Merhabalar";
        _001_Java javaData=new _001_Java();

        System.out.println(_001_Java.counter);

        //javaData.counter+=1;
        //System.out.println(javaData.counter);

        System.out.println(javaData.publicData);
        System.out.println(javaData.protectedData);
        System.out.println(javaData.privateData);
        System.out.println(javaData.defaultData);



    }
}
