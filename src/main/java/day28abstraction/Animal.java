package day28abstraction;

public abstract class Animal {

    //bodysi olmayan methodlar abstract method olarak adlandirilir.
    //bir methodu abstract yapmak icin:
    //i) method bodyi sil.
    //ii) abstract keyword kullan.
    //abstract methodlar abstract class icinde olmalidir.

    public abstract void eat();

    //abstract(soyut) classlarda hem abstract method hem de concrete(non-abstract)(somut) method kullanilabilir.
    public void drink(){
        System.out.println("Animals drink...");
    }

    // abstract move method olusturunuz.

    public abstract void move();


}


