package day12loops;

import java.util.Scanner;

public class WhileLoops01 {

    public static void main(String[] args) {
        //example1: 3 ten 10a kadar tam sayilari ayni satirsa ekrana yazdiran koduyaziniz.

        for (int i = 3; i<11 ; i++){
            System.out.print(i +  " ");

        }

        System.out.println();

        //2. yol

        int i = 3;

        while(i<11){
            System.out.print(i +  " ");
            i++;
        }

        //example 2 : 17den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz.

        System.out.println();
        int k = 17;

        while(k>3){
            if (k%2==0){
                System.out.print(k + " ");
            }
            k--;
        }



        System.out.println();
        //example 3: 12den 67ye kadar sayilarin toplamini veren kodu yaziniz.

        int sum = 0;
        int m = 12;
        while(m<68){
            sum = sum+m;

            m++;
        }
        System.out.println(sum);


        //example 4: size verilen bir tam sayinin rakamlari toplamini ekrana yazdiran kodu yazdiriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi = input.nextInt();
        sayi = Math.abs(sayi);

        int sonuc = 0;
        while(sayi>0){

            sonuc = sonuc + sayi%10;

            sayi = sayi/10;

        }
        System.out.println(sonuc);


        //example 5: kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz.
        //           3 ==> 3x1=3   3x2=6  3x3=9  ...  3x10=30
        Scanner input2 = new Scanner(System.in);
        System.out.println("carpim tablosunu gormek icin bir tam sayi giriniz");
        int s = input2.nextInt();

        int n = 1;
        while(n<11){
            System.out.println(s + "x" + n + "=" + s*n);

            n++;
        }











    }
}
