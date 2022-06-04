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
        int i3=b3; //veri kaybý olmaz

        int i4=45155;
        byte b4= (byte) i4; //veri kaybý olacak

        //3-) boxing /un boxing
        // boxing: primitive olan bir türü Wrapper class çevirmek demektir
        int primitive=45584;
        Integer wrapper=primitive;


        // unboxing: Wrapper class olan bir türü primitive çevirmek demektir
        Integer wrapper2=4515;
        int primitive2=wrapper2;

        //4-) String ==> int (çevirmek)
        //Araþtýrma: Baver:  valueOf ile  parseInt nedir aralarýndaki farklar
        String str8="14";

        //1.YOL
        int i8=Integer.valueOf(str8);
        System.out.println(i8+14);

        //2.YOL
        int i9=Integer.parseInt(str8);
        System.out.println(i9+14);

        //5-)  int ==> String (çevirmek)
        //Araþtýrma: Baver:  valueOf ile  parseInt nedir aralarýndaki farklar
        int i10=25;

        //1.YOL
        String str10=String.valueOf(i10);
        System.out.println(str10+14);

        //2.YOL
        String str11= Integer.toString(i10);
        System.out.println(str11+14);



    }
}
