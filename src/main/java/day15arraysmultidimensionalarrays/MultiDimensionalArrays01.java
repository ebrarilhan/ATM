package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

    // bir arrayin elemanlari array ise bu arrayler multiDimensional Array dir.

    public static void main(String[] args) {

        // MultiDimensionel Array nasil olusturulur?

         int arr[][] = new int[3][2];
        System.out.println(Arrays.deepToString(arr));

         //MultiDimensionel Array lere eleman ekleme nasil yapilir?


        arr[1][0] = 6;
        arr[0][0] = 3;
        arr[0][1] = -4;
        arr[1][1] = 18;
        arr[2][0] = -7;
        arr[2][1] = 0;

        // MultiDemisionel array konsola nasil yazdirilir?

        System.out.println(Arrays.deepToString(arr));

        //MultiDemisionel array lerde array elemanlardan biri nasil yazdirilir?
        System.out.println(Arrays.toString(arr[1]));

        //MultiDemisionel array lerde ic arraylerdeki elemanlar nasil yazdirilir?
        System.out.println(arr[1][0]);

        //example 1: string bir MultiDemisionel array olusturunuz.
        //elemanlari ekleyiniz sonrada toplam eleman sayisini ekrana yazdiran kpdu yaziniz.

        String brr[][] = new String[4][3];

        //elemanlari ekleme
        brr[0][0] = "A";
        brr[0][1] = "B";
        brr[0][2] = "C";

        brr[1][0] = "D";
        brr[1][1] = "E";
        brr[1][2] = "F";

        brr[2][0] = "G";
        brr[2][1] = "H";
        brr[2][2] = "I";

        brr[3][0] = "j";
        brr[3][1] = "K";
        brr[3][2] = "L";

        System.out.println(Arrays.deepToString(brr));

        int sum = 0;

        for (String[] w : brr){

            sum = sum + w.length;

        }
        System.out.println(sum);





    }
}
