package abstract1;

public class MainClass {
    public static void main(String[] args) {

        Computer computer=new Msi();//polymorphism
        computer.setId(1L);
        computer.setAdi("computer msi");
        computer.setFiyati("5");
        computer.govdeliMethod();
        computer.govdesizMethod(44); //polymorphism

        System.out.println("********************");

        Msi msi=new Msi();
        msi.setId(1L);
        msi.setAdi("Msi");
        msi.setFiyati("5");
        msi.govdeliMethod();
        msi.govdesizMethod(44); //polymorphism
        System.out.println(msi);

        System.out.println("********************");

        Monster monster=new Monster();
        monster.setId(44L);
        monster.setAdi("monster");
        monster.setFiyati("15");
        monster.govdeliMethod();
        monster.govdesizMethod(55); //polymorphism
        System.out.println(monster);
    }
}
