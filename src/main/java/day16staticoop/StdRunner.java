package day16staticoop;

public class StRunner {

    public static void main(String[] args) {

        // //stdName static oldugundan ona ulasmak icin object olusturmadim
        //        //static class memberlara ulasmak icin sadece class ismi yeterlidir
        System.out.println(Student.stName);


        //age non-static oldugundan ona ulasmak icin object olusturmak zorundayiz
        Student ali = new Student();
        System.out.println(ali.age);


        Student.staticMethod();
        ali.nonStaticMethod();




    }

}
