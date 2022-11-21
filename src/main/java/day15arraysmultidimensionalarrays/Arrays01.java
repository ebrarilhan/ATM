package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        // binarySearch() Methodu
        //bu methodu kullanarak bir elemanin arrayde olup olmadigini anlariz.
        // bu methodu kullanmadan once mutlaka Arrays.sort() kullanilmalidir.
        // bu metho, aradigimiz eleman arreyde varsa o elemanin indexini return eder.
        // aradiginiz eleman arrayde yoksa -sayi dondurur. eksi isaretinin yanindaki sayi ise
        //olsaydi hangi sirada olurdu anlamina gelir. bu sayi herhangi bir sayi olabilir
        //sira arrayden arraye degisecegi icin

        //binary search methodu tekrarlaan elemanlar icin kullanilmaz.


        int arr[] = {12, 31, 43, 14};


        int sayi1 = 43;

        Arrays.sort(arr);// [12, 14,31, 43]

        int idx1 = Arrays.binarySearch(arr, sayi1);// indexi 3
        System.out.println(idx1);

        int sayi2 = 17;
        int sonuc = Arrays.binarySearch(arr, sayi2);
        System.out.println(sonuc);


    }
}
