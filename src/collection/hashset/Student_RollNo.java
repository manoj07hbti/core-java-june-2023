package collection.hashset;

import collection.model.StudentExam;

import java.util.HashSet;

public class Student_RollNo {


    public HashSet<StudentExam> StudnetClass() {

        HashSet<StudentExam> studentResult = new HashSet<>();

        StudentExam S1 = new StudentExam("Santosh", "CS", 512, 78);
        StudentExam S2 = new StudentExam("Pravin", "IT", 514, 77);
        StudentExam S3 = new StudentExam("Rahul", "BscIT", 516, 87);
        StudentExam S4 = new StudentExam("Saurabh", "Bsc science", 518, 69);
        StudentExam S5 = new StudentExam("Chandan", "B.Pharma", 520, 86);
        StudentExam S6 = new StudentExam("Sanju", "D.Pharma", 521, 68);
        StudentExam S7 = new StudentExam("Rahul", "BscIT", 516, 87);
        StudentExam S8 = new StudentExam("Saurabh", "Bsc science", 518, 69);
        StudentExam S9 = new StudentExam("Chandan", "B.Pharma", 520, 86);
        StudentExam S10 = new StudentExam("Sanju", "D.Pharma", 521, 68);
        StudentExam S11 = new StudentExam("Jitu", "B.com", 522, 72);
        StudentExam S12 = new StudentExam("AJay", "Bsc Math", 524, 82);
        StudentExam S13 = new StudentExam("Sushil", "Civil", 526, 75);
        StudentExam S14 = new StudentExam("Yuvi", "Msc Math", 528, 83);

        studentResult.add(S1);
        studentResult.add(S2);
        studentResult.add(S3);
        studentResult.add(S4);
        studentResult.add(S5);
        studentResult.add(S6);
        studentResult.add(S7);
        studentResult.add(S8);
        studentResult.add(S9);
        studentResult.add(S10);
        studentResult.add(S11);
        studentResult.add(S12);
        studentResult.add(S13);
        studentResult.add(S14);

        return studentResult;

    }


    public static void main(String[] args) {

        Student_RollNo obj = new Student_RollNo();

        HashSet<StudentExam> result = obj.StudnetClass();

        System.out.println("Print Resulat with advanced loops");

        for (StudentExam var : result) {

            System.out.println("Student Name :" + var.getName() + " Branch :" + var.getBranchName() + " RollNo: " + var.getRollNo() + " Markas :" + var.getMarks());

        }


    }


}
