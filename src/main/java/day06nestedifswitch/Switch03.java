package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {
        // note switchde sadece int, byte, short, char ve string data tipleri
        //kullanilabilir. boolean double float long icin kullanamayiz. if else
        // kullaniriz. eger ucten fazla durum varsa hoca tercihen switch kullanir.
        // ama diyelim ki pozitif negatif durum tek var if else kullaniriz.

        // kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekrana yazdiran
        // basit bir hesap makinesi yapiniz.


        Scanner input = new Scanner(System.in);
        System.out.println("Islemi giriniz. + - * / %");
        char islem = input.next().charAt(0);
        System.out.println("Ilk sayiyi giriniz.");
        double ilk = input.nextDouble();
        System.out.println("Ikinci sayiyi giriniz");
        double ikinci = input.nextDouble();

        switch (islem){
            case '+':
                System.out.println(ilk+ikinci);
                break;
            case '-':
                System.out.println(ilk-ikinci);
                break;
            case '*':
                System.out.println(ilk*ikinci);
                break;
            case '/':
                System.out.println(ilk/ikinci);
                break;
            case '%':
                System.out.println((ilk*ikinci)/100);
                break;
            default:
                System.out.println("Bu islem tanimlanmamistir.");

        }

        // burada double kullanildi ama switchin icinde degil o yuzden double distaysa mumkun

    }
}
