package kalitim2;

// Kalıtım:
// üst atadan (sup class) olan özellikleri alt class(Sub class) özellikleri miras vermesi durumudur.
// Genel ortak olan özellikleri bir arada tutmak için kullanılır.
// Java Tek kalıtımlıdır (Single Inheritance)
// extends keywordu kullanılır ==> sadece 1 tane kullanabilirsiniz

// Kalıtım görevi
//1-) Veri tekrarını önler.
//2-) zaman kazancı sağlar
//3-) Maliyetleri azaltır.(zaman,para,kod az yazma)
//4-) Projeleri daha kısa sürede kod yazmayı sağlar

// inheritance  (is-a)    ==> extends
// interface    (can -do) ==> implements
// composition  (has-a)

//Super(): birden fazla alt sınıf olabilir fakat alt sınıfın birden fazla sınıftan etkilenmez.
//Super üst sınıfın constructrını çağırmak için kullanılıyor.

//super(x,y,z).Alt classdan üst classın elemanlarına erişmek istersek kullanıyoruz veya metotlarına erişmek istiyorsak super.metotAdi();
//field alanaları süper.getID
//protected:sınıf içerisinde metotlara veya değişkenlere alt classtakiler erişsin ancak farklı pakettekiler erişemesin.
//extends:kalıtım sağlamak için kullanıyoruz.
//this.field
//this(1,12);   //farklı constructorları çağırmak için kullanıyoruz.


//This();
//1-)global değişkenlere ulaşmak için (this.adi=adi)
//2-)bir constructor diğer bir constructorı  this(1,2); ile çağrılıyor.

public class InheritanceTuto {
}
