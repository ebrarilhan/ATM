package day18arraylistspassbyvalue;

public class MethodOverloading01 {

    public static void main(String[] args)


    {
        /*
        OOP;
        1) INHERITANCE; chil parent
        2) POLYMORPHIZM aa)overloading bb) overriding
        3) ENCAPSULATION
        4) ABSTRACTION


        Method overloading nasil yapilir...
        1-Method isimleri ayni olmalidir..
        2-Method parametreleri farkli olmalidir.
            a-Parametre sayilari degistirilebilir.  int int   === int int int
            b-Parametrelerin data tiplerini degistirebilirsiniz..  int    double
            c-data tiplerinin yerlerini degistirebiliriz          double   int
                ancak data tipleri farkli ise..
        3-Method ismi + Parametreler ==> Method Signature (imzasidir)
        4- Method Signature disinda ne degistiriseniz degistirin Java o methodlari farkli kabul etmez.
        farkli kabul etmeyecegi icin de hata verir. cunku o methodlar birebir ayni gorunur o yuzden uzerinde degisiklik
        yapmak gerekir. yukarida yazildigi sekillerde...
         */
        add(3, 5);  // 1.method kullanir data tipleri uydugu icin
        add(3, 5.0); //3.method kullanir  data tipleri uydugu icin
        add(3.0, 5.0);  // uygun method olmadigi icin hata verir...

        //autowidening kucuk kutuyu buyuk kutuya koymakti o nedenle int olan degeri double a otomatik koyabilir
        //ama double i inte otomatik koyamayacagi icin hata verir
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }


    public static void add(double a, double b) {
        System.out.println(a + b);
    }



    public static void add(int a, int b, int c)
    {
        System.out.println(a + b + c);
    }

    public static void add(int a, double b)
    {
        System.out.println(a + b);
    }

    public static void add(double a, int b)
    {
        System.out.println(a + b);
    }






}
