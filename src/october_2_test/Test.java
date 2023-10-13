package october_2_test;
import collection.model.Organization;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class Test {

    public LinkedHashMap<String, ArrayList<Organization>> userInput() {

        System.out.println("Welcome to the Inquiry Portal :");
        LinkedHashMap<String, ArrayList<Organization>> employee = new LinkedHashMap<>();
        LinkedHashMap<Double, ArrayList<Organization>> employee1 = new LinkedHashMap<>();


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

            Organization organization = new Organization(empID, empName, empAge, empDept, empSalary, empCompany, empCity);

            if (employee.containsKey(empCompany)) {
                employee.get(empCompany).add(organization);
            } else {
                ArrayList<Organization> organizations = new ArrayList<>();
                organizations.add(organization);
                employee.put(empCompany, organizations);
            }
            if (employee1.containsKey(empSalary)) {
                employee1.get(empSalary).add(organization);
            } else {
                ArrayList<Organization> organizations = new ArrayList<>();
                organizations.add(organization);
                employee1.put(empSalary, organizations);
            }
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Press Y to Continue or Press any key to Exit :");
            choice = scanner4.nextLine();
        }
        return employee;

    }

    public void findPuneData(LinkedHashMap<String, ArrayList<Organization>> puneData) {
        System.out.println("Answer No.1");
        System.out.println("Printing all Companies record whose working in Pune and Salary is Greater than 50,000: ");
        System.out.println("  ");
        for (String key : puneData.keySet()) {
            if (key.equalsIgnoreCase("IBM") || key.equalsIgnoreCase("TCS")) {
                ArrayList<Organization> data = puneData.get(key);
                for (Organization organization : data) {
                    if (organization.getEmpCity().equals("Pune")) {
                        if (organization.getEmpSalary() > 50000) {
                            System.out.println("EmpID is :" + organization.getEmpID() + "|" + "EmpName is :" + organization.getEmpName() + "|" + "EmpAge is " + organization.getEmpAge() + "|" +
                                    "EmpDept is " + organization.getEmpDept() + "|" + "EmpSalary is " + organization.getEmpSalary() + "|" + "EmpCompany is " + organization.getEmpCompany() + "|" + "Emp City is " + organization.getEmpCity());
                        }
                    }
                }
            }
        }
    }

    public void findHighestSalary(LinkedHashMap<String, ArrayList<Organization>> highestSalaryData) {
        System.out.println("Answer No.2");
        System.out.println("Printing Highest Salary Employee:");
        System.out.println(" ");
        double highestSalary = Double.MIN_VALUE;
        Organization highestSalaryEmployee = null;
        for (String key :highestSalaryData.keySet()) {
            ArrayList<Organization>organizations=highestSalaryData.get(key);
            for (Organization organization : organizations) {
                if (organization.getEmpSalary() > highestSalary) {
                    highestSalary = organization.getEmpSalary();
                    highestSalaryEmployee = organization;
                }
            }
        }
        if (highestSalaryEmployee != null) {
            System.out.println("Employee with Highest Salary :");
            System.out.println("EmpID is :" + highestSalaryEmployee.getEmpID() + "|" + "EmpName is :" + highestSalaryEmployee.getEmpName() + "|" + "EmpAge is " + highestSalaryEmployee.getEmpAge() + "|" +
                    "EmpDept is " + highestSalaryEmployee.getEmpDept() + "|" + "EmpSalary is " + highestSalaryEmployee.getEmpSalary() + "|" + "EmpCompany is " + highestSalaryEmployee.getEmpCompany() + "|" + "Emp City is " + highestSalaryEmployee.getEmpCity());
        } else {
            System.out.println("There is No Details Found");
        }
    }

    public void findLowestSalary(LinkedHashMap<String, ArrayList<Organization>> lowestSalaryData) {
        System.out.println("Answer No.2.1");
        System.out.println("Printing Lowest Salary Employee:");
        System.out.println(" ");
        double lowestSalary = Double.MAX_VALUE;
        Organization lowestSalaryEmployee = null;
        for (ArrayList<Organization> organizations : lowestSalaryData.values()) {
            for (Organization organization : organizations) {
                if (organization.getEmpSalary() < lowestSalary) {
                    lowestSalary = organization.getEmpSalary();
                    lowestSalaryEmployee = organization;
                }
            }
        }
        if (lowestSalaryEmployee != null) {
            System.out.println("Employee with Lowest Salary :");
            System.out.println("EmpID is :" + lowestSalaryEmployee.getEmpID() + "|" + "EmpName is :" + lowestSalaryEmployee.getEmpName() + "|" + "EmpAge is " + lowestSalaryEmployee.getEmpAge() + "|" +
                    "EmpDept is " + lowestSalaryEmployee.getEmpDept() + "|" + "EmpSalary is " + lowestSalaryEmployee.getEmpSalary() + "|" + "EmpCompany is " + lowestSalaryEmployee.getEmpCompany() + "|" + "Emp City is " + lowestSalaryEmployee.getEmpCity());
        } else {
            System.out.println("There is No Details Found");
        }
    }

    public void findSameCityEmployeeData(LinkedHashMap<String, ArrayList<Organization>> sameCityEmployee) {
        System.out.println(" ");
        System.out.println("Employee Whose Working in same City :");
        LinkedHashMap<String, ArrayList<Organization>> sameCityEmployees = new LinkedHashMap<>();
        for (ArrayList<Organization> organizations : sameCityEmployee.values()) {

            for (Organization organization : organizations) {
                String city = organization.getEmpCity();
                if (sameCityEmployees.containsKey(city)) {
                    sameCityEmployees.get(city).add(organization);
                } else {
                    ArrayList<Organization> sameCityEmployees1 = new ArrayList<>();
                    sameCityEmployees1.add(organization);
                    sameCityEmployees.put(city, sameCityEmployees1);
                }
            }
        }    Collection<ArrayList<Organization>> city=sameCityEmployees.values();
            for (String cities : sameCityEmployees.keySet()) {
                 System.out.println("City :" + city);
                if (sameCityEmployees.containsKey(cities)){
                    for (ArrayList<Organization> organization:city){
                       ArrayList<Organization>aa=sameCityEmployees.get(organization);
                        System.out.println(organization.get(0).getEmpName()+organization.get(0).getEmpCity()+organization.get(0).getEmpSalary());
                   }
                }
            }
        }


    public void findSameSalaryData(@NotNull LinkedHashMap<String, ArrayList<Organization>> sameSalaryData) {


     /*   for (ArrayList<Organization> organizations : sameSalaryData.values()) {
            for (Organization organization : organizations) {
                double salary = organization.getEmpSalary();
                if (sameSalaryEmployees.containsValue(salary)) {
                    sameSalaryEmployees.get(salary).add(organization);
                } else {
                    ArrayList<Organization> sameSalary = new ArrayList<>();
                    sameSalary.add(organization);
                    sameSalaryEmployees.put(salary, sameSalary);
                }
            }
        }ArrayList<Organization>organizations=new ArrayList<>();
        for (double salary : sameSalaryEmployees.keySet()) {
            System.out.println("Salary :" + salary);
            for (Organization organization : organizations){
                System.out.println(organization.empName+organization.empCompany+organization.empCity+organization.empSalary);
            }
        }*/
    }

    public static void main(String[] args) {
        Test obj = new Test();
        LinkedHashMap<String, ArrayList<Organization>> empRecord = obj.userInput();
        System.out.println("Employee Data from Various Companies :");
        for (String key : empRecord.keySet()) {
            ArrayList<Organization> organizations = empRecord.get(key);
            System.out.println("Companies " + key);
            for (Organization organization : organizations) {
                System.out.println("EmpID is :" + organization.getEmpID() + "|" + "EmpName is :" + organization.getEmpName() + "|" + "EmpAge is " + organization.getEmpAge() + "|" +
                        "EmpDept is " + organization.getEmpDept() + "|" + "EmpSalary is " + organization.getEmpSalary() + "|" + "EmpCompany is " + organization.getEmpCompany() + "|" + "Emp City is " + organization.getEmpCity());
            }
        }
        obj.findPuneData(empRecord);
        obj.findHighestSalary(empRecord);
        obj.findLowestSalary(empRecord);
        obj.findSameCityEmployeeData(empRecord);
        obj.findSameSalaryData(empRecord);
    }


}


