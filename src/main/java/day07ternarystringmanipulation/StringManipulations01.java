package day07ternarystringmanipulation;

public class StringManipulations01 {

    public static void main(String[] args) {

        //String class methodlari:
        /*
        1) equals() : i) iki tane stringin ayni olup olmadigini anlamamiza yarar.
                    ii) Bu method, boolean return eder.

        2) equalsIgnoreCase() : i) iki tane stringin ayni olup olmadigini buyuk kucuk harfe
                                    dikkat etmeden anlamamiza yarar.
                                ii) Bu method, boolean return eder.

        3) toLoverCase() :  i) bir stringdeki tum harfleri kucuk harfe cevirmek icin kullanilir.
                             ii) bu method, string return eder.
        4) toApperCase() :  i) bir stringdeki tum harfleri buyuk harfe cevirmek icin kullanilir.
                             ii) bu method, string return eder.
        5) charAt() :  i) bir stringden belli bir indeksteki karakterleri almak icin kullanilir
                         ii) bu method bize char return eder.
        6) length() :  i) bir stringde kac tane karakter kullanildigini ogrenmek icin kullanilir.
                      ii) bu method int return eder.
        7) contains() :  i) bir stringde belli bir karakterijn veya karakterlerihn var olup
                            olmadigini anlamak icin kullanilir.
                         ii) bu method bize boolean dondurur. return eder.
                         illa bir harf olmasi gerekmez
         8) split() :  i) bir stringi istedigimiz karakterden parcalamaya yarar.
                        ii) split methodu array return eder.

         */

        /*
        bir passwordun gecerli olup olmadigini asagidaki kurallara gore kontrol eden
        kodu yaziniz.
        1) en az 8 karakter icermeli
        2) space karakteri icermemeli
        3) ilk harfi M veya m olmali
        4) son karakteri ? olmali
         */

        String pwd = "manisa12?";

        // 1) en az 8 karakter icermeli

       boolean first = pwd.length()>7; //karsilastirma islemleri her zaman boolean dondurur.

        // 2) space karakteri icermemeli
        boolean second = !pwd.contains(" "); // ! isareti icermez anlamina gelir.

        // 3) ilk harfi M veya m olmali
        boolean third = pwd.charAt(0)=='M' || pwd.charAt(0)=='m';

        //4) son karakteri ? olmali
        // son index, harf sayisindan bir eksiktir. bu cokomelliiiii

        boolean fourth = pwd.charAt(pwd.length()-1)=='?';

        System.out.println(first && second && third && fourth);


    }
}
