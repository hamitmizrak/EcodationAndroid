package kalitim2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Kitap {

    //Kalıtımla (extends) alt sınıftan üst sınıfın fieldslerine ulaşmak istersen mutlaka protected olmalı.
    //protected:sınıf içerisinde metotlara veya değişkenlere alt classtakiler erişsin ancak farklı pakettekiler erişemesin.

    protected long id;
    protected String kitapAdi;
    protected String kitapFiyati;

    public void anaMethod(){
        System.out.println(id+" "+kitapAdi+" ");
    }

}
