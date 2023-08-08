package class_and_object.parameterise_constructor;

public class MyEngineer {
    String name;
    int age;
    String dpt;

    // parameterised constructor


    public MyEngineer(String name, int age, String dpt) {
        this.name = name;
        this.age = age;
        this.dpt = dpt;
    }

    public static void main(String args []){

        MyEngineer MyEngineer1 = new MyEngineer("Vishvash", 34,"Software");
       System.out.println("MyEngineer1 name is:"+MyEngineer1.name+"  age: "+MyEngineer1.age+"  dpt: "+MyEngineer1.dpt);
        MyEngineer MyEngineer2 = new MyEngineer("Aman", 36,"Hardware");
        System.out.println("MyEngineer2 name is:"+MyEngineer2.name+"  age: "+MyEngineer2.age+  "  dpt: "+MyEngineer2.dpt);
        MyEngineer MyEngineer3 = new MyEngineer("Shushant", 38,"Electrical");
        System.out.println("MyEngineer3 name is:"+MyEngineer3.name+"  age: "+MyEngineer3.age+"  dpt:"+MyEngineer3.dpt);




    }
}
