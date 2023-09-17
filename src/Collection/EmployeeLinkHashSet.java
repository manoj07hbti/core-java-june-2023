package Collection;

import Collection.Model.Employee;

import java.util.LinkedHashSet;

public class EmployeeLinkHashSet {
    public LinkedHashSet<Employee> CreateEmployeeList() {
        LinkedHashSet<Employee> EmployeeData = new LinkedHashSet<>();
        Employee emp1 = new Employee("Tarun Kumar", 123, "MCA", 45000.87);
        Employee emp2 = new Employee("Mukesh Kumar", 124, "BCA", 40000.87);
        Employee emp3 = new Employee("Rakesh Kumar", 125, "BSC", 43000.87);
        Employee emp4 = new Employee("Manish", 126, "CSE", 47000.87);
        Employee emp5 = new Employee("Jatin Kumar", 127, "BA", 4000.87);
        Employee emp6 = new Employee("Ram Kumar", 128, "M.Tech", 70000.87);

        EmployeeData.add(emp1);
        EmployeeData.add(emp2);
        EmployeeData.add(emp3);
        EmployeeData.add(emp4);
        EmployeeData.add(emp5);
        EmployeeData.add(emp6);

        return EmployeeData;


    }

    public static void main(String[] args) {
        EmployeeLinkHashSet obj = new EmployeeLinkHashSet();
        LinkedHashSet<Employee> Employees = obj.CreateEmployeeList();
        for (Employee var : Employees) {
            System.out.println("Printing Employee List : " + "Name:" + var.getEmployee_Name() + " ID :" + var.getEmployeeId() + " Job Role : " + var.getEmployee_Job_Role() + " Salary : " + var.getEmployee_Salary());
        }
    }
}
