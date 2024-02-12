package important_keywords;

public class DemoStatic {

  //  String name = "test"; // nonstatic data

    public static String name = "Dauli";

    public static void m1 (){

        System.out.println("This is my Static method...");
        System.out.println("This is staticQnA method..");

    }
    public static void  m1 (String name){

        System.out.println("This is StaticQnA Overloaded method.."+ name);
    }

    public static void m2 (){

        System.out.println("m2 method related to static or nonstatic..");

        System.out.println("Nonstatic field 'name' can not be referenced from a static context... ");

    }
    public static void main(String[] args) {

        DemoStatic.m1();
        DemoStatic.m2();
        DemoStatic.m1("Dauli");
        DemoStatic.m2();

    }
}
