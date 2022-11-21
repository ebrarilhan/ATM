package day02methodcreation;

public class MethodCreation {

       /*

   method olusturma:
    1) access modifier: javada ne olusturulursa olusturulsun onu kimin kullanacagina karar
    vermek onemlidir.
    2) return type: bu method ne uretiyor? method aksiyon demekti. methodlar bir sey uretirler.
    ne urettiklerini javaya soylemeliyiz. orn integer. (int)
    javada sonuc yerine return kelimesi kullanilir. bu islem 8 return etti gibi...
    netice = return neticenin tipi = return type
    3) methodun ismi: kurallar:
    method ismi icerikle ilgili olmalidir.
    method isimleri kucuk harfle baslar.
    method isimlerinde birden fazla kelime kullanirsaniz birinci kelimeden sonraki her kelime buyuk
    harfle baslar.
    method isimlerinde bosluk(space) kullanilmaz. diger karakterler kullanilabilir.
    method isimlerinde kulanilan sisteme camel case yani deve olayi denir.
    4) method parantezi: () method isminin yaninda bulunur. java bu patantezle bunun method oldugunu
    anlar. cunku classdan farkli olarak method oldugumu belirten bir ibare yoktur burada.
    aksi halde anlamaz.
    5) method body: {} method parantezi. methodla alakali yazilacaklar bu parantezin icine yazilir.


    */

    // main method icinde kullanacagimiz her sey static olmalidir.
    public static void main(String[] args) {

       System.out.println(toplamaYap(1.2, 5));

       System.out.println(ucSayiyiCarp(2, 1.5, 6));

       System.out.println(ilkIkiyiToplaUcuncuIleCarp(2, 8, 3.2));
        System.out.println(toplamaYap(5,8));





       //sout yazip enterlarsak otomatik system.out yazilir.
        //ekrana bir sey yazdirmak icin iki tane kod var
        // 1) System.out.println() 2) System.out.print()
        // LN LINE DEMEK LINE SATIR DEMEK LN OLANI KULLANIRSAK
        // orn hello yazar digerlerini asagi satira yazar.
        // yazdirilan her sey ayni satirda olsun istiyorsak ln olmayani kullaniriz.
        // yani ln satir basi yapiyor demektir.



    }

    /*
   main method: (statik daha sonra anlatlacak)
   void:
   methodlar aksiyondur. normalde aksiyonlar data uretir ama bazen
            istisnai durumlarda methodlar hicbir sey uretmez bir sey
            vermezler. buna bir tusa tiklama gibi durumlar veya ekrana hello yazmak
            gibi ornekler verilebilir.
    */
    //example 1: top[lama isleni yapan bir method olusturunuz.

    public static double toplamaYap(double a, double b) {
        return a+b;

    }
  //burada emir kipi yap dendi cunku methodlar aksiyon belirtir biz de oyle yazmaliyiz.

    // example 2: uc sayiyi birbiriyle carpan bir method olusturunuz.

    public static double ucSayiyiCarp(double a, double b, double c) {

        return a*b*c;

    }

    //exampe 3: uc sayidan ilk ikisini toplayip ucuncu ile carpan method olusturup
    // sonucu ekrana yazdiriniz.

    public static double ilkIkiyiToplaUcuncuIleCarp(double x, double y, double z) {

        return (x+y)*z;

    }

    // iki sayinin ortalamasini bulan methodu yazin.



}
