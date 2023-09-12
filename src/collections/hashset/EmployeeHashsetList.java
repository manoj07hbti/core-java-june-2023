package collections.hashset;

import collections.model.Employee;

import java.util.HashSet;

public class EmployeeHashsetList {

    // WE WILL CREATE A METHOD.............
    public HashSet createEmployeeSet(){

    // WE WILL CREATE OBJECT FOR HASHSET...................

        HashSet<Employee> employeeHashSet = new HashSet<>();

   // NOW WE WILL ADD EMPLOYEE DATA....................

        Employee employee1 = new Employee("Jones","IT",65000);
        Employee employee2 = new Employee("Wendy","CS",80000);
        Employee employee3 = new Employee("Kartik","HR",85000);
        Employee employee4 = new Employee("Kiran","CS",55000);
        Employee employee5 = new Employee("Deepa","HR",65000);
        Employee employee6 = new Employee("Jones","IT",65000);
        Employee employee7 = new Employee("Wendy","CS",80000);
        Employee employee8 = new Employee("Kartik","HR",85000);
        Employee employee9 = new Employee("Kiran","CS",55000);
        Employee employee10 = new Employee("Deepa","HR",65000);

        // ADD THE EMPLOYEE DATA
        employeeHashSet.add(employee1);
        employeeHashSet.add(employee2);
        employeeHashSet.add(employee3);
        employeeHashSet.add(employee4);
        employeeHashSet.add(employee5);
        employeeHashSet.add(employee6);
        employeeHashSet.add(employee7);
        employeeHashSet.add(employee8);
        employeeHashSet.add(employee9);
        employeeHashSet.add(employee10);

        return employeeHashSet;

    }
    // WE WILL CREATE MAIN METHOD.............

    public static void main(String[] args) {
        EmployeeHashsetList obj =  new EmployeeHashsetList(); // CREATE  METHOD  ( CLASS NAME OBJ = NEW CLASS NAME();

        HashSet<Employee> employees = obj.createEmployeeSet(); // CALL THE EMPLOYEE LIST AND STORE THE DATA IN A VARIABLE .....

        // NOW WE WILL PRINT THE DATA USING ADVANCE FOR LOOP.....

        for (Employee var : employees){

            // USING GETTER AND SETTER CODE ....

            System.out.println("Using Advance Loop Name " + var.getName() + " Department " + var.getDepartment() + " Salary " + var.getSalary());
        }

    }
    }
