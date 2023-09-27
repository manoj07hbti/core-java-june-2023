package oops.inheritance;


public class DemoB extends DemoA{

    public void m2(){
        System.out.println("This is M2 method of DemoB Class...");
    }
    public static void main(String[] args) {

        DemoB obj= new DemoB();
        obj.m1();
        System.out.println(obj.variable);

    }
}
