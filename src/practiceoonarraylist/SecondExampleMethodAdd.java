package practiceoonarraylist;

import java.util.ArrayList;

public class SecondExampleMethodAdd {

    public ArrayList<Integer> method_add(){

        ArrayList<Integer> addition=new ArrayList<>();
        addition.add(1);
        addition.add(2);
        addition.add(5);




        for (Integer var:addition)
            System.out.println("Before adding element "+var);

        addition.add(2,3);
        addition.add(3,4);

        for (Integer var:addition)
            System.out.println("after adding element "+var);
        return addition;
    }

    public ArrayList<String> string_arraylist()
    {

        ArrayList<String> addition2=new ArrayList<>();

        addition2.add("Sahil");
        addition2.add("Ameya");
        addition2.add("atharv");

        for (String var:addition2)
        {
            System.out.println("Before adding element  " +var );
        }
        addition2.add(2,"Jaya");
        int i=0;
        do {
            System.out.println("After adding element " +addition2.get(i) + " index "+i);
            i++;
        }while (i< addition2.size());
        return addition2;
    }

    public static void main(String[] args) {
        SecondExampleMethodAdd sm=new SecondExampleMethodAdd();
        ArrayList<Integer> addition1=sm.method_add();
        ArrayList<String> addition2=sm.string_arraylist();



    }
}
