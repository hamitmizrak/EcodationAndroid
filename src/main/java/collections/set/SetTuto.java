package collections.set;

//HaLaT
// Set bit interface'dir.
//HashSet: Kar���k veri d�nd�r�r
//LinkedHashSet : Ekledi�imiz s�rada bize veri d�nd�r�r
//TreeSet    : K���kten b�y��e Tekrars�z verir

//Dikkat: YOKTUR
// get
// indexOf lastIndexOf
// subList
import java.util.*;

public class SetTuto {
    public static  void listMethod(){
        //List<String> iller=new ArrayList<>();
        Set<String> iller=new LinkedHashSet<>();

        //add() ==> listeye veri eklemye yarar.
        iller.add("Malatya");
        iller.add("Elaz��");
        iller.add("Bing�l");
        iller.add("Malatya");


        System.out.println("******ForEach d�ng�*************");
        //1-) ForEach d�ng�
        for(String temp :iller){
            System.out.println(temp);
        }

        System.out.println("******Iterator d�ng�*************");
        //2-) Iterator d�ng�
        Iterator iterator= iller.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("******Stream API*************");
        //3-) Stream API
        iller.stream().forEach(System.out::print);
        iller.forEach(System.out::print);

        System.out.println("\n###############################################");

        //#########List �zellikleri
        //size: eleman say�s�n� verir
        System.out.println("\nEleman say�s�:"+iller.size());

        //isEmpty():
        System.out.println("Bo� mu ? "+iller.isEmpty() );

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
