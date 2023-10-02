package day18oopw;

public class StudentRunner {
    public static void main(String[] args) {

        Student ali = new Student();

        System.out.println(ali.getStdId());
        System.out.println(ali.getNotOrt());
        System.out.println(ali.isSuccesful());

        System.out.println("=================");
        ali.setStdId("VH12345678");
        ali.setNotOrt(3.13);
        ali.setSuccesful(true);

        System.out.println(ali.getStdId());
        System.out.println(ali.getNotOrt());
        System.out.println(ali.isSuccesful());

        System.out.println("=======================");
        ali.setStdId("TH12345678");
        ali.setNotOrt(4.4);
        ali.setSuccesful(true);

        System.out.println(ali.getStdId());
        System.out.println(ali.getNotOrt());
        System.out.println(ali.isSuccesful());


    }
    
}
