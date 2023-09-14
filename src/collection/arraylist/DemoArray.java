package collection.arraylist;

import java.util.ArrayList;

public class DemoArray {

// store information about the college

    public void collegeInfo() {

        String collegeName = "K.P.College";
        String cityName="Agra";
        int noOfStudents = 500;
        int noOfCourses = 7;
        int noOfFaculties = 20;
        double salary = 54545.22;


        // creating ArrayList object to store information

        ArrayList collegeInfo = new ArrayList();
        //store the data : objName.add(Data);
        collegeInfo.add("K.P.College");
        collegeInfo.add(500);
        collegeInfo.add(7);
        collegeInfo.add(20);
        collegeInfo.add(54545.22);
        collegeInfo.add("Agra");

        // Reading Data : objName.get(INDEX)

        System.out.println("Printing college name :" + collegeInfo.get(0));
        System.out.println("Printing no of students :" + collegeInfo.get(1));
        System.out.println("Printing no of courses :" + collegeInfo.get(2));
        System.out.println("Printing no of faculties :" + collegeInfo.get(3));
        System.out.println("Printing salaries :" + collegeInfo.get(4));

        // how to print all data of collection

        for (int i = 0; i < collegeInfo.size(); i++) {
            System.out.println("Before Removing Data is :" + collegeInfo.get(i) + " INDEX " + i);
        }

        //delete data : objName.remove(INDEX);
        System.out.println(" ");
        collegeInfo.remove(3);
        for (int i=0; i<collegeInfo.size();i++ ){
            System.out.println("After Removing Data is :" + collegeInfo.get(i) + " INDEX " + i);
        }

    }


    public static void main(String[] args) {

        DemoArray obj = new DemoArray();
        obj.collegeInfo();
    }

}
