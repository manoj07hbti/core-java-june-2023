package class_and_object;

public class Employee {

    // data member
    String name="ABC";
    String empId="0443AB";
    String dept="CS";
    double salary=23432.34;


    public static void main(String[] args) {
        //ClassName objName= new ClassName();   DEFAULT CONSTRUCTOR

        Employee employee1= new Employee();

        System.out.println("Printing employee name: "+employee1.name +" emp id:"+employee1.empId+" Dept:"+employee1.dept+" Salary: "+employee1.salary);

    }
}
