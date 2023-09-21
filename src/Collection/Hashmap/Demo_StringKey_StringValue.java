package Collection.Hashmap;

import java.util.HashMap;

public class Demo_StringKey_StringValue {

    public void CreateList(){
        HashMap<String,String>CapitalCities=new HashMap<>();

        CapitalCities.put("A","Oslo");
        CapitalCities.put("B","Delhi");
        CapitalCities.put("C","Colombo");
        CapitalCities.put("D","Moscow");
        CapitalCities.put("E","Islamabad");
        CapitalCities.put("F","Dhaka");
        CapitalCities.put("G","canberra");
        CapitalCities.put("H","Auckland");
        CapitalCities.put("I","Paris");
        CapitalCities.put("J","Munich");

        System.out.println("printing country capital"+CapitalCities);

     System.out.println(CapitalCities.get("A"));
        System.out.println(CapitalCities.get("B"));
        System.out.println(CapitalCities.get("C"));
        System.out.println(CapitalCities.get("D"));
        System.out.println(CapitalCities.get("E"));
        System.out.println(CapitalCities.get("F"));
        System.out.println(CapitalCities.get("G"));
        System.out.println(CapitalCities.get("H"));
        System.out.println(CapitalCities.get("I"));
        System.out.println(CapitalCities.get("J"));

    }

    public static void main(String[] args) {
        Demo_StringKey_StringValue obj=new Demo_StringKey_StringValue();
        obj.CreateList();
    }


}
