package day30collections;

import java.util.PriorityQueue;

public class PriorityQueue01 {

    public static void main(String[] args) {

        /*
                Priority Queue, Java'nın kendisine göre belirlediği önceliğe göre sıralama yapar.

                Rastgele sıralamada, Java hiçbir önceliğe bakmaz. Gerçekten rastgele sıralama yapar.
                Burada ise, Java arkada bir kural oluşturur ve ona göre öncelik belirler.

                Bunun bize faydaları;
                        1- Kendiniz sıralama kuralını belirleyebilirsiniz.
                        2- Siz söylemedikçe, Java kendi başına bir mantık oluşturur ve o mantığa göre bir sıraya dizer.
         */

        PriorityQueue<String> myQueue = new PriorityQueue<>();
        myQueue.add("A");
        myQueue.add("E");
        myQueue.add("B");
        myQueue.add("G");
        myQueue.add("C");

        System.out.println(myQueue);        // [A, C, B, G, E]

    }
}
