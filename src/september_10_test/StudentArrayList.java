package september_10_test;

import collection.model.Alumni;
import com.sun.deploy.panel.AbstractRadioPropertyGroup;

import javax.swing.text.AbstractDocument;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class StudentArrayList {

//1. Write a method which will create List of 10 Students and students will have name roll no,marks and  branch.

    public ArrayList<Alumni> createStudentList() {

        ArrayList<Alumni> studentsData = new ArrayList<>();

        Alumni alumni1 = new Alumni("Jatin", 1, 300, "cs");
        Alumni alumni2 = new Alumni("Vandana", 2, 301, "medic");
        Alumni alumni3 = new Alumni("Ojal", 3, 302, "cs");
        Alumni alumni4 = new Alumni("Mohit", 4, 303, "metric");
        Alumni alumni5 = new Alumni("Mukul", 5, 304, "inter");
        Alumni alumni6 = new Alumni("Raj", 6, 305, "resources");
        Alumni alumni7 = new Alumni("Gita", 7, 306, "sales");
        Alumni alumni8 = new Alumni("Sita", 8, 307, "cs");
        Alumni alumni9 = new Alumni("Ram", 9, 308, "planning");
        Alumni alumni10 = new Alumni("Mohan", 10, 309, "fabric");

        studentsData.add(alumni1);
        studentsData.add(alumni2);
        studentsData.add(alumni3);
        studentsData.add(alumni4);
        studentsData.add(alumni5);
        studentsData.add(alumni6);
        studentsData.add(alumni7);
        studentsData.add(alumni8);
        studentsData.add(alumni9);
        studentsData.add(alumni10);

        return studentsData;


    }

    public static void main(String[] args) {

        StudentArrayList obj = new StudentArrayList();
        ArrayList<Alumni> alumnus = obj.createStudentList();
        // 2. Find students with branch "CS"
        System.out.println("****Using Advanced for Loop****");
        System.out.println(" ");
        System.out.println("those students whose related to cs branch:");

        for (Alumni alumni : alumnus) {
            if (alumni.branch.equals("cs")) {
                System.out.println("Name is :" + alumni.getName() + " \nRoll_No is :" + alumni.getRoll_no() + " \nMark is :" + alumni.getMark() + " \nBranch is :" + alumni.getBranch());
            }
        }

        //3. Find out student with highest and lowest marks .

        System.out.println(" ");
        System.out.println("****Using Advanced for loop****");
        System.out.println(" ");
        System.out.println("Finding Highest And Lowest Mark");
        System.out.println(" ");
        Alumni max = alumnus.get(1);
        Alumni min = alumnus.get(1);


        for (Alumni alumni : alumnus) {

            if (alumni.mark > max.mark) {
                max = alumni;
            }
        }
        for (Alumni alumni : alumnus) {
            if (alumni.mark < min.mark) {
                min = alumni;
            }
        }
        System.out.println("Student with Highest Mark " + max.mark);
        System.out.println(" ");
        System.out.println("Student with Highest Mark " + min.mark);


        // 4. Find and print students between roll no 3 to 7
        System.out.println(" ");
        System.out.println("Finding students between roll_no 3 to 7");
        System.out.println(" ");
        System.out.println("****Using Advanced for loop****");
        System.out.println(" ");
        for (Alumni alumni : alumnus) {
            if (alumni.roll_no >= 3 && alumni.roll_no <= 7) {
                System.out.println("Name of student :" + alumni.name + "\nroll_no is :" + alumni.roll_no);
            }
        }
        //5. Print all students with for,while ,do while and advance.
        System.out.println(" ");
        System.out.println("Print all students with using for,while ,do while and advance loop");
        System.out.println(" ");
        System.out.println("****Using for loop****");
        System.out.println("  ");
        for (int i = 0; i < alumnus.size(); i++) {
            System.out.println("Name is :" + alumnus.get(i).getName());
        }
        System.out.println(" ");
        System.out.println("****Using while loop****");
        System.out.println(" ");

        int j = 0;
        while (j < alumnus.size()) {
            System.out.println("Name is :" + alumnus.get(j).getName());
            j++;
        }
        System.out.println(" ");
        System.out.println("****Using do while loop****");
        System.out.println(" ");

        int k = 0;
        do {
            System.out.println("Name is :" + alumnus.get(k).getName());
            k++;
        } while (k < alumnus.size());

        System.out.println(" ");
        System.out.println("****Using Advanced for loop****");
        System.out.println(" ");
        for (Alumni alumni : alumnus) {
            System.out.println("Name is :" + alumni.getName() + " \nRoll_No is :" + alumni.getRoll_no() + " \nMark is :" + alumni.getMark() + " \nBranch is :" + alumni.getBranch());

        }


    }


}


















   /*    (marks < marksArray.length)
        int min = arr.get(0);
        int max = arr.get(0);

        // store the length of the ArrayList in variable n
        int n = arr.size();

        // loop to find minimum from ArrayList
        for (int i = 1; i < n; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }

        // loop to find maximum from ArrayList
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        */









