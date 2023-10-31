package october_22_test;
import collection.model.Employeees;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Employer {

    public LinkedHashMap<String, ArrayList<Employeees>> userInput() {
        System.out.println("---------------------------------------");
        System.out.println("Welcome to the Inquiry Portal :");
        System.out.println("---------------------------------------");
        LinkedHashMap<String, ArrayList<Employeees>> employee = new LinkedHashMap<>();
        LinkedHashMap<Double, ArrayList<Employeees>> employee1 = new LinkedHashMap<>();


        System.out.println(" ");
        String choice = "Y";

        while (choice.equals("Y")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter Employee ID :");
            String empID = scanner.nextLine();

            System.out.println("Please Enter Employee Name :");
            String empName = scanner.nextLine();

            System.out.println("Please Enter Employee Age :");
            int empAge = scanner.nextInt();

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please Enter Employee Department :");
            String empDept = scanner1.nextLine();

            System.out.println("Please Enter Employee Salary");
            double empSalary = scanner1.nextDouble();

            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Please Enter Employee Company :");
            String empCompany = scanner2.nextLine();

            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Please Enter Employee City :");
            String empCity = scanner3.nextLine();

            Employeees employeees = new Employeees(empID, empName, empAge, empDept, empSalary, empCompany, empCity);

            // Check if the company already exists in the map
            if (employee.containsKey(empCompany)) {
                employee.get(empCompany).add(employeees);
            } else {
                ArrayList<Employeees> organizations = new ArrayList<>();
                organizations.add(employeees);
                employee.put(empCompany, organizations);
            }
            // Check if the salary already exists in the map
            if (employee1.containsKey(empSalary)) {
                employee1.get(empSalary).add(employeees);
            } else {
                ArrayList<Employeees> organizations = new ArrayList<>();
                organizations.add(employeees);
                employee1.put(empSalary, organizations);
            }
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Press Y to Continue or Press any key to Exit :");
            choice = scanner4.nextLine();
        }
        return employee;
    }

    public void findSameCityEmployeeData(LinkedHashMap<String, ArrayList<Employeees>> sameCityEmployee) {
        System.out.println(" ");
        System.out.println("Employee Whose Working in same City :");
        LinkedHashMap<String, ArrayList<Employeees>> sameCityEmployees = new LinkedHashMap<>();
        for (ArrayList<Employeees> organizations : sameCityEmployee.values()) {

            for (Employeees organization : organizations) {
                String empCityName = organization.getEmpCity();
                if (sameCityEmployees.containsKey(empCityName)) {
                    List<Employeees> cityEmp = sameCityEmployees.get(empCityName); /**it will Retrieve*/
                    cityEmp.add(organization); /**it will Add the employee*/
                } else {
                    ArrayList<Employeees> cityEmp = new ArrayList<>();
                    cityEmp.add(organization);
                    sameCityEmployees.put(empCityName, cityEmp);
                }
            }
        }
        for (String cities : sameCityEmployees.keySet()) {/**it will Add and print the employee to the list related to same city*/
            System.out.println("Employees working in the same city :" + cities);
            ArrayList<Employeees> cityEmp = sameCityEmployees.get(cities);
            for (Employeees employeees : cityEmp) {
                System.out.println("Name is " + employeees.getEmpName() + "|" + " Company is " + employeees.getEmpCompany() + "|" + " Salary is " + employeees.getEmpSalary());

            }
        }
    }

    public void findSameSalaryEmployeeData(LinkedHashMap<String, ArrayList<Employeees>> sameSalaryEmployee) {

        System.out.println(" ");
        System.out.println("Employee Whose Having same Salary :");
        LinkedHashMap<Double, ArrayList<Employeees>> sameSalaryEmployees = new LinkedHashMap<>();
        for (ArrayList<Employeees> organizations : sameSalaryEmployee.values()) {
            for (Employeees organization : organizations) {
                Double salary = organization.getEmpSalary();
                if (sameSalaryEmployees.containsKey(salary)) {
                    List<Employeees> salaryEmp = sameSalaryEmployees.get(salary);/**it will Retrieve*/
                    salaryEmp.add(organization);/**it will Add the employees */
                } else {
                    ArrayList<Employeees> cityEmp = new ArrayList<>();
                    cityEmp.add(organization);
                    sameSalaryEmployees.put(salary, cityEmp);
                }
            }
        }
        for (Double salaries : sameSalaryEmployees.keySet()) {/**it will Add and print the employee to the list related to same salary*/
            System.out.println("Employees having the same salary :" + salaries);
            ArrayList<Employeees> salEmp = sameSalaryEmployees.get(salaries);
            for (Employeees employeees : salEmp) {
                System.out.println("Name is " + employeees.getEmpName() + "|" + " Company is " + employeees.getEmpCompany() + "|" + " Salary is " + employeees.getEmpSalary());

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Employer obj = new Employer();
        LinkedHashMap<String, ArrayList<Employeees>> empRecord = obj.userInput();
        for (String key : empRecord.keySet()) {
            ArrayList<Employeees> organizations = empRecord.get(key);
            System.out.println("Employees Data Created As : " + key);
            for (Employeees organization : organizations) {
                System.out.println("EmpID is :" + organization.getEmpID() + "|" + "EmpName is :" + organization.getEmpName() + "|" + "EmpAge is " + organization.getEmpAge() + "|" +
                        "EmpDept is " + organization.getEmpDept() + "|" + "EmpSalary is " + organization.getEmpSalary() + "|" + "EmpCompany is " + organization.getEmpCompany() + "|" + "Emp City is " + organization.getEmpCity());
            }
        }
        obj.findSameCityEmployeeData(empRecord);
        obj.findSameSalaryEmployeeData(empRecord);
    }
}
/** VERY IMPORTANT
 * ArrayList<Employeees> ibmEmpList= sameSalaryEmployee.get("IBM");
 ArrayList<Employeees> tcsEmpList= sameSalaryEmployee.get("TCS");
 ArrayList<Employeees> infosysEmpList= sameSalaryEmployee.get("Infosys");

 ArrayList<Employeees> sameSalaryEmp= new ArrayList<>();

 for( Employeees var1: ibmEmpList){

 for(Employeees var2:tcsEmpList){

 if(var1.getEmpSalary()==var2.getEmpSalary()){

 //
 sameSalaryEmp.add(var1);
 sameSalaryEmp.add(var2);
 }
 }

 }
 for( Employeees var1: ibmEmpList){

 for(Employeees var2:infosysEmpList){

 if(var1.getEmpSalary()==var2.getEmpSalary()){

 //
 sameSalaryEmp.add(var1);
 sameSalaryEmp.add(var2);
 }
 }

 }
 for( Employeees var1: tcsEmpList){

 for(Employeees var2:infosysEmpList){

 if(var1.getEmpSalary()==var2.getEmpSalary()){

 //
 sameSalaryEmp.add(var1);
 sameSalaryEmp.add(var2);
 }
 }
 for (Employeees Salary : sameSalaryEmp) {
 System.out.println("Name is " + Salary.getEmpName() + "|" + " Company is " + Salary.getEmpCompany() + "|" + " Salary is " + Salary.getEmpSalary());

 }
 }*/