package collection.hashmap;
import collection.model.Company;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class CompanyData {

    public void createCompanyRecord() {

        LinkedHashMap<String, LinkedHashSet<Company>> employeeRecord = new LinkedHashMap<>();
        LinkedHashSet<Company> recordIBM = new LinkedHashSet<>();


        //with duplicate
        Company record1 = new Company("Jatin", 475, "IT", 52222);
        Company record2 = new Company("Mohit", 476, "SALES", 50000);
        Company record3 = new Company("Ojal", 477, "TECH", 52111);
        Company record4 = new Company("Vandana", 478, "HR", 52002);
        Company record5 = new Company("Mukul", 479, "PR", 53222);
        Company record6 = new Company("Jatin", 475, "IT", 52222);
        Company record7 = new Company("Mohit", 476, "SALES", 50000);
        Company record8 = new Company("Ojal", 477, "TECH", 52111);
        Company record9 = new Company("Vandana", 478, "HR", 52002);
        Company record10 = new Company("Mukul", 479, "PR", 53222);

        recordIBM.add(record1);
        recordIBM.add(record2);
        recordIBM.add(record3);
        recordIBM.add(record4);
        recordIBM.add(record5);
        recordIBM.add(record6);
        recordIBM.add(record7);
        recordIBM.add(record8);
        recordIBM.add(record9);
        recordIBM.add(record10);

        employeeRecord.put("IBM", recordIBM);


        LinkedHashSet<Company> recordTCS = new LinkedHashSet<>();
        //with duplicate
        Company record11 = new Company("Jatin", 475, "IT", 52222);
        Company record12 = new Company("Mohit", 476, "SALES", 50000);
        Company record13 = new Company("Ojal", 477, "TECH", 52111);
        Company record14 = new Company("Vandana", 478, "HR", 52002);
        Company record15 = new Company("Mukul", 479, "PR", 53222);
        Company record16 = new Company("Jatin", 475, "IT", 52222);
        Company record17 = new Company("Mohit", 476, "SALES", 50000);
        Company record18 = new Company("Ojal", 477, "TECH", 52111);
        Company record19 = new Company("Vandana", 478, "HR", 52002);
        Company record20 = new Company("Mukul", 479, "PR", 53222);


        recordTCS.add(record11);
        recordTCS.add(record12);
        recordTCS.add(record13);
        recordTCS.add(record14);
        recordTCS.add(record15);
        recordTCS.add(record16);
        recordTCS.add(record17);
        recordTCS.add(record18);
        recordTCS.add(record19);
        recordTCS.add(record20);

        employeeRecord.put("TCS", recordTCS);

        LinkedHashSet<Company> recordINFOSYS = new LinkedHashSet<>();
        //with duplicate
        Company record21 = new Company("Jatin", 475, "IT", 52222);
        Company record22 = new Company("Mohit", 476, "SALES", 50000);
        Company record23 = new Company("Ojal", 477, "TECH", 52111);
        Company record24 = new Company("Vandana", 478, "HR", 52002);
        Company record25 = new Company("Mukul", 479, "PR", 53222);
        Company record26 = new Company("Jatin", 475, "IT", 52222);
        Company record27 = new Company("Mohit", 476, "SALES", 50000);
        Company record28 = new Company("Ojal", 477, "TECH", 52111);
        Company record29 = new Company("Vandana", 478, "HR", 52002);
        Company record30 = new Company("Mukul", 479, "PR", 53222);

        recordINFOSYS.add(record21);
        recordINFOSYS.add(record22);
        recordINFOSYS.add(record23);
        recordINFOSYS.add(record24);
        recordINFOSYS.add(record25);
        recordINFOSYS.add(record26);
        recordINFOSYS.add(record27);
        recordINFOSYS.add(record28);
        recordINFOSYS.add(record29);
        recordINFOSYS.add(record30);

        employeeRecord.put("INFOSYS", recordINFOSYS);

        System.out.println("Printing Employee Data" + employeeRecord);
        Set<String> keys = employeeRecord.keySet();
        for (String key : keys) {
            System.out.println(" ");
            System.out.println("Printing Employee Record with Loops: ");
            System.out.println(" ");
            LinkedHashSet<Company> companies = employeeRecord.get(key);
            for (Company company : companies) {
                System.out.println("Printing Companies Employee Record: " + key + " | " + "Name is: " + company.getEmpName() + " | " + "EMP ID is: " + company.getEmpID() + " | " + "Department is: " + company.getDepartment() + " | " + "Salary is: " + company.getSalary());
            }
        }
    }
    public static void main(String[] args) {
        CompanyData obj = new CompanyData();
        obj.createCompanyRecord();
    }
}
