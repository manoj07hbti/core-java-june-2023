package collections;

import collections.model.Employee;

import java.util.ArrayList;

public class DemoEmployeeList {

    public ArrayList CreateEmployeeList(){

        ArrayList<Employee>  EmployeeList = new ArrayList<>();

        Employee employee1 = new Employee("Jay Rawat "," IT ", 65000);
        Employee employee2 = new Employee("Kamal  "," Furniture ", 70000);
        Employee employee3 = new Employee("Mohan "," HR ", 80000);
        Employee employee4 = new Employee("Wendy "," IT ", 75000);
        Employee employee5 = new Employee("Veer "," Furniture", 50000);
        Employee employee6 = new Employee("Dev "," HR ", 85000);
        Employee employee7 = new Employee("Soniya  "," IT ", 55000);
        Employee employee8 = new Employee("Monika "," HR ", 65000);
        Employee employee9= new Employee("Deepa "," IT ", 70000);
        Employee employee10 = new Employee("Kapil "," Furniture ", 70000);

        EmployeeList.add(employee1);
        EmployeeList.add(employee2);
        EmployeeList.add(employee3);
        EmployeeList.add(employee4);
        EmployeeList.add(employee5);
        EmployeeList.add(employee6);
        EmployeeList.add(employee7);
        EmployeeList.add(employee8);
        EmployeeList.add(employee9);
        EmployeeList.add(employee10);

        return EmployeeList;
    }

    public static void main(String[] args) {

        DemoEmployeeList obj = new DemoEmployeeList();

       ArrayList<Employee> employees =obj.CreateEmployeeList();

        for (int i =0; i <employees.size(); i++){

            System.out.println("Using for loop Name " + employees.get(i).getName() + "Department " +employees.get(i).getDepartment() + " Salary " + employees.get(i).getSalary());
        }

        for (Employee var :employees){

            System.out.println("Using Advance Loop Name " + var.getName() + "Department " + var.getDepartment() + "Salary "+ var.getSalary());
        }

    }
}
