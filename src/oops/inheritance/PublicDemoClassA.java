package oops.inheritance;

public class PublicDemoClassA {

    public String variable = "This is my oops first class";


    public void classM1() {

        System.out.println("This is my inheritance class A");


    }

    public void t1() {


        System.out.println("This is my T1 class");
    }

    public static void main(String[] args) {

        PublicDemoClassA obj = new PublicDemoClassA();
        obj.classM1();
        System.out.println(obj.variable);
        obj.t1();
    }


}
