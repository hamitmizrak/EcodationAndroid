package collections.list;

//L-A-V
//LinkedList: Projemizde s�rekli olarak Araya yerle�me veya Silme  kullan�rsak
//ArrayList : Projemizde s�rekli olarak Arama veya Ekleme   kullan�rsak
//Vector    : defaultta 10 ve s�rekli kendili�inden haf�zas�n�  art�r�r.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTuto {
    public static  void listMethod(){
        List<String> iller=new ArrayList<>();

        //add() ==> listeye veri eklemye yarar.
        iller.add("Malatya");
        iller.add("Elaz��");
        iller.add("Bing�l");

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

        //size: eleman say�s�n� verir
        System.out.println("\nEleman say�s�:"+iller.size());

        //remove: verilen indiste eleman listeden ��kart�r
        iller.remove(0);

        //clear:  listeden b�t�n elemanlar� ��kart�r
        iller.clear();



        System.out.println("*******************");
        List<String> ulke=new ArrayList<>();
        ulke.add("T�rkiye");
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
