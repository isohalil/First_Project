package day02variables;public class Variables01 {    public static void main(String[] args) {        // Variable nasil olusturulur ?        // Data Type   + Variable Name + Assignment Operator(Atama Operatoru) + Variable degeri + noktali virgul;              int            age                =                                    14                ;              System.out.println(age);        // System.out.println(); yazdirmanin kisa yolu ==> sout yaz enter'a bas        /*        Javada temelde iki tip data vardir;        1)primitve data type;            char, boolean, byte, short, int, long, float, double        2)non-primitive data type;            String         */        //char data type: 2 byte        // Tek karakterler icin kullanilir. Ornegin ==> A ,a, ?, 5        // Note: char data typeinda degerler hep tek tirnak icine konulmalidir        // Ornek 1: char data type'inda bir ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.        // Data Type   + Variable Name + Assignment Operator(Atama Operatoru) + Variable degeri + noktali virgul;        char isimIlkHarfi = 'A';        System.out.println(isimIlkHarfi);        // boolean data type:        // boolean'lar sadece iki farkli alabilirler.true (dogru) veya false(yanlis)        // Ornek 2: boolean data type'inde emeklimisin sorusu icin bir variable olusturun ve false degerini atayin.        boolean emeklimisin = false;        System.out.println(emeklimisin);        boolean isRetired = false;        System.out.println(isRetired);        //byte data type :        //tam sayilar icindir hafizada 1 byte yer kaplar        //byte: -128 den +127 e (dahil)kadar tamsayi degerleri icin kullanilir        //Ornek 3: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.        byte ogrenciYasi = 13;        System.out.println(ogrenciYasi);        //short data type:        //tam sayilar icindir hafizada 2 byte yer kaplar        //short: -32768 ile 32767 arasindaki tamsayilar icin kullanilir        //Ornek 4: Site nufusu icin bir variable olusturup deger atayiniz.        short siteNufusu = 1300;        System.out.println(siteNufusu);        //int data type:        //tam sayilar icindir hafizada 4 byte yer kaplar        //int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir        //Ornek 5: Ulke nufusu icin bir variable olusturup deger atamasi yapiniz        int ulkeNufusu = 12345543;        System.out.println(ulkeNufusu);        //long data type:        //tam sayilar icindir hafizada 8 byte yer kaplar        //long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir.        //Ornek 6: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.        long cellNumberInHumanboyd = 986445234234234L;        // Note: Eger long'a atadiginizda deger int'leri araliginda ise sonun L koymaya gerek yok ,        // ama int'ler araligi disinda ise bunun long oldugu sonuna L koyarak javaya soylemeliyiz.        long weightOfSun = 12344545;        //float data type:        //float: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Fiyatlandirmalar - 12.99)        //float memory'de 4 byte yer kaplar.        //float olusturdugunuzda sonunda F yada f koymalisiniz, cunku java ondalikli sayilari otomatik olarak double kabul eder        //Ornek 7: Gomlek fiyati icin bir tane variable olusturun        float tshortFiyati = 129.99F;        System.out.println(tshortFiyati);        // double data type:        //double memory de 8 byte yer kaplar, virgülden sonra ki rakam daha fazla alir        //double: Virgullu sayilar(Ondalik Sayilar - Decimal Numbers) icin kullanilir. (Hucre Agirligi: 0.000000000000112)        //Ornek 8: Hucre agirligi icin bir tane variable olusturun        double weightCell = 0.0000000000015;        System.out.println(weightCell);        //Note ==> "E" exponent (üs demek) 1.5 carpi 10 uzeri -11;    }}