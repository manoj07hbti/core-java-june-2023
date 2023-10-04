package oops.inheritance;



public class DemoY extends DemoX {

    // DemoX DemoY extends inheritance//

    public void a2(){

        System.out.println("This is my a2 method of class DemoY");
    }

    public static void main(String[] args) {

        DemoY obj = new DemoY();

        obj.a1();
        obj.a2();

        System.out.println(obj.variable);
    }

}







