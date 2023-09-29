package oops.inheritance;

public class DemoB extends DemoA {
    //TODO DemoB<---->DemoA single level inheritance
    public void m2() {
        System.out.println("This is my M2 method of Class DemoB ");
    }

    public static void main(String[] args) {
        DemoB obj = new DemoB();
        obj.m1();
        System.out.println(obj.variable);
    }
}
