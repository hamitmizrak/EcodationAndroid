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
    private long id;
    private String kitapAdi;
    private String kitapFiyati;

    public void anaMethod(){
        System.out.println(id+" "+kitapAdi+" ");
    }

}
