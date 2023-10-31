package important_keywords;

public class Static {

public static String name="Java";
    public static void m1(){
        System.out.println("This is my static method");
    }

    public static void main(String[] args) {
        Static.m1();
        System.out.println(Static.name);
    }
}
