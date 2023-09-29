package oops.inheritance;

public class DemoR extends DemoQ {
    //TODO DemoP<---->DemoQ<---->DemoR multilevel level inheritance
    public String MSG = "Moving";

    public void r1() {

        System.out.println("This is my R1 Method of Class DemoR");
    }

    public static void main(String[] args) {
        DemoR obj = new DemoR();
        obj.q1();
        obj.p1();
        obj.r1();
        System.out.println(obj.MSG);

    }
}
