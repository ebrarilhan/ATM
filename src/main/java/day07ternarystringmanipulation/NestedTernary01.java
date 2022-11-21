package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*

        verilen yilin "leap year" (artik yil) olup omadigini kontrol eden kodu yaziniz.
        1) yil 100e bolunurse 400e de bolunmelidir. ==> 1600 artik yildirn 1800 degildir
        2) yil 100e bolunmezse 4 e bolunmelidir. ==> 1996 artik yildir. 2001 degildir.

         */

        int year = 2001;

       String leap = year%100==0 ? (year%400==0 ? "Leap Year" : "Leap Year degil.") : (year%4==0 ? "Leap Year" : "Leap Year degil.");
        System.out.println(leap);

        /*  asagidaki kurallara gore passwordun gecerlui olup olmadugini kontrol eden
         kodu yaziniz

        1) 8 karakterden fazla veya 8 karakter varsa ilk harfi kucuk i olmalidir
        2) 8 karakterden az karakter varsa ilk harfi buyuk K olmalidir
         */

        // burada istedigimiz sirayla baslayabiliriz.

        String pwd = "KZa54";

        char ilkHarf = pwd.charAt(0);

        String gecerli = pwd.length()<8 ? (ilkHarf == 'K' ? "Gecerli" : "Gecersiz") : (ilkHarf == 'i' ? "Gecerli" : "Gecersiz");
        System.out.println(gecerli);

    }
}
