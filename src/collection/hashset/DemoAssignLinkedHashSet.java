package collection.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoAssignLinkedHashSet {

    public LinkedHashSet<String> createStringLinkedHashSet()
    {
        LinkedHashSet<String> set=new LinkedHashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Spring Boot") ;
        set.add("Microservices");
        return set;
    }
    public HashSet<String> createHashSet() {
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Spring");
        set.add("Spring Boot");
        set.add("Microservices");
        return set;
    }

    public  LinkedHashSet<Integer> createIntegerLinkedHashSet()
    {
        LinkedHashSet<Integer> intSet=new LinkedHashSet<>();
        intSet.add(1);
        intSet.add(2);
        intSet.add(1);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(2);


        return intSet;
    }


    public  LinkedHashSet<Double> createDoubleLinkedHashSet()
    {
        LinkedHashSet<Double> doubleSet=new LinkedHashSet<>();
        doubleSet.add(1.5);
        doubleSet.add(2.5);
        doubleSet.add(1.5);
        doubleSet.add(3.5);
        doubleSet.add(4.5);
        doubleSet.add(5.5);
        doubleSet.add(2.5);


        return doubleSet;
    }

    public static void main(String[] args) {
        DemoAssignLinkedHashSet obj=new DemoAssignLinkedHashSet();
        System.out.println();
        System.out.println("............String linked HashSet.........");
        LinkedHashSet<String> stringLinkedHashSet=obj.createStringLinkedHashSet();
        for (String var:stringLinkedHashSet)
        {
            System.out.println("Printing String linked hashset "+var);
        }
        System.out.println();
        System.out.println("............String HashSet.........");
        HashSet<String> stringHashSet=obj.createHashSet();
        for (String var: stringHashSet)
        {
            System.out.println("Printing String  hashset "+var);
        }
        System.out.println();
        System.out.println("............Integer linked HashSet.........");
        LinkedHashSet<Integer> integerLinkedHashSet=obj.createIntegerLinkedHashSet();
        for (Integer var:integerLinkedHashSet)
        {
            System.out.println("Printing Integer hashSet "+var);
        }
        System.out.println();
        System.out.println("............Double linked HashSet.........");
        LinkedHashSet<Double> doubleLinkedHashSet=obj.createDoubleLinkedHashSet();
        for (Double var:doubleLinkedHashSet)
        {
            System.out.println("Printing Double hashSet "+var);
        }

    }

}
