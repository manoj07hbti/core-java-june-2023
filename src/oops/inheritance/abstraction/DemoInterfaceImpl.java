package oops.inheritance.abstraction;

public class DemoInterfaceImpl implements DemoInterface{
    @Override
    public void m1() {
        System.out.println("This is m1 method of DemoInterfaceImpl");
    }

    @Override
    public void m2() {
        System.out.println("This is m2 method of DemoInterfaceImpl");
    }

    public static void main(String[] args) {
        DemoInterfaceImpl obj = new DemoInterfaceImpl();
        obj.m1();
        obj.m2();
    }
}
