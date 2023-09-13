package sep_test;

import collection.model.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Senior {


        //1. write a method which will create list of 10 students and students will have roll no. marks and branch.


        public ArrayList<Student> createStudentList() {

            ArrayList<Student> studentData = new ArrayList<>();

            Student student1 = new Student("Kanak", 1, 400, "CS");
            Student student2 = new Student("Veenu", 2, 401, "Med");
            Student student3 = new Student("Anu", 3, 402, "Cs");
            Student student4 = new Student("Ambika", 4, 403, "Metric");
            Student student5 = new Student("Anshu", 5, 404, "Sc");
            Student student6 = new Student("Himanshi", 6, 405, "Reso");
            Student student7 = new Student("Deepak", 7, 406, "Iot");
            Student student8 = new Student("Shiva", 8, 407, "CS");
            Student student9 = new Student("Ritika", 9, 408, "IT");
            Student student10 = new Student("Shruti", 10, 409, "Mech");

            studentData.add(student1);
            studentData.add(student2);
            studentData.add(student3);
            studentData.add(student4);
            studentData.add(student5);
            studentData.add(student6);
            studentData.add(student7);
            studentData.add(student8);
            studentData.add(student8);
            studentData.add(student9);
            studentData.add(student10);

            return studentData;
        }

        public static void main(String[] args) {

            Senior obj = new Senior();

            ArrayList<Student> Student = obj.createStudentList();

            //2. find students with branch "CS":

            System.out.println("**** Using Advanced for Loop****");

            System.out.println("");

            System.out.println("those students whose related to cs branch");

            for (Student student : Student) {

                if (student.branch.equals("cs")) {
                    System.out.println("Name is :" + student.getName() + " \nRoll_No is :" + student.getRoll_no() + " \nMark is :" + student.getMark() + " \nBranch is :" + student.getBranch());
                }
            }
            //3. find out student with highest and lowest marks :

            System.out.println(" ");
            System.out.println("***Using Advanced for loop***");
            System.out.println(" ");
            System.out.println("Finding Highest And Lowest Mark");
            System.out.println(" ");
            Student max = Student.get(1);
            Student min = Student.get(1);

            for (Student alumni : Student) {

                if (alumni.mark > max.mark) {
                    max = alumni;
                }
            }
            for (Student alumni : Student) {
                if (alumni.mark < min.mark) {
                    min = alumni;
                }
            }
            System.out.println("Student with Highest Mark " + max.mark);
            System.out.println(" ");
            System.out.println("Student with Lowest Mark " + min.mark);


            // 4. Find and print students between roll no 3 to 7
            System.out.println(" ");
            System.out.println("Finding students between roll_no 3 to 7");
            System.out.println(" ");
            System.out.println("***Using Advanced for loop***");
            System.out.println(" ");
            for (Student alumni : Student) {
                if (alumni.roll_no >= 3 && alumni.roll_no <= 7) {
                    System.out.println("Name of student :" + alumni.name + "\nroll_no is :" + alumni.roll_no);
                }
            }
            //5. Print all students with for,while ,do while and advance.
            System.out.println(" ");
            System.out.println("Print all students with using for,while ,do while and advance loop");
            System.out.println(" ");
            System.out.println("***Using for loop***");
            System.out.println("  ");
            for (int i = 0; i < Student.size(); i++) {
                System.out.println("Name is :" + Student.get(i).getName());
            }
            System.out.println(" ");
            System.out.println("***Using while loop***");
            System.out.println(" ");

            int j = 0;
            while (j < Student.size()) {
                System.out.println("Name is :" + Student.get(j).getName());
                j++;

            }
            System.out.println(" ");
            System.out.println("***Using do while loop***");
            System.out.println(" ");

            int k = 0;
            do {
                System.out.println("Name is :" + Student.get(k).getName());
                k++;
            } while (k < Student.size());

            System.out.println(" ");
            System.out.println("***Using Advanced for loop***");
            System.out.println(" ");
            for (Student alumni : Student) {
                System.out.println("Name is :" + alumni.getName() + " \nRoll_No is :" + alumni.getRoll_no() + " \nMark is :" + alumni.getMark() + " \nBranch is :" + alumni.getBranch());

            }

        }

    }



