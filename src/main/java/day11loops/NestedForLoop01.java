package day11loops;

public class NestedForLoop01 {

    public static void main(String[] args) {


/*
            1.Example: Asagidaki ciktiyi verecek kodu yaziniz.
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */
        for (int m = 1; m < 13; m++) {
            System.out.println("Month: " + m);

            for (int i = 1; i<5 ; i++){

                System.out.println("Week: " + i);
                for (int k = 1; k<8 ; k++){

                    System.out.println("Day: " + k);
                }

            }
        }





    }
}
