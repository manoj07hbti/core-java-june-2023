package oops.inheritance;

public class DemoQ extends DemoP {

    //TODO DemoQ<---->DemoP single level inheritance
    public void q1() {

        System.out.println("This is my Q1 Method of Class DemoQ");
    }

    public static void main(String[] args) {
        DemoQ obj = new DemoQ();
        obj.p1();
        obj.q1();

    }
}