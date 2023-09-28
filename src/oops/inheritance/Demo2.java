package oops.inheritance;

public class Demo2 extends Demo1 {
    public void m2()
    {
        System.out.println("This is m2 Method of Demo2");
    }

    public static void main(String[] args) {
        Demo2 obj = new Demo2();
        obj.m1();
        obj.m2();
        System.out.println(obj.Variable);

    }
}
