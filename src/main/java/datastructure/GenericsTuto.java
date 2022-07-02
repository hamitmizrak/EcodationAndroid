package datastructure;

//Generics:
// <> ile gösterilir
// Tür problemlerini çözmek için kullanýyoruz. (Type Safe)
// Ýçerisinde tüm referans veri tipleri bulunur
// referans veri tipleri ==>WrapperClass (Byte,Short,Integer,Long) (Float ,Double), (String) ,(Boolean, Character)
// casting (dönüþüm) iþlem yazpmamýza gerek kalmaz.
// Karþý taraftan hangi veri geleceðini bilmiyorsak bu bizim için önemli bir yapýdýr ve bize yardýmcý olur.

public class GenericsTuto <T>  {
private T value;

//getter and setter
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    //PSVM
    public static void main(String[] args) {
        GenericsTuto tuto=new GenericsTuto();
        tuto.setValue(55.63);
        System.out.println(tuto.getValue());
    }
}
