package day05ifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        // example 1: kullanicidan gun isimlerini aliniz. o gunun haftasonu mu
        //haftaici mi oldugunu soyleyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("bir gun ismi giriniz");
        String gun = input.next();

        // equals methodunu iki tane stringi karsilastirmak icin kullaniriz
        //iki stringin birbirine esit olup olmadigini anlamak icin == bunu degil
        // equals() bunu kullaniniz.
        // ignore onemsememek dikkate almamak anlamina gelir.

        // 1. yol

        if (gun.equalsIgnoreCase("pazar")){

            System.out.println("haftasonu");
        }else if (gun.equalsIgnoreCase("pazartesi")) {

            System.out.println("haftaici");
        }else if (gun.equalsIgnoreCase("sali")) {

            System.out.println("haftaici");
        }else if (gun.equalsIgnoreCase("carsamba")) {

            System.out.println("haftaici");
        }else if (gun.equalsIgnoreCase("persembe")) {

            System.out.println("haftaici");
        }else if (gun.equalsIgnoreCase("cuma")) {

            System.out.println("haftaici");
        }else if (gun.equalsIgnoreCase("cumartesi")) {

            System.out.println("haftasonu");
        }else{
            System.out.println("gecerli bir gun ismi yaziniz.");
        }

        // iki tane stringin birnbirine esit olup olmadigini kontrol etmek icin iki
        // tane method kullanilabilir. bunlardan biri equals
        // bu, buyuk harf ile kucuk harfi onemser. A ile a farklidir
        // equalsIgnoreCase methodu ise buuuk kucuk harfi onemsemez.
        // A ile a aynidir

        //2. yol

        if (gun.equalsIgnoreCase("pazar") ||
                gun.equalsIgnoreCase("cumartesi")){

            System.out.println("haftasonu");
        } else if (gun.equalsIgnoreCase("pazartesi") ||
                    gun.equalsIgnoreCase("sali") ||
                    gun.equalsIgnoreCase("carsamba") ||
                    gun.equalsIgnoreCase("persembe") ||
                    gun.equalsIgnoreCase("cuma")){
            System.out.println("haftaici");

        }else {
            System.out.println("gecerli bir gun ismi giriniz.");

        }

        // 3. yol

        boolean haftasonu = gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("pazar");
        // boolean haftasonu = false

        //veya yani || islemi bize boolean verir.

        boolean haftaici =  gun.equalsIgnoreCase("pazartesi") ||
                            gun.equalsIgnoreCase("sali") ||
                            gun.equalsIgnoreCase("carsamba") ||
                            gun.equalsIgnoreCase("persembe") ||
                            gun.equalsIgnoreCase("cuma");

        //boolean haftaici = true

        if (haftasonu){

            System.out.println("haftasonu");
        } else if (haftaici){
            System.out.println("haftaici");

        }else {
            System.out.println("gecerli bir gun ismi giriniz.");
        }

        // kodlar olabildigince sade ve parantez icleri boz olmalidir.


    }
}
