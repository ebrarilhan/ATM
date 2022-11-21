package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    /*
    note: char variable lari matematiksel islemlerde kullanirsaniz java onlarin
    ascii degerlerini kullanir. orn System.out.println('A' + 'C');
    ekrana AC yerine 132 yazdirir.
    javada + sembolunun iki anlami vardir.
    1) toplama
    2) birlestirme (concatenation)
    + sembolu gorunce once toplama yapmaya calisir
    yapamazsa birlestirme islemi yapmaya calisir. o da olmazsa baska ihtimal
    kalmadigindan hata verir.
     */

    public static void main(String[] args) {

        // kullanicidan ilk ve soyismini aliniz. ilk ve soyisminin ilk harfini ekrana yaziniz

        Scanner input = new Scanner(System.in);

        // 1. yol

        System.out.println("ilk isminizi yaziniz.");
        char ilkIsim = input.next().charAt(0);

        // char karakter demek charAt ise de da yani isimdeki karakterlerden
        // indeksi 0 olani ver demektir.

        System.out.println("soy isminizi yaziniz.");
        char soyIsim = input.next().charAt(0);

        System.out.println("" + ilkIsim + soyIsim);

        /*
        javada arti + isaretinin iki anlami vardir. biri toplama digeri ise
        birlestirmedir. matematik islemni yapmasini istemiyorsak birlestirme
        yapmasini isteyebiliriz bunun icin de "" isaretini araya bopsluk koymadan
        + isaretinden once yazariz ki java soldan saga islem yaparken bu bos stringi
        birlestirsin. bu birlstirmenin sonucu stringdir
        hatirlarsak string data tipinde "" isaretini kullaniyorduk bu da
        islemi stringe cevirdigi anl;amina gelir.

         */
        // 2. yol

        System.out.println("tam isminizi giriniz.");
        String tamIsim = input.nextLine();

        char ilkHarf = tamIsim.charAt(0);
        System.out.print(ilkHarf);

        char soyIsminIlkHarfi = tamIsim.split(" ")[1].charAt(0);
        System.out.println(soyIsminIlkHarfi);






    }
}
