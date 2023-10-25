package Test_22oct;

import java.util.*;

public class EmployeeManagement {

    public static void main(String[] args) {
        Map<String, Employee> employeeData = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter employee name (or 'exit' to quit): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter employee salary: ");
            double salary = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter employee city: ");
            String city = scanner.nextLine();

            System.out.print("Enter employee department: ");
            String department = scanner.nextLine();

            Employee employee = new Employee(name,city, department, salary);
            employeeData.put(name, employee);
        }

        displayEmployeesByCity(employeeData);
        displayEmployeesBySalary(employeeData);
    }

    public static void displayEmployeesByCity(Map<String, Employee> data) {
        System.out.println("\nEmployees grouped by city:");
        Map<String, StringBuilder> cityGroups = new HashMap<>();

        for (Employee employee : data.values()) {
            cityGroups.computeIfAbsent(employee.getCity(), k -> new StringBuilder())
                    .append(employee.getName()).append(" ");
        }

        cityGroups.forEach((city, names) -> System.out.println(city + ": " + names.toString()));
    }

    public static void displayEmployeesBySalary(Map<String, Employee> data) {
        System.out.println("\nEmployees with the same salary:");
        Map<Double, StringBuilder> salaryGroups = new HashMap<>();

        for (Employee employee : data.values()) {
            salaryGroups.computeIfAbsent(employee.getSalary(), k -> new StringBuilder())
                    .append(employee.getName()).append(" ")
                    .append(employee.getDepartment()).append(" ");
        }

        salaryGroups.forEach((salary, namesAndDepartments) -> {
            String[] parts = namesAndDepartments.toString().split(" ");
            for (int i = 0; i < parts.length; i += 2) {
                System.out.println(parts[i] + " " + salary + " " + parts[i + 1]);
            }
        });
    }
}



