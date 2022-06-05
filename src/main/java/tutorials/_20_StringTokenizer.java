package tutorials;


import java.util.StringTokenizer;

public class _20_StringTokenizer {
    public static void main(String[] args) {

        String data="Servlet jsp jsf primefaces spring boot";

        //1-) parçalama
        String[] dizi=data.split(" ");
        for(String temp:dizi){
            System.out.println(temp);
        }

        System.out.println("**********************************");

        //2-) parçalama
        StringTokenizer tokenizer=new StringTokenizer(data," ");
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
    }
}
