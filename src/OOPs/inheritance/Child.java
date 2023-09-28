package OOPs.inheritance;

public class Child extends Parent {
    String Variables = "This is Child inheritance class in Multi-Level";

    public void Child() {
        System.out.println("This is child Class ");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.ParentDemo();
        System.out.println(obj.Variable);

    }

}


