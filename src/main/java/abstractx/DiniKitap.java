package abstractx;

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

    public void anaMethod() {
        //üst atadan method çağırmak
        super.govdeliMethod();

        //üst aradan veri çağırmak
        super.setId(66);
        System.out.println("Dini Kitap Ana method");
    }

    @Override
    public void govdesizMethod() {
        System.out.println("Dini Kitap Gövdesiz mthod");
    }
}
