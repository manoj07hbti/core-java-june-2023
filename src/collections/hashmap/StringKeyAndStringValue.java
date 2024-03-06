package collections.hashmap;

import java.util.HashMap;
import java.util.Set;

public class StringKeyAndStringValue {

    //SYNTAX: HashMap <DataType_Key, DataType_Value> objName= new HashMap();

    public void createMapValue(){

        HashMap<String,String> map = new HashMap<>();

        //adding data to map.......

        map.put("A","Rohit Sharma");
        map.put("B","Virat kohli");
        map.put("C","Kl Rahul");
        map.put("D","Ishan Kishan");
        map.put("E","Suman Gill");
        map.put("F","Hardik Pandiya");
        map.put("G","Surya kumar Yadav");
        map.put("H","Bumrah");
        map.put("I","Mohamad Sami");
        map.put("J","Kuldip Yadav");
        map.put("K","Mohamad Siraj");
        map.put("M","Shardul Thakur");

        // READING VALUE FROM MAP................................

        System.out.println(map);

        //************************************************************************************

        // HOW TO ITERATE OR TRAVERSE HASHMAP.........
        // USE IN FOR LOOP IN HASHMAP...............
        // WE CAN ALL KEY SEARCH : MAP .KEY SET();

        Set<String> keys = map.keySet();
        for (String var : keys){
            System.out.println("Printing Using Loop Team India : " + map.get(var));


        }


    }

    public static void main(String[] args) {
        StringKeyAndStringValue obj = new StringKeyAndStringValue();
        obj.createMapValue();
    }
}
