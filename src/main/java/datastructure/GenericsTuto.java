package datastructure;

//Generics:
// <> ile g�sterilir
// T�r problemlerini ��zmek i�in kullan�yoruz. (Type Safe)
// ��erisinde t�m referans veri tipleri bulunur
// referans veri tipleri ==>WrapperClass (Byte,Short,Integer,Long) (Float ,Double), (String) ,(Boolean, Character)
// casting (d�n���m) i�lem yazpmam�za gerek kalmaz.
// Kar�� taraftan hangi veri gelece�ini bilmiyorsak bu bizim i�in �nemli bir yap�d�r ve bize yard�mc� olur.

public class GenericsTuto<T> {
    private T value;

    //parametresiz constructor
    public GenericsTuto() {

    }

    //generics parametreli constructor
    public GenericsTuto(T value) {
        this.value = value;
    }

    //generics method (istedi�imiz kadar generics parametre verebiliriz.
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
