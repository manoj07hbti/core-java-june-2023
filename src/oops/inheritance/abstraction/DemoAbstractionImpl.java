package oops.inheritance.abstraction;

public class DemoAbstractionImpl extends DemoAbstraction {


    @Override
    public void x2() {
        System.out.println("This is Implemented Method...");
    }

    public static void main(String[] args) {

        DemoAbstractionImpl obj = new DemoAbstractionImpl();

        obj.x1();
        obj.x2();
    }
}
