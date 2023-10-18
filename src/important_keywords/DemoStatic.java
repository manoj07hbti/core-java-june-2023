package important_keywords;

public class DemoStatic {

    public static String name="Java";
    public static void m1(){

        System.out.println("This is static method ...");
    }

    public static void main(String[] args) {

        DemoStatic.m1();
        System.out.println(DemoStatic.name);
    }

}
