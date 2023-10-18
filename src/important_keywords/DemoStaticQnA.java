package important_keywords;

public class DemoStaticQnA {

    String name="Test"; // non static data...
    public static void m1(){
        System.out.println("This is Static method of DemoStaticQnA class...");
    }

    public static void m1(String name){
        System.out.println("Overloaded method...");
    }

    public static void m2(){
        System.out.println("M2 method...");
        //System.out.println(name);
    }
    public static void main(String[] args) {
        DemoStaticQnA.m1();
        DemoStaticQnA.m1("test");
        DemoStaticQnA.m2();
    }
}
