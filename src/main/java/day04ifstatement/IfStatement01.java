package day04ifstatement;



public class IfStatement01 {

    public static void main(String[] args) {

        //if it rains i will cansel the picnic
        // if statement belli kodlari belli sartlara bagli olarak calistirmaya yarar.

        //exampe 1: sayi pozitif ise ekrana pozitif yazdirijn.

        int s = 12;
        if(s>0){
            System.out.println("Positive");
        }



        // exampe 2: verilen karakter buyuk harf ise ekrana buyuk harf yazdirin


        char ch = 'A';
        if (ch>='A' && ch<='Z'){
            System.out.println("Buyuk Harf");

        }



        // && islemi sadece boolean ile kullanilir. javada VE anlamina gelir.

        // true && false = true
        // true && false = false
        // false && true = false
        // false && false = false

        // && islemi mukemmelliyetcidir. true sonucunu alabilmek icin her sey
        // true omalidir. bir tane false varsa her sey false demektir.

        // axample 3: verilen bir sayi uc basamakli ise ekrana uc basamakli yazdirin

        int x = -125;

        x = Math.abs(x); // absoluut value mutlak deger demek eger negatif sayilari
        //yazarsak bile onu once pozitife cevirecektir.


        if (x>99 && x<1000){

            //puf: burada >=100 <=999 da yazabilirdir ama burada java fazla islem yapar
            // yani diger turlu daha iyidir.

            System.out.println("Uc Basamakli");
        }
        //exampe 4: verilen bir sayi cift sayi ise ekrana cift sayi yazdiriniz.

        int y = -46;

        y = Math.abs(y);

        if(y%2==0){

            System.out.println("Cift Sayi");

        }
        // javada = atama anlamina gelir atama operatorudur.
        // matematikteki esittir degildir. ama == isareti matematikteki esittir anlamina gelir.
        // % bu ise mod anlamina gelir (bunu macilis diye okuruz)
        // yani bir sayi ile bolumunden kalandir.

        // exampe 5: verilen bir sayi 300den kucuk veya 1200den buyuk ise ekrana
        // harika sayi yazdirin.

        int r = 250;

        if (r<300 || r>1200){

            System.out.println("Harika Sayi");
        }

        // || bu isarete pipet denir ve VEYA anlamina gelir ve sadece boolean ile
        // birlikte kullanilir.
        // veya islemi pollyanna gibidir.

        // true || false = true
        // true || true = true
        // false || true = true
        // false || false = false

        // || isleminde false alabilmek icin her seyin false olmasi gerekir.
        // || isleminde sadece bir tane sonucu true, true yapmaya yeter.











    }

}
