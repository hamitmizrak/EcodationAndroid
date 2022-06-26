package enumx;

public enum Olcu {
    KUCUK(1,"kucuk"),ORTA(2,"orta"),BUYUK(3,"buyuk");

    //final yazmamdaki sebeb sadece getter gelmesi içindir
    private final long id;
    private final String deger;

    //parametreli constructor
    //constructor private yazalým ki instance oluþturulmasý
   private Olcu(long id, String deger) {
        this.id = id;
        this.deger = deger;
    }

    //getter :Sadece getter olur çünkü private final yazdýðýmýz için
    public long getId() {
        return id;
    }

    public String getDeger() {
        return deger;
    }
}
