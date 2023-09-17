package Collection.hashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public LinkedHashSet<Integer> IntegerValue() {
        LinkedHashSet<Integer> Int = new LinkedHashSet<>();
        Int.add(12);
        Int.add(13);
        Int.add(14);
        Int.add(15);
        Int.add(16);
        Int.add(17);
        Int.add(18);
        return Int;
    }

    public LinkedHashSet<Double> DoubleValue() {
        LinkedHashSet<Double> DoubleSet = new LinkedHashSet<>();
        DoubleSet.add(2000.89);
        DoubleSet.add(3000.80);
        DoubleSet.add(4000.87);
        DoubleSet.add(5000.81);
        DoubleSet.add(6000.84);
        DoubleSet.add(7000.81);
        DoubleSet.add(6000.67);
        return DoubleSet;


    }

    public LinkedHashSet<String> StringSet() {
        LinkedHashSet<String> StringData = new LinkedHashSet<>();
        StringData.add("Ravi");
        StringData.add("Shiv");
        StringData.add("Rahul");
        StringData.add("Sachin");
        StringData.add("Shahul");
        StringData.add("Rahul Kumar");
        return StringData;


    }

    public static void main(String[] args) {
        LinkedHashSetDemo obj = new LinkedHashSetDemo();
        LinkedHashSet<Integer> Integers = obj.IntegerValue();
        for (Integer var : Integers) {
            System.out.println("Printing Integer Value : " + Integers);
        }
        LinkedHashSet<Double> Doubles = obj.DoubleValue();
        for (Double var : Doubles) {
            System.out.println("Printing Double Values are : " + Doubles);

        }
        LinkedHashSet<String> Result = obj.StringSet();
        for (String var : Result) {
            System.out.println("Printing String Data : " + var);
        }
    }
}
