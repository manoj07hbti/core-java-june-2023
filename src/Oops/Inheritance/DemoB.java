package Oops.Inheritance;

public class DemoB extends DemoA {

    public void M3(){
        System.out.println("this is M3 Method of DemoB Class");
    }

    public static void main(String[] args) {

        DemoB obj=new DemoB();
        obj.M2();
        System.out.println(obj.variable);

    }


}
