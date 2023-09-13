package collection;

import collection.model.StudentExam;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test_10_09_2023 {

    public ArrayList<StudentExam> StudentTest() {

        ArrayList<StudentExam> Student = new ArrayList<>();

        StudentExam Student1 = new StudentExam("Uday", "CS", 45, 70);
        StudentExam Student2 = new StudentExam("Sanjay", "EC", 46, 75);
        StudentExam Student3 = new StudentExam("Ajay", "Mechanical", 47, 71);
        StudentExam Student4 = new StudentExam("Rohit", "B.Pharma", 48, 60);
        StudentExam Student5 = new StudentExam("Rahul", "CS", 49, 80);
        StudentExam Student6 = new StudentExam("Raju", "Bsc Science", 50, 79);
        StudentExam Student7 = new StudentExam("Ankit", "BPT", 52, 66);
        StudentExam Student8 = new StudentExam("Sandeep", "Nursing", 54, 88);
        StudentExam Student9 = new StudentExam("Candan", "Bsc Radiology", 56, 59);
        StudentExam Student10 = new StudentExam("Sushil", "MBBS", 58, 78);

        Student.add(Student1);
        Student.add(Student2);
        Student.add(Student3);
        Student.add(Student4);
        Student.add(Student5);
        Student.add(Student6);
        Student.add(Student7);
        Student.add(Student8);
        Student.add(Student9);
        Student.add(Student10);

        return Student;

    }

    public static void main(String[] args) {

        Test_10_09_2023 obj = new Test_10_09_2023();

        ArrayList<StudentExam> Result = obj.StudentTest();


        System.out.println("******Printing only get student Branch CS******:");

        for (StudentExam var : Result) {

            if (var.getBranchName().equals("CS")) {

                System.out.println("Print Name " + var.getName() + " Branch Name : " + var.getBranchName() + " RollNo:" + var.getRollNo() + " Marks:" + var.getMarks());

            }
        }

        System.out.println("******Printing data MAX No & Min No*****");

        StudentExam Max = Result.get(0);
        StudentExam Min = Result.get(0);
        for (StudentExam var : Result) {

            if (var.getMarks() > Max.getMarks()) {
                Max = var;
            }
        }

        for (StudentExam var : Result) {


            if (var.getMarks() < Min.getMarks()) {

                var = Min;

            }

        }
        System.out.println("Student get Maximum Number:" + Max.getName() + " " + Max.getMarks());

        System.out.println("Student get Minimum Marks :" + Min.getName() + " " + Min.getMarks());


        System.out.println("**** Print with advanced  for loop****** ");


        for (StudentExam var1 : Result) {

            System.out.println("Name: " + var1.getName() + "Branch " + var1.getBranchName() + "RollNo " + var1.getRollNo() + "Marks :" + var1.getMarks());
        }


        System.out.println("******Print with for loops****** ");

        for (int i = 0; i < Result.size(); i++) {

            System.out.println("Name " + Result.get(i).getName() + "Branch :" + Result.get(i).getBranchName() + "RollNo:" + Result.get(i).getRollNo() + "Marks" + Result.get(i).getMarks());
        }

        System.out.println("*********Print for while loops*****");
        int j = 0;
        while (j < Result.size()) {

            System.out.println("Name " + Result.get(j).getName() + "Branch :" + Result.get(j).getBranchName() + "RollNo:" + Result.get(j).getRollNo() + "Marks" + Result.get(j).getMarks());
            j++;
        }
        System.out.println("******Printing index 3rd to index 7 *****");

        for (int l = 3; l < 7; l++) {


            System.out.println("Name :" + Result.get(l).getName() + "BranchName : " + Result.get(l).getBranchName() + "RollNo :" + Result.get(l).getRollNo() + "Marks :" + Result.get(l).getMarks());
        }

    }

}




