package collection.hashset;

import java.util.ArrayList;

public class DemoHashset {

    public  ArrayList<String> checkDuplicate()

    {
        ArrayList<String> curses=new ArrayList<>();
        curses.add("Java");
        curses.add("PHP");
        curses.add("Dot net");
        curses.add("Java");
        curses.add("Html");
        curses.add("php");


        return curses;
    }

    public static void main(String[] args) {
        DemoHashset obj=new DemoHashset();
        ArrayList<String> courses=obj.checkDuplicate();

        for (int i=0;i<courses.size();i++)
        {
            if (courses.equals(courses))
            {
                break;
            }
            else {
                System.out.println(courses.get(i));
            }
        }

    }
}


