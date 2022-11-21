/*
   programlama dili nedir?
   yazilan kodlarin 0 ve 1 lere cevrilmesi islemine compile denir.
    0 ve 1 ikili kodlarina da binary code denir. yani yazilan kodlarin binary code a cevrilmesi = compile
    ikili sisteme cevirirken sayiyi surekli ikiye boleriz kalanlari sagdan sola yazariz.
    bu formul aslinda onluk sistemndeki bir sayiyi ikilik sisteme cevirme olan
    taban aritmetigidir. javada her karakterin sayisal degeri vardir. (ascii tabel)
    A = 65 a = 97 bunlari bilmek yeterli.
    java ingilizce karakterler kullanir. UTF-8 ingilizce karakterler demektir.
    yani java UTF-8 kullanir.

    neden java?
    1) java ogrenmek kolaydir.
    2) cok yaygin olarak kulanilir. ingilizce dilini ogrenmek gibi
    is bulma imkani artar cunku yaygin kullanilir
    3) java platform indepented dir. yani mac de yazilan windowsta calisir.
    yazilan kod her yerde calisabilir. java esnektir. platformlardan bagimsizdir.
    4) java object oriented programming (oop) bir dildir. bunu oop olarak bilmek onemli.
    genelde kisaltmalar kullanilir.

    oop nedir?
    nesne odakli programlama demektir. object nesne demektir. procedural degildir. bu sisteme onem verir
    ancak object nesneye onem verir. procedural icin starbuckslar object ise pidecilere benzer
    pide ustasi pidenin guzel olmasi icin onemlidir. gercek dunyada procedural onemlidir
    cunku mukkemmel insan yuoktur. ancak dijitalde kusursuz yapilabileceginden bu daha oneml;idir,
    mukkemmel objeler olusturmak mumkundur.
    biz javada surekli obje olustururuz.
    oop legolara benzer. legolarin her parcasi bir objedir. application ise olusturulan seydir.

    bu objeyle alakali iki onemli sey vardir.
    1) pasif ozellikler - feature (variable - field)
    2) aktif ozellikler - functionality (method)
    pasif cocugun goz rengi boyu vs, aktif ise neler yaptigi olabilir.

 */


package day01variables;
// bu package adidir. batch103 projemizin icinde olusturduk. bu packagein adi yaninda yazilandir.
// bir projede bircok package olabilir bundan sonra da class olusturulur. birden fazla class da mumkun.



public class Genel_ClassOlusturma {


    /*

    class: objeleri olusturmnamiza yarayan kaliplardir. objeler kaliplarin yansimasidir.
    objelerde variables ve methodlar olacagindan kalipta da yani classta da bunlar olacaktir.
    yani obje olusturmak icin once clas olustururuz.
    ilk is class olusturmaktir.
    sonra classa variables ve methodlar eklenir.
    application yaparken hangi objeye hangi gorevi
    verecegimize bastan karar veririz. sonra o objenin classini olustururuz.

    objeleri entegre etmek lazim. objelerin birbirleriyle uyumlu calismasini saglariz.
    many object - integrate objects - application


    /*
    class olusturma: dort adima ihtiyacimiz var.
     1) access modifier: kullanim duzenleyici.

    kimin kullanacagina karar vermek icin kullanacagimiz kelimelerdir. javada ne olusturursak
    olusturalim bunu belirtmemiz gerekir.
    cesitleri

    a) public: hicbir sinirlama olmadan herkesin kullanabilecegi projenin her tarafindan
    erisilip kullanilabilecegi. halk kutuphaneleri gibi.
    b) protected: bir gruba ve o grutaki elemanlarin cocuklarina acik oldugu anlamina gelir.
    bu javada bir grup ve onun cocuklarinin kullanabiklecegi anlamina gelir.
    javada cocuk kavrami vardir.
    c) default: bir gruba acik oldugu anlamina gelir. orn yalnizca personelin girebilecegi yerler
    d) private: sadece kisiye ozel. orn ehliyet kisiye ozeldir.

    note: classlar protected ve private olamazlar.

    2) javaya ne olusturmak istedigimizi soyleriz. classlarda bu class dir.
    3) classa isim verme: olusturdugumuz seye isim vermemiz gerekir. bununla alakali kurallar:
    isim icerikle irtibatli yani iliskili, uyumlu olmalidir.
    class isimleri buyuk harfle baslar. kod calisir aksi halde ama gramer hatasi olur.
    class isminde birden fazla kelime kullanilacaksa her kelime buyuk harfle baslamali
    cunku okumayi kolaylastirmis oluruz.
    bu kelimeler arasinda bosluk kullanilmamalidir. class isminde space yani bosluk kullanilmaz
    4) kume parantezi {} (class body) (curly braces): bu ikisinin arasina variables ve methodlar yazilir.
    mutlaka sondaki parantezin yazdiklarimizdan sonra bulunmasi gerekir yoksa hata verir.



    // one line comment

    /* comment line1
       comment line2
       comment line3
    */

    /* DATA: programlama dillerinin ham maddesidir.
    programlama dilleri data kullanir.
    programlama dilleri data uretir.
    programlama dilleri datayi degistirir veya depolar.
    yani data denildiginde bunlari anlamak gerek. class, variable bir datadir.
    programlama dilindeki her seydir.

    BIT ve BYTE: Memory icin en kucuk yapi tasi bittir. 8 bit 1 byte demektir.
    bir data byte veya bitle soylenebilir. buyuklugune gore degisir.
    bir bit icinde 0 veya 1 barindirir.

     */



}
