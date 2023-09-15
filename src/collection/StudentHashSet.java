package collection;

import collection.model.Student;

import java.util.HashSet;

public class StudentHashSet {

    public HashSet<Student> createStudentSet() {

        HashSet<Student> students = new HashSet<>();

        Student student1 = new Student("Anamika", 01, 60, "CS");
        System.out.println("hashcode of student1" + student1.hashCode());

        Student student2 = new Student("Anamika", 01, 60, "CS");
        System.out.println("hashcode of student2" + student2.hashCode());

        Student student3 = new Student("Himanshi", 03, 62, "IOT");
        System.out.println("hashcode of student3" + student3.hashCode());

        Student student4 = new Student("Himanshi", 03, 62, "IOT");
        System.out.println("hashcode of student4" + student4.hashCode());

        Student student5 = new Student("Shiva", 04, 63, "IT");
        System.out.println("hashcode of student4" + student5.hashCode());

        Student student6 = new Student("Shiva", 04, 63, "IT");

        System.out.println("hashcode of student6" + student6.hashCode());

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        return students;

    }

    public static void main(String[] args) {


        StudentHashSet obj = new StudentHashSet();

        HashSet<Student> studentsData = obj.createStudentSet();

        for (Student student : studentsData) {

            System.out.println(" Name :" + student.getName() + " Rollno :" + student.getRoll_no() + " Mark :" + student.getMark() + " branch :" + student.getBranch());

        }

    }

}
