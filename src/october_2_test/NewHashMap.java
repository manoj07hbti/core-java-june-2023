package october_2_test;

import collection.model.Employees;

import java.util.*;


public class NewHashMap {

    public LinkedHashMap<String, LinkedHashSet<Employees>> empHashMap() {

        LinkedHashMap<String, LinkedHashSet<Employees>> EMPRecord = new LinkedHashMap<>();
        LinkedHashSet<Employees> RecordIBM = new LinkedHashSet<>();

        Employees record1 = new Employees("Kanak", 55000, "AGRA", "AI");
        Employees record2 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record3 = new Employees("Mohini", 50000, "DELHI", "SALES");
        Employees record4 = new Employees("Neha", 57000, "AGRA", "AI");
        Employees record5 = new Employees("Versha", 50000, "DELHI", "STEEL");
        Employees record6 = new Employees("Priyanka", 57000, "PUNE", "STEEL");
        Employees record7 = new Employees("Nidhi", 56000, "PUNE", "HR");
        Employees record8 = new Employees("Shivi", 55000, "DELHI", "SALES");
        Employees record9 = new Employees("Moni", 58000, "MATHURA", "HR");
        Employees record10 = new Employees("Seema", 54000, "DELHI", "STEEL");
        Employees record11 = new Employees("Kanak", 55000, "AGRA", "AI");
        Employees record12 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record13 = new Employees("Mohini", 50000, "DELHI", "SALES");
        Employees record14 = new Employees("Neha", 57000, "AGRA", "AI");
        Employees record15 = new Employees("Versha", 50000, "DELHI", "STEEL");
        Employees record16 = new Employees("Priyanka", 57000, "PUNE", "STEEL");
        Employees record17 = new Employees("Nidhi", 56000, "PUNE", "HR");
        Employees record18 = new Employees("Shivi", 55000, "DELHI", "SALES");
        Employees record19 = new Employees("Moni", 58000, "MATHURA", "HR");
        Employees record20 = new Employees("Seema", 54000, "DELHI", "STEEL");


        RecordIBM.add(record1);
        RecordIBM.add(record2);
        RecordIBM.add(record3);
        RecordIBM.add(record4);
        RecordIBM.add(record5);
        RecordIBM.add(record6);
        RecordIBM.add(record7);
        RecordIBM.add(record8);
        RecordIBM.add(record9);
        RecordIBM.add(record10);
        RecordIBM.add(record11);
        RecordIBM.add(record12);
        RecordIBM.add(record13);
        RecordIBM.add(record14);
        RecordIBM.add(record15);
        RecordIBM.add(record16);
        RecordIBM.add(record17);
        RecordIBM.add(record18);
        RecordIBM.add(record19);
        RecordIBM.add(record20);

        EMPRecord.put("IBM", RecordIBM);

        LinkedHashSet<Employees> RecordTCS = new LinkedHashSet<>();

        Employees record21 = new Employees("Kanak", 55000, "AGRA", "AI");
        Employees record22 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record23 = new Employees("Mohini", 50000, "DELHI", "SALES");
        Employees record24 = new Employees("Neha", 57000, "AGRA", "AI");
        Employees record25 = new Employees("Versha", 50000, "DELHI", "STEEL");
        Employees record26 = new Employees("Priyanka", 57000, "PUNE", "STEEL");
        Employees record27 = new Employees("Nidhi", 56000, "PUNE", "HR");
        Employees record28 = new Employees("Shivi", 55000, "DELHI", "SALES");
        Employees record29 = new Employees("Moni", 58000, "MATHURA", "HR");
        Employees record30 = new Employees("Seema", 54000, "DELHI", "STEEL");
        Employees record31 = new Employees("Kanak", 55000, "AGRA", "AI");
        Employees record32 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record33 = new Employees("Mohini", 50000, "DELHI", "SALES");
        Employees record34 = new Employees("Neha", 57000, "AGRA", "AI");
        Employees record35 = new Employees("Versha", 50000, "DELHI", "STEEL");
        Employees record36 = new Employees("Priyanka", 57000, "PUNE", "STEEL");
        Employees record37 = new Employees("Nidhi", 56000, "PUNE", "HR");
        Employees record38 = new Employees("Shivi", 55000, "DELHI", "SALES");
        Employees record39 = new Employees("Moni", 58000, "MATHURA", "HR");
        Employees record40 = new Employees("Seema", 54000, "DELHI", "STEEL");

        RecordTCS.add(record21);
        RecordTCS.add(record22);
        RecordTCS.add(record23);
        RecordTCS.add(record24);
        RecordTCS.add(record25);
        RecordTCS.add(record26);
        RecordTCS.add(record27);
        RecordTCS.add(record28);
        RecordTCS.add(record29);
        RecordTCS.add(record30);
        RecordTCS.add(record31);
        RecordTCS.add(record32);
        RecordTCS.add(record33);
        RecordTCS.add(record34);
        RecordTCS.add(record35);
        RecordTCS.add(record36);
        RecordTCS.add(record37);
        RecordTCS.add(record38);
        RecordTCS.add(record39);
        RecordTCS .add(record40);


        EMPRecord.put("TCS", RecordTCS);

        LinkedHashSet<Employees> RecordWIPRO = new LinkedHashSet<>();

        Employees record41 = new Employees("Kanak", 55000, "AGRA", "AI");
        Employees record42 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record43 = new Employees("Mohini", 50000, "DELHI", "SALES");
        Employees record44 = new Employees("Neha", 57000, "AGRA", "AI");
        Employees record45 = new Employees("Versha", 50000, "DELHI", "STEEL");
        Employees record46 = new Employees("Priyanka", 57000, "PUNE", "STEEL");
        Employees record47 = new Employees("Nidhi", 56000, "PUNE", "HR");
        Employees record48 = new Employees("Shivi", 55000, "DELHI", "SALES");
        Employees record49 = new Employees("Moni", 58000, "MATHURA", "HR");
        Employees record50 = new Employees("Seema", 54000, "DELHI", "STEEL");
        Employees record51 = new Employees("Kanak", 55000, "AGRA", "AI");
        Employees record52 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record53 = new Employees("Mohini", 50000, "DELHI", "SALES");
        Employees record54 = new Employees("Neha", 57000, "AGRA", "AI");
        Employees record55 = new Employees("Versha", 50000, "DELHI", "STEEL");
        Employees record56 = new Employees("Priyanka", 57000, "PUNE", "STEEL");
        Employees record57 = new Employees("Nidhi", 56000, "PUNE", "HR");
        Employees record58 = new Employees("Shivi", 55000, "DELHI", "SALES");
        Employees record59 = new Employees("Moni", 58000, "MATHURA", "HR");
        Employees record60 = new Employees("Seema", 54000, "DELHI", "STEEL");

        RecordWIPRO.add(record41);
        RecordWIPRO.add(record42);
        RecordWIPRO.add(record43);
        RecordWIPRO.add(record44);
        RecordWIPRO .add(record45);
        RecordWIPRO.add(record46);
        RecordWIPRO.add(record47);
        RecordWIPRO.add(record48);
        RecordWIPRO.add(record49);
        RecordWIPRO.add(record50);
        RecordWIPRO.add(record51);
        RecordWIPRO.add(record52);
        RecordWIPRO.add(record53);
        RecordWIPRO.add(record54);
        RecordWIPRO.add(record55);
        RecordWIPRO.add(record56);
        RecordWIPRO.add(record57);
        RecordWIPRO.add(record58);
        RecordWIPRO.add(record59);
        RecordWIPRO.add(record60);


        EMPRecord.put("WIPRO", RecordWIPRO);

        LinkedHashSet<Employees> RecoedCTS = new LinkedHashSet<>();

        Employees record61 = new Employees("Kanak", 55000, "AGRA", "AI");
        Employees record62 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record63 = new Employees("Mohini", 50000, "DELHI", "SALES");
        Employees record64 = new Employees("Neha", 57000, "AGRA", "AI");
        Employees record65 = new Employees("Versha", 50000, "DELHI", "STEEL");
        Employees record66 = new Employees("Priyanka", 57000, "PUNE", "STEEL");
        Employees record67 = new Employees("Nidhi", 56000, "PUNE", "HR");
        Employees record68 = new Employees("Shivi", 55000, "DELHI", "SALES");
        Employees record69 = new Employees("Moni", 58000, "MATHURA", "HR");
        Employees record70 = new Employees("Seema", 54000, "DELHI", "STEEL");
        Employees record71 = new Employees("Kanak", 55000, "AGRA", "AI");
        Employees record72 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record73 = new Employees("Mohini", 50000, "DELHI", "SALES");
        Employees record74 = new Employees("Neha", 57000, "AGRA", "AI");
        Employees record75 = new Employees("Versha", 50000, "DELHI", "STEEL");
        Employees record76 = new Employees("Priyanka", 57000, "PUNE", "STEEL");
        Employees record77 = new Employees("Nidhi", 56000, "PUNE", "HR");
        Employees record78 = new Employees("Shivi", 55000, "DELHI", "SALES");
        Employees record79 = new Employees("Moni", 58000, "MATHURA", "HR");
        Employees record80 = new Employees("Seema", 54000, "DELHI", "STEEL");

        RecoedCTS.add(record61);
        RecoedCTS.add(record62);
        RecoedCTS.add(record63);
        RecoedCTS.add(record64);
        RecoedCTS.add(record65);
        RecoedCTS.add(record66);
        RecoedCTS.add(record67);
        RecoedCTS.add(record68);
        RecoedCTS.add(record69);
        RecoedCTS.add(record70);
        RecoedCTS.add(record71);
        RecoedCTS.add(record72);
        RecoedCTS.add(record73);
        RecoedCTS.add(record74);
        RecoedCTS.add(record75);
        RecoedCTS.add(record76);
        RecoedCTS.add(record77);
        RecoedCTS.add(record78);
        RecoedCTS.add(record79);
        RecoedCTS.add(record80);


        EMPRecord.put("CTS", RecoedCTS);

        return EMPRecord;
    }

    public static void main(String[] args)  {

        NewHashMap obj = new NewHashMap();

        LinkedHashMap<String, LinkedHashSet<Employees>> data1 = obj.empHashMap();

        //TODO 1.Insert all the Data using Scanner With IBM,TCS,WIPRO and CTS and display employee who is having salary greater than 50,000 and belongs to pune city for IBM and TCS.
        System.out.println("Answer No.1");
        System.out.println(" ");
        System.out.println("Printing all Companies record whose working in Pune's IBM and TCS Branch and also Salary is Greater than 50,000: ");

        Set<String> recordSet = data1.keySet();
        for (String employees : recordSet) {
            System.out.println(" ");
            if (employees.equals("IBM") || employees.equals("TCS")) {
                LinkedHashSet<Employees> companiesRecord = data1.get(employees);
                for (Employees employees1 : companiesRecord) {
                    if (employees1.getEmpSalary() > 50000) {
                        if (employees1.getEmpCity().equals("PUNE")) {
                            System.out.println("Printing IBM and TCS Record :" + employees + "|" + "Emp Name is :" + employees1.getEmpName() + "|" + "Emp Salary is :" + employees1.getEmpSalary() + "|" + "Emp City is :" + employees1.getEmpCity() + "|" + "Emp Dept is :" + employees1.getEmpDept());
                        }
                    }
                }
            }
        }

        //TODO 3.Display all companies employees Data company wise.
        LinkedHashMap<String, LinkedHashSet<Employees>> data3 = obj.empHashMap();
        Set<String> keys = data3.keySet();
        System.out.println("Answer No.3");
        for (String key : keys) {
            LinkedHashSet<Employees> companiesRecord = data3.get(key);
            System.out.println(" ");
            System.out.println("Printing all Companies Record :");
            System.out.println(" ");
            for (Employees employees : companiesRecord) {
                System.out.println("Printing all Records :" + key + "|" + "Emp Name is :" + employees.getEmpName() + "|" + "Emp Salary is :" + employees.getEmpSalary() + "|" + "Emp City is :" + employees.getEmpCity() + "|" + "Emp Dept is :" + employees.getEmpDept());

            }
        }

    }
}
