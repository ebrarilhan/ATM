package day01variables;


public class Variables01 {


    // Variable nasil olusturulur?

    // 1)Access modifier 2)data type 3)variable ismi 4)= 5) deger atama 6) ; (noktali virgul)

    public int age = 13;
    public int height = 183;

    // aralarinda birer tane bosluk yeter. daha fazlasina gerek yok.
    // access modifier ile data tipi arasinda bosluk olmali
    // data tipi ile variable ismi arasinda da bosluik olmali.
    // = isaretinin sagina ve soluna bosluk koymaya gerek yoktur.
    // bu okumakligi arttirmak icindir.
    // javada ; ingilizcedeki nokta gibidir.
    // ingilizde cumle deriz javada statement deriz
    // ; den once de istedigimiz kadar bosluk koyabiliriz ama gerek yok genel kullanim budur.
    // = sembolu assigment (atama) operator olarak adlandirilir
    // yani sagdaki degeri alir soldaki variablein icine atar. esitlemezzzz bu cokomelli
    // sayisal data tiplerinde java otomatik 0 atar ama biz bunu deger atayarak degistiririz


    // javada data type leri

    /* primitive data types: icinde sadece bir deger vardir.

    1) int: integer kisaltmasi ve tam sayi demektir.
    matematikte tamsayilarin basi ve sonu yoktur fakat javada vardir.
    en  kucuk int -2,147,483,648 (buradaki sayilar her data tipinde dahildir)
    en buyuk int 2,147,483,647
    bu degerlerin uzerinde degerler atanamaz.
    memoryde 32 bit kullanir yani 4 byte
    memoryi tasarruflu kullanmak icin java boyle bir yontem belirlemistir.
    cunku applicationlar icin hafiza onemlidir.
    yani neye ihtiyacimiz varsa o data tipini seceriz.
    yani sadece bu aralikta integer belirleyebiliriz
    ancak variable ismi icin bir sinir yoktur.

    2) byte: tam ssayilar icin kullanilir
    en kucuk byte -128
    en buyuk byte 271
    bunun araligi daha kucuk oldugundan memoryi daha az kullandi.
    eger byte yeterliyse int kullanmaya gerek yok cunku memoryde daha az yer kaplar.
    mesela age kullanirken gerek yok bir insanin yasi en fazla kac olabilir ki?
    memoryde 8 bit kullanir. 1 byte
    */

    public byte price = 12;

    /*
    3) short: tam sayilar icindir
    en kucuk short -32768
    en buyuk short 32767
    int ile byte arasinda kalir. mesela sitede yasayanlarin sayisi icin kullanilabilir
    16 bit kullanir. 2 byte
    */

    public short populationOfVillage = 23000;

    /*

    4) long: tam sayilar icindir. bu da integerin yetmedigi yerlerde kullanilir.
    mesela dunyanin nufusu
    en kucuk long -9223372836854755808
    en buyuk long bla bla ....7
    64 bit kullanir. 8 byte
    memoryi korumak icin long kullansak bile java bunu integer olarak kabul eder asagida orn var
    longu kabul etmedi. sonra da sayi integer icin buyuk oldugundan hata veriyor.
    bu sorunu cozmek icin sayinin sonuna L harfi koyulmali. yani int araliginin disina cikilacaksa
    mutlaka buyuk L konulmali. cunku kucuk l 1 sayisina benzetilip karistiriliyor.
    */

    public long populationOfWorld = 7000000000L;
    public long x = 1234;




    // burada problem yok cunku integer degerlerinin disinda degil ama biz yine de
    // her zaman L harfi koyariz aliskanlik kazanmak ve hata yapmamak icin
    // ikinci ornekte java, integer memory hafizasini kullanir. longun degil.
    // birinci ornekte java, long memory hafizasini kullanir


    /*

    5) float: ondalikli sayilar icindir. bir gomlegin fiyati icin kullanilabilir. (orn 12.99)
    virgulden sonra 7 basamak icerebilir
    float degerlerinde sona kucuk f veya buyuk F koymamiz gerekir. (sayilarin sonuna)
    orn 1.25f
    developerlar bunu sevmediklerinden genelde ondalikli sayilar icin double kullanirlar.
    32 bit yer kaplar. integer gibi

     */

    public float priceOfShirt = 13.99f;
    public float priceOfBook = 15.99F;



    /*

    6) double: ondalikli sayilar icindir. mesela bir hucrenin agirligi icin
    virgulden sonra 16 basamak icerebilir
    64 bit kullanir. long gibi
    */

    public double weightOfCell = 0.0000012845;

    /*

    7) boolean: javada dogru yanlis sorulari vardir. true veya false degerleri icin kullanilir.
    o yuzden 1 bit kullanir
    NOT: JAVA KUCUK VE BUYUK HARFLERE DUYARLIDIR. yani java icin true ile TRUE tamamen farklidir.
    */

    public boolean isOld = true;
    public boolean isRich = false;

    /*
    8) char: tek karakterler icin kuallanilir.
    orn A, C, 2, ?, _, = ......
    16 bit kullanir.
    AMA TEK KARAKTERI TEK TIRNAK ARASINA KOYMAK GEREK. yoksa hata verir.
    */

    public char initial = 'S';
     /*

    note: numeric data types:
    byte < short < int < long < float < double (memoryi kullanim sirasi)
    float ve double ondalikli sayilar oldugu icin daha fazlalardir.
    float longdan daha az memory kullanir ama longdan daha buyuktur.

    numeric olmayan data types:
    boelean ve char

    non-primitive data types: icinde deger ve methodlar vardir.

    1) String: isim, adres, kimlik no (bu matematik yani integer islemi degildir isim gibi
    sabit bir degerdir)  gibi bir veya birden fazla karakter iceren degeerlerde kullanilir.
    string degerleri mutlaka "" (cift) tirnak arasina konulmalidir. aksi halde hata aliriz.
    non primitive dir. yani bir string olusturdugumuzda java bize bir suru method verir.
    ama bunun icin once main yazmamiz yani motoru calistirmamiz gerek.
    calistirdiktan sonra  main methodun araligina {} name. yazilir
    ( asagida kodunu yazdigimiz datanin adi name oldugu icin.. baska sey olsa onu yazardik)
    ve orada methodlar java tarafindan otomatik verilir. mesela butun harfleri buyuk harf yapmak,
    kac karakter kullandigimizin hesabi vb islemler icin istersek alip kullaniriz.
    bu methodlar cok kullanislidirlar.
    stringler icin farz olan aksiyonlari java, stringe eklemis, hazirlamistir.
    biz de gerekli oldugunda kullaniriz.


    */

    public String name = "Tom Hanks";




    // main method arabanin motoru gibidir. yani main methodsuz program olmaz ve calismaz.
    // main method calismadan hicbir sey calismaz. ama classin icindekileri calistirmamiz gerekecek.
    // bunu calistirmak icin psvm yazip entera basariz.


    public static void main(String[] args) {



    }

    //primitive ile non primitive lerin farki nedir?

    /*
    1) non primitive (orn String) data tiplerinde degerin yaninda methodlar vardir.
    primitive data typelerinde ise sadece deger vardir method yoktur.
    2) primitive data tipleri java tarafindan olusturulmustur. toplam 8 tanedir.
    biz primitive data olusturamayiz.
    non primitiveler java tarafindan da olusturulmustur. biz de olusturabiliriz.
    bu nedenle non primitiveler sayilamayacak kadar coktur. cunku her developer non primitive data
    type olusturabilir.
    note: java developerlarin her olusturdugu claas ayni zamanda non primitivedir.
    biz de class oplusturduk ve icine hem method hem de deger yazdik.
    bizim olusturdugumuz class da bir non primitivedir.
    3) primitive data tipleri isimlendirilirken kucuk harflerle baslarlar.
    non primitive data tip isimleri buyuk harfle baslarlar. orn String
    kucuk harfle olusturursak hata verir.
    neden buyuk harfle baslar? cunku tum classlar ayni zamanda non primitivelerdir.
    classlarda da buyukle baslama kurali vardi.
    4) primitive data typler memoryde farkli buyuklukte yerler kullanir.
    ancak non primitivelerin hepsi memoryde ayni buyuklukte yer kullanirlar.






     */



}



