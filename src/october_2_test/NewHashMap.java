package october_2_test;

import collection.model.Employees;

import java.util.*;




public class NewHashMap {

    public LinkedHashMap<String, LinkedHashSet<Employees>> empHashMap() {

        LinkedHashMap<String, LinkedHashSet<Employees>> EMPRecord = new LinkedHashMap<>();
        LinkedHashSet<Employees> RecoedIBM = new LinkedHashSet<>();

        Employees record1 = new Employees("Jatin", 55000, "AGRA", "AI");
        Employees record2 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record3 = new Employees("Mohit", 50000, "DELHI", "SALES");
        Employees record4 = new Employees("Ojal", 57000, "AGRA", "AI");
        Employees record5 = new Employees("Vandana", 50000, "DELHI", "STEEL");
        Employees record6 = new Employees("Priya", 57000, "PUNE", "STEEL");
        Employees record7 = new Employees("Nishu", 56000, "PUNE", "HR");
        Employees record8 = new Employees("Shivam", 55000, "DELHI", "SALES");
        Employees record9 = new Employees("Mukul", 58000, "MATHURA", "HR");
        Employees record10 = new Employees("Shivani", 54000, "DELHI", "STEEL");
        Employees record11 = new Employees("Jatin", 55000, "AGRA", "AI");
        Employees record12 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record13 = new Employees("Mohit", 50000, "DELHI", "SALES");
        Employees record14 = new Employees("Ojal", 57000, "AGRA", "AI");
        Employees record15 = new Employees("Vandana", 50000, "DELHI", "STEEL");
        Employees record16 = new Employees("Priya", 57000, "PUNE", "STEEL");
        Employees record17 = new Employees("Nishu", 56000, "PUNE", "HR");
        Employees record18 = new Employees("Shivam", 55000, "DELHI", "SALES");
        Employees record19 = new Employees("Mukul", 58000, "MATHURA", "HR");
        Employees record20 = new Employees("Shivani", 54000, "DELHI", "STEEL");

        RecoedIBM.add(record1);
        RecoedIBM.add(record2);
        RecoedIBM.add(record3);
        RecoedIBM.add(record4);
        RecoedIBM.add(record5);
        RecoedIBM.add(record6);
        RecoedIBM.add(record7);
        RecoedIBM.add(record8);
        RecoedIBM.add(record9);
        RecoedIBM.add(record10);
        RecoedIBM.add(record11);
        RecoedIBM.add(record12);
        RecoedIBM.add(record13);
        RecoedIBM.add(record14);
        RecoedIBM.add(record15);
        RecoedIBM.add(record16);
        RecoedIBM.add(record17);
        RecoedIBM.add(record18);
        RecoedIBM.add(record19);
        RecoedIBM.add(record20);

        EMPRecord.put("IBM", RecoedIBM);

        LinkedHashSet<Employees> RecoedTCS = new LinkedHashSet<>();

        Employees record21 = new Employees("Jatin", 55000, "AGRA", "AI");
        Employees record22 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record23 = new Employees("Mohit", 50000, "DELHI", "SALES");
        Employees record24 = new Employees("Ojal", 57000, "AGRA", "AI");
        Employees record25 = new Employees("Vandana", 50000, "DELHI", "STEEL");
        Employees record26 = new Employees("Priya", 57000, "PUNE", "STEEL");
        Employees record27 = new Employees("Nishu", 56000, "PUNE", "HR");
        Employees record28 = new Employees("Shivam", 55000, "DELHI", "SALES");
        Employees record29 = new Employees("Mukul", 58000, "MATHURA", "HR");
        Employees record30 = new Employees("Shivani", 54000, "DELHI", "STEEL");
        Employees record31 = new Employees("Jatin", 55000, "AGRA", "AI");
        Employees record32 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record33 = new Employees("Mohit", 50000, "DELHI", "SALES");
        Employees record34 = new Employees("Ojal", 57000, "AGRA", "AI");
        Employees record35 = new Employees("Vandana", 50000, "DELHI", "STEEL");
        Employees record36 = new Employees("Priya", 57000, "PUNE", "STEEL");
        Employees record37 = new Employees("Nishu", 56000, "PUNE", "HR");
        Employees record38 = new Employees("Shivam", 55000, "DELHI", "SALES");
        Employees record39 = new Employees("Mukul", 58000, "MATHURA", "HR");
        Employees record40 = new Employees("Shivani", 54000, "DELHI", "STEEL");

        RecoedTCS.add(record21);
        RecoedTCS.add(record22);
        RecoedTCS.add(record23);
        RecoedTCS.add(record24);
        RecoedTCS.add(record25);
        RecoedTCS.add(record26);
        RecoedTCS.add(record27);
        RecoedTCS.add(record28);
        RecoedTCS.add(record29);
        RecoedTCS.add(record30);
        RecoedTCS.add(record31);
        RecoedTCS.add(record32);
        RecoedTCS.add(record33);
        RecoedTCS.add(record34);
        RecoedTCS.add(record35);
        RecoedTCS.add(record36);
        RecoedTCS.add(record37);
        RecoedTCS.add(record38);
        RecoedTCS.add(record39);
        RecoedTCS.add(record40);


        EMPRecord.put("TCS", RecoedTCS);

        LinkedHashSet<Employees> RecoedWIPRO = new LinkedHashSet<>();

        Employees record41 = new Employees("Jatin", 55000, "AGRA", "AI");
        Employees record42 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record43 = new Employees("Mohit", 50000, "DELHI", "SALES");
        Employees record44 = new Employees("Ojal", 57000, "AGRA", "AI");
        Employees record45 = new Employees("Vandana", 50000, "DELHI", "STEEL");
        Employees record46 = new Employees("Priya", 57000, "PUNE", "STEEL");
        Employees record47 = new Employees("Nishu", 56000, "PUNE", "HR");
        Employees record48 = new Employees("Shivam", 55000, "DELHI", "SALES");
        Employees record49 = new Employees("Mukul", 58000, "MATHURA", "HR");
        Employees record50 = new Employees("Shivani", 54000, "DELHI", "STEEL");
        Employees record51 = new Employees("Jatin", 55000, "AGRA", "AI");
        Employees record52 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record53 = new Employees("Mohit", 50000, "DELHI", "SALES");
        Employees record54 = new Employees("Ojal", 57000, "AGRA", "AI");
        Employees record55 = new Employees("Vandana", 50000, "DELHI", "STEEL");
        Employees record56 = new Employees("Priya", 57000, "PUNE", "STEEL");
        Employees record57 = new Employees("Nishu", 56000, "PUNE", "HR");
        Employees record58 = new Employees("Shivam", 55000, "DELHI", "SALES");
        Employees record59 = new Employees("Mukul", 58000, "MATHURA", "HR");
        Employees record60 = new Employees("Shivani", 54000, "DELHI", "STEEL");

        RecoedWIPRO.add(record41);
        RecoedWIPRO.add(record42);
        RecoedWIPRO.add(record43);
        RecoedWIPRO.add(record44);
        RecoedWIPRO.add(record45);
        RecoedWIPRO.add(record46);
        RecoedWIPRO.add(record47);
        RecoedWIPRO.add(record48);
        RecoedWIPRO.add(record49);
        RecoedWIPRO.add(record50);
        RecoedWIPRO.add(record51);
        RecoedWIPRO.add(record52);
        RecoedWIPRO.add(record53);
        RecoedWIPRO.add(record54);
        RecoedWIPRO.add(record55);
        RecoedWIPRO.add(record56);
        RecoedWIPRO.add(record57);
        RecoedWIPRO.add(record58);
        RecoedWIPRO.add(record59);
        RecoedWIPRO.add(record60);


        EMPRecord.put("WIPRO", RecoedWIPRO);

        LinkedHashSet<Employees> RecoedCTS = new LinkedHashSet<>();

        Employees record61 = new Employees("Jatin", 55000, "AGRA", "AI");
        Employees record62 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record63 = new Employees("Mohit", 50000, "DELHI", "SALES");
        Employees record64 = new Employees("Ojal", 57000, "AGRA", "AI");
        Employees record65 = new Employees("Vandana", 50000, "DELHI", "STEEL");
        Employees record66 = new Employees("Priya", 57000, "PUNE", "STEEL");
        Employees record67 = new Employees("Nishu", 56000, "PUNE", "HR");
        Employees record68 = new Employees("Shivam", 55000, "DELHI", "SALES");
        Employees record69 = new Employees("Mukul", 58000, "MATHURA", "HR");
        Employees record70 = new Employees("Shivani", 54000, "DELHI", "STEEL");
        Employees record71 = new Employees("Jatin", 55000, "AGRA", "AI");
        Employees record72 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record73 = new Employees("Mohit", 50000, "DELHI", "SALES");
        Employees record74 = new Employees("Ojal", 57000, "AGRA", "AI");
        Employees record75 = new Employees("Vandana", 50000, "DELHI", "STEEL");
        Employees record76 = new Employees("Priya", 57000, "PUNE", "STEEL");
        Employees record77 = new Employees("Nishu", 56000, "PUNE", "HR");
        Employees record78 = new Employees("Shivam", 55000, "DELHI", "SALES");
        Employees record79 = new Employees("Mukul", 58000, "MATHURA", "HR");
        Employees record80 = new Employees("Shivani", 54000, "DELHI", "STEEL");

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

    public static void main(String[] args) throws Exception {

        NewHashMap obj = new NewHashMap();

        LinkedHashMap<String, LinkedHashSet<Employees>> data1 = obj.empHashMap();

        //TODO 1.Insert all the Data using Scanner With IBM,TCS,WIPRO and CTS and display employee who is having salary greater than 50,000 and belongs to pune city for IBM and TCS.
        System.out.println("Answer No.1");
        System.out.println(" ");
        System.out.println("Printing all Companies record whose working in Pune and Salary is Greater than 50,000: ");

        Set<String> recordSet = data1.keySet();
        for (String employees : recordSet) {
            System.out.println(" ");
            if (employees.equals("IBM") || employees.equals("TCS")) {
                LinkedHashSet<Employees> companiesRecord = data1.get(employees);
                for (Employees employees1 : companiesRecord) {
                    if (employees1.getEmpSalary() > 50000) {
                        if (employees1.getEmpCity().equals("PUNE")) {
                            System.out.println("Printing IBM and TCS Recoed :" + employees + "|" + "Emp Name is :" + employees1.getEmpName() + "|" + "Emp Salary is :" + employees1.getEmpSalary() + "|" + "Emp City is :" + employees1.getEmpCity() + "|" + "Emp Dept is :" + employees1.getEmpDept());
                        }
                    }
                }
            }
        }
        //TODO 2.Write a method which will find the highest salary employee and lowest salary employee.
        System.out.println("Answer No.2");
        List<Employees> list = new ArrayList<>();
        Employees record61 = new Employees("Jatin", 55000, "AGRA", "AI");
        Employees record62 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record63 = new Employees("Mohit", 50000, "DELHI", "SALES");
        Employees record64 = new Employees("Ojal", 57000, "AGRA", "AI");
        Employees record65 = new Employees("Vandana", 50000, "DELHI", "STEEL");
        Employees record66 = new Employees("Priya", 57000, "PUNE", "STEEL");
        Employees record67 = new Employees("Nishu", 56000, "PUNE", "HR");
        Employees record68 = new Employees("Shivam", 55000, "DELHI", "SALES");
        Employees record69 = new Employees("Mukul", 58000, "MATHURA", "HR");
        Employees record70 = new Employees("Shivani", 54000, "DELHI", "STEEL");
        Employees record71 = new Employees("Jatin", 55000, "AGRA", "AI");
        Employees record72 = new Employees("Raj", 55000, "PUNE", "IT");
        Employees record73 = new Employees("Mohit", 50000, "DELHI", "SALES");
        Employees record74 = new Employees("Ojal", 57000, "AGRA", "AI");
        Employees record75 = new Employees("Vandana", 50000, "DELHI", "STEEL");
        Employees record76 = new Employees("Priya", 57000, "PUNE", "STEEL");
        Employees record77 = new Employees("Nishu", 56000, "PUNE", "HR");
        Employees record78 = new Employees("Shivam", 55000, "DELHI", "SALES");
        Employees record79 = new Employees("Mukul", 58000, "MATHURA", "HR");
        Employees record80 = new Employees("Shivani", 54000, "DELHI", "STEEL");

        list.add(record61);
        list.add(record62);
        list.add(record63);
        list.add(record64);
        list.add(record65);
        list.add(record66);
        list.add(record67);
        list.add(record68);
        list.add(record69);
        list.add(record70);
        list.add(record71);
        list.add(record72);
        list.add(record73);
        list.add(record74);
        list.add(record75);
        list.add(record76);
        list.add(record77);
        list.add(record78);
        list.add(record79);
        list.add(record80);


        double salary = 0;
        Employees max = list.get(0);
        Employees min = list.get(0);
        System.out.println(" ");
        System.out.println("Printing Highest Salary :");
        list.sort((o61, o80) -> 0);
        for (Employees data9 : list) {
            if (data9.EmpSalary > max.EmpSalary) salary = data9.getEmpSalary();

        }
        System.out.println("Highest salary is: " + salary);
        double salary1 = 0;

        System.out.println(" ");
        System.out.println("Printing Lowest Salary :");

        list.sort((o61, o80) -> 0);
        for (Employees data10 : list) {
            if (data10.EmpSalary < min.EmpSalary) salary1 = data10.getEmpSalary();
        }
        System.out.println("Lowest salary is:" + salary1);
        System.out.println(" ");

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
        System.out.println(" ");
        //TODO  4.Display all employee Data who is having same city like Pune all employee Printed,then Agra all employee will be printed so on.
        LinkedHashMap<String, LinkedHashSet<Employees>> data4 = obj.empHashMap();
        Set<String> keys1 = data4.keySet();
        System.out.println("Answer No.4");
        for (String key : keys1) {
            LinkedHashSet<Employees> companiesRecord = data4.get(key);
            System.out.println(" ");
            System.out.println("Printing same City Record");
            System.out.println(" ");

            for (Employees employees : companiesRecord) {
                if ("DELHI".equalsIgnoreCase(employees.getEmpCity())) {
                    System.out.println("Printing DELHI's Record " + key + "|" + employees.getEmpName());
                }
                if ("PUNE".equalsIgnoreCase(employees.getEmpCity())) {
                    System.out.println("Printing PUNE's Record " + key + "|" + employees.getEmpName());

                }
                if ("MATHURA".equalsIgnoreCase(employees.getEmpCity())) {
                    System.out.println("Printing MATHURA's Record " + key + "|" + employees.getEmpName());

                }
                if ("AGRA".equalsIgnoreCase(employees.getEmpCity())) {
                    System.out.println("Printing AGRA's Record " + key + "|" + employees.getEmpName());

                }

            }
        }
    }
}

