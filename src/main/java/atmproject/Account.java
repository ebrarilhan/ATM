package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber;//hesap numarasi
    private int pinNumber;// sifre

    private double checkingBalance; // vadesiz hesap bakiyesi
    private double savingBalance; // vadeli hesap bakiyesi

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    Scanner input = new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    //para cekme: calculateCheckingBalanceAfterWithdraw ==>  paraCekmeIslemindenSonraKalanMiktar
    // amount ==> miktar

    private double calculateCheckingBalanceAfterWithdraw (double amount){

        checkingBalance = checkingBalance - amount;

        return checkingBalance;

    }

    //para yatirma: para yatirma isleminden sonra kalan bakiyeyi hesapla

    private double calculateCheckingBalanceAfterDeposit(double amount){

        checkingBalance = checkingBalance + amount;

        return checkingBalance;

    }

    //para cekme: saving hesabindan para cektikten sonra kalan bakiye

    private double calculateSavingBalanceAfterWithdraw(double amount){

        savingBalance = savingBalance - amount;

        return savingBalance;

    }

    //para yatirma: saving hesabina para yatirdiktan sonra kalan bakiye

    private double calculateSavingBalanceAfterDeposit(double amount){

        savingBalance = savingBalance + amount;

        return savingBalance;

    }




    //son bakiyeyi gosterme

    public void displayCurrentAmount(double balance){
        System.out.println("hesabinizda bulunan bakiye: " + moneyFormat.format(balance));
    }




    //musteri ile para cekmek icin etkilesime gecelim (checking icin)
    public void getCheckingWithdraw(){

        displayCurrentAmount(checkingBalance);

        System.out.println("Cekmek istediginiz miktari giriniz.");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("sifir veya eksi rakamlar gecersizdir.");
            getCheckingWithdraw();//recursive method: methodu tekrardan cagirma cunku kullaniciya sans
            // veriyoruz methodu tekrar dondurerek
        } else if (amount<=checkingBalance) {
            calculateCheckingBalanceAfterWithdraw(amount);
            displayCurrentAmount(checkingBalance);
        }else {
            System.out.println("Yetersiz bakiye");

        }

    }




    //para yatirm(checking icin): musteri ile para yatirmak icin etkilesime gecelim.

    public void getCheckingDeposit(){

        displayCurrentAmount(checkingBalance);

        System.out.println("Yatirmak istediginiz miktari giriniz.");
        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("sifir veya eksi rakamlar gecersizdir.");
            getCheckingDeposit();//recursive method: methodu tekrardan cagirma
        }else {
            calculateCheckingBalanceAfterDeposit(amount);
            displayCurrentAmount(checkingBalance);

        }
    }





    //musteri ile para cekmek icin etkilesime gecelim (saving icin)

    public void getSavingWithdraw(){

        displayCurrentAmount(savingBalance);

        System.out.println("Cekmek istediginiz miktari giriniz.");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("sifir veya eksi rakamlar gecersizdir.");
            getSavingWithdraw();//recursive method: methodu tekrardan cagirma
        } else if (amount<=savingBalance) {
            calculateSavingBalanceAfterWithdraw(amount);
            displayCurrentAmount(savingBalance);
        }else {
            System.out.println("Yetersiz bakiye");

        }

    }



    //para yatirm(saving icin): musteri ile para yatirmak icin etkilesime gecelim.

    public void getSavingDeposit(){

        displayCurrentAmount(savingBalance);

        System.out.println("Yatirmak istediginiz miktari giriniz.");
        double amount = input.nextDouble();

        if (amount<=0){
            System.out.println("sifir veya eksi rakamlar gecersizdir.");
            getSavingDeposit();//recursive method: methodu tekrardan cagirma
        }else {
            calculateSavingBalanceAfterDeposit(amount);
            displayCurrentAmount(savingBalance);

        }
    }










}
