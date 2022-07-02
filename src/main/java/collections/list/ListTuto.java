package collections.list;

//L-A-V
// List bit interface'dir.
//LinkedList: Projemizde s�rekli olarak Araya yerle�me veya Silme  kullan�rsak
//ArrayList : Projemizde s�rekli olarak Arama veya Ekleme   kullan�rsak
//Vector    : defaultta 10 ve s�rekli kendili�inden haf�zas�n�  art�r�r.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListTuto {
    public static  void listMethod(){
        //List<String> iller=new ArrayList<>();
        List<String> iller=new LinkedList<>();

        //add() ==> listeye veri eklemye yarar.
        iller.add("Malatya");
        iller.add("Elaz��");
        iller.add("Bing�l");
        iller.add("Malatya");

        System.out.println("****** �terative For *************");
        //1-) �terative For
        for (int i = 0; i < iller.size(); i++) {
            System.out.println(iller.get(i));
        }

        System.out.println("******ForEach d�ng�*************");
        //2-) ForEach d�ng�
        for(String temp :iller){
            System.out.println(temp);
        }

        System.out.println("******Iterator d�ng�*************");
        //3-) Iterator d�ng�
        Iterator iterator= iller.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("******Stream API*************");
        //4-) Stream API
        iller.stream().forEach(System.out::print);
        iller.forEach(System.out::print);

        System.out.println("\n###############################################");

        //#########List �zellikleri
        //size: eleman say�s�n� verir
        System.out.println("\nEleman say�s�:"+iller.size());

        //indexOf: Listede eleman� bulursa bulundu�u indisi d�nd�r�r yoksa (-1) d�ner
        System.out.println("List indexOf: "+iller.indexOf("Malatya"));
        System.out.println("List lastindexOf: "+iller.lastIndexOf("Malatya"));

        //isEmpty():
        System.out.println("Bo� mu ? "+iller.isEmpty() );

        //subList(): Listeden istedi�imiz aral�kta veri almak istersek
        System.out.println("******subList*************");
        for(String temp : iller.subList(0,2)){ //0<=X<=2-1
            System.out.println(temp);
        }

        //addAll(): bir listeye ba�ka bir liste eklemek
        List<String> ulke=new ArrayList<>();
        ulke.add("T�rkiye");
        ulke.add("Almanya");
        ulke.addAll(iller);
        System.out.println("\n******addAll*************");
        ulke.forEach(System.out::println);

        //remove: verilen indiste eleman listeden ��kart�r
        iller.remove(0);
        System.out.println("\n");
        iller.forEach(System.out::println);

        //clear:  listeden b�t�n elemanlar� ��kart�r
        iller.clear();
        System.out.println("\n");
        iller.forEach(System.out::println);
    }

    //PSVM
    public static void main(String[] args) {
        listMethod();
    }
}
