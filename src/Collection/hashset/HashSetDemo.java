package Collection.hashset;

import java.util.HashSet;

public class HashSetDemo {
    public HashSet<String> createEmployee() {
        HashSet<String> Employee = new HashSet<>();
        Employee.add("RaviKant Singh");
        Employee.add("Mohit Kumar");
        Employee.add("Rohan Singh");
        Employee.add("Virat Kohali");
        Employee.add("RaviKant Singh");
        Employee.add("Mohit Kumar");
        Employee.add("Rohan Singh");
        Employee.add("Virat Kohali");
        return Employee;

    }

    public HashSet<Integer> createEmployeeID() {
        HashSet<Integer> EmployeeID = new HashSet<>();
        EmployeeID.add(1);
        EmployeeID.add(2);
        EmployeeID.add(3);
        EmployeeID.add(4);
        EmployeeID.add(5);
        EmployeeID.add(6);
        EmployeeID.add(1);
        EmployeeID.add(2);
        EmployeeID.add(3);
        EmployeeID.add(4);
        EmployeeID.add(5);
        EmployeeID.add(6);
        return EmployeeID;
    }

    public HashSet<Double> EmployeeSalary() {
        HashSet<Double> EmployeeSalaryList = new HashSet<>();
        EmployeeSalaryList.add(43000.98);
        EmployeeSalaryList.add(54000.97);
        EmployeeSalaryList.add(42000.98);
        EmployeeSalaryList.add(41000.98);
        EmployeeSalaryList.add(40000.98);
        EmployeeSalaryList.add(39000.98);
        EmployeeSalaryList.add(43000.98);
        EmployeeSalaryList.add(54000.97);
        EmployeeSalaryList.add(42000.98);
        EmployeeSalaryList.add(41000.98);
        EmployeeSalaryList.add(40000.98);
        EmployeeSalaryList.add(39000.98);
        return EmployeeSalaryList;


    }

    public static void main(String[] args) {
        HashSetDemo obj = new HashSetDemo();
        HashSet<String> EmployeeList = obj.createEmployee();
        for (String var : EmployeeList) {
            System.out.println("Using for loop Printing Employee List are : " + var);
        }
        HashSet<Integer> EmployeeIDs = obj.createEmployeeID();
        for (Integer var : EmployeeIDs) {
            System.out.println("Using for loop Printing Employee IDs are : " + var);
        }
        HashSet<Double> EmployeeSalaryList = obj.EmployeeSalary();
        for (Double var : EmployeeSalaryList) {
            System.out.println("Using for loop Printing Employee Salary are : " + var);
        }
    }
}
