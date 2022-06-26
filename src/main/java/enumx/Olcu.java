package enumx;

public enum Olcu {
    KUCUK(1,"kucuk"),ORTA(2,"orta"),BUYUK(3,"buyuk");

    //final yazmamdaki sebeb sadece getter gelmesi i�indir
    private final long id;
    private final String deger;

    //parametreli constructor
    //constructor private yazal�m ki instance olu�turulmas�
   private Olcu(long id, String deger) {
        this.id = id;
        this.deger = deger;
    }

    //getter :Sadece getter olur ��nk� private final yazd���m�z i�in
    public long getId() {
        return id;
    }

    public String getDeger() {
        return deger;
    }
}
