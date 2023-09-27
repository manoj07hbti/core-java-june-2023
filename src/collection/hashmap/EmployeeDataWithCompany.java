package collection.hashmap;
import collection.model.Company;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeDataWithCompany {

    public LinkedHashMap<String, LinkedHashSet<Company>> makeEmployeeMap() {

        LinkedHashMap<String, LinkedHashSet<Company>> EMPRecoed = new LinkedHashMap<>();
        LinkedHashSet<Company> recordIBM = new LinkedHashSet<>();

        Company record1 = new Company("Jatin", 401, "IT", 52222);
        Company record2 = new Company("Mohit", 402, "SALES", 45000);
        Company record3 = new Company("Ojal", 403, "TECH", 52111);
        Company record4 = new Company("Vandana", 402, "HR", 52002);
        Company record5 = new Company("Mukul", 405, "PR", 53222);
        Company record6 = new Company("Raj", 406, "FABRIC", 50000);
        Company record7 = new Company("Rsm", 402, "SALES", 45000);
        Company record8 = new Company("Kumar", 408, "FPREIGN", 51111);
        Company record9 = new Company("Rahul", 409, "SALES-2", 51002);
        Company record10 = new Company("Dev", 410, "PR-2", 51222);


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

        EMPRecoed.put("IBM", recordIBM);

        LinkedHashSet<Company> recordTCS = new LinkedHashSet<>();

        Company record11 = new Company("Jatin", 401, "IT", 52222);
        Company record12 = new Company("Mohit", 402, "SALES", 45000);
        Company record13 = new Company("Ojal", 403, "TECH", 52111);
        Company record14 = new Company("Vandana", 402, "HR", 52002);
        Company record15 = new Company("Mukul", 405, "PR", 53222);
        Company record16 = new Company("Raj", 406, "FABRIC", 50000);
        Company record17 = new Company("Rsm", 402, "SALES", 45000);
        Company record18 = new Company("Kumar", 408, "FPREIGN", 51111);
        Company record19 = new Company("Rahul", 409, "SALES-2", 51002);
        Company record20 = new Company("Dev", 410, "PR-2", 51222);


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

        EMPRecoed.put("TCS", recordTCS);


        LinkedHashSet<Company> recordINFOSYS = new LinkedHashSet<>();

        Company record21 = new Company("Jatin", 401, "IT", 52222);
        Company record22 = new Company("Mohit", 402, "SALES", 45000);
        Company record23 = new Company("Ojal", 403, "TECH", 52111);
        Company record24 = new Company("Vandana", 402, "HR", 52002);
        Company record25 = new Company("Mukul", 405, "PR", 53222);
        Company record26 = new Company("Raj", 406, "FABRIC", 50000);
        Company record27 = new Company("Rsm", 402, "SALES", 45000);
        Company record28 = new Company("Kumar", 408, "FPREIGN", 51111);
        Company record29 = new Company("Rahul", 409, "SALES-2", 51002);
        Company record30 = new Company("Dev", 410, "PR-2", 51222);


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

        EMPRecoed.put("INFOSYS", recordINFOSYS);


        return EMPRecoed;
    }

    public static void main(String[] args) {
        EmployeeDataWithCompany obj = new EmployeeDataWithCompany();
        LinkedHashMap<String, LinkedHashSet<Company>> companies = obj.makeEmployeeMap();


        System.out.println("Printing Employee Data" + companies.keySet());
        System.out.println("Printing IBM && TCS Employees Record: ");
        System.out.println("Whose Salary is Greater than 45000 thousand: ");

        Set<String> companySet = companies.keySet();
        for (String Key : companySet) {
            if (Key.equals("IBM") || Key.equals("TCS")) {
                System.out.println(" ");
                System.out.println("Printing Employee Record with Loops: ");
                System.out.println(" ");
                LinkedHashSet<Company> companies1 = companies.get(Key);
                for (Company company1 : companies1) {
                    if (company1.getSalary() > 45000) {
                        System.out.println("Printing Companies Employee Record: " + Key + " | " + "Name is: " + company1.getEmpName() + " | " + "EMP ID is: " + company1.getEmpID() + " | " + "Department is: " + company1.getDepartment() + " | " + "Salary is: " + company1.getSalary());
                    }
                }
            }
        }
    }
}
