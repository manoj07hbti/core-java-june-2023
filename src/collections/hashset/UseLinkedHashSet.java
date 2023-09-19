package collections.hashset;

import java.util.LinkedHashSet;

public class UseLinkedHashSet {

    // WE WILL CREATE METHOD OF STRING.............

    public  LinkedHashSet<String> createValue(){

    // WE WILL CREATE OBJECT.......

        LinkedHashSet<String>Value = new LinkedHashSet<>();
        Value.add("Kiran Sharma");
        Value.add("Nancy ");
        Value.add("Manoj Jain");
        Value.add("Kajal");
        Value.add("Mona Sharma ");
        Value.add("Surya");
        Value.add("Kuldeep ");
        Value.add("Sameer");
        Value.add("Radha ");

      // NOW WE WILL RETURN THE DATA......
      return Value;

    }

    public  LinkedHashSet<Integer>  CreateNumber(){

        LinkedHashSet<Integer>Num = new LinkedHashSet<>();
        Num.add(68521);
        Num.add(68522);
        Num.add(68523);
        Num.add(68524);
        Num.add(68525);
        Num.add(68526);
        Num.add(68527);
        Num.add(68528);
        Num.add(68529);
        Num.add(68530);

        return Num;


    }

    public   LinkedHashSet<Double> CreateDoubleValue(){

        LinkedHashSet<Double>PointValue = new LinkedHashSet<>();
        PointValue.add(9639.10);
        PointValue.add(9640.11);
        PointValue.add(9641.12);
        PointValue.add(9642.13);
        PointValue.add(9643.14);
        PointValue.add(9644.15);
        PointValue.add(9645.16);
        PointValue.add(9646.17);
        PointValue.add(9647.18);

        return PointValue;

    }

    public static void main(String[] args) {

        UseLinkedHashSet obj = new UseLinkedHashSet();

         LinkedHashSet<String> result  = obj.createValue();

         for (String var :result){

             System.out.println("Printing Advance for loop Sting " + var);
         }

         LinkedHashSet<Integer> Int = obj.CreateNumber();

         for (Integer var : Int){

             System.out.println("Printing Advance for Loop Integer "+ var);
         }

         LinkedHashSet<Double> Doubles = obj.CreateDoubleValue();

         for (Double var : Doubles){

             System.out.println("Printing Advance for Loop Doubles "+ var);
         }


    }

}
