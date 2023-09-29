package oops.inheritance;

import javax.xml.soap.Name;

public class DemoB extends PublicDemoClassA {

    public String myName = "MY Second class DemoB inheritance";

    public void m2() {

        System.out.println("This is my inheritance second classDemoB");
        System.out.println("Name" + myName);


    }

    public static void main(String[] args) {

        DemoB obj = new DemoB();

        obj.m2();
        obj.classM1();
        System.out.println(obj.variable);
        System.out.println(obj.myName);
        obj.t1();
    }


}
