package collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortThelist {

    public ArrayList<Integer> sortedlist()
    {

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(25);
        list1.add(2);
        list1.add(35);
        list1.add(12);
        list1.add(7);
       for (int i=0;i< list1.size();i++)
       {
           System.out.println(" Before sorting list " +list1.get(i));
       }

        Collections.sort(list1);
        for (int i=0;i< list1.size();i++)
        {
            System.out.println(" after sorting list " +list1.get(i));
        }

        System.out.println("Maximum no is " +list1.get(list1.size()-1));
        System.out.println("Minimum no is " +list1.get(0));

        int middleNo= list1.size()/2;
        int midnum= list1.get(middleNo);
        System.out.println("middle number is " +midnum);

        //decending order

        Collections.sort(list1,Collections.reverseOrder());
        System.out.println("Decending order list"+list1);
        return list1;
    }

    public static void main(String[] args) {
        SortThelist sl=new SortThelist();
        ArrayList<Integer> sort=sl.sortedlist();
    }


}
