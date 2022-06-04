package tutorials;


public class _18_Cast {
    public static void main(String[] args) {

        //Cast
        //1-) float,long
        float f1=44.55f;
        System.out.println(f1);

        float f2= (float)44.55;
        System.out.println(f2);

        long l1=1145114652l;
        System.out.println(l1);

        long l2=1145114652L;
        System.out.println(l2);

        //2-) byte < short < int <long
        byte b3=120;
        int i3=b3; //veri kayb� olmaz

        int i4=45155;
        byte b4= (byte) i4; //veri kayb� olacak

        //3-) boxing /un boxing
        // boxing: primitive olan bir t�r� Wrapper class �evirmek demektir
        int primitive=45584;
        Integer wrapper=primitive;


        // unboxing: Wrapper class olan bir t�r� primitive �evirmek demektir
        Integer wrapper2=4515;
        int primitive2=wrapper2;

        //4-) String ==> int (�evirmek)
        //Ara�t�rma: Baver:  valueOf ile  parseInt nedir aralar�ndaki farklar
        String str8="14";

        //1.YOL
        int i8=Integer.valueOf(str8);
        System.out.println(i8+14);

        //2.YOL
        int i9=Integer.parseInt(str8);
        System.out.println(i9+14);

        //5-)  int ==> String (�evirmek)
        //Ara�t�rma: Baver:  valueOf ile  parseInt nedir aralar�ndaki farklar
        int i10=25;

        //1.YOL
        String str10=String.valueOf(i10);
        System.out.println(str10+14);

        //2.YOL
        String str11= Integer.toString(i10);
        System.out.println(str11+14);



    }
}
