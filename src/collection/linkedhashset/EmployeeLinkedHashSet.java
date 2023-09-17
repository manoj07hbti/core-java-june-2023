package collection.linkedhashset;

import collection.model.Employee;

import java.util.LinkedHashSet;

public class EmployeeLinkedHashSet {

    public LinkedHashSet<Employee> createEmployeeLinkedSet() {

        LinkedHashSet<Employee> employeesData = new LinkedHashSet<>();
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

        employeesData.add(employee1);
        employeesData.add(employee2);
        employeesData.add(employee3);
        employeesData.add(employee4);
        employeesData.add(employee5);
        employeesData.add(employee6);
        employeesData.add(employee7);
        employeesData.add(employee8);
        employeesData.add(employee9);
        employeesData.add(employee10);
        employeesData.add(employee11);
        employeesData.add(employee12);
        employeesData.add(employee13);
        employeesData.add(employee14);
        employeesData.add(employee15);
        employeesData.add(employee16);
        employeesData.add(employee17);
        employeesData.add(employee18);
        employeesData.add(employee19);
        employeesData.add(employee20);

        return employeesData;


    }

    public static void main(String[] args) {

        EmployeeLinkedHashSet obj = new EmployeeLinkedHashSet();
        LinkedHashSet<Employee> employees = obj.createEmployeeLinkedSet();
        int i = 0;
        for (Employee var : employees) {
            System.out.println("Name is :" + var.getEmpName() + " |" + " Age is :" + var.getAge() + "|" + " EmpID is :" + var.getEmpId() + "|" + " Department is :" + var.getDept() + "|" + " Salary is :" + var.getSalary() + " at INDEX " + i);
            i++;
        }
    }
}
