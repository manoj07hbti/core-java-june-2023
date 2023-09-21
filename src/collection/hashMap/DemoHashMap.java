package collection.hashMap;

import java.util.HashMap;

public class DemoHashMap {

    public void CreatMap() {

        HashMap<Integer, String> map = new HashMap();

        map.put(1, "UDAY");
        map.put(2, "IMRAN");
        map.put(3, "REJI");
        map.put(4, "SANJAY");
        map.put(5, "SANDEEP");
        map.put(6, "CHANDAN");
        map.put(7, "NILESH");
        map.put(8, "SUMIT");
        map.put(9, "CHOLE");
        map.put(10, "SHARIQE");
        map.put(11, "SANTOSH");
        map.put(12, "RUPESH");
        map.put(13, "RESHMA");
        map.put(14, "SUJA");

        System.out.println(map);

        System.out.println("Print value : " + map.get(11));
        System.out.println("Print value : " + map.get(9));

        // using duplicate key

        map.put(14, "SUPRIYA");

        System.out.println("Pint data after replacing data :  " + map.get(14));

        map.put(null, "RAHUL");
        map.put(null, "SANJU");

        System.out.println("Printing data after using null value : " + map.get(null));
        System.out.println(" ");
        System.out.println("Print after data manage value : " + map);
    }


    public void AnotherData() {

        HashMap<String, String> FruitMap = new HashMap<>();

        System.out.println(" ");
        System.out.println("Printing fruit and vegetable name ");
        System.out.println("  ");

        FruitMap.put("A", "APPLE");
        FruitMap.put("B", "ORANGE");
        FruitMap.put("C", "MANGO");
        FruitMap.put("D", "GAV AVA");
        FruitMap.put("E", "BANANA");
        FruitMap.put("F", "PINEAPPLE");
        FruitMap.put("G", "CURRY");
        FruitMap.put("H", "JUNK FRUIT");
        FruitMap.put("I", "POTATO");
        FruitMap.put("J", "TOMATO");

        System.out.println("Printing value " + FruitMap);

        FruitMap.put(null, "GARLIC");
        FruitMap.put("I", "WATERMELON");

        System.out.println(" ");
        System.out.println("Print value after replacing value : " + FruitMap);


    }

    public void Salary() {

        HashMap<String, Double> Salarymap = new HashMap<>();
        Salarymap.put("AMIT", 34000.87);
        Salarymap.put("UDAY", 42000.76);
        Salarymap.put("MRAN", 55000.45);
        Salarymap.put("RAKESH", 16000.34);
        Salarymap.put("RAMESH", 24000.32);
        Salarymap.put("PRAKASH", 3400.98);
        Salarymap.put("ASHUTOSH", 50000.45);
        Salarymap.put("ANAND", 34000.97);
        Salarymap.put("SUJEET", 42000.54);
        Salarymap.put("JITENDRA", 18000.98);
        Salarymap.put("RITIK", 20000.45);
        Salarymap.put("CHANDAN", 23000.43);
        Salarymap.put("SANJAY", 31000.655);
        Salarymap.put("DR NASSER", 250000.96);
        Salarymap.put("DR NILESH", 120000.54);

        System.out.println(" ");
        System.out.println("Print data salary : " + Salarymap);

        Salarymap.put("DR NILESH", 95000.98);
        Salarymap.put(null, 45600.76);

        System.out.println("  ");
        System.out.println("Print value after exchange data : " + Salarymap);
        System.out.println("Print Data for ech loops ");
        for (int i = 0; i < Salarymap.size(); i++) {


        }
    }

    public static void main(String[] args) {

        DemoHashMap obj = new DemoHashMap();
        obj.CreatMap();
        obj.AnotherData();
        obj.Salary();
    }

}
