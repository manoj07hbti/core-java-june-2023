package oops.inheritance;

public class DemoC extends DemoB {
    //TODO DemoA<---->DemoB<---->DemoC multilevel level inheritance
    public static void main(String[] args) {
        DemoC obj = new DemoC();
        obj.m1();
        System.out.println(" ");
        obj.m2();
    }
}
