package day21accessmodifiersinheritance.inheritance;

public class AnimalRunner {

    /*
        1) "Inheritance" (miras demektir) sayesinde
            i) kod tekrarlarindan kurtulmus oluruz.
            ii) kod tamiri(maintenance) kolay olur
            iii) child classlari daha atomik yapmis oluruz.

        2) bir classi baska bir classin child classi yapmak icin "extends" keyword kullanilir.
        ilk yazilan class child, ikinci yazilan class parent olur.

        3) child class objectleri paretn classtan method ve variablellari kullanabilirler.

        4) parent class objeleri child classtan method ve variablellari kullanamazlar,

        5) object class her classin parentidir.
        javada object class haric her classin parenti vardir.
        javada parenti olmayan tek class object classtir.

        6)"Private" method ve varieblellar child classlar tarafindan kullanilamaz.
        default method ve varieblellar ayni packagedeki child classlar tarafindan kullanilabilir.
        Protected  method ve varieblellar child classlar tarafindan kullanilabilir.
        public method ve varieblellar child classlar tarafindan kullanilabilir.

        note: child classlar tarafindan kullanilabilir olmak "inherit" edilebilir demektir.

        7)4 tip inhertance vardir.
            i) Multilevel Inheritance: Java bunu kabul eder.
            ii) Hierarchical Inheritance: bir parent icin coklu child demektir. java bunu kabul eder.
            iii) Multiple Inheritance: bir childa coklu parent demektir. java bunu desteklemez.
            iiii) Single Inheritance: bir child class icin bir parent class demektir ve java bunu
            destekler.

     */

    public static void main(String[] args) {

        Cat c1 = new Cat();
        c1.eat();
        c1.drink();
        c1.meow();


        Dog d1 = new Dog();
        d1.eat();
        d1.drink();
        d1.bark();


        Bird b1 = new Bird();
        b1.eat();
        b1.drink();
        b1.tweet();
        b1.yasa();



    }
}
