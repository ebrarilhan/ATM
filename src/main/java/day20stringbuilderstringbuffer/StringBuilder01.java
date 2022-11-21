package day20stringbuilderstringbuffer;

public class StringBuilder01 {

        /*
        1)String Builder javada bir classtir.
        2)stringbuilder string olusturmaya yarar.
        3)String class varken nicin string buildera ihtiyac duyariz?
            cunku string class "inmutable(degisime kapali) class"dir. ama biz bazen mutiable
            stringlere ihtiyac duyariz. StringBuilder bize mutable (degisime acik) string verir.
        4)inmutable classlarda var olan deger degistirilemez. siz var olan bir degeri degistirmek
        istediginizde
        i) memoryde yeni bir variable yeni degerle olusturulur
        ii) eski variablein pointeri yeni variable a dondurulur.
        iii) eger bir variable i hicbir pointer gostermiyorsa  o variable "Garbage Collector"
        tarafindan silinir.

        Mutable classlarda var olan deger degistirilebilir. orijinal deger korunmaz.

        5)String classlarin inmutable yapisi security icin onemlidir.
        ayni degere sahip birden fazla string oldugunda java bir tane container olusturur. ve
        ayni degere sahip stringlerin bu containeri kullanmasini temin eder. bu memoryi korumak icin
        iyidir. ancak containerdaki degeri bir variable icin degistirdigimizde tum variablellarin
        etkilenmesi tehlikesi vardir. bu tehlikeden kurtulmak icin java stringleri "inmutable (degismez)"
        yapmistir. fakat herhangi bir variablein degerini degistirmek icin java bir yol bulmuistur.
        degistirmek istediginiz variable icin yeni bir conteiner olusturur ve variablin pointerini
        bu yeni variable a yonlendirir. boylelikle hem degisim saglanmis hem de digerleri etkilenmemis
        olur.
         */

    public static void main(String[] args) {

        String str = "Java";
        str = "Super Java";
        System.out.println(str);

        //string builder nasil olustururlur?
        //1.yol
        StringBuilder strb1 = new StringBuilder("Java");
        System.out.println(strb1);

        //2.yol
        StringBuilder strb2 = new StringBuilder();
        //yol a:
        strb2.append("Java");
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);//Java is easy!!!

        //yol b:
        strb2.append(" Learn").append(" Java earn").append(" money");//method chain, method zinciri demektir.
        System.out.println(strb2);

        //StringBuilder larda karakter sayisi nasil bulunur? ==> length methodu ile bulunur
        StringBuilder strb3 = new StringBuilder();
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxx");

        int numOfChar = strb3.length();
        System.out.println(numOfChar);

        //capacity asimlarinda capacity, var olanin iki katinin iki fazlasina cikar.
        int capacity1 = strb3.capacity();
        System.out.println(capacity1);//34 ==> 16*2 + 2 == 34

        strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        int capacity2 = strb3.capacity();
        System.out.println(capacity2);//70 == 34*2+2

        //setCharAt ==> index 2 deki karakteri r ye cevirir.
        strb3.setCharAt(2,'r');
        System.out.println(strb3);

        //delete (3,18) ==> index 3 dahilden index 18 harice kadar tum karakterleri siler.
        strb3.delete(3,18);
        System.out.println(strb3);

        //deleteCharAt ==> index 2 deki karakteri siler
        strb3.deleteCharAt(2);
        System.out.println(strb3);

        //reverse methodu stringBuilderi ters cevirir. yani Ali ==> ilA
        //mutable larda sadece method kullanmak orijinal degeri degistirmek icin yeterlidir.
        strb3.reverse();
        System.out.println(strb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //inmutable larda orijinal degeri degistirmek icin methodu kullanmak yeterli olmaz bir de
        //atama islemi yapmalisiniz
        String abc = "Java";
        abc = abc.replace("a","i");
        System.out.println(abc);//Jivi

        //toString methodu StringBuilderlari Stringe cevirir.
        String stringStrb3 = strb3.toString();
        System.out.println(stringStrb3);

        //Stringden de StringBuildera asagidaki gibi donebilirsiniz.
        StringBuilder strb4 = new StringBuilder(stringStrb3);
        System.out.println(strb4);

        //Insert() ==> 3. karakterden sonra "XXXX"leri koydu
        strb4.insert(3,"XXXX");
        System.out.println(strb4);

        //strb4 ye 3. karakterinden sonra "KLMOPQRSTU" stringinin index 5 6 ve 7deki karakterlerini
        // yerlestirir.
        strb4.insert(3,"KLMOPQRSTU",5,8);
        System.out.println(strb4);

        StringBuilder a = new StringBuilder("Java");
        StringBuilder b = new StringBuilder("Java");

        //compareTo methodu
        //i) StringBuilder lar tamamiyle ayni ise 0 verir.
        //ii) a alfabetik sirada b'den sonra gelirse pozitif olarak aradaki alfabetik siralama farkini
        //gosterir.
        //iii) a alfabetik sirada b'den once gelirse negatif olarak aradaki alfabetik siralama farkini
        //gosterir.

        int sonuc = a.compareTo(b);
        System.out.println(sonuc);
















    }


}
