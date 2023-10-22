package collection.oct_02_test6;

import collection.model.Employee;
import com.sun.deploy.cache.CacheEntry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest1  {

    public HashMap<String, ArrayList<Employee>> employeeDataUserInput()
    {

        HashMap<String, ArrayList<Employee>> empData =new HashMap<>();
        String choice = "y";

        while (choice.equalsIgnoreCase("y"))
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter employee userId:");
            String empId=sc.nextLine();

            System.out.println("Enter employee name:");
            String name=sc.nextLine();

            System.out.println("Enter employee age:");
            int age=sc.nextInt();

            System.out.println("Enter employee salary: ");
            double sal = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter employee companyName");
            String companyName=sc.nextLine();

            System.out.println("Enter employee city ");
            String city=sc.nextLine();

            Employee employee=new Employee(empId,name,age,sal,companyName,city);
                if (empData.containsKey(companyName))
                {
                    empData.get(companyName).add(employee);
                }
                else {
                    ArrayList<Employee> employees=new ArrayList<>();
                    employees.add(employee);
                    empData.put(companyName,employees);
                }



            System.out.println("Enter y to continue or press any other key to exit");
            choice=sc.nextLine();

        }

        return empData;
    }
    public void displayEmployeesBySalary(HashMap<String, ArrayList<Employee>> empData) {
        System.out.println();
        System.out.println("5.Employees grouped by salary:");

        ArrayList<Employee> ibmEmpList= empData.get("IBM");
        ArrayList<Employee> tcsEmpList= empData.get("TCS");
        ArrayList<Employee> infosysEmpList= empData.get("Infosys");

        ArrayList<Employee> sameSalaryEmp= new ArrayList<>();

        for(Employee var1: ibmEmpList){

            for(Employee var2:tcsEmpList){

                if(var1.getSal()==var2.getSal()){

                    //
                    sameSalaryEmp.add(var1);
                    sameSalaryEmp.add(var2);
                }
            }

        }
        for( Employee var1: ibmEmpList){

            for(Employee var2:infosysEmpList){

                if(var1.getSal()==var2.getSal()){

                    //
                    sameSalaryEmp.add(var1);
                    sameSalaryEmp.add(var2);
                }
            }

        }
        for( Employee var1: tcsEmpList){

            for(Employee var2:infosysEmpList){

                if(var1.getSal()==var2.getSal()){

                    //
                    sameSalaryEmp.add(var1);
                    sameSalaryEmp.add(var2);
                }
            }

            for (Employee employee : sameSalaryEmp) {
                System.out.println("CompanyName1: " + employee.getCompanyName() +
                        ", EmpId: " + employee.getEmpId() +
                        ", Name: " + employee.getEmpName() +
                        ", Age: " + employee.getAge() +
                        ", Salary: " + employee.getSal());

            }

        }
;
//
//            for (Employee employee : sameSalaryEmp) {
//                System.out.println("CompanyName1: " + employee.getCompanyName() +
//                        ", EmpId: " + employee.getEmpId() +
//                        ", Name: " + employee.getEmpName() +
//                        ", Age: " + employee.getAge() +
//                        ", Salary: " + employee.getSal());
//
//            }
//            System.out.println();for (Employee employee : sameSalaryEmp) {
//            System.out.println("CompanyName2: " + employee.getCompanyName() +
//                    ", EmpId: " + employee.getEmpId() +
//                    ", Name: " + employee.getEmpName() +
//                    ", Age: " + employee.getAge() +
//                    ", Salary: " + employee.getSal());
//
//        }
//        System.out.println();

        }


    public static void main(String[] args) {
    EmployeeTest1 bj=new EmployeeTest1();
        HashMap<String, ArrayList<Employee>> employeeData =bj.employeeDataUserInput();
        System.out.println("Employee data for different companies:");
        for (String key : employeeData.keySet()) {
            ArrayList<Employee> employees = employeeData.get(key);
            System.out.println("Company: " + key);

            for (Employee employee : employees) {
                System.out.println("EmpId: " + employee.getEmpId() + ", Name: " + employee.getEmpName() +
                        ", Age: " + employee.getAge() + ", Salary: " + employee.getSal() +
                        ", City: " + employee.getCity());
            }
        }

        bj.displayEmployeesBySalary(employeeData);
    }
}
