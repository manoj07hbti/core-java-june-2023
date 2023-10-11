package collection.oct_02_test6;

import collection.model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public void findAndDisplayGreterSalaryEmployees(HashMap<String, ArrayList<Employee>> empData) {


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
        System.out.println("2.1 Employee having HighestSalary  ");

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
        System.out.println("2.2 Employee having LowestSalary");

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
    public void displayEmployeesByCompany(HashMap<String, ArrayList<Employee>> empData) {
        System.out.println();
        System.out.println("5.Employees grouped by Company:");
        HashMap<String, ArrayList<Employee>> employeesByCompany = new HashMap<>();

        for (ArrayList<Employee> employees : empData.values()) {
            for (Employee employee : employees) {
                String companyName = employee.getCompanyName();

                if (employeesByCompany.containsKey(companyName)) {
                    List<Employee> cityEmployees = employeesByCompany.get(companyName); // Retrieve the list for the city
                    cityEmployees.add(employee); // Add the employee to the list

                } else {
                    ArrayList<Employee> cityEmployees = new ArrayList<>();
                    cityEmployees.add(employee);
                    employeesByCompany.put(companyName, cityEmployees);
                }
            }
        }

        for (String company: employeesByCompany.keySet()) {
            System.out.println("CompanyName: " +company );
            ArrayList<Employee> cityEmployees = employeesByCompany.get(company);

            for (Employee employee : cityEmployees) {
                System.out.println("CompanyName: " + employee.getCompanyName() +
                        ", EmpId: " + employee.getEmpId() +
                        ", Name: " + employee.getEmpName() +
                        ", Age: " + employee.getAge() +
                        ", Salary: " + employee.getSal());

            }
            System.out.println();
        }
    }
    public void displayEmployeesByCity(HashMap<String, ArrayList<Employee>> empData) {
        System.out.println();
        System.out.println("4.Employees grouped by city:");
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
                    List<Employee> cityEmployees = employeesBySalary.get(salary); // Retrieve the list for the city
                    cityEmployees.add(employee); // Add the employee to the list

                } else {
                    ArrayList<Employee> cityEmployees = new ArrayList<>();
                    cityEmployees.add(employee);
                    employeesBySalary.put(salary, cityEmployees);
                }
            }
        }

        for (Double Salary: employeesBySalary.keySet()) {
            System.out.println("Salary: " + Salary);
            ArrayList<Employee> cityEmployees = employeesBySalary.get(Salary);

            for (Employee employee : cityEmployees) {
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

        obj.findAndDisplayGreterSalaryEmployees(employeeData);
        obj.findAndDisplayHighestSalaryEmployee(employeeData);
        obj.findEmployeeWithLowestSalary(employeeData);
        obj.displayEmployeesByCompany(employeeData);
        obj.displayEmployeesByCity(employeeData);
        obj.displayEmployeesBySalary(employeeData);

    }
}
