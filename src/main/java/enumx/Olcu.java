package enumx;

public enum Olcu {
    KUCUK(1,"kucuk"),ORTA(2,"orta"),BUYUK(3,"buyuk");

    //final yazmamdaki sebeb sadece getter gelmesi içindir
    private final long key;
    private final String value;

    //parametreli constructor
    //constructor private yazalým ki instance oluþturulmasý
   private Olcu(long key, String value) {
        this.key = key;
        this.value = value;
    }

    //getter :Sadece getter olur çünkü private final yazdýðýmýz için
    public long getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
