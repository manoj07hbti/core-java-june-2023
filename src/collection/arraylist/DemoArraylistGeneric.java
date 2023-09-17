package collection.arraylist;

import java.util.ArrayList;

public class DemoArraylistGeneric {

    public  ArrayList<String> createStringArraylist(){

    //syntax:Arraylist<datatype>=new collection_name<

        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("Sushant");
        stringArrayList.add("Shivani");
        stringArrayList.add("chiki");
        stringArrayList.add("Parag");
        return stringArrayList;

    }
    public   ArrayList<Integer>  createIntegerArraylist()
    {

        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(58);
        marks.add(87);
        marks.add(98);
        marks.add(76);
        return marks;
    }


    public static void main(String[] args) {
        DemoArraylistGeneric obj=new DemoArraylistGeneric();
        ArrayList<String> name=obj.createStringArraylist();

        ArrayList<Integer> objmarks=obj.createIntegerArraylist();
        System.out.println();
        System.out.println("...........using for loop.............");

        for (int i=0; i< name.size();i++)
        {
            System.out.println(""+name.get(i));
        }
        System.out.println();
        System.out.println("...........using while.............");
        int j=0;
        while (j< name.size())
        {
            System.out.println(""+name.get(j));
            j++;
        }
        System.out.println();
        System.out.println("...........using do while.............");
        j=0;
        do {
            System.out.println(""+name.get(j));
            j++;
        }while (j< name.size());

        System.out.println();
        System.out.println("...........advanced for loop.............");
        for (String var:name)
        {
            System.out.println(""+var);
        }

        System.out.println();
        System.out.println("...........INTEGER.............");
        System.out.println();
        System.out.println("...........using for loop.............");
        for (int i=0;i< objmarks.size();i++)
        {
            System.out.println(""+objmarks.get(i));
        }
        System.out.println();
        System.out.println("...........using while.............");
       int i=0;
        while (i< objmarks.size())
        {
            System.out.println(""+objmarks.get(i));
            i++;
        }
        System.out.println();
        System.out.println("...........using do while.............");
        i=0;
        do {
            System.out.println(""+objmarks.get(i));
            i++;
        }while (i< objmarks.size());
       // System.out.println();
        System.out.println("...........using Advanced for loop.............");
        for (Integer var:objmarks)
        {
            System.out.println(""+var);
        }
    }
}
