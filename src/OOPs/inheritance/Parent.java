package OOPs.inheritance;

public class Parent {
    String Variable = "This is Parent inheritance Class in single-level";

    public void ParentDemo() {
        System.out.println("This is parent");
    }

    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.ParentDemo();
        System.out.println(obj.Variable);
    }
}
