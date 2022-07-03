package collections.maps;

//MAP:
// Key,value �eklinde �al��an veri yap�lar�d�r.
// bir interfacedir.
// Map<Key,Value> ==> <String,Object> ==> Key: unique olmak zorundad�r.
// generics yap�larla beraber �al���r
// Database yoktur nas�l �al���rs�n�z ? Map, File
// java.util paketinde gelir

// MAP kullan�m alanlar�: JSON, API(service)


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// HHLT
// Hash Table    ==> Senkron �al��mak ve null vermemek i�in kullan�yoruz.
// HashMap       ==> �ndis s�ras� �emli de�ilse
// LinkedHashMap ==> �ndis s�ras� �nemliyse eklenen s�rada gelir
// TreeMap       ==> K���kten b�y��e do�ru s�ralama s�z konusudur.
public class MapsTuto {

    public static void mapTutorials(){
        Map<String,Object> mapList=new LinkedHashMap<>();
        mapList.put("1","Hamit");
        mapList.put("2","Ahmet");
        mapList.put("3","Ferhat");

        System.out.println("\n****** jUST key*********");
        //1-Sadece Key
        for ( String key :mapList.keySet()  ){
            System.out.print(key+" ");
        }

        System.out.println("\n****** jUST VALUE*********");
        //2-Sadece Value
        for ( Object value :mapList.values()  ){
            System.out.print(value+" ");
        }

        System.out.println("\n****** KEY- VALUE*********");
        //3-Key- Value
        for ( String key :mapList.keySet()  ){
            System.out.println(key+" "+mapList.get(key) +" ");
        }

        System.out.println("\n****** Map.Entry *********");
        //4-M.E-L-ES
        for(Map.Entry<String,Object> tempList :mapList.entrySet()){
            System.out.println(tempList);
        }
        System.out.println("\n****** ITERATOR *********");

        //5-set loop
        Set set=mapList.keySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(mapList.get(iterator.next()) );
        }

        //6-forEach
        System.out.println("\n****** FOREACH *********");
        mapList.entrySet().forEach(System.out::println);






    }

    public static void main(String[] args) {
        mapTutorials();
    }
}
