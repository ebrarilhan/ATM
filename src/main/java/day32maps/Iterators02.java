package day32maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Z");
        myList.add("K");
        myList.add("A");
        myList.add("J");
        myList.add("M");

        //example 1: iterators kullanarak list elemanlarini tersten consola yazdiriniz.
        ListIterator<String> itr = myList.listIterator();

        //hasNext() methodu pointerdan sonra eleman varsa true, yoksa false return eder.
        //next() methodu pointeri bir sonraki elemnin onune koyar ve ustunden atladigi elemani return eder.
        while(itr.hasNext()){
            itr.next();
        }

        //hasPrevious() methodu pointerdan once eleman varsa true, yoksa false return eder.
        //Previous() methodu pointeri bir onceki elemnin sonuna koyar ve ustunden atladigi elemani return eder.
        while(itr.hasPrevious()){

            String el = itr.previous();
            System.out.print(el + " ");

        }

        System.out.println();
        System.out.println(myList);

        //example 2: listteki tum elemanlari siliniz.
        while(itr.hasNext()){
            itr.next();
            itr.remove();

        }

        System.out.println(myList);


        /*
        ListIterator da :
        1)hasNext()
        2)next()
        3)set()
        4)hasPrevious()
        5)previous
        6)remove() methodlari vardir

        ListIterator,

        1) Sağdan sola / soldan sağa hareket edebilir.
        2) ListIterator ile bir List'i düzenleyebilirsiniz.


        Iterator da :
        1)hasNext()
        2)next()
        3)remove() methodlari vardir.

        Iterator,

        1) Sadece soldan sağa hareket edebilir.
        2) Update özellikleri yoktur.


        */

        List<String> yourList = new ArrayList<>();
        yourList.add("Z");
        yourList.add("K");
        yourList.add("A");
        yourList.add("J");
        yourList.add("M");

        Iterator<String> iterator = yourList.iterator();

        while (iterator.hasNext()) {
            String el = iterator.next();
            System.out.print(el);
        }




    }
}
