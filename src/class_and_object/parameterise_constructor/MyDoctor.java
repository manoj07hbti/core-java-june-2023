package class_and_object.parameterise_constructor;

import class_and_object.Person;

public class MyDoctor {
    String name;
    int age;
    String add;

    // parameterised constructor

    public MyDoctor(String name, int age, String add) {
        this.name = name;
        this.age = age;
        this.add = add;
    }
    public static void main(String args []){

        MyDoctor MyDoctor1 = new MyDoctor("Rohan",34,"Kanpur");
        System.out.println("My doctor1 name is:"+ MyDoctor1.name+ "  age "+MyDoctor1.age+ "  add " +MyDoctor1.add);
        MyDoctor MyDoctor2 = new MyDoctor("Sohan",32,"Agra");
        System.out.println("My doctor2 name is:"+ MyDoctor2.name+"  age "+MyDoctor2.age+"  add "+MyDoctor2.add);
        MyDoctor MyDoctor3 = new MyDoctor("Abhinav",24,"Jhansi");
        System.out.println("My doctor3 name is:"+ MyDoctor3.name+"  age "+MyDoctor3.age+"  add "+MyDoctor3.add);
    }
}
