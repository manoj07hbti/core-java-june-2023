package Collection.Hashmap;

import java.util.HashMap;

public class HashMapDemo {
    public void CreateHashmap() {
        HashMap<Integer, String> HashMap = new HashMap<>();
        HashMap.put(1, "India");
        HashMap.put(2, "China");
        HashMap.put(3, "Canada");
        HashMap.put(4, "France");
        HashMap.put(5, "Bangladesh");
        HashMap.put(6, "Afghanistan");
        HashMap.put(7, "Australia");
        HashMap.put(8, "United States");
        HashMap.put(9, "Brazil");
        HashMap.put(10, "Cambodia");

        System.out.println("Printing County Name : " + HashMap);


        HashMap.get(1);
        System.out.println(HashMap.get(1));
        HashMap.get(2);
        System.out.println(HashMap.get(2));

        HashMap.get(3);
        System.out.println(HashMap.get(3));

        HashMap.get(4);
        System.out.println(HashMap.get(4));

        HashMap.get(5);
        System.out.println(HashMap.get(5));

        HashMap.get(6);
        System.out.println(HashMap.get(6));

        HashMap.get(7);
        System.out.println(HashMap.get(7));

        HashMap.get(8);
        System.out.println(HashMap.get(8));

        HashMap.get(9);
        System.out.println(HashMap.get(9));

        HashMap.get(10);
        System.out.println(HashMap.get(10));

    }

    public void CreateHashMap2() {
        HashMap<String, String> Map = new HashMap<>();
        Map.put("A", "Tundla");
        Map.put("B", "Agra");
        Map.put("C", "Meerut");
        Map.put("D", "Kanpur");
        Map.put("E", "Delhi");
        Map.put("F", "Pune");
        Map.put("G", "Lucknow");
        Map.put("H", "Allahabad");
        Map.put("I", "Firozabad");
        Map.put("J", "Ghaziabad");
        Map.put("K", "Aligarh");

        System.out.println("Printing City Name : " + Map);

        System.out.println(Map.get("A"));
        System.out.println(Map.get("B"));
        System.out.println(Map.get("C"));
        System.out.println(Map.get("D"));
        System.out.println(Map.get("E"));
        System.out.println(Map.get("F"));
        System.out.println(Map.get("G"));
        System.out.println(Map.get("H"));
        System.out.println(Map.get("I"));
        System.out.println(Map.get("J"));
        System.out.println(Map.get("k"));

    }

    public void CreateHashMap3() {
        HashMap<String, Double> map = new HashMap<>();
        map.put("Employee Ravi's Salary ", 70000.45);
        map.put("Employee Rahul's Salary ", 60000.45);
        map.put("Employee Ramesh's Salary ", 650000.45);
        map.put("Employee Rakesh's Salary ", 71000.45);
        map.put("Employee Ram Prakash's Salary ", 72100.45);
        map.put("Employee Pinki's Salary ", 63000.45);
        map.put("Employee Dev's Salary ", 75000.45);
        map.put("Employee Sachin's Salary ", 74000.45);
        map.put("Employee Mohit's Salary ", 71000.45);
        map.put("Employee Mathur's Salary ", 50000.45);
        map.put("Employee Devendra's Salary ", 78000.45);

        System.out.println("Employee Salary With Name : " + map);

        System.out.println(map.get("Employee Ravi's Salary "));
        System.out.println(map.get("Employee Rahul's Salary "));
        System.out.println(map.get("Employee Ramesh's Salary "));
        System.out.println(map.get("Employee Rakesh's Salary "));
        System.out.println(map.get("Employee Ram Prakash's Salary "));
        System.out.println(map.get("Employee Pinki's Salary "));
        System.out.println(map.get("Employee Dev's Salary "));
        System.out.println(map.get("Employee Sachin's Salary "));
        System.out.println(map.get("Employee Mohit's Salary "));
        System.out.println(map.get("Employee Mathur's Salary "));
        System.out.println(map.get("Employee Devendra's Salary "));


    }


    public static void main(String[] args) {
        HashMapDemo obj = new HashMapDemo();
        obj.CreateHashmap();
        obj.CreateHashMap2();
        obj.CreateHashMap3();
    }
}
