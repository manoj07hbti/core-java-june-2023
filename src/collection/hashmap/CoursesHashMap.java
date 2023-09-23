package collection.hashmap;

import javax.swing.*;
import java.util.HashMap;

public class CoursesHashMap {

    public void createHashMap() {

        HashMap<Integer, String> data = new HashMap<>();
        data.put(1, "Java");
        data.put(2, "Advance Java");
        data.put(3, "Spring");
        data.put(4, "SpringBoot");
        data.put(5, "Microservices");


        System.out.println(data);

        System.out.println("Printing Data " + data.get(1));
        System.out.println("Printing Data " + data.get(2));
        System.out.println("Printing Data " + data.get(3));
        System.out.println("Printing Data " + data.get(4));
        System.out.println("Printing Data " + data.get(5));


        System.out.println(" ");
        data.put(3,"Spring Framework.......");
        System.out.println("Printing Data after using Duplicate Key " + data.get(3));

        System.out.println(" ");
        data.put(null,"Beginner");

        System.out.println("Printing with null>>> "+data);
        data.put(null,"Programmer");
        System.out.println(" ");
        System.out.println("Printing with null... "+data);

    }

    public static void main(String[] args) {
        CoursesHashMap obj = new CoursesHashMap();
        obj.createHashMap();
    }
}
