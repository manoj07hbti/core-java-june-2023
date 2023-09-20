package Linked_Set;

import java.util.LinkedHashSet;

public class DemoLinkedSet {

    public   LinkedHashSet<Integer> createRollN0set(){

     LinkedHashSet<Integer>set = new LinkedHashSet<>();
     set.add(78);
     set.add(89);
     set.add(76);
     set.add(90);
     set.add(54);
     set.add(32);
     set.add(21);
     set.add(28);
     set.add(64);
     set.add(11);
     return set;

    }

    public static void main(String[] args) {

        DemoLinkedSet obj=new DemoLinkedSet();
        LinkedHashSet<Integer> result=obj.createRollN0set();

        for (Integer var: result){
            System.out.println("printing hashset link data"+var);
        }
    }
}
