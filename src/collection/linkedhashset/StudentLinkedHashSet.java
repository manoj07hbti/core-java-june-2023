package collection.linkedhashset;

import collection.model.Student1;

import java.util.LinkedHashSet;

public class StudentLinkedHashSet {
    public LinkedHashSet<Student1> createStudentLinkedSet() {

        LinkedHashSet<Student1> studentsData = new LinkedHashSet<>();

        Student1 student1 = new Student1("Jatin", 21, "it", 1);
        System.out.println("Hashcode of Student 1 is:" + student1.hashCode());
        Student1 student2 = new Student1("Vandana", 19, "medic", 2);
        System.out.println("Hashcode of Student 2 is:" + student2.hashCode());
        Student1 student3 = new Student1("Ojal", 20, "webtoon", 3);
        System.out.println("Hashcode of Student 3 is:" + student3.hashCode());
        Student1 student4 = new Student1("Mohit", 18, "metric", 4);
        System.out.println("Hashcode of Student 4 is:" + student4.hashCode());
        Student1 student5 = new Student1("Mukul", 19, "inter", 5);
        System.out.println("Hashcode of Student 5 is:" + student5.hashCode());
        Student1 student6 = new Student1("Jatin", 21, "it", 1);
        System.out.println("Hashcode of Student 6 is:" + student6.hashCode());
        Student1 student7 = new Student1("Vandana", 19, "medic", 2);
        System.out.println("Hashcode of Student 7 is:" + student7.hashCode());
        Student1 student8 = new Student1("Ojal", 20, "webtoon", 3);
        System.out.println("Hashcode of Student 8 is:" + student8.hashCode());
        Student1 student9 = new Student1("Mohit", 18, "metric", 4);
        System.out.println("Hashcode of Student 9 is:" + student9.hashCode());
        Student1 student10 = new Student1("Mukul", 19, "inter", 5);
        System.out.println("Hashcode of Student 10 is:" + student10.hashCode());


        studentsData.add(student1);
        studentsData.add(student2);
        studentsData.add(student3);
        studentsData.add(student4);
        studentsData.add(student5);
        studentsData.add(student6);
        studentsData.add(student7);
        studentsData.add(student8);
        studentsData.add(student9);
        studentsData.add(student10);


        return studentsData;
    }

    public static void main(String[] args) {


        StudentLinkedHashSet obj = new StudentLinkedHashSet();
        LinkedHashSet<Student1> students = obj.createStudentLinkedSet();

        int i = 0;
        for (Student1 var : students) {
            System.out.println("Name is :" + var.getName() + "|" + "Age is :" + var.getAge() + "|" + "Section is :" + var.getSection() + "|" + "Roll_no is :" + var.getRoll_no() + "|" + "at INDEX " + i);
            i++;
        }


    }
}