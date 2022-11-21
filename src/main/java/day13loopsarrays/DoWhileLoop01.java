package day13loopsarrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        //example 1: kullanicidan bir sayi aliniz. sayi 100den kucuk ise ekrana kazandin yazdiriniz.
        // aksi halde ekrana kaybettin yazdiriniz.
        // kullanici kazandikca oyun devam etmeli.


        Scanner input = new Scanner(System.in);
//        int sayi = 0;
//        do {
//            System.out.println("bir sayi giriniz.");
//            sayi = input.nextInt();
//            if (sayi<100){
//                System.out.println("Kazandiniz!");
//            }
//        }while(sayi<100);
//
//
//        System.out.println("Kaybettiniz!");

        //example 2: kullanicidan isimler aliniz ilk harfinin buyuk harf olup olmadigini kotnrol
        //ediniz.



        do {
            System.out.println("bir isim giriniz.");
            char ilk = input.next().charAt(0);


            if(ilk>='A' && ilk<='Z'){
                System.out.println("Isim basarili");
            }else{
                System.out.println("ismi yanlis girdiginiz icin isleiniz iptal edilmistir.");
                break;
            }

        }while(true);




        //infinite loop: sonsuz dongu demektir. loop olustururken sonsuz olmamasina dikkat etmemiz gerekir.
        //

//        for (int i = 1; i<4 ; i--){
//            System.out.println("Hi");
//        }
        //arttirma azaltma kismini yazmazsaniz "infinite loop sorunsali" olusur.

//        for (int i = 1; i<4 ;){
//            System.out.println("Hi");
//        }

        int i = 12;
        while(i<15){
            System.out.println("Hi");
        }



    }
}
