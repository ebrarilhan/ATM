package day07ternarystringmanipulation;


public class Ternary01 {

    public static void main(String[] args) {

        //example 1: bir sayinin pozitif olup olmadigini ekrana yazdiran kodu
        //yaziniz.

        //1.yol: if-else

        int a = 0;
        if(a>0){
            System.out.println("Pozitif");
        }else{
            System.out.println("Pozitif degil");
        }


        //2. yol: ternary

        //? mu, mi sorusunu sorar yani a buyuk mu evetse pozitif demektir.
        // condition (a>0) + ? + condition dogru ise uygulanacak kod + : + condition yanlis
        // ise uygulanacak kod + ;


        //Condition   ?  Condition dogru ise uygulanacak kod   :   Condition yanlis ise uygulanacak kod
        String sonuc =     a>0      ?           "Pozitif"                    :            "Pozitif degil";
        System.out.println(sonuc);

        //example 2: iki sayidan kucuk oolani secen kodu yaziniz.

        int b = 25;
        int c = 24;
        int min = b<c ? b : c;
        System.out.println(min);

        //example 3: verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        // pozotof sayilarin ve 0 in mutlak degeri kendileridir.
        // negatif sayilarin mutlak degeri -1 ile carpilmis halleridir.

        int d = -45;
        int abs = d<0 ? -1*d : d;
        System.out.println(abs);

        //example 4: iki tane sayi ayni isaretli ise bu sayilari carpiniz.
        // farkli isaretli ise islem yapamam mesaji veriniz.

        int e = 12;
        int f = -10;

        Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "islem yapamam.";
        System.out.println(islem);

        // ternary farkli data tiplerinde sonuc return ederse sonucxun data tipini
        // object yapiniz.

        // note: javada her class in en az bir tane parent (aile) classi vardir.
        // sadece object class in parent classi yoktur.







    }
}
