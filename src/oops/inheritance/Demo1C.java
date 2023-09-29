package oops.inheritance;

public class Demo1C extends Demo1B {


    public void c1() {

        System.out.println("This is my Method 1C of Class Demo1C");
    }


    public static void main(String[] args) {
        Demo1C obj = new Demo1C();
        obj.a1();
        obj.b1();
        obj.c1();
        System.out.println(obj.MSG1);
        System.out.println(obj.MSG2);

    }
}
