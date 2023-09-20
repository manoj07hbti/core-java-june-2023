package collection.hashmap;

import java.util.HashMap;


public class DemoHashMap {

    public void createMap(){

        //SYNTAX: HashMap <DataType_Key, DataType_Value> objName= new HashMap();

        HashMap <Integer,String> map= new HashMap<>();

        //adding data to map
        map.put(11,"Core Java");
        map.put(22,"Advance Java");
        map.put(33,"Spring");
        map.put(44,"Spring Boot");
        map.put(55,"Microservices");

        System.out.println(map);

        // reading data from Map

        System.out.println("Printing data "+map.get(33));
        System.out.println("Printing data "+map.get(55));

        // adding duplicate key to map
        map.put(33,"Spring framework.....");

        System.out.println("Printing data after using duplicate key "+map.get(33));

        map.put(null,"Beginner...");
        map.put(null,"Programmer...");

        System.out.println("Printing mad with null key :"+map);
    }

    public void createAnotherMap(){

        HashMap<String,String> hashMap= new HashMap<>();

        hashMap.put("A","Lenovo");
        hashMap.put("B","Dell");
        hashMap.put("C","Sony");
        hashMap.put(null,"IBM");
        hashMap.put(null,"IBM ISL");

        System.out.println(hashMap);

    }



    public static void main(String[] args) {
        DemoHashMap obj= new DemoHashMap();
        obj.createMap();
        obj.createAnotherMap();
    }

}
