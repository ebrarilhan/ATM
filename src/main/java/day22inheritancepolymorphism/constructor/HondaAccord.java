package day22inheritancepolymorphism.constructor;

import day22inheritancepolymorphism.constructor.Honda;

public class HondaAccord extends Honda {

    /*
        1) siz class olusturdugunuzda java otomatik olarak size gorulmez bir constructor verir.
        cunku java classin bir kalip oldugunu ve object olusturmak icin yaratildigini ve object olusturmak
        icin constructorin sart oldugunu bilir.



        2) javanin otomatik olarak olusturdugu bu gorunmez constructora default constructor denir.

        3) siz kendiniz herhangi bir constructor olusturdugunuzda java default constructori siler.

        4) bir classda birden fazla constructor olabilir. fakat bu constructorlarin parametreleri
        farkli olmalidir. () PARANTEZ ICLERI FARKLI OLMALI

        5) "this" keyword "bu class" anlamindadir."this.price" demek bu classdaki price isimli variable
        demektir. this.price syntaxi constructorlarin icinde kullanilir.

        6) constructor kullanarak variablellar uzerinde yaptiginiz degisimler sadece object uzerindeki
        variabellarin degerlerini degistirir. classdaki variable degerlerini degistiremez.BU COK ONEMLI
        YANI KALIPLAR (CLASSLAR) ASLA DEGISMEZ. OBJECT DEGISIR.
     */
    public int price;
    public int year;
    public String make;
    public String model;


    public HondaAccord(){

    }

    public HondaAccord(int price){
        this.price = price;

    }

    public HondaAccord(int price, int year){


        this.price = price;
        this.year = year;
        System.out.println("Honda Accord Constructor");

    }

    public HondaAccord(int price, int year, String make, String model){
        this.price = price;
        this.year = year;
        this.make = make;
        this.model = model;
    }






}
