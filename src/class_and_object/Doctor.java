package class_and_object;

public class Doctor {

    String name = "Dr Sanjay Varma";
    String add ="jhansi" ;
    String dept = "Skin Specialist";
    int age = 40;
    double salary = 116780.78;

    public static void main(String args []){
        // class name object name = new class name() // default constructor

        Doctor doctor1 = new Doctor();

        System.out.println("Printing Dr name:" +doctor1.name);
        System.out.println("Printing Dr add:"  +doctor1.add);
        System.out.println("Printing Dr dept:" +doctor1.dept);
        System.out.println("Printing Dr age:"  +doctor1.age);
        System.out.println("Printing Dr salary:" +doctor1.salary);




    }
}
