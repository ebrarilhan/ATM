package day28abstraction;

//1) Atomic olsun diye “parent”i parcaladim ama bir “Child Class” in birden fazla “parent” i oldu bu ise Java’da mumkun
// degildir. Cunku Java “multiple Inheritance” i desteklemez.
//“multiple inheritance” class’larda mumkun degildir fakat Java “interface” isimli yeni bir yapi olusturdu bu yapida
//“multiple inheritance” a musaade etti.

//2) interface lerdeki tum methodlar abstract oldugu icin interface lere tam abstraction manasinda fully abstraction
//denir. abstract classlarda abstract method ve concrete method bir arada kullanildigi icin abstract classlara
//fully abstraction denmez.

public interface Engine {

    //interface lerdeki tum methodlar abstract olmak zorundadir.

    //interface lerde abstract method olustururken abstract keyword kullanmaya gerek yoktur. cunku java o metodun
    //abstract oldugunu bilir.

    //interface lerdeki tum methodlar java tarafindan otomatik olarak public kabul edilir. bu yuzden o methodlar
    //icin public yazmaya gerek yoktur.

    // yani; public abstract void eco(); ile void eco(); ayni anlama gelir.
    void eco();

    void gas();

    void tsi();

    //default keyword kullanarak interface lerin icinde bodysi olan methodlar uretebilirsiniz.
    //asagidaki non static methoddur.
    public default int add(int a, int b){
        return a+b;
    }

    //static keyword kullanarak da interface lerin icinde bodysi olan methodlar uretebilirsiniz.
    //asagidaki method static methoddur.
    public static String update(String str){
        return str + "!";
    }






}
