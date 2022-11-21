package day10stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String a = "Java kolaydir.";

        //bu kod ilk bes karakterden sonraki stringe bakar ve o stringin kola ile baslayip
        // baslamadigini kontrol eder. kola ile basliyorsa true, baslamiyorsa false return eder.
        boolean b = a.startsWith("kola",5);
        System.out.println(b);

        //bu kod strindeki ilk a yi * a cevirir. sadece replace yazsaydik bu ise strindeki tum
        // a harflerini yildiza cevirirdi.
        String c =a.replaceFirst("a","*");
        System.out.println(c);

        //concat methodu iki tane stringi birbirine yapistirmaya yarar.
        //concatenation islemi iki turlu yapilabilir. birincisi + ile yapilabilir.
        //ikincisi concat ile yailabilir.
        // java bir islem icin method uretmisse o methodu kullanmak best practice dir.
        //yani en iyi uygulamadir.
        String d = a.concat(" Anladin mi?");
        System.out.println(d);

        // bu method her zaman en sona ekler. eger araya eklemek istersek onun icin replace
        // kullanabiliriz. ya da baska seylerle...

        String e = "   Tom Hanks     ";
        System.out.println(e);

        //trim methodu bir stringin bas ve sonundaki space karakterlerini siler. aradaki space
        //karakterlerine dokunmaz.
        String f = e.trim();
        System.out.println(f);

        String h = "Java";
        String i = "Java";
        int k = h.compareTo(i);//bu kodda h nin alfabetik sirasindan i nin alfabetik sirasi cikarilir

        System.out.println(k);
        // bu kod iki tane stringi alfebetik (lexicographic) olarak karsilastirir.
        //buyuk harfe duyarlidir. bunu istemiyorsak compareToIgnoreCase kullanilabilir.

        //buyuk harflerle kucuk harflerin arasinda 32 ascii fark vardir. messela A 65 a ise
        //97dir. aralarinda 32 fark var. eger buyuk harf kucuk harf onemsenmesin istiyorsak
        //comparetoignorcase methodu vardir.

        String n = a.repeat(5);
        System.out.println(n);
        //a.repeat(5) kodu a stringini yan yana bes kere yapistirir. repeat(0) ise bos yani
        //empty string return eder.

        //windows icin eger methodun aciklamasini okumak istiyorsak methodun ustune
        // gelerek ctrl ye basili tutariz ve cikan linke tiklariz. (java dokumente ulasmak icin)






    }
}
