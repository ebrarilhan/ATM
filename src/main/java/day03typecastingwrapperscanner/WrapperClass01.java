package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
        java, primitivelere methodlar ekleyerek yeni bir structor yani
        yeni bir yapi olusturdu. bu yapiya wrapper class denir.

        primitive ----- wrapper
         byte       ---   Byte
         short    ---     Short
          int      ----    Integer
          long     ---     Long
          float    ---      Float
          double   ----     Double
          boolean  ---     Boolean
          char     ---    Character



          wrapper class bir class oldugu icin wrapper adlarinin bas harfleri
          buyuk oldu.
          ayrica wrapper classlar da non primitivedir
*/



        byte primitiveByte = 12;//primitiveByte yazip nokta konuldugunda hic
        //method goremeyiz cunku primitiveler method icermez sadece deger icerir.


        Byte wrapperByte = 12;//wrapperByte yazip nokta koydugumuzda bircok
        //method goruruz cunku wrapperler method icerir.

        //exampe1:byte data tipinin en kucuk ve en buyuk degerlerini ekrana yazdiriniz.

        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);//127

        //exampe2: short int long data tiplerinin en buyuk ve en kucuk degerlerini
        //ekrana yazdiriniz.

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);


        //primitiveler nasil wrapperlera cevrilir?

        float f1 = 13.99F;
        Float wrapperF1 = f1;

        // aslinda burada yine kucuk olandan buyuk olana cevirme islemi yaptigimizdan
        // donusturme kolay oldu. buna da autoboxing denir.

        //wrapperlar primitivelere nasil cevrilir?

        Character w1 = 's';
        char primitiveW1 = w1;

        // buna da unboxing denir
        // note: autoboxing ve unboxing(kutu disi) java tarafindan otomatik olarak yapilir.
        // bizim ekstra kod yazmamiza gerek yok.










    }




}
