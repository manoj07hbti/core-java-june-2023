package cllection.hashset;

import java.time.Year;
import java.util.HashSet;

public class MyHashSet {
    public HashSet <String> createStringSet(){
        HashSet <String> company = new HashSet<>();
        company.add("Radmi");
        company.add("MI");
        company.add("Nokia");
        company.add("Moto");
        company.add("Vivo");
        company.add("Apple");
        company.add("Apple");
        company.add("LG");
        company.add("Samsung");
        company.add("Nokia");
        company.add("Lenevo");
        company.add("Moto");
        company.add("MI");
        company.add("LG");

        return company;

    }
    public HashSet<Integer> createIntegerSet(){
        HashSet <Integer> rollnumber = new HashSet<>();
        rollnumber.add(23);
        rollnumber.add(23);
        rollnumber.add(24);
        rollnumber.add(24);
        rollnumber.add(25);
        rollnumber.add(25);
        rollnumber.add(26);
        rollnumber.add(27);
        rollnumber.add(26);
        rollnumber.add(27);
        rollnumber.add(28);
        rollnumber.add(29);
        rollnumber.add(30);
        rollnumber.add(29);

        return rollnumber;
    }
    public HashSet<Double> createDoubleSet(){
        HashSet <Double> Price = new HashSet<>();
        Price.add(25.56);
        Price.add(67.80);
        Price.add(234.80);
        Price.add(25.56);
        Price.add(67.80);
        Price.add(234.80);
        Price.add(600.78);
        Price.add(78.56);
        Price.add(45.89);
        Price.add(600.78);
        Price.add(25.56);
        Price.add(67.80);
        Price.add(234.80);
        Price.add(600.78);
        Price.add(78.56);

        return Price;
    }
    public static void main(String [] args ){
        MyHashSet obj = new MyHashSet();
        HashSet <String>company =  obj.createStringSet();

          System.out.println("Using String: ");

         int i = 0;
        for (String var:company){
            System.out.println("Printing companies names:"+var+" Index: "+i);
              i++;
        }



           HashSet <Integer> rollnumber = obj.createIntegerSet();

        System.out.println("Using Integer: ");
            int n = 0;
         for (Integer var:rollnumber){
             System.out.println("Printing rollnumber:"+var+" Index: "+n);
             n++;
         }

           HashSet <Double> Price = obj.createDoubleSet();

           System.out.println("Using Double: ");

            int k = 0;
           for (Double var: Price){
               System.out.println("Printing Price: "+var+" Index: "+k);
               k++;
           }
    }
}
