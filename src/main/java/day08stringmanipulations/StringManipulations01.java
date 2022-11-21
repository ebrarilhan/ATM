package day08stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {


        //example 1: kullanicidan aldiginiz ismin ilk ve son harfini ekrana yazdiriniz.
        // ramazan ==> rn
        // 1. yol

        Scanner input = new Scanner(System.in);
//        System.out.println("Lutfen isminizi giriniz.");
//        String isim = input.next();
//
//        char ilkHarf = isim.charAt(0);
//        char sonHarf = isim.charAt(isim.length()-1);// yazdiginiz kod sadece bazi durumlar icin
//        //calisirsa o koda "hard coding" denir. bu aslinda kod degildir. olu bir koddur.
//        // ancak her durum icin calisirsa o koda da dynamic coding denir.
//
//        System.out.println("" + ilkHarf + sonHarf);
//
//        // 2. yol
//
//        // eger bir stringin alt stringini alacaksak substringini aliriz.
//        // bu substring kullanildiginda ilk index dahil olur ama yazilan diger index
//        // dahil olmaz
//        //substringin iki tane kullanimi vardir.
//        // 1) substring baslangic indexi, bitis indexi: stringin ortasindan bir parca
//        // almaya yarar.
//        //2) substring baslangic indexi: stringin verilen indexten sonuna kadar almaya yarar.
//
//        String ilk = isim.substring(0,1);
//        String son = isim.substring(isim.length()-1);
//        System.out.println(ilk + son);//stringlerin ascii value su olmadigi icin
//        // burada toplama zaten yapmaz birlestirme yapar. o yuzden "" gerek yoktur
//        // java direkt birlestirme yapar.
//
//        // example 2: verilen stringdeki sadece hayvan isimlerini ekrana yazdiriniz.
//        // "Ben kedi, esim tavuk, oglum sever inek"
//        String str = "Ben kedi, esim tavuk, oglum sever inek";
//        String kedi = str.substring(4,8);
//        String tavuk = str.substring(15,20);
//        String inek = str.substring(34);
//
//        System.out.println(kedi + " " + tavuk + " " + inek);

        // example 3: ilk isim ve soy ismi iceren isimlerden ilk ve soy isimlerin bas harflerini
        // ekrana yazdiriniz. ali can ==> ac

        // tekrar scanner yazmaya gerek yok ???? dedi hoca ama kod calismadi ???

        System.out.println("ilk ve soy isminizi giriniz.");
        String tamIsim = input.nextLine();

        String a = tamIsim.substring(0,1);
        String b = tamIsim.split(" ")[1].substring(0,1);
        System.out.println(a + b);





    }
}
