package important_keywords;

public class StaticChild extends DemoStaticQnA{

    public static void m1(){
        System.out.println("This is Static method of StaticChild class...");
    }
    public static void main(String[] args) {
        StaticChild.m1();
    }

}
