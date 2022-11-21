package day16multidimensionalarraysarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    /*
    array list ler ayni data tipine sahip birden fazla datayi depolamak icin kullanilir.
    array ile array listin farki nedir?
    1) array olustururken arrayin icine kac tane eleman koymamiz gerektigini soylemeliyiz
    ve soyledigimiz eleman sayisindan fazla eleman koyamayiz.
    arrayler eleman sayisinda "fixed"dirler.

    array list leri olustururken eleman sayisi soylemeye gerek yok cunku array listler eleman
    sayisinda "flexibel" (esnek)dirler.

    2) arraylerin icine primitive ve reference lar konabilir.
    array listlerin icine ise sadece non primitiveler konulur.

    3)Arrayler super fast tir. cok hizli demektir

    4) arrayler memoryi cok az kullanirlar.

    note: eleman sayisi kesin belli olan coklu datalari depolamak icin array kullaniriz.
    ama eleman sayisi degisken olan coklu datalar icin array kullanma riskini almayin.
     */

    public static void main(String[] args) {

        //array lists nasil olustururlur?

        //1.yol

        ArrayList<Integer> ages = new ArrayList<Integer>();

        //2.yol

        ArrayList<Integer> heights = new ArrayList<>();

        //3.yol

        List<Integer> nums = new ArrayList<>();

        // genellikle 2 ve 3u kullaniriz. ancak 3 daha kolay oldugundan onu tercih ederiz.

        // array listler nasil yazdirilir?

        System.out.println(nums);//bos list

        // array listlere nasil eleman eklenir?
        //add() her zaman yeni elemani en sona ekler. ( insertion order)
        //add methodu boolean return eder.
        nums.add(21);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);

        nums.add(1,50);//bu araya sayi eklemek isterken kulanilir. 1, koymak istedigimiz
        //indextir. ayrica bu method hicbir sey return etmez. (void yaziyor)
        // void sonuc yok demek
        System.out.println(nums);

        List<Integer> prices = new ArrayList<>();
        prices.add(23);
        prices.add(185);

        nums.addAll(prices);
        System.out.println(nums);//buna ekledi
        System.out.println(prices);//23, 185

        nums.addAll(2,prices);
        System.out.println(nums);

        //arraylistlerin eleman sayisi nasil bulunur?

        int elemanSayisi = nums.size();

        System.out.println(elemanSayisi);

        //array listlere herhangi bir eleman nasil secilir?
        //get() methodu istenen bir indexteki elemani verir.

        int el1 = nums.get(3);
        System.out.println(el1);

        //array listin bos olup olmadigini nasil anlariz?

        boolean bos1 = nums.isEmpty();
        System.out.println(bos1);

        boolean bos2 = ages.isEmpty();
        System.out.println(bos2);

        //array listte bir eleman nasil degistirilir?
        nums.set(3,200);
        System.out.println(nums);

        //example 1: nums array listindeki tum tek sayilari 11 arttirdiktan sonra ekrana yazdiriniz.

        for (int w : nums){
            if (w%2!=0){

                nums.set(nums.indexOf(w),w+11);
            }

        }

        System.out.println(nums);

        // remove() methodunun icine tam sayi koyarsaniz java onu index olarak kabul eder.
        //COK ONEMLI

        //example 2: array listten 34 elemaninin ilk gorunumunu siliniz.

        // note: tum tam sayilar java icin aksi soylenmedikce primitivedir. yani "int" dir.
        // note 2: "primitive" ler arrayListlerin elemani olamazlar.
        // note 3: primitive i wrapper classa cevirirseniz non primitive olur
        // ve  non primitive ler arraylistlerin elemani olur. index olamaz. diye dusunuyor java.

        Integer sayi = 34;

        nums.remove(sayi);
        System.out.println(nums);








    }
}
