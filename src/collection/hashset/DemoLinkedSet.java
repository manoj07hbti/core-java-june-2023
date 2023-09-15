package collection.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoLinkedSet {


    public LinkedHashSet <String> createSet(){

        LinkedHashSet <String> set= new LinkedHashSet();
        set.add("Java");
        set.add("Spring");
        set.add("Spring boot");
        set.add("Microservices");

        return set;
    }
    public HashSet<String> createNormalSet(){

       HashSet <String> set= new HashSet();
        set.add("Java");
        set.add("Spring");
        set.add("Spring boot");
        set.add("Microservices");

        return set;
    }
    public static void main(String[] args) {

        DemoLinkedSet obj= new DemoLinkedSet();
        LinkedHashSet <String> result= obj.createSet();

        for(String var: result){
            System.out.println("Printing Linked hashset data: "+var);
        }

        for(String var: obj.createNormalSet()){

            System.out.println("Printing NORMAL hashset data: "+var);
        }

    }
}
