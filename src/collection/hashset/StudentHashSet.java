package collection.hashset;

import collection.model.Student1;

import java.util.HashSet;

public class StudentHashSet {


    public HashSet<Student1> createStudentSet() {
        HashSet<Student1> students = new HashSet<>();

        Student1 student1 = new Student1("Jatin", 21, "it",1);
        System.out.println("Hashcode of Student 1 is:" + student1.hashCode());
        Student1 student2 = new Student1("Vandana", 19, "medic",2);
        System.out.println("Hashcode of Student 2 is:" + student2.hashCode());
        Student1 student3 = new Student1("Ojal", 20, "webtoon",3);
        System.out.println("Hashcode of Student 3 is:" + student3.hashCode());
        Student1 student4 = new Student1("Mohit", 18, "metric",4);
        System.out.println("Hashcode of Student 4 is:"+student4.hashCode());
        Student1 student5 = new Student1("Mukul", 19, "inter",5);
        System.out.println("Hashcode of Student 5 is:"+student5.hashCode());
        Student1 student6 = new Student1("Jatin", 21, "it",1);
        System.out.println("Hashcode of Student 6 is:"+student6.hashCode());
        Student1 student7 = new Student1("Vandana", 19, "medic",2);
        System.out.println("Hashcode of Student 7 is:"+student7.hashCode());
        Student1 student8 = new Student1("Ojal", 20, "webtoon",3);
        System.out.println("Hashcode of Student 8 is:"+student8.hashCode());
        Student1 student9 = new Student1("Mohit", 18, "metric",4);
        System.out.println("Hashcode of Student 9 is:"+student9.hashCode());
        Student1 student10 = new Student1("Mukul", 19, "inter",5);
        System.out.println("Hashcode of Student 10 is:"+student10.hashCode());


        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);
        students.add(student9);
        students.add(student10);

        return students;
    }

    public static void main(String[] args) {
        StudentHashSet obj = new StudentHashSet();
        HashSet<Student1> studentsData = obj.createStudentSet();

        int i = 0;
        for (Student1 var : studentsData) {
            System.out.println("Roll_No is: "+var.getRoll_no() + " at INDEX " + i);
            i++;
        }

    }
}
