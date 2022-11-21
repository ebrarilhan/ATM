package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {

    public static void main(String[] args) {

        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz. (hocanin interwiev sorusuymus)
        //            [2, 3, 12, 0,  0,  0]


        int original[] = {0, 2, 3, 0, 12, -23};
        int yeni[] = new int[original.length];

        int idx = 0;

        for (int i = 0; i < original.length; i++) {

            if (original[i] != 0){

                yeni[idx] = original[i];
                idx++;
            }

        }

        System.out.println(Arrays.toString(yeni));

        //example 2: bir arrayin icinde herhangi bir elemanin olup olmadigini kontrol eden
        // ve kac kere tekrarlandigini gosteren kodu yaziniz.
        //              [2, 1, 2, -3, 2]  ==> kullanici 2yi sordu ==> 2 elemani var ve 3 kere
        //tekrarlandi. 6 icin orn 6 elemani yok.

        int arr[] = {5, 1, 5, -3};
        int eleman = 5;

        int counter = 0;//flag: bazi durumlarin olup olmadigini kontrol etmek icin "flag" kullanilir.

        for (int w : arr){
            if (w==eleman){
                counter++;



            }
        }

        if (counter>0){

            System.out.println(eleman + ", arrayde " + counter + " defa var.");
        }else {
            System.out.println(eleman+ " arrayde yok");
        }


        //counter, say demek...

        //example 3: size erilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz.
        //              "Java kolaydir calisana, ne kolay ki calismayana" ==> calismayana

        String sentence = "Java kolaydir calisana, ne kolay ki calismayana.";
        System.out.println(sentence);
        sentence = sentence.replaceAll("\\p{Punct}","");
        System.out.println(sentence);

        String words[] = sentence.split(" ");
        Arrays.sort(words, Comparator.comparingInt(String::length)); //compare karsilastir demek

        System.out.println(Arrays.toString(words));

        System.out.println(words[words.length-1]);







    }
}
