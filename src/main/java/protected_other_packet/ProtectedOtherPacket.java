package protected_other_packet;

import protecteddata.ProtectedSamePacketSameClass;

public class ProtectedOtherPacket extends ProtectedSamePacketSameClass {

    //parametreli constructor (super)
    public ProtectedOtherPacket(String name) {
        super(name);
    }

    public static void main(String[] args) {
        ProtectedOtherPacket otherPacket=new ProtectedOtherPacket("protected farkl� paket,farkl� class");
        System.out.println(otherPacket.name);
    }
}
