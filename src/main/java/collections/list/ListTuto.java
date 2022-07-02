package collections.list;

//L-A-V
// List bit interface'dir.
//LinkedList: Projemizde sürekli olarak Araya yerleþme veya Silme  kullanýrsak
//ArrayList : Projemizde sürekli olarak Arama veya Ekleme   kullanýrsak
//Vector    : defaultta 10 ve sürekli kendiliðinden hafýzasýný  artýrýr.

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
        iller.add("Elazýð");
        iller.add("Bingöl");
        iller.add("Malatya");

        System.out.println("****** Ýterative For *************");
        //1-) Ýterative For
        for (int i = 0; i < iller.size(); i++) {
            System.out.println(iller.get(i));
        }

        System.out.println("******ForEach döngü*************");
        //2-) ForEach döngü
        for(String temp :iller){
            System.out.println(temp);
        }

        System.out.println("******Iterator döngü*************");
        //3-) Iterator döngü
        Iterator iterator= iller.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("******Stream API*************");
        //4-) Stream API
        iller.stream().forEach(System.out::print);
        iller.forEach(System.out::print);

        System.out.println("\n###############################################");

        //#########List Özellikleri
        //size: eleman sayýsýný verir
        System.out.println("\nEleman sayýsý:"+iller.size());

        //indexOf: Listede elemaný bulursa bulunduðu indisi döndürür yoksa (-1) döner
        System.out.println("List indexOf: "+iller.indexOf("Malatya"));
        System.out.println("List lastindexOf: "+iller.lastIndexOf("Malatya"));

        //isEmpty():
        System.out.println("Boþ mu ? "+iller.isEmpty() );

        //subList(): Listeden istediðimiz aralýkta veri almak istersek
        System.out.println("******subList*************");
        for(String temp : iller.subList(0,2)){ //0<=X<=2-1
            System.out.println(temp);
        }

        //addAll(): bir listeye baþka bir liste eklemek
        List<String> ulke=new ArrayList<>();
        ulke.add("Türkiye");
        ulke.add("Almanya");
        ulke.addAll(iller);
        System.out.println("\n******addAll*************");
        ulke.forEach(System.out::println);

        //remove: verilen indiste eleman listeden çýkartýr
        iller.remove(0);
        System.out.println("\n");
        iller.forEach(System.out::println);

        //clear:  listeden bütün elemanlarý çýkartýr
        iller.clear();
        System.out.println("\n");
        iller.forEach(System.out::println);
    }

    //PSVM
    public static void main(String[] args) {
        listMethod();
    }
}
