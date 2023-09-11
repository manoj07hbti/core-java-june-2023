package collection;

import java.util.HashSet;

public class HashSet_Employee {

    public HashSet<String> StringList() {

        HashSet<String> name = new HashSet<>();

        name.add("Somya");
        name.add("Ranu");
        name.add("Kunal");
        name.add("Divi");
        name.add("Somya");
        name.add("Ranu");
        name.add("Kunal");
        name.add("Divi");


        return name;

    }

    public HashSet<Integer> IntegerList() {

        HashSet<Integer> batchNo = new HashSet<>();


        batchNo.add(23);
        batchNo.add(75);
        batchNo.add(87);
        batchNo.add(45);
        batchNo.add(23);
        batchNo.add(75);
        batchNo.add(87);
        batchNo.add(45);

        return batchNo;

    }

    public HashSet<Double> doublesList() {

        HashSet<Double> salary = new HashSet<>();
        salary.add(7865.9);
        salary.add(4574.9);
        salary.add(8977.0);
        salary.add(6543.9);
        salary.add(7865.9);
        salary.add(4574.9);
        salary.add(8977.0);
        salary.add(6543.9);

        return salary;
    }

    public static void main(String[] args) {

        HashSet_Employee obj = new HashSet_Employee();

        HashSet<String> name = obj.StringList();
        HashSet<Integer> batchNo = obj.IntegerList();
        HashSet<Double> salary = obj.doublesList();

        int i = 0;
        for (String var : name) {
            System.out.println("printing name data:" + var + " at Index" + i);
            i++;
        }
        int t = 0;
        for (Integer var : batchNo) {
            System.out.println("printing batch data:" + var + " at Index" + t);
            t++;
        }
        int k = 0;
        for (double var : salary) {
            System.out.println("printing salary data:" + var + "at Index" + k);

        }
    }
}



