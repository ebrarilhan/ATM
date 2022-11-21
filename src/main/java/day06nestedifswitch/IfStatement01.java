package day06nestedifswitch;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        // kullanicidan yas degerini alan kodu yaziniz ve yasin hangi jenerasyond oldugunu
        //tabloya gore yazdiriniz.
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //else (tanimlanmamis evre)

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz.");
        int yas = input.nextInt();


        if(yas<0) {
            System.out.println("gecerli yas giriniz.");
        }else if (yas<5) {
            System.out.println("bebek");
        }else if (yas<13) {
            System.out.println("cocuk");
        }else if (yas<21) {
            System.out.println("genc");
        }else if (yas<31) {
            System.out.println("yetiskin");
        }else{
            System.out.println("tanimlanmamis evre");
        }

        // kod test edilirken kesinlikle kritik degerler test edilmelidir.
        // butun kritik degerler ve onlarin oncesi ve sonrasi test edilmelidir.
        // bu teste boundary value analyze test(sinir degerlerini anaiz ederek test
        // etme) denir. buna kisaca BVA denir.
        // mesela bu soru icin ornek kritik degerler : -1 0 2 4 5 6 12 13 14 20 21 22 30 32


    }
}
