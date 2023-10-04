package oops.inheritance.abstraction;


public class DemoAbstractionImpl extends DemoAbstraction {
    @Override
    public void m2() {
        System.out.println("This is implemented method...");
    }

    @Override
    public void m3() {

    }

    public static void main(String[] args) {
        DemoAbstractionImpl obj= new DemoAbstractionImpl();
        obj.m1();
        obj.m2();
    }
}
