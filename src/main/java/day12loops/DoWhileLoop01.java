package day12loops;

public class DoWhileLoop01 {

    public static void main(String[] args) {

        int i = 1;
        while (i<1){
            System.out.println("While Loop");
            i++;

        }
        //while loop icin loop bodysi icindeki kodun hic calistirmama ihtimali vardir.

        //while loop bazi durumlarda hic calismayabilir. yani while loop icin "zero execution" mumkundur.

        int k = 1;

        do {
            System.out.println("do-while loop");
            k++;
        }while (k<1);

        //do while loop kullandiginizda loop bodysi icindeki kod en az bir kere calisir. yani do-while
        //loop icin zero execution mumkun degildir.
        //do while loopun bodysi icindeki kod her halukarda en az bir kere calisir.

        //example 1 : bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        // 24.5673  ==> 5+6+7+3=21

        double num = 24.5673;
        System.out.println(num);
        //string.valuoOf metodu parantezin icine koyulan datanin tipini String yapar.

        String str = String.valueOf(num);
        System.out.println(str);

        //regex icin nokta kullandiginizda onune "\\" bunu koyunuz. yani nokta "\\." seklinde kullanilir

        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);

        int decimalInt = Integer.valueOf(decimalPart);
        System.out.println(decimalInt);

        int sum = 0;
        do {
            sum = sum + decimalInt%10;
            decimalInt = decimalInt/10;
        }while(decimalInt>0);


        System.out.println(sum);









    }
}
