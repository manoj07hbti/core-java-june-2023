package collecton;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DemoGenerics {

    public ArrayList<String> createStringList() {
        // SYNTAX: CollectionName <Datatype> ObjectName= new collection name

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("Raj");
        stringArrayList.add("Mohan");
        stringArrayList.add("Abhishek");
        stringArrayList.add("Ram");
        stringArrayList.add("Payal");

        return stringArrayList;
    }

    public ArrayList<Integer> createIntigerList() {

        ArrayList<Integer> age = new ArrayList<>();
        age.add(21);
        age.add(23);
        age.add(24);
        age.add(25);
        age.add(22);

        return age;

    }

    public static void main(String args[]) {
        DemoGenerics Obj = new DemoGenerics();
        ArrayList<String> names = Obj.createStringList();

        System.out.println(" Printing names Using for loop:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println("Printing names: " + names.get(i));
        }
        System.out.println(" Printing names Using while Loop: ");

        int j = 0;
        while (j < names.size()) {
            System.out.println("Printing names: " + names.get(j));
            j++;
        }
        System.out.println(" Printing names Using do while loop: ");
        int k = 0;
        do {
            System.out.println("printing names: " + names.get(k));
            k++;
        } while (k < names.size());

        System.out.println("Using Advanced loop:");
        for (String var : names) {
            System.out.println("Printing names using advanced loop: " + var);
        }

        ArrayList <Integer> age = Obj.createIntigerList();

          System.out.println("Printing age using for loop: ");

        for (int i = 0; i < age.size(); i++){
            System.out.println("Printing age: "+age.get(i));
        }
        System.out.println("Printing age using while loop: ");

        int i = 0;
        while (i < age.size()){
            System.out.println("Printing age:"+age.get(i));
            i++;
        }
         System.out.println("Printing age using do while loop:");
         int n = 0;
        do {
            System.out.println("Printing age: "+age.get(n));
            n++;
        }while (n< age.size());

        System.out.println("Printing age using advanced loop: ");

        for (Integer var: age){
            System.out.println("Printing age using advanced loop: "+var);
        }


    }

}