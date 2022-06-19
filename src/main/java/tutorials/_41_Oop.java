package tutorials;

public class _41_Oop {

    //polymorphism =çok biçimlilik
    //encapsulation=private
    //abstraction = abstract+interface

    //Bean
    //POJO < Bean < management Bean < CDI

    //access modifier
    //public: bütün paketlerden erişim sağlanır
    //private sadece o classta erişim vardır
    //protected: aynı paketin aynı classında erişim vardır farklı classta erişim olması için kalıtımlamak lazımdır
    //-=sadece aynı pakettekiler erişim sağlayabilir.

    //new: hafızada benim bir için bir yer aç
    //null: olan hafızayı boşaltır
    //sıfır:kapladığı bir alan vardır ancak değeri sıfırdır

    //overloading:aşırı yükleme aynı isimdeki metotlara ancak farklı parametrede olmaları gerekiyor.
    //override: var olan kurallar yerin benim söylediğim kurallar geçerlidir.

    //return: metotu kırar
    //break: döngüyü kırar
    //continue: devam eden 1 kere mahsusn es geç sonra döngüye devam etsin.

    //final
    //değişkenlerde sabittik
    //class extends edemeyiz
    //metotlarda override edemeyiz

    //static new oluşturmadan verilere erişim sağlamak
    // classAdi.deger
    //instance of

    public static void main(String[] args) {
        _45_PencilBean bean=new _45_PencilBean();
        if(bean instanceof _45_PencilBean){
            System.out.println("Evet");
        }else{
            System.out.println("Hayır");
        }
    }


}
