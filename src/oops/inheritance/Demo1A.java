package oops.inheritance;

public class Demo1A {
    //TODO Demo1A<---->Demo1B single level inheritance
    public String MSG1 = "NULL";

    public void a1() {
        System.out.println("This is my Method 1A of Class Demo1A ");
    }

    public static void main(String[] args) {
        Demo1A obj = new Demo1A();
        obj.a1();
        System.out.println(obj.MSG1);
    }
}
