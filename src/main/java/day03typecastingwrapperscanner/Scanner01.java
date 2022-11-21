package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {

    //scannerler disaridaki bir datayi benim kodumun icine tasir
    // yani scanner kullanicidan data almaya yarar.
    // scanner kullanici ile etkilesim kurmamizi saglar
    // scanner bir java classidir. bu classi kulanabilmek icin import (ice aktarmak)
    // etmek gerekir.scanner classi javanin util kutuphanesindedir.

    public static void main(String[] args) {

        // kullanicidan data almak icin yapilmasi gerekenler:
        // 1. adim: scanner classindan obje olsuturun
        //obje olusturma kurallari ile ayni

        Scanner input = new Scanner(System.in);

        // 2. adim: kullaniciya ne yapacagini soyle

        System.out.println("Hey kullanici yasini gir...");

        //3. adim: kullanicidan aldiginiz datayi bir variablein icine koyun

        byte age = input.nextByte();

        System.out.println("Hey kullanici senin yasin " + age);








    }


}
