package Collection.Hashmap;

import java.util.HashMap;

public class HashMap2 {
    public void CreateHashmap() {
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put(" CNG ", 70);
        map.put(" Petrol ", 100);
        map.put(" Diesel ", 80);
        System.out.println(" Price  : " + map);

        System.out.println("Printing  Fuel Price is : " + map.get(" CNG "));
        System.out.println("Printing  Fuel Price is : " + map.get(" Petrol "));
        System.out.println("Printing Fuel Price is : " + map.get(" Diesel "));


        // update price of Petrol
        map.put(" Petrol ", 110);
        System.out.println(" update Price of Petrol : " + map);
        // update price of CNG
        map.put("CNG ", 75);
        System.out.println(" update Price of CNG : " + map);

    }

    public void CreateHashMap2() {
        HashMap<String, String> Map = new HashMap<>();
        Map.put("India ", " 130 Cr");
        Map.put("China ", " 160 Cr");
        Map.put(" USA ", "  50 Cr");
        System.out.println("Printing Country Population are : " + Map);

        System.out.println(" Printing India Population are : " + Map.get("India "));
        System.out.println(" Printing China Population are : " + Map.get("China "));
        System.out.println(" Printing USA Population are : " + Map.get(" USA "));


        // update India population
        Map.put("India ", " 140 Cr ");
        System.out.println("update India population are : " + Map);
        // update China population
        Map.put("China ", " 180 Cr ");
        System.out.println("update China population are : " + Map);

    }

    public void CreateHashMap3() {
        HashMap<Integer, String> Student = new HashMap<>();
        // Inserting Student Roll Number and Student Name :
        Student.put(101, "RaviKant Singh");
        Student.put(102, "Manoj Singh");
        Student.put(103, "Rahul Singh");
        Student.put(104, "Rakesh Singh");
        Student.put(105, "Mohan Singh");
        Student.put(106, "Mathur Singh");
        Student.put(107, "Shatyveer Singh");
        Student.put(108, "Mohit Singh");
        Student.put(109, "Bhanu Pratap Singh");
        Student.put(110, "ravi Singh");
        Student.put(111, "RaviKant Singh");
        System.out.println("Printing Student Roll number and Name : " + Student);
        // update student
        Student.put(101, "Manoj Singh");
        System.out.println("update student : " + Student);
        Student.put(108, "Shiv kumar");
        System.out.println("update student : " + Student);
        System.out.println(Student.get(101));
        System.out.println(Student.get(102));
        System.out.println(Student.get(103));
        System.out.println(Student.get(104));
        System.out.println(Student.get(105));
        System.out.println(Student.get(106));
        System.out.println(Student.get(107));
        System.out.println(Student.get(108));
        System.out.println(Student.get(109));
        System.out.println(Student.get(110));
        System.out.println(Student.get(111));

    }

    public static void main(String[] args) {
        HashMap2 obj = new HashMap2();
        obj.CreateHashmap();
        obj.CreateHashMap2();
        obj.CreateHashMap3();

    }
}
