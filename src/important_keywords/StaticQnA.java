package important_keywords;

public class StaticQnA {

String name="!22234";
    public static void m1(){
        System.out.println("This is static QnA Method");
    }
    public static void m1(String name){
        System.out.println("This is static QnA Overloaded Method");
    }
    public static void m2(){
        System.out.println("M2 Method related to static or non static");
        System.out.println("Non-static field 'name' cannot be referenced from a static context");
//        System.out.println(name);

    }

    public static void main(String[] args) {
        StaticQnA.m1();
        StaticQnA.m1("jatin");
    }




}
