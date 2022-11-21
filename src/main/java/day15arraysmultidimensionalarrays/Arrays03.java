package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {


        //example 1: bir stringdeki sesli harflerin sayisini bulan kodu yaziniz.
        //    a  e i o u A E I O U==>ingdeki sesli harfler

        String str = "Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki";

        str = str.toLowerCase();

        String harfler[] = str.split("");
        int counter = 0;
        System.out.println(Arrays.toString(harfler));

        //split methodu her zaman  array verir

        for (String w : harfler){

            switch (w){


                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
                    break;


            }


        }
        System.out.println(counter);


    }


}
