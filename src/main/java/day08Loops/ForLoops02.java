package day08Loops;public class ForLoops02 {    public static void main(String[] args) {        //Example 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz        //           "I love Java" ==> "I love J"        String s = "I love Java";        for (int i = 0; i < s.length() ; i++) {            char ch = s.charAt(i);            if (ch =='a'){                break;            }            System.out.print(ch);        }                 System.out.println();        //example 2 :Verilen bir String'de kucuk harfleri console'a yazmayiniz        //"Pwd12?Ab" ==> P12?A        String s11 = "Pwd12?Ab";        for (int i = 0; i < s11.length()-1; i++) {            char ch = s11.charAt(i);        if(ch>= 'a' && ch <='z') {            continue; // loop yaparken bazi elemenleri isleme sokmamak icin continue kullanilir        } else {            System.out.print(ch);          }        }                  System.out.println();                            //tekrar        String s1 = "Pwd12?Ab";        for (int i = 0; i < s1.length(); i++) {            char ch = s1.charAt(i);            if(ch>='a' && ch <='z') {                continue;//            } else {                System.out.print(ch);            }        }            //break switch disina cikmak icin ve loopu kirmak icin kullanilir            //continue ise loop yaparken bazi elemanlari isleme sokmamak icin continue kullanilir                         System.out.println();                                            // Example 3:            //example 3  Bir String'i ters ceviren kodu yaziniz            //"Java" ==> "avaJ"        String t = "Java";        String ters = "";        for (  int i = t.length()-1 ;    i>=0 ;    i--) {            ters = ters + t.charAt(i);        }        System.out.println(ters); // avaJ//----------------------------------------------------------------------------------------------------------------------                            // ornek akşam        String h = "Ben seni seviyorum";        for (int i = 0; i <h.length() ; i++) {            char ch = h.charAt(i);            if(ch=='B'){                break;            }            System.out.print(h.charAt(i));        }        String e = "Tramway";        for (int i = 0;  i <e.length() ;  i++) {            char ch = e.charAt(i);            if(ch=='a'){                break;            }            System.out.print(ch);        }                             System.out.println();                                        // -----------------        String c1 = "Pwd12?Abdd";        for (int i = 0; i <c1.length() ; i++) {            char ch = c1.charAt(i);           if (ch>='a' && ch<='z'){               continue;           } else {               System.out.print(ch);           }        }                                 System.out.println();                                                //Not                //break ile continue arasindaki fark nedir?                //break switch in disina cikmak icin ve loopu kirmak icin kullanilir.                //continue ise loop calisirken java bu keywordu okudugunda artirma/azaltma kısmından yoluna devam eder                //continue loop yaparken bazi kodlari isleme sokmamak icin kullanilir                    //ornek 3 Bir String'i ters ceviren kodu yaziniz                    //"Java" ==> "avaJ"        String t1 = "Code";        String ters2 = "";        for (int i = t1.length()-1; i >=0; i--) {            ters2 = ters2+t1.charAt(i);        }        System.out.println(ters2); // edoC    }}