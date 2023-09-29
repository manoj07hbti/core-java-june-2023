package oops.inheritance;

public class DemoClassC extends DemoB {

    public String Name = "This is my third claas of oops";

    public void M3() {

        System.out.println("This is my oops third class is C");
        System.out.println("Name " + Name);


    }

    public static void main(String[] args) {

        DemoClassC obj = new DemoClassC();
        obj.M3();
        obj.classM1();
        obj.m2();
        obj.t1();
        System.out.println(obj.Name);
        System.out.println(obj.variable);
        System.out.println(obj.myName);

    }


}
