package collection.hashset;

import java.util.HashSet;

public class DemoHashSet {

    public HashSet<String> createStringSet(){

        HashSet <String> courses= new HashSet<>();
        courses.add("Maths");
        courses.add("Science");
        courses.add("Geography");
        courses.add("Physics");
        courses.add("Chemistry");
        courses.add("Maths");
        courses.add("Geography");
        courses.add("Physics");
        courses.add("Chemistry");
        return  courses;
    }

    public HashSet<Integer> createIntegerSet(){

        HashSet<Integer> rollNo= new HashSet<>();
        rollNo.add(1);
        rollNo.add(2);
        rollNo.add(2);
        rollNo.add(1);
        rollNo.add(3);
        rollNo.add(1);
        rollNo.add(4);
        rollNo.add(4);

        return rollNo;

    }
    public static void main(String[] args) {

        DemoHashSet obj= new DemoHashSet();
        HashSet<String> courses= obj.createStringSet();
        int i=0;
        for(String var: courses){
            System.out.println("Printing course data: "+var+" at Index: "+i);
            i++;
        }

        HashSet<Integer> resultRollNo= obj.createIntegerSet();

        for(Integer var: resultRollNo){
            System.out.println("Printing roll no: "+var);
        }
    }

}
