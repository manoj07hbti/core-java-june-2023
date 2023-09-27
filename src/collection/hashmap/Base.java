package collection.hashmap;

import java.util.LinkedHashMap;

public class Base {
    public void makeSimpleMap() {

        LinkedHashMap<String, Integer> contentUpdate = new LinkedHashMap<>();
//inset
        System.out.println("Company Price :");
        contentUpdate.put("ADIDAS", 50000);
        contentUpdate.put("PUMA", 60000);
        contentUpdate.put("NIKE", null);
//print
        System.out.println("Price :" + contentUpdate);
        System.out.println(" ");
        System.out.println("Company Price :");

        System.out.println("ADIDAS Price is :" + contentUpdate.get("ADIDAS"));
        System.out.println("PUMA Price is :" + contentUpdate.get("PUMA"));
        System.out.println("NIKE Price is :" + contentUpdate.get("NIKE"));
//update
        System.out.println(" ");
        System.out.println("Update Price :");
        contentUpdate.put("ADIDAS", 55000);
        contentUpdate.put("PUMA", 65000);
//print
        System.out.println("Update Price of ADIDAS is :" + contentUpdate.get("ADIDAS"));
        System.out.println("Update Price of PUMA is :" + contentUpdate.get("PUMA"));
    }

    public static void main(String[] args) {
        Base obj = new Base();
        obj.makeSimpleMap();
    }
}
