package OOPs.inheritance.abstraction;

public class InterfaceDemoImpl implements InterfaceDemo {
    @Override
    public void m1() {
        System.out.println("This is m1 method of InterfaceDemoImpl .... ");
    }

    @Override
    public void m2() {
        System.out.println("This is m2 method of InterfaceDemoImpl .... ");
    }

    @Override
    public void m3() {
        System.out.println("This is m3 method of InterfaceDemoImpl .... ");

    }
    public static void main(String[] args) {
        InterfaceDemoImpl obj=new InterfaceDemoImpl();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
