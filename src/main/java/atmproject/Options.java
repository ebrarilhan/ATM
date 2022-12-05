package atmproject;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Options extends Account {

    Scanner input = new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    boolean flag = true;


    HashMap<Integer,Integer> data = new HashMap<>();



    public void login(){

        System.out.println("Techproed ATM'e hosgeldiniz.");

        do {

            data.put(12345,1234);
            data.put(23456,2345);
            data.put(34567,3456);
            data.put(45678,4567);


            try{
                System.out.println("Hesap numaranizi giriniz");
                setAccountNumber(input.nextInt());
                System.out.println("Pininizi giriniz");
                setPinNumber(input.nextInt());

            }catch (Exception e){

                System.out.println("Yanlis karakter girdiiz. Lutfen sadee rkam giriniz veya Q ya basip cikabilirsiniz");
                input.nextLine();
                String exit = input.next();

                if (exit.equalsIgnoreCase("Q")){

                    flag = false;
                }
            }

            int count = 0;

            for (Map.Entry<Integer,Integer> w: data.entrySet()){


                if (w.getKey().equals(getAccountNumber()) && w.getValue().equals(getPinNumber())){
                    getAccountTypes();//hesap islemlerine gidiniz.
                }else {

                    count++;
                }

            }

            if (count == data.size()){
                System.out.println("Yanlis hesap numarasi veya pin numarasi girdiniz.");
            }

        }while (flag);

    }




    //kisi icin secenekleri goruntule
    public void displayMessage(){
        System.out.println("Option seciniz");
        System.out.println("1: View Balance"); //hesap ozeti, bakiye goruntuleme
        System.out.println("2: Witdraw"); //para cekme
        System.out.println("3: Deposit"); //para yatirma
        System.out.println("4: Exit"); //islemi sonlandirma

    }





    //checking hesap islemleri ==> yani vazdesiz
    public void checkingOperations() {

        do {
            displayMessage();

            int option = input.nextInt();

            if (option == 4) {
                System.out.println("gule gule...");
                break;
            }

            switch (option) {

                case 1:
                    System.out.println("Checing hesabinizda kalan bakiye: " + moneyFormat.format(getCheckingBalance()));
                    break;
                case 2:
                    getCheckingWithdraw();
                    break;
                case 3:
                    getCheckingDeposit();
                    break;
                default:
                    System.out.println("Yanlis secenek girdiniz. Lutfen 1, 2, 3 veya 4 u kullaniniz.");
                    break;

            }


        } while (true);
        getAccountTypes();

    }


    //vadeli hesap islemleri
    public void savingOperations(){

        do {
            displayMessage();

            int option = input.nextInt();

            if (option == 4) {
                System.out.println("gule gule...");
                break;
            }

            switch (option) {

                case 1:
                    System.out.println("Saving hesabinizda kalan bakiye: " + moneyFormat.format(getSavingBalance()));
                    break;
                case 2:
                    getSavingWithdraw();
                    break;
                case 3:
                    getSavingDeposit();
                    break;
                default:
                    System.out.println("Yanlis secenek girdiniz. Lutfen 1, 2, 3 veya 4 u kullaniniz.");
                    break;

            }


        } while (true);
        getAccountTypes();

    }



    //ilgili hesabi seciniz.
    public void getAccountTypes(){

        System.out.println("işlem yapmak istediginiz hesabi seciniz");
        System.out.println("1: Checking account"); //vadesiz hesap
        System.out.println("2: Saving account"); //vadeli hesap
        System.out.println("3: Quit"); //cikis yapma

        int option = 0;
        try{
             option = input.nextInt();
        }catch (Exception e){
            e.printStackTrace();
        }// sayi yerine baska sey girerse devam etsin diye

        switch (option){
            case 1:
                System.out.println("Checking/vadesiz hesabinizdasiniz.");
                checkingOperations();
                break;
            case 2:
                System.out.println("Saving/vadeli hesabinizdasiniz.");
                savingOperations();
                break;
            case 3:
                System.out.println("ATM makinemizi kullandiginiz icin tesekkur ederiz");
                flag = false;
                break;
            default:
                System.out.println("Yanlis secenek girdiniz. Lutfen 1, 2 veya 3 u kullaniniz.");
                break;





        }


    }









}
