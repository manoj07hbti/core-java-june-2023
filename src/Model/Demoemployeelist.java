package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Demoemployeelist {

    public ArrayList<Employee> createemployeelist() {

        ArrayList<Employee> employeeslist = new ArrayList<>();

        Employee employee1 = new Employee("yash", "cs", "gurugram", 32);
        Employee employee2 = new Employee("manu", "IT", "delhi", 22);
        Employee employee3 = new Employee("Hemant", "marketing", "noida", 34);

        employeeslist.add(employee1);
        employeeslist.add(employee2);
        employeeslist.add(employee3);

        return employeeslist;
    }

    public Employee employeedatawithuserinput() {

        Scanner scanner = new Scanner(System.in);


        System.out.println("please enter name of employee");
        String name = scanner.nextLine();

        System.out.println("please enter department of employee ");
        String department = scanner.nextLine();

        System.out.println("please enter address of employee");
        String address = scanner.nextLine();

        System.out.println("please enter address of age");
        int age = scanner.nextInt();

        Employee employee1 = new Employee(name, department, address, age);

        return employee1;

    }

    public static void main(String[] args) {

        String flag = "y";


        Demoemployeelist obj = new Demoemployeelist();
        ArrayList<Employee> employees = obj.createemployeelist();

        while (flag.equals("y")) {


            for (int i = 0; i < employees.size(); i++) {
                System.out.println("name:" + employees.get(i).getName() + "department:" + employees.get(i).getDepartment() + "address:" + employees.get(i).getAddress() + employees.get(i).getAddress() + employees.get(i).getAge());
            }
            for (Employee var : employees) {
                System.out.println("advanced loop :" + "name:" + var.getName() + "department:" + var.getDepartment() + "address:" + var.getAddress() + "age:" + var.getAge());
            }

            Employee employee=obj.employeedatawithuserinput();
            System.out.println("created data for"+employee.getName()+employee.getDepartment()+employee.getAddress()+employee.getAge());

            System.out.println("please enter y to continue and press other button to exit");
            Scanner scanner1 = new Scanner(System.in);
            flag = scanner1.nextLine();
        }
    }
}

