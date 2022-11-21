package day23inheritancepolymorphism.override;

public class Cat extends Mammal {


    public void meow(){

        System.out.println("Cat meow");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    //asagidaki method overriding method olarak adlandirilir
    @Override
    public Mammal create() {
        return new Mammal();
    }



    /*
    @Override annotation ini kullanarak javanin yaptigimiz override islemini kontrol etmesini
                saglariz
    1) override yaparken methodun bodysi degistirilir.
    2) override yaparken asla method signature a dokunulmaz. (isim ve parametre)
        yani isim ve parametre degistirilemez. eat() <== isim ve parametre
    3) override yaparken inheritance olmak zorundadir.
    4) override yaparken acces modifierlar belli kurallara gore farklilastirilabilirler.

           i)private methodlar override edilemezler.
           ii)child class icindeki override edilen methodun acces modifieri, parent classdaki methodun
           access modifieri ile ayni veya genis olmalidir. yaniii;

           note: child classdaki methodun access modifieri daha dar olamaz.

           iii) default methodlar ayni package icindeyse override edilebilirler.
           farkli packageden override edilemezler.

    5) parent classdaki methodun return type i void ise return type degistirilemez.
    6) parent classdaki methodun return type i primitive ise return type degistirilemez.
    7) parent classdaki methodun return type i wrapper class ise return type degistirilemez.
    8) parent classdaki methodun return type i parent class ise return type child lardan biri
    olabilir.
    note: child classdaki return type parent classdakinden daha genis olamaz.

    note: aralarinda parent child iliskisi olmayan classlar overridingde return type degisiminde
    kullanilamazlar. mesela short integerdan kucuktur fakat aralarinda parent child iliskisi
    olmadigindan integer yerine short kullanamazsiniz.

    note: child daki methodun return type indan parentteki methodun return type ina gidiste
    "IS-A" relationship olmali.

    note: aralarinda "IS-A" relationship olan data type lara "Covariant" denir.

    9) Child<Prent ==>IS-A (Her kedi hayvandır ama her hayvan kedi değildir.
        HAS-A ==> Hayvanlar kedileri içerir ama kediler tüm hayvanları içermez.
        is-a childden parente, has-a parenttten childa...cat is a animal. animal has a cat.


    10) final methodlar override edilemezler. cunku overridingde method body degistirilir.
        fakat final method body degistirilmesine musaade etmez.

    11) polymorphism (coklu yapi) =  overloading + overriding
        note: polymorphism nedir derlerse overloading ile overriding i anlatin.

    12) overloading ile overriding arasindaki farklar nelerdir?
        i) overloading icin inheritance gerekmez. cunku bu, ayni class icinde yapilirdi. fakat overriding icin gerekir.
        ii) private methodlar overload edilebilir. (ayni class icinde cunku) override edilemezler.
        iii) final methodlar overload edilebilir. (method body degistirilmedigi icin) override edilemezler. (method body degistirilir ve final izin ermez buna)
        iiii) overloading static polymorphism olarak overriding dynamic polymorphism olarak
        adlandirilir. cunku static methodlar overload edilebilir override edilemezler.
        i5) overloadingde method signature degisir ama overridingde method signature a dokunulmaz.
     */

}
