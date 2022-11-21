package day11loops;

public class ForLoop02 {

    public static void main(String[] args) {

        //example 1: bir stringdeki "m" karakteri haric tum karakterleri yazdiriniz.
        // Andromeda ==> Androeda

        //1.yol

        String str = "madam";

        for (int i = 0; i<str.length()-1; i++){

            char c = str.charAt(i);

            if (c!='m'){
                System.out.print(c);//ada
            }
        }
        System.out.println();
        //2.yol
        for (int i = 0; i<str.length()-1; i++){
            char c = str.charAt(i);
            if (c=='m'){

                continue;//bosveeeer demek devam et,
            }
            System.out.print(c);
        }

        //continue looplarda kullanilir. bir keyword dur.
        //loop un icinde bazi degerler icin loop un calismamasini isterseniz continue
        //kullaniniz.


        // example 2: 1'den 100e kadar 6 ile bolunenler haric tum tam sayilari ekrana
        // yazdiriniz.

        System.out.println();


        for (int i = 1; i<101 ; i++){
            if (i%6==0){
                continue;
            }
            System.out.print(i + " ");
        }

        System.out.println();
        //example 3: size verilen bir stringdeki 'm'den onceki karakterleri yazdiriniz.
        // Luxemburg ==> Luxe

        String s = "kalemlik";

        for (int i = 0 ; i<s.length(); i++){
            String c = s.substring(i,i+1);
            if (c.equalsIgnoreCase("m")){
                break;

            }

            System.out.print(c);

        }





    }
}
