package collections.hashmap;

import collections.model.Employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueEmployeeData {

    public  HashMap<String, HashSet<Employee>> createEmpData(){

        HashMap<String, HashSet<Employee>> employeeMap = new HashMap<>();

   // WE NEED DATA OF EMPLOYEE..........................

        Employee employee1 = new Employee("Jay Rawat ", " IT ", 65000);
        Employee employee2 = new Employee("Kamal  ", " Furniture ", 70000);
        Employee employee3 = new Employee("Mohan ", " HR ", 80000);
        Employee employee4 = new Employee("Wendy ", " IT ", 75000);
        Employee employee5 = new Employee("Veer ", " Furniture", 50000);
        Employee employee6 = new Employee("Dev ", " HR ", 85000);
        Employee employee7 = new Employee("Soniya  ", " IT ", 55000);
        Employee employee8 = new Employee("Monika ", " HR ", 65000);
        Employee employee9 = new Employee("Deepa ", " IT ", 70000);
        Employee employee10 = new Employee("Kapil ", " Furniture ", 70000);

        //DUPLICATE DATA............................

        Employee employee11 = new Employee("Monika ", " HR ", 65000);
        Employee employee12 = new Employee("Deepa ", " IT ", 70000);
        Employee employee13 = new Employee("Kapil ", " Furniture ", 70000);
        Employee employee14 = new Employee("Kapil ", " Furniture ", 70000);

        // WE NEED TO CREATE HASH SET...............

        HashSet<Employee> employeesHashSet =new HashSet<>();

        employeesHashSet.add(employee1);
        employeesHashSet.add(employee2);
        employeesHashSet.add(employee3);
        employeesHashSet.add(employee4);
        employeesHashSet.add(employee5);
        employeesHashSet.add(employee6);
        employeesHashSet.add(employee7);
        employeesHashSet.add(employee8);
        employeesHashSet.add(employee9);
        employeesHashSet.add(employee10);

        employeesHashSet.add(employee11);
        employeesHashSet.add(employee12);
        employeesHashSet.add(employee13);
        employeesHashSet.add(employee14);

        employeeMap.put("IBM",employeesHashSet);


        return employeeMap;

    }

    public static void main(String[] args) {
        UniqueEmployeeData obj = new UniqueEmployeeData();
        HashMap<String, HashSet<Employee>> map = obj.createEmpData();

       Set<Employee>employeeSet = map.get("IBM");

        for (Employee var :employeeSet){
            System.out.println("Name : " +var.getName()+ ": Department  "  +var.getDepartment() + " : Salary : " + var.getSalary());

        }


    }
}
