package collection.hashset;

import collection.model.Employee;

import java.util.HashSet;

public class EmployeeHashSet {

    public HashSet<Employee> createEmployeeSet() {
        HashSet<Employee> employees = new HashSet<>();

        Employee employee1 = new Employee("MOHAN", 40, 5, "IT", 45600);
        System.out.println("Hashcode of Employee 1 is:" + employee1.hashCode());
        Employee employee2 = new Employee("PAYAL", 39, 6, "SALES", 47600);
        System.out.println("Hashcode of Employee 2 is:" + employee2.hashCode());
        Employee employee3 = new Employee("RAHUL", 38, 4, "RESOURCE", 48600);
        System.out.println("Hashcode of Employee 3 is:" + employee3.hashCode());
        Employee employee4 = new Employee("MADAN", 37, 9, "STEEL", 49600);
        System.out.println("Hashcode of Employee 4 is:" + employee4.hashCode());
        Employee employee5 = new Employee("PRIYA", 36, 8, "FABRIC", 44600);
        System.out.println("Hashcode of Employee 5 is:" + employee5.hashCode());
        Employee employee6 = new Employee("RADHA", 35, 7, "HR", 43600);
        System.out.println("Hashcode of Employee 6 is:" + employee6.hashCode());
        Employee employee7 = new Employee("OJAL", 33, 2, "ADVERTISEMENT", 42600);
        System.out.println("Hashcode of Employee 7 is:" + employee7.hashCode());
        Employee employee8 = new Employee("OMIYA", 32, 10, "GRAPHIC", 41600);
        System.out.println("Hashcode of Employee 8 is:" + employee8.hashCode());
        Employee employee9 = new Employee("SHIVAM", 31, 1, "LANDSCAPE", 46600);
        System.out.println("Hashcode of Employee 9 is:" + employee9.hashCode());
        Employee employee10 = new Employee("ANKIT", 30, 3, "ARCHITECTURE", 50600);
        System.out.println("Hashcode of Employee 10 is:" + employee10.hashCode());
        Employee employee11 = new Employee("MOHAN", 40, 5, "IT", 45600);
        System.out.println("Hashcode of Employee 11 is:" + employee11.hashCode());
        Employee employee12 = new Employee("PAYAL", 39, 6, "SALES", 47600);
        System.out.println("Hashcode of Employee 12 is:" + employee12.hashCode());
        Employee employee13 = new Employee("RAHUL", 38, 4, "RESOURCE", 48600);
        System.out.println("Hashcode of Employee 13 is:" + employee13.hashCode());
        Employee employee14 = new Employee("MADAN", 37, 9, "STEEL", 49600);
        System.out.println("Hashcode of Employee 14 is:" + employee14.hashCode());
        Employee employee15 = new Employee("PRIYA", 36, 8, "FABRIC", 44600);
        System.out.println("Hashcode of Employee 15 is:" + employee15.hashCode());
        Employee employee16 = new Employee("RADHA", 35, 7, "HR", 43600);
        System.out.println("Hashcode of Employee 16 is:" + employee16.hashCode());
        Employee employee17 = new Employee("OJAL", 33, 2, "ADVERTISEMENT", 42600);
        System.out.println("Hashcode of Employee 17 is:" + employee17.hashCode());
        Employee employee18 = new Employee("OMIYA", 32, 10, "GRAPHIC", 41600);
        System.out.println("Hashcode of Employee 18 is:" + employee18.hashCode());
        Employee employee19 = new Employee("SHIVAM", 31, 1, "LANDSCAPE", 46600);
        System.out.println("Hashcode of Employee 19 is:" + employee19.hashCode());
        Employee employee20 = new Employee("ANKIT", 30, 3, "ARCHITECTURE", 50600);
        System.out.println("Hashcode of Employee 20 is:" + employee20.hashCode());


        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);
        employees.add(employee7);
        employees.add(employee8);
        employees.add(employee9);
        employees.add(employee10);
        employees.add(employee11);
        employees.add(employee12);
        employees.add(employee13);
        employees.add(employee14);
        employees.add(employee15);
        employees.add(employee16);
        employees.add(employee17);
        employees.add(employee18);
        employees.add(employee19);
        employees.add(employee20);

        return employees;
    }

    public static void main(String[] args) {
        EmployeeHashSet obj = new EmployeeHashSet();
        HashSet<Employee> employeesData = obj.createEmployeeSet();
        int i = 0;
        for (Employee var : employeesData) {
            System.out.println("Name is :" + var.getEmpName() + " Age is :" + var.getAge() + " EmpID is :" + var.getEmpId() + " Department is :" + var.getDept() + " Salary is :" + var.getSalary() + " at INDEX " + i);
            i++;
        }
    }
}


