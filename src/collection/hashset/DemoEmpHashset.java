package collection.hashset;

import collection.model.Employee;

import java.util.HashSet;

public class DemoEmpHashset {

    public  HashSet<Employee> createEmpSet(){

        HashSet<Employee> employees= new HashSet<>();

        Employee employee1= new Employee("Raj","A23","CS",34322.7);
        System.out.println("Hashcode of employee1 "+employee1.hashCode());
        Employee employee2= new Employee("Raj","A23","CS",34322.7);
        System.out.println("Hashcode of employee2 "+employee2.hashCode());
        Employee employee3= new Employee("Mukesh","A24","IT",34322.7);
        System.out.println("Hashcode of employee3 "+employee3.hashCode());
        Employee employee4=  new Employee("Mukesh","A24","IT",34322.7);
        System.out.println("Hashcode of employee4 "+employee4.hashCode());
        Employee employee5= new Employee("Rohit","A25","CS",34322.7);
        System.out.println("Hashcode of employee5 "+employee5.hashCode());
        Employee employee6= new Employee("Rohit","A25","CS",34322.7);
        System.out.println("Hashcode of employee6 "+employee6.hashCode());

        employees.add(employee1);
        employees.add(employee2);

        employees.add(employee3);
        employees.add(employee4);

        employees.add(employee5);
        employees.add(employee6);

        return  employees;
    }

    public static void main(String[] args) {

        DemoEmpHashset obj= new DemoEmpHashset();
        HashSet<Employee> employees= obj.createEmpSet();

        for(Employee employee: employees){

            System.out.println(employee.getName()+" Emp id: "+employee.getEmpId());
        }
    }


}
