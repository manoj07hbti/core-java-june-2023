package oops.inheritance;

public class Demo1B extends Demo1A {
    //TODO Demo1B<---->Demo1A single level inheritance
    public String MSG2 = "There is no Value";

    public void b1() {

        System.out.println("This is my Method 1B of Class Demo1B");
    }

    public static void main(String[] args) {
        Demo1B obj = new Demo1B();
        obj.b1();
        obj.a1();
        System.out.println(obj.MSG1 + " " + obj.MSG2);

    }
}
