package advancedjava;

public enum _007_Enum {
    pazar,pazartesi,sali,carsamba,persembe,cuma,cumartesi
}

class Enumtutorials{
    public static void main(String[] args) {
        System.out.println(_007_Enum.pazartesi.ordinal());
        String temp=_007_Enum.pazartesi.toString();
        System.out.println(temp);
    }
}

//serileþtirme nedir ?
