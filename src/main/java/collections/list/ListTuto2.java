package collections.list;

//L-A-V
// List bit interface'dir.
//LinkedList: Projemizde s�rekli olarak Araya yerle�me veya Silme  kullan�rsak
//ArrayList : Projemizde s�rekli olarak Arama veya Ekleme   kullan�rsak
//Vector    : defaultta 10 ve s�rekli kendili�inden haf�zas�n�  art�r�r.

import java.util.*;

public class ListTuto2 {
    public static  void listMethod(){
        //List<String> iller=new ArrayList<>();
        List<String> iller=new LinkedList<>();

        //add() ==> listeye veri eklemeye yarar.
        iller.add("Malatya");
        iller.add("Elaz��");
        iller.add("Bing�l");
        iller.add("Malatya");
        iller.add("Balikesir");

        System.out.println("******Iterator d�ng�*************");
        //3-) Iterator d�ng�
        Iterator iterator= iller.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //Collections
        //Collections.sort(liste): K���kten B�y��e s�ralama
        java.util.Collections.sort(iller);
        System.out.println("******Collections.sort(liste) ==> K���kten B�y��e*************");
        for(String temp :iller){
            System.out.println(temp);
        }

        //Collections.reverse(liste): B�y�kten K����e s�ralama
        java.util.Collections.reverse(iller);
        System.out.println("******Collections.reverse() ==> B�y�kten K����e*************");
        for(String temp :iller){
            System.out.println(temp);
        }

        //Collections.shuffle(liste: Kar���k
        java.util.Collections.shuffle(iller);
        System.out.println("******Collections.reverse(): Kar���k*************");
        for(String temp :iller){
            System.out.println(temp);
        }

        //unmodifiableList: listeye art�k yeni veriler eklenmesini istemiyorsak
        //Exception: Exception in thread "main" java.lang.UnsupportedOperationException
        iller= java.util.Collections.unmodifiableList(iller);
        iller.add("eklenmez");
        for(String temp :iller){
            System.out.println(temp);
        }

        System.out.println("******Collections.binarySearch(liste,kelime): *************");
        System.out.println(java.util.Collections.binarySearch(iller,"Elaz��"));
    }

    //PSVM
    public static void main(String[] args) {
        listMethod();
    }
}
