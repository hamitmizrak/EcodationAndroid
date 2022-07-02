package datastructure;

//Generics:
// <> ile gösterilir
// Tür problemlerini çözmek için kullanýyoruz. (Type Safe)
// Ýçerisinde tüm referans veri tipleri bulunur
// referans veri tipleri ==>WrapperClass (Byte,Short,Integer,Long) (Float ,Double), (String) ,(Boolean, Character)
// casting (dönüþüm) iþlem yazpmamýza gerek kalmaz.
// Karþý taraftan hangi veri geleceðini bilmiyorsak bu bizim için önemli bir yapýdýr ve bize yardýmcý olur.

public class GenericsTuto<T> {
    private T value;

    //parametresiz constructor
    public GenericsTuto() {

    }

    //generics parametreli constructor
    public GenericsTuto(T value) {
        this.value = value;
    }

    //generics method (istediðimiz kadar generics parametre verebiliriz.
    public <K> void genericsMethod1(K value1,K value2){
        System.out.println(value1+" "+value2);
    }

    //generics method sadece Integer olsun istersek
    public <K extends  Integer> void genericsMethod2(K value1){
        System.out.println(value1);
    }

    //getter and setter
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    //PSVM
    public static void main(String[] args) {
        GenericsTuto tuto = new GenericsTuto(true);
        System.out.println(tuto.getValue());
        tuto.setValue(55.63);
        System.out.println(tuto.getValue());
        tuto.genericsMethod1(true,"merhabalar");
        tuto.genericsMethod2(55);
    }
}
