package OOPs.inheritance.Polymorphism;

public class OverloadingMethodDemo {
    public void m1() {
        System.out.println("This is normal method....");
    }

    public void m1(String name) {
        System.out.println("This is over loading method with String input parameter....");
    }

    public void m1(String name, int age) {
        System.out.println("This is over loading method with String and integer input parameter....");
    }

    public static void main(String[] args) {
        OverloadingMethodDemo obj = new OverloadingMethodDemo();
        obj.m1();
        obj.m1("");
        obj.m1("Ravi", 22);
    }
}

