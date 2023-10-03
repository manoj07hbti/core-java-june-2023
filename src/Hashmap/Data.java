package Hashmap;
import collection.model.Company;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Data {
    public LinkedHashMap<String, LinkedHashSet<Company>> dataGathering(){
        LinkedHashMap<String,LinkedHashSet<Company>> data=new LinkedHashMap<>();
        LinkedHashSet<Company> record=new LinkedHashSet<>();

        Company record1 = new Company("Kanak", 475, "IT", 52222);
        Company record2 = new Company("Mahi", 476, "SALES", 50000);
        Company record3 = new Company("Aabhya", 477, "TECH", 52111);
        Company record4 = new Company("Vandana", 478, "HR", 52002);
        Company record5 = new Company("Manvi", 479, "PR", 53222);
        Company record6 = new Company("Kanak", 475, "IT", 52222);
        Company record7 = new Company("Mahi", 476, "SALES", 50000);
        Company record8 = new Company("Aabhya", 477, "TECH", 52111);
        Company record9 = new Company("Vandana", 478, "HR", 52002);
        Company record10 = new Company("Manvi", 479, "PR", 53222);


        record.add(record1);
        record.add(record2);
        record.add(record3);
        record.add(record4);
        record.add(record5);
        record.add(record6);
        record.add(record7);
        record.add(record8);
        record.add(record9);
        record.add(record10);


        data.put("IBM",record);

        return data;
    }

    public static void main(String[] args) {
        Data obj=new Data();
        LinkedHashMap<String,LinkedHashSet<Company>>info= obj.dataGathering();

        Set<Company>companiesSet=info.get("IBM");

        System.out.println("Printing IBM Employee Record :");
        System.out.println(" ");
        System.out.println("****Using Advanced for loop****");
        System.out.println(" ");
        for (Company company:companiesSet){

            System.out.println("Printing Companies Employee Record: "  + "Name is: " + company.getEmpName() + " | " + "EMP ID is: " + company.getEmpID() + " | " + "Department is: " + company.getDepartment() + " | " + "Salary is: " + company.getSalary());

        }
    }
}
