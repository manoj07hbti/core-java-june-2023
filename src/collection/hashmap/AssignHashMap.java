package collection.hashmap;

import java.util.HashMap;

public class AssignHashMap {

    public HashMap<Integer,String> createIntegerStringHashMap()
    {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Cherry");
        map.put(4,"Gave");

        System.out.println("Printing map"+map);

        return map;
    }

    public HashMap<String,String>  createStringsHashMap()
    {
        HashMap<String,String> map1=new HashMap<>();
        map1.put("A21","Ashwini");
        map1.put("A22","Shreya");
        map1.put("A23","Sangita");
        map1.put("A24","Rutuja");

        map1.put("A24","Suruchi");

        System.out.println(map1);
        return map1;
    }

    public HashMap<String,Double>createStringDoubleHashMap(){
        HashMap<String,Double> map2=new HashMap<>();
        map2.put("A21",52000.52);
        map2.put("A22",65000.52);
        map2.put("A23",89256.52);
        map2.put("A24",100000.65);
        System.out.println(map2);
        map2.put(null,986325.25);
        System.out.println(map2);
        map2.put(null,87523.25);
        System.out.println(map2);
        return map2;
    }
    public static void main(String[] args) {
        AssignHashMap obj=new AssignHashMap();
        HashMap<Integer,String> map=obj.createIntegerStringHashMap();
        HashMap<String,String> map1=obj.createStringsHashMap();
        HashMap<String,Double> map2=obj.createStringDoubleHashMap();


    }

    public void createEmployeeData() {
    }
}
