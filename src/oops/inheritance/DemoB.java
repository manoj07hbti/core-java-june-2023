package oops.inheritance;



public class DemoB extends DemoA {

    public void m2(){

        System.out.println(" This is second method of class Demo B : ");
    }


    public static void main( String [] args ){

        DemoB Obj = new DemoB();

        Obj.m1();

        System.out.println(Obj.variable);

    }
}
