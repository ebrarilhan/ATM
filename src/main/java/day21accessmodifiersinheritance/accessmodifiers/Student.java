package day21accessmodifiersinheritance.accessmodifiers;

public class Student {

    /*

    Acces Modifier
    1)public   2)protected   3)default (access modifieri default yapmak icin access modifier yazmayiz.)
    yani hicbir sey yazmazsak bu, default olur.
    4) private

    note: access modifierlari genisten dara dogru sayiniz.
    public > protected > default > private

    note: access modifierlari birer birer aciklayiniz.
    public olanlar her classdan kullanilabilir.
    protected olanlar baska packagelerden kullanilamaz ancak baska package de "child class" icinden
    kullanilabilir.
    default olanlar baska packageden kullanilamazlar.
    private olanlar sadece olusturulduklari class icinde kullanilabilirler.

    note: protected ile defaultun farkini soyleyiniz.
    protected olanlar baska packagelerden kullanilamaz ancak baska package de "child class" icinden
    kullanilabilir.
    default olanlar baska packageden kullanilamazlar.

    note: classlar icin hangi access modifierlar kullanilabilir.
    public ve dafault kullanilabilir. ama protected ve private kullanilamaz.

    default diger adi package private dir.



     */


    //public, her classdan kullanilabilir.
    public String stdName = "TomHanks";

    //protected olanlar baska packagelerden kullanilamaz ancak baska package de "child class" icinden
    //kullanilabilir.
    protected String address = "Miami";

    //default olanlar baska packageden kullanilamazlar.
    String email = "th@gmail";

    //private olanlar sadece olusturulduklari class icinde kullanilabilirler.
    private String stdId= "20206517004";

}
