package day18oop;

public class Vehicle {
    /*
    Child classdan bir object olusturdugunuzda constructorlar
    en ustteki parent classtan baslatilarak alta doğru calistiriliri

    Child class daki constructordan Parent class daki constructor a gidebilmek icin super() kullanilir
    Parent class da birden fazla constructor varsa istenilen constructor super() ifadesinin parantezi icine
    yazilan parameterler yardimi ile secilebilir

    Ayni class icindeki constructorlari secmek icin this() kullanilir, Ayni class da birden fazla constructor varsa
    istenilen constructor this() ifadesinin parantezi icine yazilan parametreler yardimi ile secilebilir

    super() ifadesini yazmak istege baglidir, yazmasanizda java sanki super() varmis gibi davranir. Ama kodunuzu
    daha okunur kilmak icin yazmaniz tavsiye edilir

    super() ve this() ifadeleri constructor icinde herzaman ilk satirda olmalidir
    Bir constructor icinde super() ve this() ifadeleri sadece bir kere kullanilabilir

    Inheritance da variable ve methodlari cagirmak icin this veya super kullanilir
    this ayni class icindeki variable lari ve methodlar cagirmak icin kullanilir
    super parent class icindek variable lari ve methodlari cağirmak icin kullanilir

     */

    public Vehicle(){
        this(2000);
        System.out.println("Vehicle 1");
    }
    public Vehicle (int price){
        System.out.println("Vehicle 2");
    }


}
