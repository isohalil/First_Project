package day18oopw;

public class Animal {

    //Overriding

     /*
    1) Parent classdaki methodu child class icinde ozellestirerek kullanmaya "Overriding" denir;

    2) Overriding de method parantezine, methodun ismine yani method signature a dokunulmaz,
        methodun body si değistirilir

    3) Parent class da override edilmis eat() methoduna Overriden Method denir
       Child class da override edilmis eat() methoduna Overriding Method denir.

    4) private methodlar override edilemezler

    5) Child class daki methodun occess modifieri Parent class daki override edilmis (Overriden Method) un acces modifier'indan
    dar olamaz. Aynisi olabilir veya daha genis olabilir

    Overriden Method ==> protected --- Overriding method ==> protected + public
    Overriden Method ==> default   --- Overriding method ==> protected + public + default
    Overriden Method ==> private   --- Overriding method ==> override olmazki access modifier i olsun (Bakiniz 4. kural)

    6) Child class da override edilen methodun return type i ile parent taki methodun return type i arasinda IS-A iliskisi varsa
       return type degistirilebilir,

    7) Methodun return typei primitive ise Overriding yaparken return type degistirilemez. Cunku return type ya ayni olur
       yada parent tan secelir, ama primitive ler arasinda parent chlid iliskisi olmadigindan parent dan secmek mevzu bahis olamaz
       o zaman tek secenek aynisi olmalidir,

    8) Child da override edilen methodun return type i ile parent taki methodun return type i arasinda "IS-A" iliskisi yoksa
       return type degistirilemez, Mesela ; Integer wrapper class ile Long wrapper class arasinda IS-A iliskisi yoktur
       dolayisiyla return type Integer oldugunda Longa degistirilemez;

    9) Method'un return typei void ise Overriding yaparken return type degistirilemez
       yani void ise yine void olarak kalmak zorundadir.

    10) static methodlar override edilemezler. Cunku static methodlar tum childlar icin ortak methodlardir
        Bir child bir ortak methodu degistirdiginde diger child lar bundan olumsuz etkilenebilir. Bu yüzden
        Java static methodlarin override edilmesine izin vermez;

    11) final methodlar override edilemezler, final methodlarin body'si degistirilemez ama Override ederken method body i degistiririz
        bu bir celiskidir, Bu yüzden java final methodlarin override edilmesine musaade etmez;

       a)  final keywordunu Variable lar ile kullanabilirsiniz
            i)  eger variable final ise mutlaka deger atanmalidir
            ii) ilk atanan deger degistirilemez

       b)  final keywordunu method lar ile kullanabilirsiniz
            i)  eger method final ise body si degistirilemez
            ii) method bodysi degistirilemeyince override yapmak mümkün olmaz.

       c)  final keywordunu Class lar ile kullanabilirsiniz
            i) class finla ise o class in child i olamaz


    12) Polymorphism =  Method Overloading  + Method Overriding

     */



    public void eat(){
        System.out.println("Animals eat");
    }


    public void drink(){
        System.out.println("Animals drink");
    }


    public Animal create(){
        return new Animal();
    }


    public int add (int a, int b){
        return a+b;
    }

    public  Integer multiply(Integer a, Integer b){
        return a*b;
    }

    public final double circeArea(double r){
        return 3.14*r*r;
    }




}
