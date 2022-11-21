package day02methodcreation;

import java.util.Scanner;

public class Car_ObjectCreation {

    public String marka = "Honda";
    public int fiyat = 20000;

    /*
    note: class  ---    variable ve method  ---    object --- kullanacagiz
     */

    public static void main(String[] args) {

        //object nasil olusturulur?
        // class ismini yaziniz
        // objeye bir isim veriniz (variable kurallari ile ayni)
        // = koy
        // new keywordunu kullan (yoktan var et demek)
        // class ismi parantezle beraber yaz (constructor(muteahhit))
        //;

        Car_ObjectCreation myHonda = new Car_ObjectCreation();
        System.out.println(myHonda.fiyat);
        System.out.println(myHonda.marka);

        myHonda.hareketEt();
        myHonda.dur();


        // buralarda da objeyi kullanmis olduk





        MethodCreation obj = new MethodCreation();
        // car classin icindeyken baska classdan(MethodCreation) obje olusturmak mumkundur.
        System.out.println(obj.toplamaYap(3, 5));

        

    }

    public void hareketEt(){

        System.out.println("honda guzel hareket eder");
    }
    public void dur(){
        System.out.println("honda guvenli bir sekilde durur");
    }









}
