package day09stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        String str = "Java is easy";
        int idxA1 = str.indexOf("a");
        System.out.println(idxA1);

        // note indexof methodu verilen karakter veya karakterlerin ilk gorunumunun indexini
        // verir.

        int idxA2 = str.lastIndexOf("a");
        System.out.println(idxA2);

        // lastIndexOf() methodu herhangi bir karakter veya karakterlerin en son nerede (indexte)
        // goruldugunu ogrenmek icin kullanilir

        String str1 = "Kara kara dusunme Ankara";
        int idxA3 = str1.indexOf("kara");
        System.out.println(idxA3);

        String str2 = "Kara kara dusunme Ankara";
        int idxA4 = str2.lastIndexOf("kara");
        System.out.println(idxA4);

        String s = "Mississippi";
        int idxI = s.indexOf('i');
        System.out.println(idxI);

        // note: indexof hem string hem de char ile kullanilabilir

        int idxIss = s.indexOf("iss");//ilk gorunumun ilk karakterinin indexini verir.
        System.out.println(idxIss);
        int idxIss2 = s.lastIndexOf("iss");//son gorunumun yine ilk karakterini verir.
        System.out.println(idxIss2);

        //example 1: bir stringdeki bir karakterin tekrarli veya tekrarsiz olup olmadigini
        //gosteren kodu yaziniz.
        // orn "Hellooo" ==> H tekrarsiz l tekrarli e tekrarsiz o ise tekrarli

        String t = "Helloooo";
        char c = 'H';
        if (t.indexOf(c)==t.lastIndexOf(c)){
            System.out.println("tekrarsiz");
        }else{
            System.out.println("tekrarli");
        }


        String u = "Learn Java earn money";
        int sonuc = u.indexOf("n",5);
        System.out.println(sonuc);

        // bu, 5. indexten sonraki ilk n harfinin indexsini ver demektir.
        // indexOf iki parametre ile kullanilirsa ikinci parametrede verilen sayi kadar
        //karakteri gectikten sonra istenen karakterin ilk gorunumunun indexini return eder.

        int son = u.lastIndexOf("a",5);
        System.out.println(son);


        // lastIndeexOf iki parametre ile kullanilirsa ikinci parametrede verilen sayiyi index
        //olarak kabul edip en bastan bu indexe kadar olan karakterleri bir kutu icine aliniz ve
        //lasIndexOf methodunu sadece bu kutu icindeki string icin kullaniniz.
        String m = "Hello everyone!";
        int e = m.lastIndexOf("e",10);
        System.out.println(e);




        String v = "";
        boolean bosMu = v.isEmpty();
        System.out.println(bosMu);

        // bu method verilen stringde hic karakter yoksa yani bossa true verir.
        // let op: space hiclik degildir.
        // isEmpty methodu bir stringin bos olup olmadigini kontrol eder. eger stringde hic
        // karakter yoksa isEmpty() true return eder. herhangi bir karakter varsa false return
        // eder.
        // length()==0 demek isEmpty() true verir demektir. yani bu ikisi ayni anlama gelir.
        // o zaman neden boyle bir method var? lenth de iki tane is var uzunluk alma ve onu
        // esitleme. isEmptyde ise direkt tek isle sonuc bulunur.
        // bu nedenle burada length kullanmayin

        String x = "    ";
        boolean blankMi = x.isBlank();
        System.out.println(blankMi);

        // isBlank hem bos string icin hem de "sadece space" iceren stringler icin true
        // return eder.

        // example 2: kullanicidan alinan isim mutlaka spaceden farkli en az bir karakter
        // icermelidir.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ilk isminizi giriniz.");
        String ilk = input.nextLine();

        if (ilk.isBlank()){
            System.out.println("Sana ismini gir dedim");
        }else{
            System.out.println(ilk);
        }



    }
}
