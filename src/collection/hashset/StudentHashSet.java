package collection.hashset;

import collection.model.Student;

import java.util.HashSet;

public class StudentHashSet {


    public HashSet<Student> createStudentSet() {
        HashSet<Student> students = new HashSet<>();
        Student student1 = new Student("Jatin", 21, "it");
        Student student2 = new Student("Vandana", 19, "medic");
        Student student3 = new Student("Ojal", 20, "webtoon");
        Student student4 = new Student("Mohit", 18, "metric");
        Student student5 = new Student("Mukul", 19, "inter");
        Student student6 = new Student("Jatin", 21, "it");
        Student student7 = new Student("Vandana", 19, "medic");
        Student student8 = new Student("Ojal", 20, "webtoon");
        Student student9 = new Student("Mohit", 18, "metric");
        Student student10 = new Student("Mukul", 19, "inter");


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
        HashSet<Student> studentsData = obj.createStudentSet();

        int i = 0;
        for (Student var : studentsData) {
            System.out.println("Name is: " + var.getName() + " Age is: " + var.getAge() + " Section is: " + var.getSection() + " at INDEX " + i);
            i++;
        }

    }
}
