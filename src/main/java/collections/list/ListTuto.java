package collections.list;

//L-A-V
//LinkedList: Projemizde sürekli olarak Araya yerleþme veya Silme  kullanýrsak
//ArrayList : Projemizde sürekli olarak Arama veya Ekleme   kullanýrsak
//Vector    : defaultta 10 ve sürekli kendiliðinden hafýzasýný  artýrýr.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTuto {
    public static  void listMethod(){
        List<String> iller=new ArrayList<>();

        //add() ==> listeye veri eklemye yarar.
        iller.add("Malatya");
        iller.add("Elazýð");
        iller.add("Bingöl");

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

        //size: eleman sayýsýný verir
        System.out.println("\nEleman sayýsý:"+iller.size());

        //remove: verilen indiste eleman listeden çýkartýr
        iller.remove(0);

        //clear:  listeden bütün elemanlarý çýkartýr
        iller.clear();



        System.out.println("*******************");
        List<String> ulke=new ArrayList<>();
        ulke.add("Türkiye");
        ulke.add("Almanya");

        ulke.addAll(iller);

        for (int i = 0; i < ulke.size(); i++) {
            System.out.println(ulke.get(i));
        }

    }

    //PSVM
    public static void main(String[] args) {
        listMethod();
    }
}
