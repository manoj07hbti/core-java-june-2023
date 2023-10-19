package Important_keywords;

public class Demo_Static {
    static String name = "Ravi";

    public static void m1() {
        System.out.println("Printing This is Static method...");
    }

    public static void main(String[] args) {
        Demo_Static.m1();
        System.out.println(Demo_Static.name);
    }
}
