package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {


        //example1: kullanicidan bir dikdortgenin en ve boyunu alip alan ve
        // cevresini hesaplayan kodu yaziniz.

        Scanner input = new Scanner(System.in);

        System.out.println("dikdortgenin enini giriniz");

        int en = input.nextInt();

        System.out.println("dikdortgenin boyunu giriniz");

        int boy = input.nextInt();

        System.out.println("alan " + en*boy);
        System.out.println("cevre " + (en+boy)*2);





    }
}
