package Hashmap;

import java.util.HashMap;

public class DemoHashMap {

    public void createDemoHashMap() {

        HashMap<String, Integer> map = new HashMap<>();

        // Insertion :

        map.put("Petrol", 100);
        map.put("Tomato", 80);
        map.put("Oil", 120);

        System.out.println("  Price  :" + map);



        System.out.println("Printing fuel Price is  :" + map.get("Petrol"));

        System.out.println("Printing vegetable Price is  :" + map.get("Tomato"));

        System.out.println("Printing mustard oil Price is  :" + map.get("Oil"));


        // new price of petrol & oil :

        map.put("Petrol", 120);

        System.out.println(" new price of petrol :" + map);

        map.put("Tomato", 90);

        System.out.println(" new price of vegetable  :" + map);
    }

    public void createDemoHashMap2() {

        HashMap<String, String> Map = new HashMap<>();

        Map.put("UttarPradesh", "75 districts");

        Map.put("Bihar", "38 districts ");

        Map.put("Rajasthan", " 50 districts");

        System.out.println("Printing State Population are : " + Map);

        System.out.println(" Printing UttarPradesh Districts are : " + Map.get("UttarPradesh"));
        System.out.println(" Printing Bihar Districts are : " + Map.get("Bihar"));
        System.out.println(" Printing Rajasthan Districts are : " + Map.get("Bihar"));

        // update India population


        Map.put(" UttarPradesh ", " 76 districts ");
        System.out.println("update UttarPradesh Districts are : " + Map);
        // update China population
        Map.put("Bihar ", " 30 districts ");
        System.out.println("update Bihar  Districts are : " + Map);
    }

    public void createDemoHashMap3() {

        HashMap<Double, String> Employee = new HashMap<>();

        // Inserting Employee Name and Employee Work experience :

        Employee.put(3.1, "Manvi");

        Employee.put(3.4, "Ambika");

        Employee.put(4.1, "Janvi");

        System.out.println("Printing Employee Name  and Work Experience : " + Employee);

        // Update Details :

        Employee.put(3.1, "Manvi");
        System.out.println("update Employee : " + Employee);

        Employee.put(3.4, "Ambika");
        System.out.println("update Employee : " + Employee);

        Employee.put(4.1, "Janvi");
        System.out.println("update Employee :" + Employee);


    }

    public static void main(String[] args) {

        DemoHashMap obj = new DemoHashMap();

        obj.createDemoHashMap();
        obj.createDemoHashMap2();
        obj.createDemoHashMap3();

    }
}
