package day06switchternarystring;import java.util.Scanner;public class Switch01 {    public static void main(String[] args) {        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini        //           yazdiran kodu yaziniz.        //           8 ==> August - September - October - November - December        Scanner imput = new Scanner(System.in);        System.out.println("Lutfen baslangiz ayinin kacinci ay oldugunu giriniz.");        int numOfMonth = imput.nextInt();        switch (numOfMonth){            case 1:                System.out.println("January");            case 2:                System.out.println("Februray");            case 3:                System.out.println("Mart");            case 4:                System.out.println("April");            case 5:                System.out.println("May");            case 6:                System.out.println("June");            case 7:                System.out.println("Jule");            case 8:                System.out.println("August");            case 9:                System.out.println("September");            case 10:                System.out.println("Oktober");            case 11:                System.out.println("November");            case 12:                System.out.println("Decenber");                break;            default:                System.out.println("Gecerli ay numarasi giriniz");        }                    /*                    Note : switch condition parantezi icine : 1) String 2)int 3) byte 4)short 5 char kullanabiliriz.                           switch condition parantezi icine : 1)long 2) boolean 3)float 4) double kullanamayiz                     */        Scanner imput1 = new Scanner(System.in);        System.out.println("Hafta gununu giriniz..");        int haftaGun = imput.nextInt();        switch (haftaGun){            case 1:                System.out.println("Pazartesi");                break;            case 2:                System.out.println("Sali");                break;            case 3:                System.out.println("Çarşanba");                break;            case 4:                System.out.println("Perşenbe");                break;            case 5:                System.out.println("Cuma");                break;            case 6:                System.out.println("Cumartesi");                break;            case 7:                System.out.println("Pazar");                break;            default:                System.out.println("Lutfen gecerli gun giriniz");        }    }}