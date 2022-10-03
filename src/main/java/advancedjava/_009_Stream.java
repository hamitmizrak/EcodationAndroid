package advancedjava;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class _009_Stream {

    //Array Dizisi
    public static String[] strArray() {
        String[] arrayData = {"javase", "mvc", "data", "security", "spring", "api", "security"};
        return arrayData;
    }

    //Collection Dizi
    public static List<String> collectionListData() {
        List<String> listem = new ArrayList<>();
        listem.add("javase");
        listem.add("mvc");
        listem.add("data");
        listem.add("spring");
        listem.add("security");
        listem.add("security");
        listem.add("api");
        return listem;
    }

    //Array To List
    public static List<String> arrayToList() {
        String[] arrayData = strArray();
        List<String> listem = List.of(arrayData);
        return listem;
    }

    //ForEach
    public static void streamForEachMethod() {
        List<String> list = arrayToList();
        //List<String> list=collectionListData();
        //list.forEach(System.out::println);
        list.forEach((temp) -> {
            System.out.print(temp + " ");
        });
    }

    public static void streamSortedMethod() {
        List<String> list = collectionListData().stream().sorted().collect(Collectors.toList());
        list.forEach((temp) -> {
            System.out.print(temp + " ");
        });
    }

    public static void streamSortedMethod2() {
        List<String> list = collectionListData().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        list.forEach((temp) -> {
            System.out.print(temp + " ");
        });
    }

    public static void streamLimitMethod() {
        List<String> list = collectionListData()
                .stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList());
        list.forEach((temp) -> {
            System.out.print(temp + " ");
        });
    }

    public static void streamDistinctMethod() {
        List<String> list = collectionListData()
                .stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .limit(3)
                .collect(Collectors.toList());
        list.forEach((temp) -> {
            System.out.print(temp + " ");
        });
    }

    public static void streamFilterMethod() {
               /*
                 List<String> list=collectionListData()
                .stream()
                .filter((temp)->temp.startsWith("s"))
                .collect(Collectors.toList());

                list.forEach((temp)->{
                System.out.print(temp+" ");
                 });
                */

        long data = collectionListData()
                .stream()
                .filter((temp) -> temp.startsWith("s"))
                .distinct()
                .count();
        System.out.println(data);
    }


    public static void streamMapMethod() {
        List<String> list=collectionListData()
                .stream()
                .filter((temp)->temp.startsWith("s"))
                .distinct()
                .map((temp)->temp.toUpperCase())
                .sorted()
                .map((temp)->temp.substring(0,3).concat("*"))
                .collect(Collectors.toList());

        list.forEach((temp)->{
            System.out.print(temp+" ");
        });
    }

    public static void main(String[] args) {
        //streamForEachMethod();
        //streamSortedMethod();
        //streamSortedMethod2();
        //streamLimitMethod();
        //streamDistinctMethod();
        //streamFilterMethod();
        streamMapMethod();
    }

}
