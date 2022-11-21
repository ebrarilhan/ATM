package day32maps;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        // for-each loop kullanarak her elemanin sonuna ! ekleyiniz.
        // note: looplar kendi baslarina collectionlari update edemezler. bu yuzden java iterator lari
        // olusturdu. bunlar collectionlari update etmek icin kullanilir.

        for (String w : myList){

            w = w + "!";

        }

        System.out.println(myList);// [Z, K, A, J, M] ==> eklemedi cunku listte degisen sey olmaz.

        ListIterator<String> itr = myList.listIterator();

        while (itr.hasNext()){

            String el = itr.next();
            itr.set(el+"!");

        }

        System.out.println(myList);// [Z!, K!, A!, J!, M!]

    }
}
