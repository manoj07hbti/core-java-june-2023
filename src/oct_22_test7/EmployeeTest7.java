package oct_22_test7;

import collection.model.Employee;
import collection.oct_02_test6.EmployeeTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest7 {

    public HashMap<String, ArrayList<Employee>> employeeData()
    {
        HashMap<String, ArrayList<Employee>> empData=new HashMap<>();
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
            if (empData.containsKey(companyName)) {
                empData.get(companyName).add(employee);
            } else {
                ArrayList<Employee> employees = new ArrayList<>();
                employees.add(employee);
                empData.put(companyName, employees);
            }

            System.out.println("Press 'y' to continue or press any key to exit");
            choice = sc.nextLine();
        }

        return empData;
    }
    public void displayEmployeesByCity(HashMap<String, ArrayList<Employee>> empData) {
        System.out.println();
        System.out.println("Employees grouped by city:");
        HashMap<String, ArrayList<Employee>> employeesByCity = new HashMap<>();

        for (ArrayList<Employee> employees : empData.values()) {
            for (Employee employee : employees) {
                String city = employee.getCity();



                if (employeesByCity.containsKey(city)) {
                    List<Employee> cityEmployees = employeesByCity.get(city); // Retrieve the list for the city
                    cityEmployees.add(employee); // Add the employee to the list

                } else {
                    ArrayList<Employee> cityEmployees = new ArrayList<>();
                    cityEmployees.add(employee);
                    employeesByCity.put(city, cityEmployees);
                }
            }
        }


        for (String city : employeesByCity.keySet()) {
        System.out.println("City: " + city);
        ArrayList<Employee> cityEmployees = employeesByCity.get(city);

        for (Employee employee : cityEmployees) {
            System.out.println("Company: " + employee.getCompanyName() +
                    ", EmpId: " + employee.getEmpId() +
                    ", Name: " + employee.getEmpName() +
                    ", Age: " + employee.getAge() +
                    ", Salary: " + employee.getSal());
        }
    }
    }

    public void displayEmployeesBySalary(HashMap<String, ArrayList<Employee>> empData) {
        System.out.println();
        System.out.println("5.Employees grouped by salary:");
        HashMap<Double, ArrayList<Employee>> employeesBySalary = new HashMap<>();

        for (ArrayList<Employee> employees : empData.values()) {
            for (Employee employee : employees) {
                Double salary = employee.getSal();

                if (employeesBySalary.containsKey(salary)) {
                    List<Employee> salEmployees = employeesBySalary.get(salary); // Retrieve the list for the Salary
                    salEmployees.add(employee); // Add the employee to the list

                }else {
                    ArrayList<Employee> salEmployees = new ArrayList<>();
                    salEmployees.add(employee);
                    employeesBySalary.put(salary, salEmployees);
                }
            }
        }

        for (Double Salary: employeesBySalary.keySet()) {
            System.out.println("Salary: " + Salary);
            ArrayList<Employee> salEmployees = employeesBySalary.get(Salary);

            for (Employee employee : salEmployees) {
                System.out.println("CompanyName: " + employee.getCompanyName() +
                        ", EmpId: " + employee.getEmpId() +
                        ", Name: " + employee.getEmpName() +
                        ", Age: " + employee.getAge() +
                        ", Salary: " + employee.getSal());

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        EmployeeTest7 obj = new EmployeeTest7();
        HashMap<String, ArrayList<Employee>> employeeData = obj.employeeData();

        System.out.println("Employee data for different companies:");
        for (String key : employeeData.keySet()) {
            ArrayList<Employee> employees = employeeData.get(key);
            System.out.println("Company name: " + key);
            for (Employee employee : employees) {
                System.out.println(" Name: " + employee.getEmpName() +
                          ", Salary: " + employee.getSal() +
                        ", City: " + employee.getCity());
            }
        }
        obj.displayEmployeesByCity(employeeData);
        obj.displayEmployeesBySalary(employeeData);
    }
}
