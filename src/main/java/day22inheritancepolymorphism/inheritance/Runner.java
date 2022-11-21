package day22inheritancepolymorphism.inheritance;

public class Runner {


    public static void main(String[] args) {
        //VARIABLE LAR HAKKINDA
        //inheritance da variablellar secilirken java, object in data tipine bakar.
        //oncelikle istediginiz variable i object in data tipi olan Classda arar.
        // o classda bulamazsa parent classlara bakar.
        //hicbir parent classda bulamazsa hata verir.

        Cat cat1 = new Cat();
        System.out.println(cat1.a);
        System.out.println(cat1.b);
        System.out.println(cat1.c);

        Mammal cat2 = new Cat();//mammal data type kulanilabilir cunku cat mammalin childidir.
        System.out.println(cat2.a);


        Animal cat3 = new Cat();
        System.out.println(cat3.a);


        //object olustururken objectin data tipi child classlardan secilemez.

        //METHODLAR HAKKINDA:
        //inheritanceda  methodlar secilirken java constructora bakar.
        //oncelikle istediginiz methodu consructori kullanilan classdan alir.
        //o classda bulamazsa parent classlara bakar.
        //hicbir yerde o methodu bulamazsak hata verir.
        Cat cat4 = new Cat();
        cat4.eat();//Cat eat
        cat4.drink();

        Mammal cat5 = new Mammal();
        cat5.eat();//Mammal eat

        Animal cat6 = new Animal();
        cat6.eat();//Animal eat

    }
}
