package class_and_object;

public class Testing {
    public static void main(String[] args) {

        Student student= new Student();

        System.out.println("Printing student name: "+student.name);

        System.out.println("Accessing default prop in same package: "+student.section);

       // System.out.println("Printing ROll no: "+student.rollNo);

    }
}
