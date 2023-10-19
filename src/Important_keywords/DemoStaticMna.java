package Important_keywords;

public class DemoStaticMna {
    String name = "Test";// non static data

    public static void m1() {
        System.out.println("This is static method of DemoStaticMna class");
    }

    public static void m1(String Test) {
        System.out.println("OverLoaded Method.....");
    }

    public static void m2() {
        System.out.println("m2 Method.....");
        //   System.out.println(name);
    }

    public static void main(String[] args) {
        DemoStaticMna.m1();
        DemoStaticMna.m1("Core Java");
        DemoStaticMna.m2();
    }

}
