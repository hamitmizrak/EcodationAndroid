package kalitimx;
//java single inheritance(Kalıtım)
public class Computer {
    private long id;
    private String adi;
    private String fiyati;


    //toString
    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", adi='" + adi + '\'' +
                ", fiyati='" + fiyati + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getFiyati() {
        return fiyati;
    }

    public void setFiyati(String fiyati) {
        this.fiyati = fiyati;
    }
}
