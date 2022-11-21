package day06nestedifswitch;

public class NestedIf01 {

    public static void main(String[] args) {

        /*
        passwordun ilk harfi buyuk harf ise ve
        'A' olursa gecerli password, aksi halde gecersiz password
        passwordun ilk harfi kucuk harf ise
        'z' olursa gecerli password, aksi halde gecersiz password...
         */

        //nested ic ice gecmis demektir. if in icine if sokariz buna nested if denir.

        String password = "zxy12!";
        char x = password.charAt(0);

        if (x>='A' && x<='Z'){

            if (x=='A'){
                System.out.println("Gecerli Password");
            }else {
                System.out.println("Gecersiz Password");
            }
        }else if (x>='a' && x<='z') {

            if (x=='z'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz Password");
            }

        }else{
            System.out.println("Ilk karakter harf olmalidir.");
        }


        // nested if tavsiye edilmez. cunku java nestedlari uygularken cok fazla zaman
        // harcar. buna time complexity denir. bu yuzden mumkunse nested kullanmayiniz.
    }
}
