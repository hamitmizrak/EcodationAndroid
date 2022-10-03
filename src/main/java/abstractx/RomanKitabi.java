package abstractx;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class RomanKitabi extends Kitap {

    @Override
    public void govdesizMethod() {
        System.out.println("Roman Kitap Gövdesiz Method");
    }


}
