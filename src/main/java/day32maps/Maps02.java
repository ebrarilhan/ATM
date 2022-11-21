package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {

    public static void main(String[] args) {

        //size verilen bir kelimede kullanilan harflerin kacar kere kullanildigini gosteren kodu yaziniz.
        // abbcaa ==> a=3,b=2,c=1

        String str = "abbcaa";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        HashMap<String, Integer> map = new HashMap<>();

        for (String w : arr){

            Integer gorunumSayisi = map.get(w);

            if (gorunumSayisi==null){

                map.put(w,1);

            }else{

                map.put(w,gorunumSayisi+1);
            }


        }

        System.out.println(map);

    }
}
