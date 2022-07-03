package kalitim2;


import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class DiniKitap extends Kitap {
    //diğer kitaplardan farklı özelliği
    private String kelam;

    //parametresiz constructor
    public DiniKitap() {
    }

    //parametreli constructor
    public DiniKitap(long id, String kitapAdi, String kitapFiyati, String kelam) {
        //üst atadan gelen özellikleri alır
        super(id, kitapAdi, kitapFiyati);
        //diğer kitaplardan farklı özelliği
        this.kelam = kelam;
    }

    @Override
    public void anaMethod() {
        super.anaMethod();
        super.setId(66);
        System.out.println("Dini Kitap Ana method");
    }
}
