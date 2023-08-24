package day09Loops;

import java.util.Scanner;

public class ForLoops01 {
    public static void main(String[] args) {
            /*
        Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      ....    */


        for (int i =1 ;               i <3 ;                   i++) {
            System.out.println("Week : "+i);


            for (int k = 1;               k <3 ;               k++) {
                System.out.println("   Day : "+k);
            }

        }

            /*
          Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz

                X X X X X
                X X X X X
                X X X X X    */

        Scanner input = new Scanner(System.in);
        System.out.println("Satir (row) sayisini giriniz...");
        int row= input.nextInt();

        System.out.println("Sutun (column) sayisini giriniz...");
        int column= input.nextInt();


        for (int i = 1;  i <=row ;     i++) {//dıstaki loop satirlar icin satir sayisi kadar calistiriyorum

            for (int k = 1;   k <=column ;     k++) {//icteki loop yanyana yazdigindan sutunlar icin sutun sayisi kadar calisit
                System.out.print("X  ");
            }

            System.out.println();//satir yan yana print ile yazdirildigindan pointeri bir sonraki satira almak icin kullandik
        }

    }
}
