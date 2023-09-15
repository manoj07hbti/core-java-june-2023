package cllection.hashset;

import collection.model.Employee;

import java.util.HashSet;

public class EmployeeSet {

    public HashSet <Employee> createEmployeeSet(){
        HashSet <Employee> employeeshashset = new HashSet<>();

        Employee employee1 = new Employee("Karan",22,"Hardware","Kanpur",7000);
        System.out.println("Hash code of 1 employee :"+employee1.hashCode());
        Employee employee2  = new Employee("Grower",32,"Software","Gwalior",20000);
        System.out.println("Hash code of 2 employee :"+employee2.hashCode());
        Employee employee3 = new Employee("Harsh",28,"Mechanical","Jhansi",30000);
        System.out.println("Hash code of 3 employee :"+employee3.hashCode());
        Employee employee4 = new Employee("Mukund",34,"Electrical","Shi kohabad",50000);
        System.out.println("Hash code of 4 employee :"+employee4.hashCode());
        Employee employee5 = new Employee("Abhinav",42,"Developer","Firozabad",55000);
        System.out.println("Hash code of 5 employee :"+employee5.hashCode());
        Employee employee6 = new Employee("Karan",22,"Hardware","Kanpur",7000);
        System.out.println("Hash code of 6 employee :"+employee6.hashCode());
        Employee employee7  = new Employee("Grower",32,"Software","Gwalior",20000);
        System.out.println("Hash code of 7 employee :"+employee7.hashCode());
        Employee employee8 = new Employee("Harsh",28,"Mechanical","Jhansi",30000);
        System.out.println("Hash code of 8 employee :"+employee8.hashCode());
        Employee employee9 = new Employee("Mukund",34,"Electrical","Shi kohabad",50000);
        System.out.println("Hash code of 9 employee :"+employee9.hashCode());
        Employee employee10 = new Employee("Abhinav",42,"Developer","Firozabad",55000);
        System.out.println("Hash code of 10 employee :"+employee10.hashCode());

        employeeshashset.add(employee1);
        employeeshashset.add(employee2);
        employeeshashset.add(employee3);
        employeeshashset.add(employee4);
        employeeshashset.add(employee5);
        employeeshashset.add(employee6);
        employeeshashset.add(employee7);
        employeeshashset.add(employee8);
        employeeshashset.add(employee9);
        employeeshashset.add(employee10);

        return employeeshashset;

    }
    public static void main(String [] args ){

        EmployeeSet Obj = new EmployeeSet();
        HashSet <Employee>  employees =Obj.createEmployeeSet();

        System.out.println(" Printing Employee data : ");


        System.out.println(" Use to advanced loop : ");

        for (Employee employee: employees){
            System.out.println(" Printing Employee : "+employee.getName()+" age: "+employee.getAge()+" dpt: "+employee.getDpt()+" add: "+employee.getAdd()+" salary: "+employee.getSalary());
        }
        }

    }

