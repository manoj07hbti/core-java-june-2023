package september_10_test;

import collection.model.Student;

import java.util.ArrayList;

public class StudentArrayList {

//1. Write a method which will create List of 10 Students and students will have name roll no,marks and  branch.

    public ArrayList<Student> createStudentList() {

        ArrayList<Student> studentsData = new ArrayList<>();

        Student alumni1 = new Student("Jatin", 1, 300, "cs");
        Student alumni2 = new Student("Vandana", 2, 301, "medic");
        Student alumni3 = new Student("Ojal", 3, 302, "cs");
        Student alumni4 = new Student("Mohit", 4, 303, "metric");
        Student alumni5 = new Student("Mukul", 5, 304, "inter");
        Student alumni6 = new Student("Raj", 6, 305, "resources");
        Student alumni7 = new Student("Gita", 7, 306, "sales");
        Student alumni8 = new Student("Sita", 8, 307, "cs");
        Student alumni9 = new Student("Ram", 9, 308, "planning");
        Student alumni10 = new Student("Mohan", 10, 309, "fabric");

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
        ArrayList<Student> alumnus1 = obj.createStudentList();//TODO Method no.1

        // 2. Find students with branch "CS"

        System.out.println("****Using Advanced for Loop****");
        System.out.println(" ");
        System.out.println("those students whose related to cs branch:");

        for (Student alumni : alumnus1) {
            if (alumni.branch.equals("cs")) {
                System.out.println("Name is :" + alumni.getName() + " \nRoll_No is :" + alumni.getRoll_no() + " \nMark is :" + alumni.getMark() + " \nBranch is :" + alumni.getBranch());
            }
        }

        //3. Find out student with highest and lowest marks .

        ArrayList<Student> alumnus2 = obj.createStudentList();//TODO Method no.2

        System.out.println(" ");
        System.out.println("****Using Advanced for loop****");
        System.out.println(" ");
        System.out.println("Finding Highest And Lowest Mark");
        System.out.println(" ");
        Student max = alumnus2.get(1);
        Student min = alumnus2.get(1);


        for (Student alumni : alumnus2) {

            if (alumni.mark > max.mark) {//greater than
                max = alumni;
            }
        }
        for (Student alumni : alumnus2) {
            if (alumni.mark < min.mark) {//less than
                min = alumni;
            }
        }
        System.out.println("Student with Highest Mark " + max.mark);
        System.out.println(" ");
        System.out.println("Student with Lowest Mark " + min.mark);


        // 4. Find and print students between roll no 3 to 7

        ArrayList<Student> alumnus3 = obj.createStudentList();//TODO Method no.3

        System.out.println(" ");
        System.out.println("Finding students between roll_no 3 to 7");
        System.out.println(" ");
        System.out.println("****Using Advanced for loop****");
        System.out.println(" ");
        for (Student alumni : alumnus3) {
            if (alumni.roll_no >= 3 && alumni.roll_no <= 7) {
                System.out.println("Name of student :" + alumni.name + "\nroll_no is :" + alumni.roll_no);
            }
        }
        //5. Print all students with for,while ,do while and advance.

        ArrayList<Student> alumnus4 = obj.createStudentList();//TODO Method no.4

        System.out.println(" ");
        System.out.println("Print all students with using for,while ,do while and advance loop");
        System.out.println(" ");
        System.out.println("****Using for loop****");
        System.out.println("  ");
        for (int i = 0; i < alumnus4.size(); i++) {
            System.out.println("Name is :" + alumnus4.get(i).getName());
        }
        System.out.println(" ");
        System.out.println("****Using while loop****");
        System.out.println(" ");

        int j = 0;
        while (j < alumnus4.size()) {
            System.out.println("Name is :" + alumnus4.get(j).getName());
            j++;
        }
        System.out.println(" ");
        System.out.println("****Using do while loop****");
        System.out.println(" ");

        int k = 0;
        do {
            System.out.println("Name is :" + alumnus4.get(k).getName());
            k++;
        } while (k < alumnus4.size());

        System.out.println(" ");
        System.out.println("****Using Advanced for loop****");
        System.out.println(" ");
        for (Student alumni : alumnus4) {
            System.out.println("Name is :" + alumni.getName() + " \nRoll_No is :" + alumni.getRoll_no() + " \nMark is :" + alumni.getMark() + " \nBranch is :" + alumni.getBranch());

        }


    }


}


