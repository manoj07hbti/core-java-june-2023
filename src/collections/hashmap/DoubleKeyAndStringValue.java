package collections.hashmap;

import java.util.HashMap;
import java.util.Set;

public class DoubleKeyAndStringValue {

    //SYNTAX: HashMap <DataType_Key, DataType_Value> objName= new HashMap();

    public void createMapValue(){

        HashMap<Double,String> percent = new HashMap<>();

        //adding data to map.......
        percent.put(80.00,"Hindi");
        percent.put(95.00,"English");
        percent.put(75.00,"Mathe");
        percent.put(79.00,"Science");
        percent.put(78.00,"Social Science");
        percent.put(98.00,"Drawing");
        percent.put(null,"GK");

        // READING VALUE FROM MAP................................

        System.out.println("Printing HighSchool Result " + percent.get(95.00));

        // HOW TO ITERATE OR TRAVERSE HASHMAP.........
        // USE IN FOR LOOP IN HASHMAP...............
        // WE CAN ALL KEY SEARCH : MAP .KEY SET();

        Set<Double> keys = percent.keySet();
        for (Double var :keys){

            System.out.println(" Printing HighSchool Result " + percent.get(var));
        }
    }

    public static void main(String[] args) {
        DoubleKeyAndStringValue obj = new DoubleKeyAndStringValue();
        obj.createMapValue();
    }
}
