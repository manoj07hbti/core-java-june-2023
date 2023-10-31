package important_keywords;

public class StaticChild extends StaticQnA{

    public static void m1(){
        System.out.println("This is my static child method");
    }

    public static void main(String[] args) {
        StaticChild.m1();
    }
}
