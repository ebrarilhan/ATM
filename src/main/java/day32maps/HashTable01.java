package day32maps;

import java.util.Hashtable;

public class HashTable01 {

    public static void main(String[] args) {

        /*
                1) hashTable bir maptir.
                2) hashTable entrySetleri herhangi bir siralamaya tabi tutmaz.
                3) hashTable hashMap ten daha yavastir. cunku hashTable lar thread-safe ve synchronized'dir.
                4) hashtable larda key, null olamaz. keyi null yaparsaniz NullPointerException atar.
                5) hashtable larda value, null olamaz. value yu null yaparsaniz NullPointerException atar.

                note: toString() methodu objeleri koonsolda detayleri ile gorebilemk icin classlarin icinde
                olusturulur.
                toString() methodunu olusturmadan objeyi konsola yazdirirsaniz java o objenin adresini yazdirir.



         */

        Hashtable<String, Integer> countryPopulations = new Hashtable<>();

        countryPopulations.put("USA",400000000);
        countryPopulations.put("Germany",83000000);
        countryPopulations.put("Turkey",90000000);

        System.out.println(countryPopulations);

//        countryPopulations.put(null,90000000);// hashTable larda key, null olamaz. nullpointerexception atar.
//        countryPopulations.put("France",null);// hashTable larda value, null olamaz. nullpointerexception atar.


        Hashtable<String,Students> myStudents = new Hashtable<>();
        myStudents.put("Math", new Students("Tom Hanks","th@gmail.com",21,true));
        myStudents.put("Science", new Students("Mary Star","as@gmail.com",32,false));
        System.out.println(myStudents);

        String name = myStudents.get("Math").name;
        System.out.println(name);

        int age = myStudents.get("Math").age;
        System.out.println(age);






    }
}
