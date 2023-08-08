package class_and_object;

public class Engineer {

    String name = "Krishna";
    int age = 26;
    String dept = "Software Developer";
    String id = "2364@ID";
    double salary = 78000.00;

    public static void main(String args []){

        // class name object name = new class name() // default constructor

        Engineer Engineer1 = new Engineer();

        System.out.println("Printing name Engineer:  "+Engineer1.name);
        System.out.println("Printing age Engineer   :"+Engineer1.age);
        System.out.println("Printing dept Engineer    :"+Engineer1.dept);
        System.out.println("Printing id Engineer    :"+Engineer1.id);
        System.out.println("Printing salary Engineer   :"+Engineer1.salary);



    }
}
