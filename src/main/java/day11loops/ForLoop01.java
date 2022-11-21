package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {


        //example 1: 3 ten 6 ya kadar tam sayilarin toplamini bulan kodu yaziniz.

        int sum = 0;

        for (int i = 3;  i<7 ;  i++) {

            sum = sum + i;

        }

        System.out.println(sum);

        //note: sout loopun disina yazilirsa sadece sum in sadece son degerini ekrana yazdiri.
        //loopunicine yazilirsa her bir loop icin sum in hangi degerleri aldigini yazdirir.


        //example2: 6dan 3e kadar tam sayilarin carpimini bulan kodu yaziniz

        int multiply = 1;

        for (int i = 6 ; i>2 ; i--){
            multiply = multiply*i;

        }
        System.out.println(multiply);

        //example 3: size verilen bir tam sayinin rakamlari toplamini bulunuz.

        //javada tam sayiyi tamsayiya bolerseniz sonuc tam sayi olur. eger sonuc virgullu sayi ise
        //java ondalik kismi siler.

        int num = -385;
        num = Math.abs(num);
        int sonuc = 0;
        for (int i = num; i>0; i=i/10){
            sonuc = sonuc+i%10;

        }

        System.out.println(sonuc);

        //example 4: size verilen bir stringi ters ceviren kodu yaziniz.
        //          "Kaba" ==> "abaK"

        String str = "Kaba";
        String ters = "";
        //concatenation yapacaksaniz "" bos string kullanin.
        for (int i = str.length()-1; i>=0; i--){

            char c = str.charAt(i);
            ters = ters+c;


        }

        System.out.println(ters);



    }
}
