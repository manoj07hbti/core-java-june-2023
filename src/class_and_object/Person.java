package class_and_object;

public class Person {

    String name = "Rohan";
    String add = "Kanpur";
    String identity = "Indian";
    int age = 45;
    String field = "Farmer";

    public static void main(String args []){
        // class name object name = new class name() // default constructor

        Person Person1 = new Person();

        System.out.println("Printing Person name:  "+Person1.name);
        System.out.println("Printing Person add:  "+Person1.add);
        System.out.println("Printing Person identity:  "+Person1.identity);
        System.out.println("Printing Person age:  "+Person1.age);
        System.out.println("Printing Person field:  "+Person1.field);



    }

}
