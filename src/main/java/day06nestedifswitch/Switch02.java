package day06nestedifswitch;

import java.util.Locale;
import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {

        /*
        kullaniciya ay ismi sorunuz ve kullanicinin verdigi ay isminden son aya kadar
        ekrana yazdiriniz.
         */
        // note toLowerCase() methodu bir stringdeki tum karakterleri kucuk harfe cevirir.
        // toUpperCase() ise  bir stringdeki tum karakterleri buyuk harfe cevirir.

        Scanner input = new Scanner(System.in);
        System.out.println("Ay ismini giriniz.");
        String ayIsmi = input.next().toLowerCase();

        // switchin parantezine ne tip variable yazarsak casede de onu yazabiliriz
        // ayismini String yaptigimiz icin caselerden sonra

        switch(ayIsmi){

            case "ocak":
                System.out.println("subat");
            case "subat":
                System.out.println("mart");
            case "mart":
                System.out.println("nisan");
            case "nisan":
                System.out.println("mayis");
            case "mayis":
                System.out.println("haziran");
            case "haziran":
                System.out.println("temmuz");
            case "temmuz":
                System.out.println("agustos");
            case "agustos":
                System.out.println("eylul");
            case "eylul":
                System.out.println("Ekim");
            case "ekim":
                System.out.println("kasim");
            case "kasim":
                System.out.println("aralik");
                break;
            default:
                System.out.println("Gecerli ay ismini giriniz.");


        }
    }
}
