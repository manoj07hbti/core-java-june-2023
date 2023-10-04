package collection.oct_02_test6;

import collection.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeTest {

    public HashMap<String, ArrayList<Employee>> employeeUserInput() {
        HashMap<String, ArrayList<Employee>> emp = new HashMap<>();

        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Employee id: ");
            String empId = sc.nextLine();

            System.out.println("Enter Employee name: ");
            String empName = sc.nextLine();

            System.out.println("Enter age of Employee: ");
            int age = sc.nextInt();

            System.out.println("Enter Employee salary: ");
            double sal = sc.nextDouble();
            sc.nextLine(); // Consume the newline character

            System.out.println("Enter company name: ");
            String companyName = sc.nextLine();

            System.out.println("Enter city: ");
            String city = sc.nextLine();

            Employee employee = new Employee(empId, empName, age, sal, companyName, city);

            // Check if the company already exists in the map
            if (emp.containsKey(companyName)) {
                emp.get(companyName).add(employee);
            } else {
                ArrayList<Employee> employees = new ArrayList<>();
                employees.add(employee);
                emp.put(companyName, employees);
            }

            System.out.println("Press 'y' to continue or press any key to exit");
            choice = sc.nextLine();
        }

        return emp;
    }

    public void findAndDisplayHighSalaryEmployees(HashMap<String, ArrayList<Employee>> empData) {


        System.out.println();
        System.out.println();
        System.out.println("Employee data whose salary is greater than 50000 and belongs to Pune city for IBM and TCS:");

        for (String key : empData.keySet()) {
            if (key.equalsIgnoreCase("TCS") || key.equalsIgnoreCase("IBM")) {
                ArrayList<Employee> employees = empData.get(key);

                for (Employee employee : employees) {
                    if (employee.getCity().equalsIgnoreCase("Pune") && employee.getSal() > 50000) {
                        System.out.println("Company: " + key + ", EmpId: " + employee.getEmpId() +
                                ", Name: " + employee.getEmpName() + ", Age: " + employee.getAge() +
                                ", Salary: " + employee.getSal());
                    }
                }
            }
        }
    }

    public void findAndDisplayHighestSalaryEmployee(HashMap<String, ArrayList<Employee>> empData) {
        System.out.println();
        System.out.println();

        double highestSalary = Double.MIN_VALUE;
        Employee highestSalaryEmployee = null;

        for (ArrayList<Employee> employees : empData.values()) {
            for (Employee employee : employees) {
                if (employee.getSal() > highestSalary) {
                    highestSalary = employee.getSal();
                    highestSalaryEmployee = employee;
                }
            }
        }

        if (highestSalaryEmployee != null) {
            System.out.println("Employee with the highest salary:");
            System.out.println("EmpId: " + highestSalaryEmployee.getEmpId() +
                    ", Name: " + highestSalaryEmployee.getEmpName() +
                    ", Age: " + highestSalaryEmployee.getAge() +
                    ", Salary: " + highestSalaryEmployee.getSal() +
                    ", Company: " + highestSalaryEmployee.getCompanyName() +
                    ", City: " + highestSalaryEmployee.getCity());
        } else {
            System.out.println("No employees found.");
        }
    }




    public void findEmployeeWithLowestSalary(HashMap<String, ArrayList<Employee>> empData) {
        System.out.println();
        System.out.println();

        double lowestSalary = Double.MAX_VALUE;
        Employee lowestSalaryEmployee = null;

        for (ArrayList<Employee> employees : empData.values()) {
            for (Employee employee : employees) {
                if (employee.getSal() < lowestSalary) {
                    lowestSalary = employee.getSal();
                    lowestSalaryEmployee = employee;
                }
            }
        }
        if (lowestSalaryEmployee != null) {
            System.out.println("Employee with the lowest salary:");
            System.out.println("EmpId: " + lowestSalaryEmployee.getEmpId() +
                    ", Name: " + lowestSalaryEmployee.getEmpName() +
                    ", Age: " + lowestSalaryEmployee.getAge() +
                    ", Salary: " + lowestSalaryEmployee.getSal());
        } else {
            System.out.println("No employees found.");
        }


    }



    public static void main(String[] args) {
        EmployeeTest obj = new EmployeeTest();
        HashMap<String, ArrayList<Employee>> employeeData = obj.employeeUserInput();

        System.out.println("Employee data for different companies:");
        for (String key : employeeData.keySet()) {
            ArrayList<Employee> employees = employeeData.get(key);
            System.out.println("Company: " + key);

            for (Employee employee : employees) {
                System.out.println("EmpId: " + employee.getEmpId() + ", Name: " + employee.getEmpName() +
                        ", Age: " + employee.getAge() + ", Salary: " + employee.getSal() +
                        ", City: " + employee.getCity());
            }
        }

        obj.findAndDisplayHighSalaryEmployees(employeeData);
        obj.findAndDisplayHighestSalaryEmployee(employeeData);
        obj.findEmployeeWithLowestSalary(employeeData);
    }
}
