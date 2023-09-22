package collection.hashmap;

import java.util.HashMap;
import java.util.Set;


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

        //PRINTING ALL ELEMENTS OF HASHMAP
        Set<Integer> keys= map.keySet(); // it will return all keys of hashmap in form of Set

        for(Integer key: keys){

            System.out.println("Printing Map using Keys :"+map.get(key));
        }

    }

    public void createAnotherMap(){

        HashMap<String,String> hashMap= new HashMap<>();

        hashMap.put("A","Lenovo");
        hashMap.put("B","Dell");
        hashMap.put("C","Sony");
        hashMap.put(null,"IBM");
        hashMap.put(null,"IBM ISL");

        System.out.println(hashMap);

        Set <String> keys=hashMap.keySet();

        for(String key: keys){

            System.out.println("Printing String Map: "+hashMap.get(key));
        }

    }



    public static void main(String[] args) {
        DemoHashMap obj= new DemoHashMap();
        obj.createMap();
        obj.createAnotherMap();
    }

}
