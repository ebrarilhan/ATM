package day23inheritancepolymorphism.override;

import day23inheritancepolymorphism.override.Animal;

public class Bird extends Animal {

    /*
        "final" keyword nedir?

        bu keyword
        i)variablellarda kullanilabilir
            public final int age = 12;
            a)atanan deger degistirilemez.
            b)deger atamasi yapmak zorundasiniz. yani null veya 0 olacak sekilde olmaz

        ii)methodlarda kullanilabilir
            public final int add(){
                        return a+b;
            }
            a)bir method olusturulurken final olarak olusturulmus ise o methodun bodysi asla
            degistirilemez. dolayisiyla o method override edilemez.

        iii)classlarda kullanilabilir.
            bir classi final yaparsaniz o classi kisirlastirmis olursunuz.
            bir class final ise o class a extend edilemez.
            final class, kendisi child olabilir.



     */
}
