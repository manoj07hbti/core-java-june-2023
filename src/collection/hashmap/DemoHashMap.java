package collection.hashmap;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {

    public void createMap(){

        // SYNTAX: HashMap <DataType_Integer, DataType_String> = new Hashmap();

        HashMap<Integer,String> map = new HashMap<>();
        // Adding data to map


        map.put(2,"Monday");
        map.put(3,"Tuesday");
        map.put(4,"Wednesday");
        map.put(5,"Thursday");
        map.put(6,"Friday");
        map.put(7,"Saturday");
        map.put(null,"Sunday");



        System.out.println(map);

        //reading data from map:

        System.out.println(" Printing data 2: "+map.get(2));
        System.out.println(" Printing data 3: "+map.get(3));
        System.out.println(" Printing data 4: "+map.get(4));
        System.out.println(" Printing data 5: "+map.get(5));
        System.out.println(" Printing data 6: "+map.get(6));
        System.out.println(" Printing data 7: "+map.get(7));
        System.out.println(" Printing data 1: "+map.get(null));

    }
    public void createAnotherMap() {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put (" Rakhi","SC" );
        hashMap.put(" Arti ","MC");
        hashMap.put( "Preeti","SC");
        hashMap.put( "Rohan","CS");
       hashMap.put ( "Arjun","BC");
        hashMap.put( "Prem","IIT");
        hashMap.put( "Rahul","ITI");
        hashMap.put( "Arjeet","MSC");
        hashMap.put( "Kamal","ART");
        hashMap.put( "Ansh","CP");


        System.out.println(hashMap);

    }
    public void createMap1(){
        HashMap<String,Double> map = new HashMap<>();

        map.put("Five Star-chocolate ",55.6);
        map.put("Silk-chocolate",150.50);
        map.put("Kit-Kat-chocolate ",160.50);
        map.put("Hershey-chocolate ",50.5);
        map.put("DairyMilk-chocolate ",40.5);
        map.put("Nestle-chocolate ",200.50);
        map.put("Dark-chocolate ",250.50);

        System.out.println(map);
    }
    public static void main(String [] args ){

        DemoHashMap Obj = new DemoHashMap();
        Obj.createMap();
        Obj.createAnotherMap();
        Obj.createMap1();
    }
}
