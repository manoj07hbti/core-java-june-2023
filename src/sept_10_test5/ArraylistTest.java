package sept_10_test5;

import sept_10_test5.model.Student;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistTest {

    public ArrayList<Student> student()
    {
        ArrayList<Student> stud=new ArrayList<>();

        Student student1=new Student("nitin",1,63.52,"Mechanical");
        Student student2=new Student("Shivani",2,35.54,"cs");
        Student student3=new Student("Shubham",3,85.54,"Mechanical");

        Student student4=new Student("Rahul",4,78.00,"cs");
        Student student5=new Student("Ankita",5,54.54,"cs");
        Student student6=new Student("Bhavana",6,55.45,"civil");

        Student student7=new Student("Surya",7,60.54,"cs");
        Student student8=new Student("Reva",8,78.4,"Mechanical");
        Student student9=new Student("Shardul",9,70.00,"Electrical");

        Student student10=new Student("Rohit",10,85.54,"cs");

        stud.add(student1);
        stud.add(student2);
        stud.add(student3);
        stud.add(student4);
        stud.add(student5);
        stud.add(student6);
        stud.add(student7);
        stud.add(student8);
        stud.add(student9);
        stud.add(student10);

        System.out.println("Name of student" +student1.getName() + "RollNo is" +student1.getRollNo()+"Marks is:"+student1.getMarks()+"Branch is"+student1.getBranch());





        return stud;
    }

    public static void main(String[] args) {
        ArraylistTest at = new ArraylistTest();
        ArrayList<Student> st = at.student();
        for (Student var : st) {

            System.out.println("Student RollNo is " + var.getRollNo() + " Name is" + var.getName() + "Marks " + var.getMarks() + "Branch " + var.getBranch());
        }





            System.out.println();
            System.out.println("2.Find out all student with branch cs");
            for (Student var : st) {
                if (var.getBranch().equalsIgnoreCase("CS")) {
                    System.out.println("Student RollNo is " + var.getRollNo() + " Name is " + var.getName() + " Marks " + var.getMarks() + " Branch " + var.getBranch());
                }


            }
        System.out.println();
        System.out.println("3.lowest marks");
        double min = st.get(0).getMarks();
        for (int i = 0; i < st.size(); i++) {
            if (st.get(i).getMarks() < min) {
                min = st.get(i).getMarks();
                System.out.println(+min + " Roll no " + st.get(i).getRollNo() + " Name is" + st.get(i).getName() + " marks" + st.get(i).getMarks() + "branch " + st.get(i).getBranch());
            }

        }
        System.out.println();
        System.out.println("3.highest marks");
        double max = st.get(0).getMarks();
        for (int i = 0; i < st.size(); i++) {

            if (st.get(i).getMarks() > max) {
                max = st.get(i).getMarks();
                System.out.println(+ max + " Roll no " + st.get(i).getRollNo() + " Name is" + st.get(i).getName() + " marks" + st.get(i).getMarks() + "branch " + st.get(i).getBranch());


            }

        }


        System.out.println();
            System.out.println("4.Find out student details which roll no between 3 to 7");
            for (Student var : st) {
                int rollNo = var.getRollNo();
                if (rollNo >= 3 && rollNo <= 7) {
                    System.out.println("Student RollNo is " + var.getRollNo() + " Name is " + var.getName() + " Marks " + var.getMarks() + " Branch " + var.getBranch());
                }
            }

            System.out.println("5.Print all the student with do while ,while,for,adv loop");
            System.out.println();
            System.out.println("..........Using for loop......");
            for (int i = 0; i < st.size(); i++) {
                System.out.println(" " + st.get(i).getRollNo() + " " + st.get(i).getName() + " " + st.get(i).getMarks() + " " + st.get(i).getBranch());
            }

            System.out.println();
            System.out.println("Using while loop");
            int i = 0;
            while (i < st.size()) {

                System.out.println(" " + st.get(i).getRollNo() + " " + st.get(i).getName() + " " + st.get(i).getMarks() + " " + st.get(i).getBranch());
                i++;
            }
            System.out.println();
            System.out.println("Using do while loop");
            i = 0;
            do {

                System.out.println(" " + st.get(i).getRollNo() + " " + st.get(i).getName() + " " + st.get(i).getMarks() + " " + st.get(i).getBranch());
                i++;
            } while (i < st.size());
            System.out.println();
            System.out.println("Advanced for loop");
            for (Student var : st) {

                System.out.println("Student RollNo is " + var.getRollNo() + " Name is" + var.getName() + "Marks " + var.getMarks() + "Branch " + var.getBranch());
            }


        }
    }
