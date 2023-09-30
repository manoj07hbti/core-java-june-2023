package Collection.Hashmap;

import Collection.Model.Companies;

import java.util.HashMap;
import java.util.HashSet;

public class CompanyAndEmployee {

    public HashMap<String, HashSet<Companies>> CompanyEmployee() {
        HashMap<String, HashSet<Companies>> Emp = new HashMap<>();
        Companies Company1 = new Companies("TCS", "Shiv", "TCS0012", 60666.54);
        Companies Company2 = new Companies("IBM", "Mukesh", "TCS0112", 50666.54);
        Companies Company3 = new Companies("TCS", "Ravi", "TCS0212", 40666.54);
        Companies Company4 = new Companies("IBM", "Mohit", "TCS0512", 70666.54);
        Companies Company5 = new Companies("INFOSYS", "Pinki", "TCS0812", 80666.54);
        Companies Company6 = new Companies("IBM", "Pinki Kumari", "TCS0112", 80666.54);
        Companies Company7 = new Companies("INFOSYS", "Dev", "TCN0912", 80166.54);
        Companies Company8 = new Companies("INFOSYS", "Shelesh", "TNS0832", 81066.54);
        Companies Company9 = new Companies("INFOSYS", "Kishan", "TNS1812", 89266.54);
        Companies Company10 = new Companies("TCS", "Pooja", "TCS0812", 87661.54);
        Companies Company11 = new Companies("TCS", "Lokesh", "TCS0815", 80641.54);
        Companies Company12 = new Companies("IBM", "Farah", "IBM0812", 81766.54);
        Companies Company13 = new Companies("IBM", "Rohit", "IBM0812", 87606.54);
        Companies Company14 = new Companies("INFOSYS", "Vijay Kumar", "INS0812", 83366.54);
        Companies Company15 = new Companies("IBM", "Rakhi Dev", "IBM0312", 88966.54);
        Companies Company16 = new Companies("INFOSYS", "Doli", "INS0912", 80619.54);
        Companies Company17 = new Companies("TCS", "Poonam Gautam", "TCS0412", 83666.54);
        Companies Company18 = new Companies("INFOSYS", "Pinki Gautam", "INS0812", 81666.54);

        HashSet<Companies> Employee = new HashSet<>();
        Employee.add(Company1);
        Employee.add(Company2);
        Employee.add(Company3);
        Employee.add(Company4);
        Employee.add(Company5);
        Employee.add(Company6);
        Employee.add(Company7);
        Employee.add(Company8);
        Employee.add(Company9);
        Employee.add(Company10);
        Employee.add(Company11);
        Employee.add(Company12);
        Employee.add(Company13);
        Employee.add(Company14);
        Employee.add(Company15);
        Employee.add(Company16);
        Employee.add(Company17);
        Employee.add(Company18);


        Emp.put("Emp", Employee);
        return Emp;

    }

    public static void main(String[] args) {
        CompanyAndEmployee obj = new CompanyAndEmployee();
        HashMap<String, HashSet<Companies>> EmpData = obj.CompanyEmployee();
        HashSet<Companies> Set = EmpData.get("Emp");
        for (Companies var : Set) {
            if (var.getCompanyName().equals("INFOSYS") || var.getCompanyName().equals("IBM")) {
                if (var.getEmployeeSalary() > 45000) {
                    System.out.println("Company Name   :" + var.getCompanyName() + " Employee Name :" + var.getEmployeeName() + " Employee ID : " + var.getEmployeeID() + " Salary " + var.getEmployeeSalary());
                }
            }
        }
    }

}
