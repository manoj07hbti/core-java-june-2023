package Collection.arraylist;

import Collection.Model.Employee;

import java.util.ArrayList;

public class Employee_Detail {


    public ArrayList<Employee> EmployeeList() {
        ArrayList<Employee> EmployeeData = new ArrayList<>();
        Employee Employee1 = new Employee("Shiv  kumar", 00001, "HOD EN ", 100000);
        Employee Employee2 = new Employee("Ravi Kant", 00002, "HOD IT Department", 39000.87);
        Employee Employee3 = new Employee("Mohit kumar", 00003, "HOD CS Department", 40000.87);
        Employee Employee4 = new Employee("Rohan Kant", 00004, "HOD ME Department", 35000.87);
        Employee Employee5 = new Employee("Manish Sharma", 00005, "HOD EC Department", 37000.87);
        EmployeeData.add(Employee1);
        EmployeeData.add(Employee2);
        EmployeeData.add(Employee3);
        EmployeeData.add(Employee4);
        EmployeeData.add(Employee5);
        return EmployeeData;


    }

    public static void main(String[] args) {
        Employee_Detail obj = new Employee_Detail();
        ArrayList<Employee> Employee = obj.EmployeeList();
        for (int i = 0; i < Employee.size(); i++) {


            System.out.println("Using For Loop Printing Employee Name is : " + Employee.get(i).getEmployee_Name());
            System.out.println("Using For Loop Printing Employee ID is : " + Employee.get(i).getEmployeeId());
            System.out.println("Using For Loop Printing Employee JOb Role  is : " + Employee.get(i).getEmployee_Job_Role());
            System.out.println("Using For Loop Printing Employee Salary is : " + Employee.get(i).getEmployee_Salary());

        }
        int i = 0;
        while (i < Employee.size()) {
            System.out.println("Using While loop Printing Employee name is : " + Employee.get(i).getEmployee_Name());
            System.out.println("Using While loop Printing Employee ID is : " + Employee.get(i).getEmployeeId());
            System.out.println("Using While loop Printing Employee Job Role is : " + Employee.get(i).getEmployee_Job_Role());
            System.out.println("Using While loop Printing Employee Salary is  : " + Employee.get(i).getEmployee_Salary());
            i++;
        }
        int j = 0;
        do {
            System.out.println("Printing do while loop Printing Employee name is : " + Employee.get(j).getEmployee_Name());
            System.out.println("Printing do while loop Printing Employee ID is : " + Employee.get(j).getEmployeeId());
            System.out.println("Printing do while loop Printing Employee Job Role is : " + Employee.get(j).getEmployee_Job_Role());
            System.out.println("Printing do while loop Printing Employee Salary is : " + Employee.get(j).getEmployee_Salary());
            j++;
        } while (j < Employee.size());

    }
}

