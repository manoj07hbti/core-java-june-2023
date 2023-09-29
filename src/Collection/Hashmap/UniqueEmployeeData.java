package Collection.Hashmap;

import Collection.Model.CompanyData;
import Collection.Model.Employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniqueEmployeeData {
    public HashMap<String, HashSet<CompanyData>> EmployeeDataOfCompany() {
        HashMap<String, HashSet<CompanyData>> Employees = new HashMap<>();
        CompanyData Emp1 = new CompanyData("TCS", "Ravi Sharma", "UP83", 56000.54);
        CompanyData Emp2 = new CompanyData("TCS", "Rahul", "UP84", 56040.54);
        CompanyData Emp3 = new CompanyData("IBM", "Mukesh", "UP85", 46000.54);
        CompanyData Emp4 = new CompanyData("INFOSYS", "Sachin Sharma", "UP86", 36000.54);
        CompanyData Emp5 = new CompanyData("IBM", "Dheeraj", "UP87", 56030.54);
        CompanyData Emp6 = new CompanyData("TCS", "Mukesh Kumar", "UP12", 56600.54);
        CompanyData Emp7 = new CompanyData("INFOSYS", "Sanjana", "UP13", 56660.54);
        CompanyData Emp8 = new CompanyData("IBM", "Anil", "UP14", 56090.54);
        CompanyData Emp9 = new CompanyData("IBM", "Priti", "UP15", 56056.54);
        CompanyData Emp10 = new CompanyData("TCS", "Poonam", "UP16", 56220.54);
        CompanyData Emp11 = new CompanyData("INFOSYS", "Washim", "UP18", 56100.54);
        CompanyData Emp12 = new CompanyData("TCS", "Ravi Chuadhary", "UP19", 56070.54);
        CompanyData Emp13 = new CompanyData("IBM", "Rakesh", "UP20", 56330.54);
        CompanyData Emp14 = new CompanyData("INFOSYS", "Rakhi", "UP21", 66000.54);
        CompanyData Emp15 = new CompanyData("TCS", "Arun", "UP22", 56500.54);
        CompanyData Emp16 = new CompanyData("IBM", "Shiv", "UP23", 56570.54);
        CompanyData Emp17 = new CompanyData("INFOSYS", "Munnesh", "UP24", 56110.54);
        CompanyData Emp18 = new CompanyData("TCS", "Vijay", "UP25", 76000.54);
        CompanyData Emp19 = new CompanyData("IBM", "Praveen", "UP26", 36000.54);
        CompanyData Emp20 = new CompanyData("INFOSYS", "Sulekha", "UP27", 56900.54);
        CompanyData Emp21 = new CompanyData("TCS", "Pinki", "UP80", 96000.54);
        CompanyData Emp22 = new CompanyData("IBM", "Rekha Sharma", "UP01", 46060.54);
        CompanyData Emp23 = new CompanyData("TCS", "Pinki", "UP80", 96000.54);
        CompanyData Emp24 = new CompanyData("IBM", "Rekha Sharma", "UP01", 46060.54);

        HashSet<CompanyData> Employee = new HashSet<>();


        Employee.add(Emp1);
        Employee.add(Emp2);
        Employee.add(Emp3);
        Employee.add(Emp4);
        Employee.add(Emp5);
        Employee.add(Emp6);
        Employee.add(Emp7);


        Employee.add(Emp8);
        Employee.add(Emp9);
        Employee.add(Emp10);
        Employee.add(Emp11);
        Employee.add(Emp12);
        Employee.add(Emp13);
        Employee.add(Emp14);
        Employee.add(Emp15);
        Employee.add(Emp16);
        Employee.add(Emp17);
        Employee.add(Emp18);
        Employee.add(Emp19);
        Employee.add(Emp20);
        Employee.add(Emp21);
        Employee.add(Emp22);
        Employee.add(Emp23);
        Employee.add(Emp24);

        Employees.put("Employees", Employee);

        return Employees;

    }

    public static void main(String[] args) {
        UniqueEmployeeData obj = new UniqueEmployeeData();
        HashMap<String, HashSet<CompanyData>> EmpData = obj.EmployeeDataOfCompany();
        Set<CompanyData> Company = EmpData.get("Employees");
        for (CompanyData var : Company) {
            if ("TCS".equalsIgnoreCase(var.getCompanyName()) || "IBM".equalsIgnoreCase(var.getCompanyName()) && (45000 < var.getEmployeeSalary())) {
                System.out.println("Company Name is : " + var.getCompanyName() + "  Emp Name is : " + var.getEmployeeName() + " Emp ID is : " + var.getEmployeeId() + " Emp Sal : " + var.getEmployeeSalary());

            }
        }
    }
}
