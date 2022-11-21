package day28abstraction;

public class Cat extends Mammal{

    /*
    bir method parent classda abstract method ise child class o methodu override edip kullanmak zorundadir.
    bu yuzden herhangi bir fonksiyonu child class icin mecburi yapmak isterseniz o methodu abstract yapmalisiniz.

     */

    @Override
    public void eat() {
        System.out.println("Cats eat");
    }

    @Override
    public void move() {
        System.out.println("Cats move");
    }
}
