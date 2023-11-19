package cllection.hashset;

import collection.model.Employee;

import java.util.HashSet;

public class EmployeeSet {

    public HashSet<Employee> createEmployeeSet(){
        HashSet<Employee> employeeshashSet = new HashSet<>();

        Employee employee1 = new Employee("IBM","Rahul","1234df",45000.0);
        System.out.println("Hash code of 1 employee: "+employee1.hashCode());
        Employee employee2= new Employee("IBM","Rahul","1234df",45000.0);
        System.out.println("Hash code of 2 employee: "+employee2.hashCode());
        Employee employee3 = new Employee("Infosys","Palak","1134df",65000.0);
        System.out.println("Hash code of 3 employee: "+employee3.hashCode());
        Employee employee4 = new Employee("TCS","Amit","1244df",50000.0);
        System.out.println("Hash code of 4 employee: "+employee4.hashCode());
        Employee employee5 = new Employee("Infosys","Palak","1134df",65000.0);
        System.out.println("Hash code of 5 employee: "+employee5.hashCode());
        Employee employee6 = new Employee("TCS","Amit","1244df",50000.0);
        System.out.println("Hash code of 6 employee: "+employee6.hashCode());
        Employee employee7 = new Employee("Apple","Lalit","1235df",48000.0);
        System.out.println("Hash code of 7 employee: "+employee7.hashCode());
        Employee employee8 = new Employee("Cognigent","Sonal","1264df",60000.0);
        System.out.println("Hash code of 8 employee: "+employee8.hashCode());
        Employee employee9 = new Employee("Apple","Lalit","1235df",48000.0);
        System.out.println("Hash code of 9 employee: "+employee9.hashCode());
        Employee employee10 = new Employee("Cognigent","Sonal","1264df",60000.0);
        System.out.println("Hash code of 10 employee: "+employee10.hashCode());

        employeeshashSet.add(employee1);
        employeeshashSet.add(employee2);
        employeeshashSet.add(employee3);
        employeeshashSet.add(employee4);
        employeeshashSet.add(employee5);
        employeeshashSet.add(employee6);
        employeeshashSet.add(employee7);
        employeeshashSet.add(employee8);
        employeeshashSet.add(employee9);
        employeeshashSet.add(employee10);

        return employeeshashSet;

    }
    public static void main(String args []){

        EmployeeSet Obj = new EmployeeSet();
        HashSet<Employee> employees = Obj.createEmployeeSet();

        System.out.println(" Printing Employee data : ");

        System.out.println(" Use to Advanced Loop : ");

        for (Employee employee: employees){
            System.out.println(" Printing Employee data : "+employee.getCompany()+" Name: "+employee.getName()+" ID: "+employee.getID()+" salary: "+employee.getSalary());
        }

    }
}
