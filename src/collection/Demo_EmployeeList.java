package collection;

import collection.model.Doctor;
import collection.model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo_EmployeeList {

    public ArrayList<Employee> createEmployeeData() {

        ArrayList<Employee> employeesList = new ArrayList<>();

        Employee employee1 = new Employee("Deepak", 28, "CS", "TechMahindra");

        Employee employee2 = new Employee("Ambika", 27, "IT", "Co forge");

        employeesList.add(employee1);
        employeesList.add(employee2);

        return employeesList;
    }

    public Employee createEmployeeDataWithUserInput(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter employee name:");
        String name = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter employee Age:");
        int Age = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter doctor Department:");
        String Department = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please enter employee CompName:");
        String CompName = scanner3.nextLine();

        Employee employee1 = new Employee(name,Age,Department,CompName);

        return employee1;

    }
    public static void main(String[] args) {

        Demo_EmployeeList obj = new Demo_EmployeeList();

        ArrayList<Employee> employees = obj.createEmployeeData();

        //using for loop:

        for (int i = 0; i < employees.size(); i++) {

            System.out.println("Name :" + employees.get(i).getName() + "Age :" + employees.get(i).getAge() + " Department :" + employees.get(i).getDepartment() + " CompName :" + employees.get(i).getCompName());
        }
        // using Advanced loop:

        for (Employee var : employees) {

            System.out.println("Name :" + var.getName() + "Age :" + var.getAge() + " Department :" + var.getDepartment() + " CompName :" + var.getCompName());

        }

        Employee employee = obj.createEmployeeDataWithUserInput();

        System.out.println("Created Data for " + employee.getName() + "," + employee.getAge() + " ," + employee.getDepartment() + " ," + employee.getCompName());

    }


}
