package collection.arraylist;

import java.util.ArrayList;

public class DemoArraylist {


    public void storedInfo()
    {

        String clgName="Amgoi";
        int nosStudent=1500;
        int nosCourses=20;
        int nosFaculties=700;
        double salary=97000.22;

        //create arraylist object
        //Arraylist obj=new Arraylist();
        ArrayList collegeInfo=new ArrayList();
        collegeInfo.add("Amgoi");//index 0
        collegeInfo.add(1500);//index 1
        collegeInfo.add(20);//index 2
        collegeInfo.add(700);//index 3
        collegeInfo.add(97000.22);//index 4
        collegeInfo.add("Kolhapur");

        //getting or reading the data
        //objectName.get[index]

        System.out.println("Salary " +collegeInfo.get(4));
        System.out.println("No of student " +collegeInfo.get(1));


        for (int i=0;i<5;i++)
        {

            System.out.println("Printing all the data " +collegeInfo.get(i));
        }

        System.out.println();
        for (int i=0;i< collegeInfo.size();i++)
        {
            System.out.println("Printing all the data " +collegeInfo.get(i));
        }


        collegeInfo.remove(2);
        System.out.println("after removing data");
        for (int i=0;i< collegeInfo.size();i++)
        {
            System.out.println("Printing all the data " +collegeInfo.get(i));
        }
        System.out.println();
        System.out.println("......USing doo while.....");
        int i=0;
        do {
            System.out.println("Printing all the data " +collegeInfo.get(i));
            i++;

        }while (i<collegeInfo.size());

        System.out.println();
        System.out.println("...............Using while........");
        i=0;
        while (i<collegeInfo.size())
        {

            System.out.println("Printing all the data " +collegeInfo.get(i));
            i++;
        }


    }

    public static void main(String[] args) {

        DemoArraylist da= new DemoArraylist();
        da.storedInfo();

    }
}
