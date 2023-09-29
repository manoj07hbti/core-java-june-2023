package oops.inheritance;

public class DemoA {
    //TODO DemoA<---->DemoB single level inheritance
    public String variable = "This is my inheritance class :";

    public void m1() {

        System.out.println("This is my M1 method of Class DemoA");

    }

    public static void main(String[] args) {
        DemoA obj = new DemoA();
        obj.m1();
    }
}
