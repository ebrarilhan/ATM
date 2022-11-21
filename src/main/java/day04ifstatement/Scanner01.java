package day04ifstatement;

import java.util.Scanner;

//Kullanicidan ilk, orta ve soy ismini aliniz ve asagidaki formatta ekrana yazdiriniz
       // Ali Mert Can
       //123456789

public class Scanner01 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //1. yol

        System.out.println("ilk isminizi giriniz.");
        String ilkisim = input.next();

        System.out.println("ikinci isminizi giriniz.");
        String ikinciisim = input.next();

        // next methodu kullanicidan String datasi almak
        //icin kullanilir

        System.out.println("soy isminizi giriniz.");
        String soyisim = input.next();

        System.out.println("kimlik numaranizi giriniz.");
        String kimlikNo = input.next();

        System.out.println(ilkisim + " " + ikinciisim + " " + soyisim);
        System.out.println(kimlikNo);

        //2. yol
        System.out.println("ilk, orta ve soyismizini ve kimlik numaranizi giriniz.");

        String ilk = input.next();
        String orta = input.next();
        String soy = input.next();
        String kimlik = input.next();

        System.out.println(ilk + " " + orta + " " + soy);
        System.out.println(kimlik);

        // 3. yol
        System.out.println("ilk, orta ve soyisminizi giriniz.");
        String tamIsim = input.nextLine();
        System.out.println(tamIsim);
        System.out.println("kimlik numarasini giriniz.");
        String kimlikk = input.next();
        System.out.println(kimlikk);


        // nexxt ile nextline arasindaki fark
        // next methodu kullanicidan gelen stringin sadeece ilk kelimesini alir
        //nextline methodub kullanicidan gelen stringin tamamini alir
        // orn kimlik no almak icin hic boslk kullanilmayacagindan next yapmak yeterli olur
        // yani next aslinda ilk kelime kullanmak istedigimizde lazim olur
        // ilk harfi veya herhangi bir harfi alma diger scanner doyasinda anlatildi

         // ctrl + / ile kodu kapatabiliriz. acmak icin de aynisi yapilabilir.





    }
}
