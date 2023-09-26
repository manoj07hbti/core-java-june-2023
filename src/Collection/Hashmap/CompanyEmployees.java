package Collection.Hashmap;

import Collection.Model.CompanyEmployee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class CompanyEmployees {
    public void CreateEmployee() {
        HashMap<String, ArrayList<CompanyEmployee>> EmployeeMap = new HashMap<>();
        ArrayList<CompanyEmployee> IBMEmployee = new ArrayList<>();

        CompanyEmployee Emp1 = new CompanyEmployee("RaviKant Singh", "UPSSC1989", 30000.54);
        CompanyEmployee Emp2 = new CompanyEmployee("Rahul Kumar", "UPSSC1981", 45000.54);
        CompanyEmployee Emp3 = new CompanyEmployee("Mukesh Singh", "UPSSC1982", 43700.54);
        CompanyEmployee Emp4 = new CompanyEmployee("Manoj Singh", "UPSSC1983", 50000.54);
        CompanyEmployee Emp5 = new CompanyEmployee("Anil Singh", "UPSSC1984", 46008.54);
        CompanyEmployee Emp6 = new CompanyEmployee("Suresh Chandra ", "UPSSC1985", 44000.54);
        CompanyEmployee Emp7 = new CompanyEmployee("Sandeep", "UPSSC1986", 45000.54);
        CompanyEmployee Emp8 = new CompanyEmployee("Ramesh Singh", "UPSSC1987", 30000.54);
        CompanyEmployee Emp9 = new CompanyEmployee("Mahesh", "UPSSC1988", 30056.54);
        CompanyEmployee Emp10 = new CompanyEmployee("Washingtan Sunder Singh", "UPSSC1990", 30034.54);
        IBMEmployee.add(Emp1);
        IBMEmployee.add(Emp2);
        IBMEmployee.add(Emp3);
        IBMEmployee.add(Emp4);
        IBMEmployee.add(Emp5);
        IBMEmployee.add(Emp6);
        IBMEmployee.add(Emp7);
        IBMEmployee.add(Emp8);
        IBMEmployee.add(Emp9);
        IBMEmployee.add(Emp10);
        EmployeeMap.put("IBM", IBMEmployee);

        ArrayList<CompanyEmployee> TCSEmployee = new ArrayList<>();

        CompanyEmployee Emp11 = new CompanyEmployee("Rakhi Kumari", "UPSSC1991", 46000.87);
        CompanyEmployee Emp12 = new CompanyEmployee("Manish Kumar", "UPSSC1992", 46078.87);
        CompanyEmployee Emp13 = new CompanyEmployee("Rakesh Kumar", "UPSSC1993", 44000.89);
        CompanyEmployee Emp14 = new CompanyEmployee("Ramesh Kumar", "UPSSC1994", 46654.87);
        CompanyEmployee Emp15 = new CompanyEmployee("Munnesh Khan", "UPSSC1995", 46098.87);
        CompanyEmployee Emp16 = new CompanyEmployee("Mathur", "UPSSC1996", 48000.87);
        CompanyEmployee Emp17 = new CompanyEmployee("Mohit Kumar", "UPSSC1997", 45008.87);
        CompanyEmployee Emp18 = new CompanyEmployee("Manoj Sharma", "UPSSC1998", 76000.87);
        CompanyEmployee Emp19 = new CompanyEmployee("Ashok Kumar", "UPSSC1999", 40000.87);
        CompanyEmployee Emp20 = new CompanyEmployee("Sachin Kumar", "UPSSC1200", 47000.87);

        TCSEmployee.add(Emp11);
        TCSEmployee.add(Emp12);
        TCSEmployee.add(Emp13);
        TCSEmployee.add(Emp14);
        TCSEmployee.add(Emp15);
        TCSEmployee.add(Emp16);
        TCSEmployee.add(Emp17);
        TCSEmployee.add(Emp18);
        TCSEmployee.add(Emp19);
        TCSEmployee.add(Emp20);

        EmployeeMap.put("TCS", TCSEmployee);

        ArrayList<CompanyEmployee> INFOSYSEmployee = new ArrayList<>();

        CompanyEmployee Emp21 = new CompanyEmployee("Sanju Kumar", "UPSSC211", 55000.65);
        CompanyEmployee Emp22 = new CompanyEmployee("Sewang  Kumar", "UPSSC212", 51000.65);
        CompanyEmployee Emp23 = new CompanyEmployee("Manik Kumar", "UPSSC213", 35000.65);
        CompanyEmployee Emp24 = new CompanyEmployee("Rohit Kumar", "UPSSC214", 53000.65);
        CompanyEmployee Emp25 = new CompanyEmployee("Shiv Kumar", "UPSSC215", 35070.65);
        CompanyEmployee Emp26 = new CompanyEmployee("Ram Kumar", "UPSSC216", 37000.65);
        CompanyEmployee Emp27 = new CompanyEmployee("Abhisekh Sagar", "UPSSC217", 55700.65);
        CompanyEmployee Emp28 = new CompanyEmployee("Vijay Kumar", "UPSSC218", 55010.65);
        CompanyEmployee Emp29 = new CompanyEmployee("Monu Kumar", "UPSSC219", 550876.65);
        CompanyEmployee Emp30 = new CompanyEmployee("Ashwani Kumar", "UPSSC276", 55710.65);


        INFOSYSEmployee.add(Emp21);
        INFOSYSEmployee.add(Emp22);
        INFOSYSEmployee.add(Emp23);
        INFOSYSEmployee.add(Emp24);
        INFOSYSEmployee.add(Emp25);
        INFOSYSEmployee.add(Emp26);
        INFOSYSEmployee.add(Emp27);
        INFOSYSEmployee.add(Emp28);
        INFOSYSEmployee.add(Emp29);
        INFOSYSEmployee.add(Emp30);

        EmployeeMap.put("INFOSYS", INFOSYSEmployee);
        System.out.println("Printing all Companies Data : " + EmployeeMap);
        Set<String> CompanyData = EmployeeMap.keySet();
        for (String var : CompanyData) {
            System.out.println("Printing Companies Data : ");
            if (var.equals("IBM") || var.equals("TCS")) {
                ArrayList<CompanyEmployee> Companies = EmployeeMap.get(var);
                for (CompanyEmployee emp : Companies) {
                    if (emp.getSalary() > 45000) {

                        System.out.println("Company Data : " + var + "Name : " + emp.getName() + "ID : " + emp.getID() + " Salary : " + emp.getSalary());
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        CompanyEmployees obj = new CompanyEmployees();
        obj.CreateEmployee();

    }
}

