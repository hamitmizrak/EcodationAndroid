package enumx;

public class EnumConstructorMainClass {
    public static void main(String[] args) {
        Olcu olcu=Olcu.BUYUK;
        System.out.println("Sýra: "+olcu.ordinal());
        System.out.println("ID: "+olcu.getId());
        System.out.println("Deðer: "+olcu.getDeger());

        String value=Olcu.BUYUK.toString();
        System.out.println(value);

        System.out.println("**********************");
        for(Olcu temp:Olcu.values()){
            System.out.println(temp);
        }
    }
}
