package collection;

import collection.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManegment {


    public ArrayList<Student> StudentData() {

        ArrayList<Student> StudentList = new ArrayList<>();

        Student student1 = new Student("Uday", 26, 56);
        Student student2 = new Student("Reji", 20, 58);
        Student student3 = new Student("Candan", 26, 53);
        Student student4 = new Student("Sanjay", 25, 52);
        Student student5 = new Student("Abhi", 23, 51);
        Student student6 = new Student("Rahul", 22, 50);


        StudentList.add(student1);
        StudentList.add(student2);
        StudentList.add(student3);
        StudentList.add(student4);
        StudentList.add(student5);
        StudentList.add(student6);

        return StudentList;
    }

    public Student dataWithUsarInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Name : ");

        String Name = sc.nextLine();

        System.out.println("Student Age : ");

        int age = sc.nextInt();

        System.out.println("Student rollNo :");

        int rollNo = sc.nextInt();

        Student student1 = new Student(Name, age, rollNo);
        return student1;


    }

    public static void main(String[] args) {

        StudentManegment obj = new StudentManegment();

        ArrayList<Student> student = obj.StudentData();
        Student student1 = obj.dataWithUsarInput();

        for (int i = 0; i < student.size(); i++) {

            System.out.println("Student Name : " + student.get(i).getName() + " age: " + student.get(i).getAge() + " rollNo:" + student.get(i).getRoll());
        }
        for (Student var : student) {

            System.out.println("Name:" + var.getName() + " age : " + var.getAge() + " : rollNo:" + var.getRoll());
        }

    }
}