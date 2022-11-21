package day08stringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        // example 1: bir stringdeki space haric kac tane character kullanildiginiz gosteren
        // kodu yaziniz.
        // orn ali okula gitti. ==> 14 karakter var.

        String str = "Ali okula gitti.";
        int num = str.replace(" ","").length();//space i silmek istiyorsak bu
        // methodu kullaniriz. (bu ornek icin baska seyler de silebiliriz) o yuzden
        // once silmek istedigimizi yazdik " " sonra yerine
        // koymak istedigimiz karakteri gireriz. biz bir sey koymnak istemedigimz icin
        // "" hiclik koyduk.
        // replace methodu bir stringdeki herhangi bir karakteri veya karakterleri degistirmek
        // icin kullanilir.

        System.out.println(num);

        // example 2: bir stringdeki tum a harflerini 'A" ya ceviriniz.
        // toUpperCase kullanamayiz o, tum harfleri cevirir.

        String s = "Ankara'nin tasina gozlerimin yasina bak.";

        String newS = s.replace("a","A");

        System.out.println(newS);

        // example 3: bir stringdeki tum "kara" kelimelerinin yerine * koyunuz.

        String t = "Kara kara dusunme Ankara";
        String newT = t.replace("kara","*");
        System.out.println(newT);// burada buyuk k oldugu icin ilk karayi cevirmedi
        //Kara * dusunme An*

        // example 4: bir stringdeki tum sayilari *'a ceviriniz.
        // "AC202117004" ==> AC*********

        String stdId = "AC202117004";
        String newStdId = stdId.replaceAll("[0-9]","*");
        System.out.println(newStdId);

        /* bir grup datayi ifade eden kodlara "regex" denir. bunun acilimi regular
        expression dir.

        1) tum rakamlar ==> [0-9]
        2) tum kucuk harfler ==> [a-z]
        3) tum buyuk harfler ==> [A-Z]
        4) tum harfler ==> [a-zA-Z]
        5) sesli harfler ==> [aeiouAEIOU] (ingilizcedeki tabii ki)
        6) space karakteri ==> [ ] (burada space var)
        7) tum rakamlar ve tum harfler ==> [0-9a-zA-Z]
        8) tum noktalama isaretleri ==> \\p{Punct} (bunu unutursak noktalama isaretleri
        icin regex diye googleda aratabiliriz.)

        1) rakamlar haric tum karakterler ==> [^0-9] ^ haric isareti demektir.
        2) kucuk harfler haric tum karakterler ==> [^a-z]
        3) buyuk harfler haric tum karakterler ==> [^A-Z]
        4) tum harfler haric tum karakterler ==> ^[a-zA-Z]
        5) space haric ==> [^ ]

         */

        // example 5: verilan bir stringde kullanilan noktalama isareti, rakamlar ve space haric
        // tum karakterlerin sayisini bulan kodu yaziniz.

        String u = "Ali 13 yasinda, dersem inanma!...";
        int sonuc = u.
                replaceAll("[0-9]","").
                replace(" ","").
                replaceAll("\\p{Punct}","").
                length();
        System.out.println(sonuc);

        //example 6: bir passwordun gecerli olup olmadigini asagidaki kurallara gore
        // test eden kodu yaziniz.
        // 1) space haric en az 8 karakter olmalidir.
        // 2) en az 1 sembol icermelidir.
        // 3) en az bir rakam icermelidir.
        // 4) en az bir buyuk harf icermeli
        // 5) en az bir kucuk harf icermeli

        String pwd = "B78c? K!m";

        // 1) space haric en az 8 karakter olmalidir.
        boolean first = pwd.replace(" ","").length()>7;

        // 2) en az 1 sembol icermelidir. (bu rakam kucuk buyuk harf ve space haric her seydir
        boolean second = pwd.replaceAll("[0-9a-zA-Z ]","").length()>0;

        // 3) en az bir rakam icermelidir.
        boolean third = pwd.replaceAll("[^0-9]","").length()>0;

        // 4) en az bir buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>0;

        // 5) en az bir kucuk harf icermeli
        boolean fifth = pwd.replaceAll("[^a-z]","").length()>0;

        boolean pwdGecerli = first && second && third && fourth && fifth;

        if (pwdGecerli){
            System.out.println("Passwordunuz gecerlidir.");
        }else{
            System.out.println("Passwordunuz gecerli degildir.");

        }

        // example 7: bir stringdeki noktalama isaretlerinin sayisini gosteren
        // kodu yaziniz.

        String cumle = "Sen yapmazsan, ben ?...";
        int number = cumle.replaceAll("[^\\p{Punct}]","").length();
        System.out.println(number);

        // example 8: verilen bir string "Al" ile basliyor ve "x" ile bitiyorsa ekrana
        // "Harika" yazdirin aksi halde "Normal" yazdirin.

        String v = "Alex";

        boolean baslangic = v.startsWith("Al");
        boolean bitis = v.endsWith("x");

        String result = baslangic && bitis ? "Harika" : "Normal";
        System.out.println(result);








    }
}
