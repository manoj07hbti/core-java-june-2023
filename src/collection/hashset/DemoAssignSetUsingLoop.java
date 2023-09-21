package collection.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoAssignSetUsingLoop {
    public LinkedHashSet<String> hashSetUsingLoop() {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Pineapple");

        // Convert the HashSet to an array for indexed access
        String[] elementsArray = set.toArray(new String[0]);

        // Using a while loop to print elements
        System.out.println("Using while loop:");
        int i = 0;
        while (i < elementsArray.length) {
            System.out.println(elementsArray[i]);
            i++;
        }
        System.out.println();
        System.out.println("Using do while loop:");
        i=0;
        do {
            System.out.println(elementsArray[i]);
            i++;
        }while (i< elementsArray.length);
        System.out.println();
        System.out.println("Using for loop:");
        //using for loop
        for (i=0;i< elementsArray.length;i++)
        {
            System.out.println(elementsArray[i]);
        }

        return set;
    }

    public LinkedHashSet<Integer> integerHashSetUsingLoop() {
        System.out.println();
        LinkedHashSet<Integer> intSet = new LinkedHashSet<>();
        intSet.add(25);
        intSet.add(85);
        intSet.add(78);
        intSet.add(45);

        // Convert the HashSet to an array for indexed access
        Integer[] elementsIntegerArray = intSet.toArray(new Integer[0]);

        // Using a while loop to print elements
        System.out.println("Using while loop:");
        int i = 0;
        while (i < elementsIntegerArray.length) {
            System.out.println(elementsIntegerArray[i]);
            i++;
        }
        System.out.println();
        System.out.println("Using do while loop:");
        i=0;
        do {
            System.out.println(elementsIntegerArray[i]);
            i++;
        }while (i< elementsIntegerArray.length);
        System.out.println();
        System.out.println("Using for loop:");
        //using for loop
        for (i=0;i< elementsIntegerArray.length;i++)
        {
            System.out.println(elementsIntegerArray[i]);
        }


        return intSet;
    }

    public LinkedHashSet<Double> doubleHashSetUsingLoop()
    {
        LinkedHashSet<Double> doubleSet=new LinkedHashSet<>();
        doubleSet.add(78236.52);
        doubleSet.add(753642.52);
        doubleSet.add(951478.65);
        doubleSet.add(741025.42);

        //convert array
        Double[] doubles=doubleSet.toArray(new Double[0]);
        System.out.println("Using while loop:");
        int i = 0;
        while (i < doubles.length) {
            System.out.println(doubles[i]);
            i++;
        }
        System.out.println();
        System.out.println("Using do while loop:");
        i=0;
        do {
            System.out.println(doubles[i]);
            i++;
        }while (i< doubles.length);
        System.out.println();
        System.out.println("Using for loop:");
        //using for loop
        for (i=0;i< doubles.length;i++)
        {
            System.out.println(doubles[i]);
        }
        return doubleSet;
    }

    public static void main(String[] args) {
        DemoAssignSetUsingLoop obj = new DemoAssignSetUsingLoop();
        LinkedHashSet<String> stringHashSet = obj.hashSetUsingLoop();
        LinkedHashSet<Integer> integerLinkedHashSet = obj.integerHashSetUsingLoop();
        LinkedHashSet<Double> doubleLinkedHashSet = obj.doubleHashSetUsingLoop();


    }
}
