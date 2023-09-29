package oops.inheritance;

public class DemoP {

    //TODO DemoP<---->DemoQ single level inheritance
    public String GOT = "Winter is Coming";

    public void p1() {

        System.out.println("This is my P1 Method of Class DemoP");
    }

    public static void main(String[] args) {
        DemoP obj = new DemoP();
        obj.p1();
        System.out.println(obj.GOT);
    }
}
