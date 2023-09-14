package collection.generic_arraylist;

import collection.model.Employee;

import java.util.ArrayList;

public class EmployeeArrayList {

    public ArrayList<Employee> createEmployeeList() {

        ArrayList<Employee> employeesData = new ArrayList<>();

        Employee employee1 = new Employee("MOHAN", 40, 5, "IT", 45600);
        Employee employee2 = new Employee("PAYAL", 39, 6, "SALES", 47600);
        Employee employee3 = new Employee("RAHUL", 38, 4, "RESOURCE", 48600);
        Employee employee4 = new Employee("MADAN", 37, 9, "STEEL", 49600);
        Employee employee5 = new Employee("PRIYA", 36, 8, "FABRIC", 44600);
        Employee employee6 = new Employee("RADHA", 35, 7, "HR", 43600);
        Employee employee7 = new Employee("OJAL", 33, 2, "ADVERTISEMENT", 42600);
        Employee employee8 = new Employee("OMIYA", 32, 10, "GRAPHIC", 41600);
        Employee employee9 = new Employee("SHIVAM", 31, 1, "LANDSCAPE", 46600);
        Employee employee10 = new Employee("ANKIT", 30, 3, "ARCHITECTURE", 50600);


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


        return employeesData;
    }
    public static void main(String[] args) {
        EmployeeArrayList obj = new EmployeeArrayList();
        ArrayList<Employee> Data = obj.createEmployeeList();

        System.out.println("****Using for loop****");
        for (int i = 0; i < Data.size(); i++) {
            System.out.println("Name is :" + Data.get(i).getEmpName() + " Age is :" + Data.get(i).getAge() + " EmpID is :" + Data.get(i).getEmpId() + " Department is :" + Data.get(i).getDept() + " Salary is :" + Data.get(i).getSalary());
        }

        System.out.println("");
        System.out.println("****Using while loop****");
        System.out.println("");
        int j = 0;
        while (j < Data.size()) {
            System.out.println("Name is :" + Data.get(j).getEmpName() + " Age is :" + Data.get(j).getAge() + " EmpID is :" + Data.get(j).getEmpId() + " Department is :" + Data.get(j).getDept() + " Salary is :" + Data.get(j).getSalary());
            j++;
        }
        System.out.println("");
        System.out.println("****Using do while loop****");
        System.out.println("");
        int k = 0;
        do {
            System.out.println("Name is :" + Data.get(k).getEmpName() + " Age is :" + Data.get(k).getAge() + " EmpID is :" + Data.get(k).getEmpId() + " Department is :" + Data.get(k).getDept() + " Salary is :" + Data.get(k).getSalary());
            k++;
        } while (k < Data.size());

        System.out.println("");
        System.out.println("****Using do while loop****");
        System.out.println("");
        for (Employee var : Data) {
            System.out.println("Name is :" + var.getEmpName() + " Age is :" + var.getAge() + " EmpID is :" + var.getEmpId() + " Department is :" + var.getDept() + " Salary is :" + var.getSalary());
        }
    }
}
