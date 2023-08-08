package class_and_object;

public class Employee {

    String empName = "XYZ";

    String empID = "123A";

    int salary = 20000;

    String dept = "CSE";


    public static void main(String[] args) {
        //ClassName objName=new ClassName() DEFAULT CONSTRUCTOR

        Employee employee = new Employee();
        //object.propertyName;

        System.out.println("Printing empName:" + employee.empName);
        System.out.println("Printing empID:" + employee.empID);
        System.out.println("Printing employee salary:" + employee.salary);
        System.out.println("Printing employee dept:" + employee.dept);


        Employee employee1 = new Employee();
        //object.propertyName;
        System.out.println("Printing empName:" + employee1.empName + " Printing empID:" + employee1.empID + " Printing salary:" + employee1.salary + " Printing dept:" + employee1.dept);

    }
}
