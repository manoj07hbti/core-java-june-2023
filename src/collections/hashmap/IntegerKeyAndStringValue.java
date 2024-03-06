package collections.hashmap;

import java.security.spec.PKCS8EncodedKeySpec;
import java.util.HashMap;
import java.util.Set;

public class IntegerKeyAndStringValue {

    //SYNTAX: HashMap <DataType_Key, DataType_Value> objName= new HashMap();

    // WE WILL CREATE METHOD ...................
    public <set> void createMapValue(){

        // WE WILL CREATE OBJECT..........

        HashMap<Integer,String> map = new HashMap<>();

        //adding data to map

        map.put(1,"Ram");
        map.put(2,"Shyam");
        map.put(3,"Meera");
        map.put(4,"Kunal");
        map.put(5,"Rita");
        map.put(6,"Nancy");
        map.put(7,"Neelam");
        map.put(8,"Kartik");
        map.put(9,"Monty");
        map.put(10,"Rahul");

       // READING VALUE FROM MAP : MAP.GET(KEY) ......................

        System.out.println("Printing Map Data " + map.get(6));



        // HOW TO ITERATE OR TRAVERSE HASHMAP.........
       // USE IN FOR LOOP IN HASHMAP...............
       // WE CAN ALL KEY SEARCH : MAP .KEY SET();

        Set<Integer> keys = map.keySet();

        for (Integer var :keys){
            System.out.println("Printing Map Using Loop : " + map.get(var));
        }

       //*******************************************************************************************************

        //  MAP . REMOVE (KEY)

        map.remove(4);

        for (Integer var : keys){

            System.out.println("Printing Map Using Loop : " + map.get(var));

        }
    }

    public static void main(String[] args) {
        IntegerKeyAndStringValue obj = new IntegerKeyAndStringValue();
        obj.createMapValue();

    }

}
