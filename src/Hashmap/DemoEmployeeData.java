package Hashmap;

import collection.model.DataE;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DemoEmployeeData {

    public HashMap<String, HashSet<DataE>> DataE() {

        HashMap<String, HashSet<DataE>> DataE1 = new HashMap<>();
        HashSet<DataE> DataA = new HashSet<>();
        DataE record1 = new DataE("Neha", "TCS", 30000, 12);
        DataE record2 = new DataE("Tanu", "IT", 34560, 13);
        DataE record3 = new DataE("Hina", "IOT", 34570, 14);
        DataE record4 = new DataE("Neha", "TCS", 30000, 12);
        DataE record5 = new DataE("Tanu", "IT", 34560, 13);
        DataE record6 = new DataE("Hina", "IOT", 34570, 14);

        DataA.add(record1);
        DataA.add(record2);
        DataA.add(record3);
        DataA.add(record4);
        DataA.add(record5);
        DataA.add(record6);


        DataE1.put("TCS", DataA);


        HashSet<DataE> DataB = new HashSet<>();
        DataE record7 = new DataE("Neha", "TCS", 30000, 12);
        DataE record8 = new DataE("Tanu", "IT", 34560, 13);
        DataE record9 = new DataE("Hina", "IOT", 34570, 14);
        DataE record10 = new DataE("Neha", "TCS", 30000, 12);
        DataE record11 = new DataE("Tanu", "IT", 34560, 13);
        DataE record12 = new DataE("Hina", "IOT", 34570, 14);

        DataB.add(record7);
        DataB.add(record8);
        DataB.add(record9);
        DataB.add(record10);
        DataB.add(record11);
        DataB.add(record12);


        DataE1.put("IT", DataB);

        HashSet<DataE> DataC = new HashSet<>();
        DataE record13 = new DataE("Neha", "TCS", 30000, 12);
        DataE record14 = new DataE("Tanu", "IT", 34560, 13);
        DataE record15 = new DataE("Hina", "IOT", 34570, 14);
        DataE record16 = new DataE("Neha", "TCS", 30000, 12);
        DataE record17 = new DataE("Tanu", "IT", 34560, 13);
        DataE record18 = new DataE("Hina", "IOT", 34570, 14);

        DataC.add(record13);
        DataC.add(record14);
        DataC.add(record15);
        DataC.add(record16);
        DataC.add(record17);
        DataC.add(record18);


        DataE1.put("IBM", DataC);


        return DataE1;


    }

    public static void main(String[] args) {

        DemoEmployeeData obj = new DemoEmployeeData();

        HashMap<String, HashSet<DataE>> CompanyData = obj.DataE();
        System.out.println("printing IT and TCS Employee record");
        System.out.println("Whose Salary is Greater than 30000 thousand: ");
        Set<String> CompanyDataSet = CompanyData.keySet();
        for (String key : CompanyDataSet) {

            if (key.equals("IT") || key.equals("TCS")) {

                HashSet<DataE> Company = CompanyData.get(key);

                for (DataE salary : Company) {

                    if (salary.getSalary() > 30000) {

                        System.out.println("Printing Companies Employee Record: " + key + " | " + "Name is: " + salary.getName() + " | " + "EMP ID is: " + salary.getId() + " | " + "CompanyName: " + salary.getCompanyName() + " | " + "Salary is: " + salary.getSalary());


                    }

                }


            }
        }


    }


}
