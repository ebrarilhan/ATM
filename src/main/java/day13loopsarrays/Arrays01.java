package day13loopsarrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Arrays01 {

    /*
    1) ayni data tipinde coklu datayi depolamak icin javanin olusturdugu yapilar vardir.
        bu yapilardan birisi de arraylerdir.

     */
    public static void main(String[] args) {

        //array nasil olusturulur?

        int stdAges[] = new int[7];// bos olan koseli parantez uc yere de yazilabilir int sonrasi, isim
        //oncesi ve isim sonrasi ama bz isim sonrasini tercih ederiz. bu, genel kullanimdir.

        //array nasil yazdirilir?
        System.out.println(Arrays.toString(stdAges));

        // Arraylere elemanlar nasil eklenir? ingilizcede element denir
        stdAges[1] = 11;
        System.out.println(Arrays.toString(stdAges));
        stdAges[0] = 12;
        stdAges[2] = 13;
        stdAges[3] = 14;
        stdAges[4] = 10;
        stdAges[5] = 12;
        stdAges[6] = 12;
        System.out.println(Arrays.toString(stdAges));

        // arraydeki herhangi bir elemani naasil yazdiraabiliriz?
        System.out.println(stdAges[4]);

        //example 1: arraydeki en kucuk ve en buyuk elemanin toplamini ekrana yazdiriniz.

        Arrays.sort(stdAges);//bu siraya koy anlamina gelir
        System.out.println(Arrays.toString(stdAges));

        int ilk = stdAges[0];
        //note length() parantezli sekilde stringlerde kullanilir. parantezsiz sekilde arraylerde olur
        int son = stdAges[stdAges.length-1];

        System.out.println(ilk+son);//24

        //example 2: stdAges arrayi icindeki tum elemanlarin toplamini ekrana yazdirn kodu yaziniz.

        //1. yol for loop

        int sum = 0;

        for (int i = 0; i < stdAges.length ; i++) {

            sum = sum + stdAges[i];

        }
        System.out.println(sum);

        //2. yol while loop


        int i = 0;
        int toplam = 0;
        while(i<stdAges.length){
            toplam = toplam + stdAges[i];

            i++;

        }
        System.out.println(toplam);

        //3. yol do while ile

        int k = 0;
        int top = 0;
        do {
            top = top + stdAges[k];
            k++;
        }while(k<stdAges.length);
        System.out.println(top);

        //4. yol: for each loop: bu en gelismis looptur.mumkunse bunun disinda baska loop kullanmayin.
        // arraylerde ve collections larda kullanilir.

        int t = 0;

        for (int w : stdAges) {
            t = t + w;

        }
        System.out.println(t);

        //example 3: String bir array olusturunuz. bu arraye bes tane isim yerlestiriniz.
        // sonra bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz.

        String stdIsim[] = new String[5];
        stdIsim[0] = "Ali";
        stdIsim[1] = "Tom";
        stdIsim[2] = "Veli";
        stdIsim[3] = "Kemal";
        stdIsim[4] = "Cem";

        int karakterSayilariToplami = 0;
        for (String w : stdIsim){
            karakterSayilariToplami = karakterSayilariToplami + w.length();
        }

        System.out.println(karakterSayilariToplami);

        //example 4: char bir array olusturunuz ve bu arraye bes eleman ekleyiniz.
        //sonra da bu arraydeki sadece buyuk harfleri ekrana yazidriniz.

        char ch[] = {'A', 'c' , 'D', 'k', 'M'};
        for (char w : ch){


            if (w>='A' && w<='Z'){
                System.out.print(w);

            }
        }








    }
}
