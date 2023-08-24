package day09Loops;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {

        /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Lütfen bir sayı giriniz");
            int num = input.nextInt();
            if(num>=100){
                System.out.println("Kazandiniz !!");
            }else {
                System.out.println("Kaybettiniz!! ");
                break;
            }
        }while (true);


                                                       // ornek


            /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 50'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 50 ve 80'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
             */

        do {
            System.out.println("Lutfen bir tam sayi giriniz");
            int sayi = input.nextInt();
            if (sayi>=50 ){
                System.out.println("kazandiniz---");
            } else {
                System.out.println("kaybettiniz ---");
                break;
            }
        }while (true);













    }

}
