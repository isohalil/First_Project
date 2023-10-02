package day18oopw;

public class Student {

        // Encapsulation - kapsulleme

    /*

         Encapsulation nedir? Data hiding (Veri saklamak)
    Data nasil saklanir?
    Access modifier larini private yaparak datayi diger classlardan gorunmez hale getiririm
    boylece datayi saklamis olurum

    Encapsulation yaptigimiz datayi istersek diger classlardan okuyabiliriz
    Nasil okuruz?
    get method olusturarak Encapsulate edilmis datanin degerini okuyabiliriz


   1) get method lar public olur
   2) get methodun return type i okudugu variable ile ayni olur
   3) get method bir boolean variable icin olusturulduysa ismi is ile baslar

        Encapsulation yaptigimizde datayi isterseniz diger classlardan nasil degistirebiliriz
        -set method olusturarak Encapsulation edilmis datanin degerini degistirebiliriz.

    1) set methodlar public olur
    2) set methodun return typei hep void olur.
    3) set method parametre kullanir, parametrenin data typei set edilmek istenen variable
    ile ayni olur

    set method kullanarak varolan object uzerinde degisiklikler yaparak o objecti sanki yeni bir objectmis gibi kullanabiliriz
    get methodlarin diger adina getter set methodlarin diger adina setter denir

    java beans ==> getter ve setterlarin ikisine birden java beans denir.

         */

    public  String stdName = "Ali Can";
    public int age =17;

    private String stdId = "Ac12345678";
    private  double notOrt = 3.87;

    private boolean succesful = false;


    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }


    public boolean isSuccesful() {
        return succesful;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }


}
