package tutorials;

//Bean: POJO+Constructor:
//constructor
// kurucu metot demektir
//return yazamayız.
//instance yani new ile o classı çağırdığımızda ilk uğrak alanıdır.
public class _45_PencilBean {

    //Nesne değişkenleri
    private Long pencilId;
    private String pencilName;
    private double pencilPrice;
    private String pencilTrade;

    //this: bu anlamaına geliyor.
    //global değişkenleri kullanmak
    //başka bir constructor çağırmak için kullanmak

    //constructor:parametresiz
    public _45_PencilBean() {
        this(5L,"adı",44,"marka");
    }

    //constructor:parametreli
    //Overloading

    public _45_PencilBean(Long pencilId, String pencilName, double pencilPrice, String pencilTrade) {
        this.pencilId = pencilId;
        this.pencilName = pencilName;
        this.pencilPrice = pencilPrice;
        this.pencilTrade = pencilTrade;
    }


    //Alt+Ins
    //Getter setter

    public Long getPencilId() {
        return pencilId;
    }

    public void setPencilId(Long pencilId) {
        this.pencilId = pencilId;
    }

    public String getPencilName() {
        return pencilName;
    }

    public void setPencilName(String pencilName) {
        this.pencilName = pencilName;
    }

    public double getPencilPrice() {
        return pencilPrice;
    }

    public void setPencilPrice(double pencilPrice) {
        this.pencilPrice = pencilPrice;
    }

    public String getPencilTrade() {
        return pencilTrade;
    }

    public void setPencilTrade(String pencilTrade) {
        this.pencilTrade = pencilTrade;
    }
}
