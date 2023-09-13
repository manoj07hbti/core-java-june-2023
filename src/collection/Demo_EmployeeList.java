package collection;

import collection.model.Doctor;
import collection.model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo_EmployeeList {

    static ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flag = "Y";

        while (flag.equals("Y")) {

            System.out.println("Please enter employee Name :");

            String name = scanner.nextLine();

            System.out.println("Please enter employee Age :  ");

            int age = scanner.nextInt();

            System.out.println("Please enter employee CompName");

            String CompName = scanner.nextLine();

            Employee employee = new Employee(name, age, CompName);

            employeeArrayList.add(employee);


            System.out.println("Press Y to continue........and any key to Exit");

            Scanner scanner2 = new Scanner(System.in);
            flag = scanner2.nextLine();
        }

        for (Employee employee : employeeArrayList) {


            System.out.println("create Data As : " + employee.getName() + "|" + "age :" + employee.getAge() + "|" + "compName :" + employee.getCompName());
        }


    }


}



