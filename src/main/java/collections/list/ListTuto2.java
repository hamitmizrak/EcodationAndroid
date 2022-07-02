package collections.list;

//L-A-V
// List bit interface'dir.
//LinkedList: Projemizde sürekli olarak Araya yerleþme veya Silme  kullanýrsak
//ArrayList : Projemizde sürekli olarak Arama veya Ekleme   kullanýrsak
//Vector    : defaultta 10 ve sürekli kendiliðinden hafýzasýný  artýrýr.

import java.util.*;

public class ListTuto2 {
    public static  void listMethod(){
        //List<String> iller=new ArrayList<>();
        List<String> iller=new LinkedList<>();

        //add() ==> listeye veri eklemeye yarar.
        iller.add("Malatya");
        iller.add("Elazýð");
        iller.add("Bingöl");
        iller.add("Malatya");
        iller.add("Balikesir");

        System.out.println("******Iterator döngü*************");
        //3-) Iterator döngü
        Iterator iterator= iller.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Collections
        //Collections.sort(liste): Küçükten Büyüðe sýralama
        java.util.Collections.sort(iller);
        System.out.println("******Collections.sort(liste) ==> Küçükten Büyüðe*************");
        for(String temp :iller){
            System.out.println(temp);
        }

        //Collections.reverse(liste): Büyükten Küçüðe sýralama
        java.util.Collections.reverse(iller);
        System.out.println("******Collections.reverse() ==> Büyükten Küçüðe*************");
        for(String temp :iller){
            System.out.println(temp);
        }

        //Collections.shuffle(liste: Karýþýk
        java.util.Collections.shuffle(iller);
        System.out.println("******Collections.reverse(): Karýþýk*************");
        for(String temp :iller){
            System.out.println(temp);
        }

        //unmodifiableList: listeye artýk yeni veriler eklenmesini istemiyorsak
        //Exception: Exception in thread "main" java.lang.UnsupportedOperationException
        iller= java.util.Collections.unmodifiableList(iller);
        iller.add("eklenmez");
        for(String temp :iller){
            System.out.println(temp);
        }

        System.out.println("******Collections.binarySearch(liste,kelime): *************");
        System.out.println(java.util.Collections.binarySearch(iller,"Elazýð"));
    }

    //PSVM
    public static void main(String[] args) {
        listMethod();
    }
}
