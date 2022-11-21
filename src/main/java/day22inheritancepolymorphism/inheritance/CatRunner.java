package day22inheritancepolymorphism.inheritance;

import day22inheritancepolymorphism.inheritance.Cat;

public class CatRunner {

    /*
    CONSTRUCTOR ILE METHODLARIN FARKI?
    1) CONSTRUCTORLARDA RETURN TYPE YOKTUR.
    2) METHODLARDA ISIM OLUSTURMA ISTEGE BAGLIDIR. ANCAK CONS LARDA CLASS ISMI ILE AYNI OLMAK ZORUNDADIR.
    3) METHOD ISIMLERI KUCUK HARFLE BASLAR AMA CONSTRUCTOR ISIMLERI CLASS OLDUGU ICIN BUYUK HARFLE BASLAR



    1) javada object olusturuken constructorlar parent ten childa dogru calistirilir.
    o yuzden asagida object olusturunca(cat1) parentlerin icinde tek tek olusturdugumuz construktorlarin ciktisini goruruz.
    bunlar normalde bostur ama biz mantigini anlamak icin bir sey yazdik ki hepsini konsolda parentten classa dogru
    gorebilelim.
    2) java en ust parent constructora cikabilmek icin "super()" kodunu kullanir.
    3) "super()" kodu her constructorin ilk satirinda gizli olarak bulunur.
    4) super() kodunu isterseniz gorunur sekilde de yazabilirsiniz. java kizmaz.
    5) bu super kodunu gorunur sekilde yazarsaniz sakin ha ilk satir disinda bir satira koymayiniz. hata
    verir.
    6) super() kodu parent classtan constructor cagirmaya yarar.
     */

    public static void main(String[] args) {

        Cat cat1 = new Cat();


    }
}
