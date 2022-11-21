package day23inheritancepolymorphism.constructor;

import day23inheritancepolymorphism.constructor.Courses;

public class Math extends Courses {

    public void practice(){
        System.out.println("Solve questions");
    }

    public Math(){
        super("X");

        System.out.println("Constructor 1");
    }

    public Math(int a){
        this();//BU CLASSDAKI PARAMETRESIZ CONSTRUCTORI KULLAN DEMEKTIR.
        System.out.println("Constructor 2");
    }
}
