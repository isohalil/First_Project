package day14contructorsdatatime;import java.time.LocalDate;import java.util.Locale;import java.util.Scanner;public class DateTime01 {    public static void main(String[] args) {        /*        //  İcinde bulundugunuz zaman dilimindeki tarihi verir        LocalDate myCurrentData = LocalDate.now();        System.out.println(myCurrentData);        System.out.println(myCurrentData.getMonthValue()); // 8        System.out.println(myCurrentData.getYear()); // 2023        System.out.println(myCurrentData.getDayOfMonth()); //28        System.out.println(myCurrentData.getMonth()); // AUGUST        System.out.println(myCurrentData.getDayOfWeek()); // MONDAY        //İleriki tarihe nasil gidiir?        System.out.println(myCurrentData.plusDays(4).plusMonths(2).plusYears(1)); //2024-11-01        // Geçmiş tarihe nasil ?        System.out.println(myCurrentData.minusYears(2).minusMonths(24).minusDays(5)); //2019-08-23        // Spesefik tarih objesi nasil olusturulur?        LocalDate date1 =  LocalDate.of(1980,8,10); // 1980-08-10        LocalDate date2 =  LocalDate.of(1990,8,10);        System.out.println(date1);        boolean r1 = date1.isBefore(date2);        System.out.println(r1); // true        boolean r2 = date1.isAfter(date2);        System.out.println(r2); // false        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.        Scanner input = new Scanner(System.in);        System.out.println("Please enter year, month, and day numbers in the given order");        int year = input.nextInt();        int month = input.nextInt();        int day = input.nextInt();        LocalDate givenDate = LocalDate.of(year,month,day);        if (givenDate.isBefore(LocalDate.now())){            System.out.println("İnvalite day");        } else {            System.out.println("Enter time for the ticket");        }        //Example 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.        System.out.println("Please enter year, month, and day numbers in the given order ");        int y = input.nextInt();        int m = input.nextInt();        int d = input.nextInt();        LocalDate date = LocalDate.of(y,m,d);        System.out.println(date.getDayOfWeek());         */        //---------------------------------//-------------------------------------//--------------------------//-------        LocalDate mycrDay =LocalDate.now();        System.out.println(mycrDay);        System.out.println(mycrDay.getMonthValue()); // 8        System.out.println(mycrDay.getYear()); // 2023        System.out.println(mycrDay.getDayOfMonth()); // 28        System.out.println(mycrDay.getMonth()); // AUGUST        System.out.println(mycrDay.getDayOfWeek()); // MONDAY        System.out.println(mycrDay.plusYears(1).plusMonths(10).plusDays(30));       LocalDate date2 = LocalDate.of(1945,5,23);        LocalDate date3 = LocalDate.of(1950,7,11);        boolean result = date2.isAfter(date3);        System.out.println(result); // false        boolean result1 =  date2.isBefore(date3);        System.out.println(result1); // true        //Example 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.        //           Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.        Scanner scan = new Scanner(System.in);        System.out.println("Lutfen yil, ay ve gun sayisini giriniz");        int yil = scan.nextInt();        int ay = scan.nextInt();        int gun  = scan.nextInt();        LocalDate giveDate = LocalDate.of(yil,ay,gun);        if (giveDate.isBefore(LocalDate.now())){            System.out.println("Gecersiz tarih");        } else {            System.out.println(" Tarihiniz gecerldir  Biletiniz kesilmiştir ");        }        //Example 2: Kullanicindan dogum tarihini alan ve girdigi tarihin gun ismini bulan kodu yaziniz.        System.out.println("Lutfen yil, ay ve gun sayisini giriniz");        int y = scan.nextInt();        int a = scan.nextInt();        int g = scan.nextInt();        LocalDate date = LocalDate.of(y,a,g);        System.out.println(date.getDayOfWeek());    }}