package day16multidimensionalarraysarraylists;

import java.util.Arrays;

public class MultiDimensionalArray01 {

    /*
    array veya collection varsa "for each loop" kullanmak ilk tercihinix olsun
    array veya collection var ama index kullanmak zorundasiniz, o zaman for each loop calismaz.
    for loop veya while loop veya do while loop kullanmalisiniz.
     */
    public static void main(String[] args) {

        //bir tane inter multi arrray olusturunuz.
        // bu arraydeki tum sayilarin toplamini veren kodu yaziniz.

        int arr[][] = { {2, 5, 1}, {32, 75}, {13, 21, 43, 56} };


        int sum = 0;

        for (int[] w : arr){

            for (int k : w){

                sum=sum+k;
            }
        }

        System.out.println(sum);

        //bir multi arrayi bir normal arraye ceviren kodu yaziniz.
        //{{2, 5, 1}, {32, 75}} ==> {2, 5, 1, 32, 75}

        //once multideki eleman sayisini bulmaliyiz. cunku yeni bir array olusturmaliyiz
        //ve bu yeni arrayin uzunlugu orijinal arrayin eleman sayisina esit olmalidir.

        int brr[][] = { {2, 5, 1}, {32, 75} };
        int toplam = 0;

        for (int[] w : brr){
            toplam=toplam+w.length;
        }
        System.out.println(toplam);
        int idx = 0;

        int crr[] = new int[toplam];

        for (int[] w : brr){
            for (int k : w){
                crr[idx]=k;
                idx++;
            }
        }

        System.out.println(Arrays.toString(crr));



























    }
}



























