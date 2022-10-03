package abstractx;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

//Kalıtımla (extends) alt sınıftan üst sınıfın fieldslerine ulaşmak istersen mutlaka protected olmalı.
//protected:sınıf içerisinde metotlara veya değişkenlere alt classtakiler erişsin ancak farklı pakettekiler erişemesin.

abstract public class Kitap {

    protected long id;
    protected String kitapAdi;
    protected String kitapFiyati;

    //gövdeli method
    public void govdeliMethod(){
        System.out.println(id+" "+kitapAdi+" ");
    }

    //gövdesiz method
    abstract public void govdesizMethod();

}
