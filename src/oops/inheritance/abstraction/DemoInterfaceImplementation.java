package oops.inheritance.abstraction;

public class DemoInterfaceImplementation implements DemoInterface {

    @Override
    public void m1() {
        System.out.println("Q.1.-> When we Should ues Interface ?");
        System.out.println(" ");
        System.out.println("Sol.1-> You use an Interface to Define a protocol of Behaviour that can be Implemented by Class" +
                "Anywhere in the Class Hierarchy Interfaces are useful for the following" +
                "Capturing Similarities among Unrelated classes without Artificially Forcing a class Relationship");
    }

    @Override
    public void m2() {
        System.out.println("Q.1.-> When we Should ues Abstract class ?");
        System.out.println(" ");
        System.out.println("An abstract class is used if you want to provide a common, implemented functionality among all the" +
                " implementations of the component. Abstract classes will allow you to partially implement your class, whereas " +
                "interfaces would have no implementation for any members whatsoever.");
    }

    public static void main(String[] args) {
        DemoInterfaceImplementation obj=new DemoInterfaceImplementation();
        obj.m1();
        obj.m2();
    }
}