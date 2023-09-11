package Collection.hashset;

import java.util.HashSet;

public class Employee_hashset {

    public HashSet<String> StringList(){

        HashSet<String>name=new HashSet<>();
        name.add("vijay");
        name.add("manoj");
        name.add("anil");
        name.add("kapil");
        name.add("rohan");
        name.add("raman");
        name.add("deepak");
        name.add("vijay");
        name.add("kapil");

        return name;
    }

    public HashSet<Integer> integersList(){

        HashSet<Integer>batchNo=new HashSet<>();
        batchNo.add(908);
        batchNo.add(905);
        batchNo.add(780);
        batchNo.add(658);
        batchNo.add(765);
        batchNo.add(430);
        batchNo.add(210);
        batchNo.add(100);
        batchNo.add(908);
        batchNo.add(780);

        return batchNo;
    }

    public HashSet<Double> doublesList(){

        HashSet<Double>salary=new HashSet<>();
        salary.add(9087.9);
        salary.add(769.9);
        salary.add(897.0);
        salary.add(760.9);
        salary.add(9087.4);
        salary.add(650.9);
        salary.add(432.5);
        salary.add(324.7);
        salary.add(9087.9);

        return salary;
    }

    public static void main(String[] args) {
        Demo_hashset obj=new Demo_hashset();
        HashSet<String>name=obj.createStringSet();
        HashSet<Integer>batchNo=obj.IntegerList();
        HashSet<Double>salary=obj.DoubleList();

        int i=0;
        for (String var:name){
            System.out.println("printing name data:"+var+" at Index"+i);
            i++;
        }
        int t=0;
        for (Integer var:batchNo){
            System.out.println("printing batch data:"+var+" at Index"+t);
            t++;
        }
        int g=0;
        for (double var:salary){
            System.out.println("printing salary data:"+var+"at Index"+g);
        }
    }



}
