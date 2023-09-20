package collection.linkedhash_set;

import collection.model.Student;

import java.util.LinkedHashSet;

public class DemoLinked_Student {

    public LinkedHashSet<Student> createStudentLinkedSet() {

        LinkedHashSet<Student> StudentData = new LinkedHashSet<>();

        Student student1 = new Student("Anamika", 01, 60, "CS");

        Student student2 = new Student("Himanshi", 04, 63, "IT");
        System.out.println("hashcode of student2" + student2.hashCode());

        Student student3 = new Student("Shiva", 03, 62, "IOT");
        System.out.println("hashcode of student3" + student3.hashCode());

        Student student4 = new Student("Anamika", 01, 60, "CS");
        System.out.println("hashcode of student4" + student4.hashCode());

        Student student5 = new Student("Himanshi", 04, 63, "IT");
        System.out.println("hashcode of student4" + student5.hashCode());

        Student student6 = new Student("Shiva", 03, 62, "IOT");
        System.out.println("hashcode of student6" + student6.hashCode());

        StudentData.add(student1);
        StudentData.add(student2);
        StudentData.add(student3);
        StudentData.add(student4);
        StudentData.add(student5);
        StudentData.add(student6);

        return StudentData;

    }

    public static void main(String[] args) {

        DemoLinked_Student obj = new DemoLinked_Student();

        LinkedHashSet<Student> StudentData = obj.createStudentLinkedSet();

        int k = 0;

        for (Student student : StudentData) {

            System.out.println(" Name :" + student.getName() + " Rollno :" + student.getRoll_no() + " Mark :" + student.getMark() + " branch :" + student.getBranch() + "At Index" +k);

            k++;


        }


    }


}
