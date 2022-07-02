package collections.set;

//HaLaT
// Set bit interface'dir.
//HashSet: Karýþýk veri döndürür
//LinkedHashSet : Eklediðimiz sýrada bize veri döndürür
//TreeSet    : Küçükten büyüðe Tekrarsýz verir

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
        iller.add("Elazýð");
        iller.add("Bingöl");
        iller.add("Malatya");


        System.out.println("******ForEach döngü*************");
        //1-) ForEach döngü
        for(String temp :iller){
            System.out.println(temp);
        }

        System.out.println("******Iterator döngü*************");
        //2-) Iterator döngü
        Iterator iterator= iller.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("******Stream API*************");
        //3-) Stream API
        iller.stream().forEach(System.out::print);
        iller.forEach(System.out::print);

        System.out.println("\n###############################################");

        //#########List Özellikleri
        //size: eleman sayýsýný verir
        System.out.println("\nEleman sayýsý:"+iller.size());

        //isEmpty():
        System.out.println("Boþ mu ? "+iller.isEmpty() );

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
