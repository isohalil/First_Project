package day08Loops;public class ForLoops03 {    public static void main(String[] args) {        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz        //578 ==> 5+7+8 = 20        int sum = 0;        for (int i = 578; i > 0 ; i = i /10) {            sum = sum + i % 10;        }        System.out.println(sum);            // Bir string teki tekrarsiz karakterleri veren kodu yaziniz            //          mehmet ==> ht        String t = "mehmet";        String unique = "";        for (int i = 0; i <t.length(); i++) {           char ch = t.charAt(i);           if (t.indexOf(ch) == t.lastIndexOf(ch)) {               unique = unique + ch;           }        }        System.out.println(unique);            //Example 1: 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz.            //           5 + 6 + 7 + 8 ==> 26            int total = 0;        for (int i = 5; i <9 ; i++) {            total = total + i;        }        System.out.println(total);            //Example  7'den 9'a kadar tamsayilarin carpimini veren kodu yaziniz.            //           7*8*9 ==> 504        int carp = 1;        for (int i = 7; i < 10; i++) {            carp = carp*i;        }        System.out.println(carp);            //---------------------------------------------------------------------------------------------------------                //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz                //7914 ==> 7+9+8 = 24        int sum1 = 0;        for (int i = 798; i >0 ; i=i/10) {            sum1 = sum1 + i%10;        }        System.out.println(sum1); // 24                // Bir string teki tekrarsiz karakterleri veren kodu yaziniz                //          mahmut ==> ht        String y = "mahmut";        String unique1 = "";        for (int i = 0; i < y.length() ; i++) {            char ch1 = y.charAt(i);            if (y.indexOf(ch1)==t.lastIndexOf(ch1)){                unique1 = unique1 + ch1;        }        }        System.out.println(unique1);            //Example 1: 5'den 8'e kadar tamsayilarin toplamini veren kodu yaziniz.            //           9 + 11 + 13 + 15  ==> 69            int e = 0;        for (int i = 9; i < 15; i++) {            e = e +i;        }        System.out.println(e);                //Example  7'den 9'a kadar tamsayilarin carpimini veren kodu yaziniz.                //           13*14*16 ==> 2730        int multiply1 = 1;        for (int i = 13; i < 16 ; i++) {            multiply1 = multiply1 * i;        }        System.out.println(multiply1);    }}