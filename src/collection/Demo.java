package collection;

import java.util.ArrayList;

public class Demo {

    //store information about a college

    public void storeInfo(){

        String name="Agra college";
        int noOfStudents=1500;
        int noOfCourses=20;
        int noOfFaculty=100;
        double salary=32253.34;
      // creating arrayList object to store info

        ArrayList collegeInfo= new ArrayList();

        //store the data : objName.add(Data);
        collegeInfo.add("Agra College");// 0 INDEX
        collegeInfo.add(1500);// 1 INDEX
        collegeInfo.add(20); // 2 INDEX
        collegeInfo.add(100); // 3 INDEX
        collegeInfo.add(32253.34);//4 INDEX
        collegeInfo.add("Agra");// 5 INDEX

       // Reading Data : objName.get(INDEX);

        System.out.println("Salary :" + collegeInfo.get(4));
        System.out.println("Courses :" + collegeInfo.get(2));
        System.out.println("College Name :" + collegeInfo.get(0));

        //how to print all data of collection

        for(int i=0;  i<collegeInfo.size(); i++){

            System.out.println(" Before delete : Printing all data of list : "+collegeInfo.get(i) +" INDEX:"+i);
        }

        //delete data : objName.remove(INDEX);

        collegeInfo.remove(2);
        for(int i=0;  i<collegeInfo.size(); i++){

            System.out.println(" After delete : Printing all data of list : "+collegeInfo.get(i) +" INDEX:"+i);
        }


    }



    public static void main(String[] args) {

        Demo obj= new Demo();
        obj.storeInfo();

    }
}
