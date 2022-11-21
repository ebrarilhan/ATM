package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //type casting: bir numeric data typeni diger numeric data tipine ceviormek demektir.
    // byte < short < int < long < float < double
    // boolean numeric degil char ise direkt bir sayi degil.

    /*
    auto widening: (otomatik genisletme) bazen orn bytei integer yapma ihtiyaci duyariz.
    kucukten buyuge cevirmeye denir.


        explicit narrowing: (acikca daraltma) bazen de floattan mesela shorta cevirme
        ihtiyaci duyariz. buyuk data type ni kucuk data typeine cevirmeye denir.




         */

    public static void main(String[] args) {

        byte age = 23;

        // public yazmaya gerek yok main icinde oldugu icin olmasaydi yazmak gerekirdi.

        int newAge = age;

        // kucugu buyuge koymak cok kolaydir. herhangi bir riski yoktur.
        // java burada otomatik olarak bytei integerin icine koydu.

        long population = 1234;
        int newPopulation = (int)population;

        //buyuk kutuyu kucuk kutuya koymak kolay degildir. ya kutu ezilir
        // ya da yirtilir. ikisi de riske girer java risk almaz.
        // bu riski bizim almamiz gerekir.
        // (int) diye acikca yazdigimiz icin bu yontemin adi explicit dir.

        // exampe1: shortu doublea ceviren kodu yaziniz.
        // exampe2: floati byte yapan kodu yaziniz.

        short village = 235;
        double newVillage = village;

        float price = 12.99F;
        byte newPrice = (byte)price;

        System.out.println(newPrice);

        // nasil byte i ondalikli sayi yapabildik cunku
        // java yuvarlama islemi yapmaz mesela ondalik sayi olan
        // 12.99u 12 olarak calistirdi. ondalik kismi direkt siler.
        // orayi gormez.

        int number = 515;

        byte newNumber = (byte)number;


        System.out.println(newNumber);

        // sonucu 3 olarak yazdirdi cunku byte en fazla 127 olabiliyordu
        // bunu da 515i bytein icindeki toplam sayiya bolerek kalanini sonuca yazdirarark
        // elde ediyor. yani bytta 256 sayi var 515i bu sayiya bolersek
        // kalan 3 olur.
        // bu nedenle javada boyle abuk subuk sonuclar cikmasini istemedigimizden
        // buyukten kucuge ceviirme islemini cok tercih etmemeye calisiriz.
        // bazen bu ise yarar ama genelde yapmayiz.


        int num = 510;
        byte newNum = (byte)num;

        System.out.println(newNum);

        // burada da -2 olarak yazdirdi.
        // yine ayni sekilde 510u 256ya boldu. ama bolerken bolumu 1 degil
        // 2 olarak aldi o zaman da kalan -2 olur
        // bu matematikteki mod gibidir.
        // neden yapti? 1 bolum olarak alirsa kalan 254 olurdu
        // 254 de yine byte in icinde olan bir sayi degildir.


    }






}
