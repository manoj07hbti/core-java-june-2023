package collecton;

import collection.model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeWithList {


    public EmployeeWithList(){

    }
    public ArrayList <Employee> createEmployeeData(){

        ArrayList <Employee> EmployeeWithList = new ArrayList<>();

        Employee employee1 = new Employee("Karan",22,"Hardware","Kanpur",7000);
        Employee employee2 = new Employee("Grower",32,"Software","Gwalior",20000);
        Employee employee3 = new Employee("Harsh",28,"Mechanical","Jhansi",30000);
        Employee employee4 = new Employee("Mukund",34,"Electrical","Shi kohabad",50000);
        Employee employee5 = new Employee("Abhinav",42,"Developer","Firozabad",55000);

        EmployeeWithList.add(employee1);
        EmployeeWithList.add(employee2);
        EmployeeWithList.add(employee3);
        EmployeeWithList.add(employee4);
        EmployeeWithList.add(employee5);

         return EmployeeWithList;
    }
    public Employee createEmployeeDataWithUserInput(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter employee name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter employee age: ");
        int age = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter employee dpt: ");
        String dpt = scanner1.nextLine();
       // Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter employee add: ");
        String add = scanner1.nextLine();
        //Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter employee salary: ");
        double salary = scanner1.nextDouble();



        Employee employee1 = new Employee(name,age,dpt,add,salary);

        return employee1;

    }
    public static void main(String args []){
        EmployeeWithList Obj = new EmployeeWithList();
        ArrayList <Employee> employees = Obj.createEmployeeData();

        System.out.println("Using for loop: ");
        for (int i = 0; i< employees.size(); i++){
            System.out.println("Name: "+employees.get(i).getName()+" age: "+employees.get(i).getAge()+" dpt:  "+employees.get(i).getDpt()+" add: "+employees.get(i).getAdd()+" Salary: "+employees.get(i).getSalary() );
        }
        System.out.println("Using Advanced loop: ");
        for (Employee var: employees){
            System.out.println("Name: "+var.getName()+" age: "+var.getAge()+" dpt: " +var.getDpt()+" add: "+var.getAdd()+" salary: "+var.getSalary());
        }
          Employee employee = Obj.createEmployeeDataWithUserInput();
        System.out.println("Name: "+employee.getName()+" age: "+employee.getAge()+" dpt: "+employee.getDpt()+" add: "+employee.getAdd()+" Salary: "+employee.getSalary()+" ");
    }
}
