package kalitimx;

public class MainClass {
    public static void main(String[] args) {

        Computer computer=new Computer();
        computer.setId(1L);
        computer.setAdi("computer");
        computer.setFiyati("45");
        System.out.println(computer);

        System.out.println("********************");

        Msi msi=new Msi();
        msi.setId(1L);
        msi.setAdi("Msi");
        msi.setFiyati("5");
        System.out.println(msi);

        System.out.println("********************");

        Monster monster=new Monster();
        monster.setId(44L);
        monster.setAdi("monster");
        monster.setFiyati("15");
        System.out.println(monster);
    }
}
