package protecteddata;

public class ProtectedSamePacketSameClass {
    protected String name;

    //parametreli constructor
    public ProtectedSamePacketSameClass(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        ProtectedSamePacketSameClass deneme=new ProtectedSamePacketSameClass("protected ayn� paket,ayn� class ");
        System.out.println(deneme.name);
    }
}
