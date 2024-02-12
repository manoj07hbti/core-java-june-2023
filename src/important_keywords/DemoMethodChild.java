package important_keywords;

public class DemoMethodChild extends DemoMethod {
    @Override
    public void m1(){
        System.out.println("This is child class m1 method ");
    }

    @Override
    public void m2 (){
        System.out.println("This child class m2 method");

    }
    public static void main(String[] args) {
        DemoMethodChild obj = new DemoMethodChild();

        obj.m1();
        obj.m2();
        final String name = "Anshu";

        System.out.println(name);
    }


}
