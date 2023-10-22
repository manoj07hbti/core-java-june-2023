package october_2_test;

import collection.model.Employeees;

import java.util.*;

public class Test {

    public LinkedHashMap<String, ArrayList<Employeees>> userInput() {

        System.out.println("Welcome to the Inquiry Portal :");
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

            Employeees organization = new Employeees(empID, empName, empAge, empDept, empSalary, empCompany, empCity);

            if (employee.containsKey(empCompany)) {
                employee.get(empCompany).add(organization);
            } else {
                ArrayList<Employeees> organizations = new ArrayList<>();
                organizations.add(organization);
                employee.put(empCompany, organizations);
            }
            if (employee1.containsKey(empSalary)) {
                employee1.get(empSalary).add(organization);
            } else {
                ArrayList<Employeees> organizations = new ArrayList<>();
                organizations.add(organization);
                employee1.put(empSalary, organizations);
            }
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Press Y to Continue or Press any key to Exit :");
            choice = scanner4.nextLine();
        }
        return employee;

    }

    public void findPuneData(LinkedHashMap<String, ArrayList<Employeees>> puneData) {
        System.out.println("Answer No.1");
        System.out.println("Printing all Companies record whose working in Pune and Salary is Greater than 50,000: ");
        System.out.println("  ");
        for (String key : puneData.keySet()) {
            if (key.equalsIgnoreCase("IBM") || key.equalsIgnoreCase("TCS")) {
                ArrayList<Employeees> data = puneData.get(key);
                for (Employeees organization : data) {
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

    public void findHighestSalary(LinkedHashMap<String, ArrayList<Employeees>> highestSalaryData) {
        System.out.println("Answer No.2");
        System.out.println("Printing Highest Salary Employee:");
        System.out.println(" ");

        double highestSalary = Double.MIN_VALUE;
        Employeees highestSalaryEmployee = null;


        for (ArrayList<Employeees> organizations : highestSalaryData.values()) {
            for (Employeees organization : organizations) {
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

    public void findLowestSalary(LinkedHashMap<String, ArrayList<Employeees>> lowestSalaryData) {
        System.out.println("Answer No.2.1");
        System.out.println("Printing Lowest Salary Employee:");
        System.out.println(" ");

        double lowestSalary = Double.MAX_VALUE;
        Employeees lowestSalaryEmployee = null;

        for (ArrayList<Employeees> organizations : lowestSalaryData.values()) {
            for (Employeees organization : organizations) {
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

    public void findSameCityEmployeeData(LinkedHashMap<String, ArrayList<Employeees>> sameCityEmployee) {
        System.out.println(" ");
        System.out.println("Employee Whose Working in same City :");
        LinkedHashMap<String, ArrayList<Employeees>> sameCityEmployees = new LinkedHashMap<>();
        for (ArrayList<Employeees> organizations : sameCityEmployee.values()) {

            for (Employeees organization : organizations) {
                String empCityName = organization.getEmpCity();
                if (sameCityEmployees.containsKey(empCityName)) {
                    List<Employeees> cityEmp = sameCityEmployees.get(empCityName);
                    cityEmp.add(organization);
                } else {
                    ArrayList<Employeees> cityEmp = new ArrayList<>();
                    cityEmp.add(organization);
                    sameCityEmployees.put(empCityName, cityEmp);
                }
            }
        }
        for (String cities : sameCityEmployees.keySet()) {
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
                Double empSalary = organization.getEmpSalary();
                if (sameSalaryEmployees.containsKey(empSalary)) {
                    List<Employeees> cityEmp = sameSalaryEmployees.get(empSalary);
                    cityEmp.add(organization);
                } else {
                    ArrayList<Employeees> salaryEmp = new ArrayList<>();
                    salaryEmp.add(organization);
                    sameSalaryEmployees.put(empSalary, salaryEmp);
                }
            }
        }
        for (Double salaries : sameSalaryEmployees.keySet()) {
            System.out.println("Employees working in the same city :" + salaries);
            ArrayList<Employeees> salEmp = sameSalaryEmployees.get(salaries);
            for (Employeees employeees : salEmp) {
                System.out.println("Name is " + employeees.getEmpName() + "|" + " Company is " + employeees.getEmpCompany() + "|" + " Salary is " + employeees.getEmpSalary());

            }
        }
    }


    public static void main(String[] args) {
        Test obj = new Test();
        LinkedHashMap<String, ArrayList<Employeees>> empRecord = obj.userInput();
        System.out.println("Employee Data from Various Companies :");
        for (String key : empRecord.keySet()) {
            ArrayList<Employeees> organizations = empRecord.get(key);
            System.out.println("Companies " + key);
            for (Employeees organization : organizations) {
                System.out.println("EmpID is :" + organization.getEmpID() + "|" + "EmpName is :" + organization.getEmpName() + "|" + "EmpAge is " + organization.getEmpAge() + "|" +
                        "EmpDept is " + organization.getEmpDept() + "|" + "EmpSalary is " + organization.getEmpSalary() + "|" + "EmpCompany is " + organization.getEmpCompany() + "|" + "Emp City is " + organization.getEmpCity());
            }
        }
        obj.findPuneData(empRecord);
        obj.findHighestSalary(empRecord);
        obj.findLowestSalary(empRecord);
        obj.findSameCityEmployeeData(empRecord);
        obj.findSameSalaryEmployeeData(empRecord);
    }


}


