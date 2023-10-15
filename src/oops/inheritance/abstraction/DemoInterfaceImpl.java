package oops.inheritance.abstraction;

public class DemoInterfaceImpl implements DemoInterface  {


    @Override
    public void a1() {
        System.out.println("when we should use interface..");

        System.out.println("");

        System.out.println("Ans : you use an interface to define a protocol of Behaviour that can be implemented by class , anywhere " +
                "in the class hierarchy interfaces are useful for the following " +
                "Capturing Similarities among Unrelated classes without Artificially Forcing a class Relationship. ");



    }

    @Override
    public void a2() {

        System.out.println("When be should use abstract class..");

        System.out.println(" Ans: An abstract class is used if you want to provide a common, implemented functionality among all the implementations" +
                "of the component. Abstract classes will allow you to partially implement your class, whereas" +
                "interfaces would have no implementation for any members whatsoever." +
                "");
    }

    public static void main(String[] args) {

        DemoInterfaceImpl obj = new DemoInterfaceImpl();

        obj.a1();
        obj.a2();
    }
}
