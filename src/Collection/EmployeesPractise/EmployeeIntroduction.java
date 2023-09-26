package Collection.EmployeesPractise;

import Collection.ArrayList.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class EmployeeIntroduction {

    public HashMap<String, HashSet<Employee>> createEmployeeData() {

        HashMap<String, HashSet<Employee>> employeeMap = new HashMap<>();

        HashSet<Employee> IBMEmployeesHashset = new HashSet<>();

        Employee employee1 = new Employee("karan", 12, 46000);
        Employee employee2 = new Employee("Piyush", 13, 12000);
        Employee employee3 = new Employee("Nitin", 14, 43000);
        Employee employee4 = new Employee("Raju", 15, 15000);
        Employee employee5 = new Employee("Pawan", 16, 56000);
        Employee employee6 = new Employee("Chetan", 17, 10000);
        Employee employee7 = new Employee("amrish", 18, 2000);
        Employee employee8 = new Employee("Gagan", 19, 4690);
        Employee employee9 = new Employee("Vipin", 20, 1200);
        Employee employee10 = new Employee("Harsh", 21, 4000);

        IBMEmployeesHashset.add(employee1);
        IBMEmployeesHashset.add(employee2);
        IBMEmployeesHashset.add(employee3);
        IBMEmployeesHashset.add(employee4);
        IBMEmployeesHashset.add(employee5);
        IBMEmployeesHashset.add(employee6);
        IBMEmployeesHashset.add(employee7);
        IBMEmployeesHashset.add(employee8);
        IBMEmployeesHashset.add(employee9);
        IBMEmployeesHashset.add(employee10);

        employeeMap.put("IBM", IBMEmployeesHashset);

        System.out.println("IBM employees with salary > 45000:");
        for (Employee employee:IBMEmployeesHashset){
            if (employee.getSalary()>45000){
                System.out.println("printing employee name "+employee.getName()+"employeeId :"+employee.getEmployeeId()+"salary :"+employee.getSalary());
            }
        }



        HashSet<Employee> TCSemployeeHashset = new HashSet<>();
        Employee employee11 = new Employee("Jack", 41, 34000);
        Employee employee12 = new Employee("Jill", 44, 48000);
        Employee employee13 = new Employee("Mack", 47, 54000);
        Employee employee14 = new Employee("Jenice", 52, 34000);
        Employee employee15 = new Employee("fairy", 57, 56000);
        Employee employee16 = new Employee("Mark", 87, 35000);
        Employee employee17 = new Employee("Jacky", 67, 32000);
        Employee employee18 = new Employee("Jai", 70, 7000);
        Employee employee19 = new Employee("Deepak", 73, 99000);
        Employee employee20 = new Employee("Happy", 76, 100000);

        TCSemployeeHashset.add(employee11);
        TCSemployeeHashset.add(employee12);
        TCSemployeeHashset.add(employee13);
        TCSemployeeHashset.add(employee14);
        TCSemployeeHashset.add(employee15);
        TCSemployeeHashset.add(employee16);
        TCSemployeeHashset.add(employee17);
        TCSemployeeHashset.add(employee18);
        TCSemployeeHashset.add(employee19);
        TCSemployeeHashset.add(employee20);

        employeeMap.put("TCS",TCSemployeeHashset);

        System.out.println("TCS employee with salary > 45000");
        for (Employee employee:TCSemployeeHashset){
            if (employee.getSalary()>45000){
                System.out.println("Printing employee name :"+employee.getName()+"employeeID :"+employee.getEmployeeId()+" salary :"+employee.getSalary());
            }
        }


        HashSet<Employee>INFOSYSemployeeHashset=new HashSet<>();
        Employee employee21=new Employee("Harsh",81,46000);
        Employee employee22=new Employee("Kunal",84,96000);
        Employee employee23=new Employee("Darsh",87,77000);
        Employee employee24=new Employee("Olly",91,88000);
        Employee employee25=new Employee("Prabhat",94,4600);
        Employee employee26=new Employee("Gagan",97,4000);
        Employee employee27=new Employee("Pulkit",101,41000);
        Employee employee28=new Employee("Sandeep",104,34500);
        Employee employee29=new Employee("Sanjeev",107,41230);
        Employee employee30=new Employee("Atul",111,67090);

        INFOSYSemployeeHashset.add(employee21);
        INFOSYSemployeeHashset.add(employee22);
        INFOSYSemployeeHashset.add(employee23);
        INFOSYSemployeeHashset.add(employee24);
        INFOSYSemployeeHashset.add(employee25);
        INFOSYSemployeeHashset.add(employee26);
        INFOSYSemployeeHashset.add(employee27);
        INFOSYSemployeeHashset.add(employee28);
        INFOSYSemployeeHashset.add(employee29);
        INFOSYSemployeeHashset.add(employee30);

        employeeMap.put("INFOSYS",INFOSYSemployeeHashset);

        System.out.println("printing employee data "+IBMEmployeesHashset);

        for (Employee employee:IBMEmployeesHashset){
            System.out.println("Printing employee name :"+employee.getName()+"employeeID :"+employee.getEmployeeId()+"salary :"+employee.getSalary());
        }

        return employeeMap;

    }

    public static void main(String[] args) {
        EmployeeIntroduction obj=new EmployeeIntroduction();
        HashMap<String, HashSet<Employee>> map=obj.createEmployeeData();
    }

}

