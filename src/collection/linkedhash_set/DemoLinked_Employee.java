package collection.linkedhash_set;

import collection.model.Employee;

import java.util.LinkedHashSet;

public class DemoLinked_Employee {

    public LinkedHashSet<Employee> createLinkedEmployee() {

        LinkedHashSet<Employee> EmployeeDetails = new LinkedHashSet<>();

        Employee employee1 = new Employee("Neetu", 32, "TechMahindra");
        System.out.println("hashcode of employee1" + employee1.hashCode());

        Employee employee2 = new Employee("Lalit", 30, "Azimuth");
        System.out.println("hashcode of employee2" + employee2.hashCode());

        Employee employee3 = new Employee("Anaya", 25, "IT");
        System.out.println("hashcode of employee3" + employee3.hashCode());

        Employee employee4 = new Employee("Neetu", 32, "TechMahindra");
        System.out.println("hashcode of  employee4" + employee4.hashCode());

        Employee employee5 = new Employee("Lalit", 30, "Azimuth");
        System.out.println("hashcode of employee5" + employee5.hashCode());

        Employee employee6 = new Employee("Anaya", 25, "IT");
        System.out.println("hashcode of employee6" + employee6.hashCode());

        EmployeeDetails.add(employee1);
        EmployeeDetails.add(employee2);
        EmployeeDetails.add(employee3);
        EmployeeDetails.add(employee4);
        EmployeeDetails.add(employee5);
        EmployeeDetails.add(employee6);

        return EmployeeDetails;

    }

    public static void main(String[] args) {

        DemoLinked_Employee obj = new DemoLinked_Employee();

        LinkedHashSet<Employee> EmployeeDetails = obj.createLinkedEmployee();

        int j = 0;

        for (Employee employee : EmployeeDetails) {

            System.out.println("  Name :" + employee.getName() + "  Age :" + employee.getAge() + "  CompName :" + employee.CompName + " At Index" + j);
            j++;

        }


    }


}
