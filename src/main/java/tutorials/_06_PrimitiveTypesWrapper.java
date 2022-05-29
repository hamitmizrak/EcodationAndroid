package tutorials;

public class _06_PrimitiveTypesWrapper {
    public static void main(String[] args) {
        // 8 tane primitive type vardır:
        //tam sayılar
        byte b1 = 127;
        short s1 = 128;
        int i1 = 5815;
        long l1 = 645114L;

        //virgüllü sayılar
        float f2 = 452.55f;
        double d2 = 15.52;

        boolean b3 = true;
        char c3 = '\u8532';
        System.out.println(c3);

        ////////////////////////////////
        //primitive
        // object değildir
        // null veremezsiniz
        //Stack hafıza
        //Daha hızlıdır


        //wrapper
        // tamamen objecttir
        // null veremebiliriz
        //Heap Hafıza

        //Wrapper Class
        Byte b14 = 127;
        Short s14 = 128;
        Integer i14 = 5815;
        Long l14 = 645114L;

        //virgüllü sayılar
        Float f24 = 452.55f;
        Double d24 = 15.52;

        Boolean b34 = true;
        Character c34 = '\u8532';
        System.out.println(c3);
    }
}
