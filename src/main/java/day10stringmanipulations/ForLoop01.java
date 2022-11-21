package day10stringmanipulations;

public class ForLoop01 {
    public static void main(String[] args) {

        // example 1 ekrana bes kere hi yazdiriniz.

        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        // tekrarli isler icin loop kullaniriz.
        // dort cesit loop vardir. i. for-loop ii.while-loop iii.do-while-loop iiii.for-each-loop


        //i. for-loop
        // example 2 ekrana bes kere hi yazdiriniz.

        // ilk bolume baslangic degeri yazariz. sonuna ;
        // ikinci bolume loop hangi sart altinda calisacak sonuna ;
        // ucuncu bolume de arttirma (increment) veya azaltma (decrement)
        for(    int i = 1   ;      i<6     ;    i++   ){
            System.out.println("Hi");

        }



        //example 3: 4 ten 7 ye kadar tum tam sayilari ekrana yazdiran kodu yaziniz.


        for (int i=4 ; i<8 ; i++ ){
            System.out.print(i + " "); //4 5 6 7

        }



        System.out.println();

        // example 4: 14den 5e kadar tum tamsayilari ekrana yazdiran kodu yaziniz.

        for (int i = 14 ; i>4 ; i--){
            System.out.print(i + " ");//14 13 12 .... 5
        }

        //example 5: 14ten 5e kadar tum cift sayilari yazidrin
        System.out.println();//bunu yukaridaki kod ile asagidaki kod yan yana yazilmasin diye yaziyoruz.



        for (int i = 14 ; i>4 ; i=i-2){
            System.out.print(i + " ");
        }




        System.out.println();

        //2.yol:

        for (int i = 14; i>4 ; i--){

            if (i%2==0){
                System.out.print(i + " ");
            }
        }

        //example 6 : 28den 157ye kadar tum tek sayilari ekrana yazdiran kodu yaziniz.
        System.out.println();




        for (int i = 29 ; i<158 ; i=i+2){
            System.out.print(i + " ");
        }


        for(int i = 29 ; i<158 ; i++){

            if (i%2!=0){
                System.out.println(i+" ");
            }

        }



        System.out.println();



        //example 7: "Java" stringini "J*a*v*a*" stringine ceviren kodu yaziniz.

            String str = "Java";

            for(int i=0 ; i<str.length() ; i++){
                System.out.print(str.charAt(i) + "*");
            }



        System.out.println();
        //example 8: size verilen strinde tekrarsiz karakterleri ekrana yazdiriniz.
        // Hellooo Ali ==> He Ai


        String s = "Hellooo Ali";

            for (int i = 0 ; i<s.length() ; i++){
                char c = s.charAt(i);

                if (s.indexOf(c)==s.lastIndexOf(c)){
                    System.out.print(c);
                }
            }

        System.out.println();






    }


        }










