package oops.inheritance.abstraction;

public  class DemoAbstractionImplementation extends DemoAbstraction {


    @Override
    public void m2() {
        System.out.println("This is my Abstraction Implemented class 1.2");
    }

    @Override
    public void m3() {
        System.out.println("This is my Abstraction Implemented class 1.3");
    }

    public static void main(String[] args) {
        DemoAbstractionImplementation obj=new DemoAbstractionImplementation();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
