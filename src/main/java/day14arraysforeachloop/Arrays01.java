package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

    //arrayslerin icine sadece primitive data tipleri ve reference lar (adresler) yerlestirilebilir.
    //yani non primitive data tiplerini koyamayiz.
    // yani string yazdigimizda aslinda java onlarin adreslerini arraye koyar

    public static void main(String[] args) {

        String str[] =  new String[3];
        str[0]= "Java";
        str[1]= "did";
        str[2]= "surpise you";

        System.out.println(Arrays.toString(str));

        //example 1: string bir array olusturunuz ve "Tom" ve "Tom"dn onceki tum elemanlari
        // ekrana yazdiriniz.

        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : arr){
            System.out.print(w + " ");
            if (w.equals("Tom")){
                break;
            }

        }
        System.out.println();
        //example 2: string bir array olusturunuz ve "Tom" ve "Jane"haric tum elemanlari
        // ekrana yazdiriniz.

        String brr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};

        for (String w : brr){

            if (w.equals("Tom") || w.equals("Jane")){
                continue;
            }
            System.out.print(w + " ");

        }
        System.out.println();

        //example 3: kullanici ile beraber bir array olusturunuz.
        // bunun anlami = bir ogretmenin sinifindaki ogrencilerin isimlerini applicationa
        // yuklemesini saglayan kodu yaziniz. (gunluk hayattaki karsiligi)

        Scanner input = new Scanner(System.in);
        System.out.println("kac ogrenci ismi gireceksiniz?");
        int numOfStd = input.nextInt();

        String names[] = new String[numOfStd];
        System.out.println("girisi sonlandirmak icin q harfine basiniz...");

        for (int i = 1; i <=numOfStd; i++) {

            System.out.println("lutfen " + i + ". ogrencinin ilk ismini giriniz.");

            String stdName = input.next();


            if (stdName.equalsIgnoreCase("Q")){
                break;
            }
            names[i-1] = stdName;


        }

        System.out.println(Arrays.toString(names));


    }
}
