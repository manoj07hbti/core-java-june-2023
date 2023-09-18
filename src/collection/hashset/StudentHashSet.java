package collection.hashset;

import collection.model.Student1;

import java.util.HashSet;
import java.util.Iterator;

public class StudentHashSet {


    public HashSet<Student1> createStudentSet() {
        HashSet<Student1> students = new HashSet<>();

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


        System.out.println(" ");
        System.out.println("Iterate over hashset in for loop :");
        System.out.println("****Using for loop****");
        System.out.println(" ");


        Iterator<Student1> itr1 = students.iterator();//todo method 1
        for (int j = 0; j < students.size(); j++) {
            System.out.println(j + " Name is : " + itr1.next().getName());
        }


        System.out.println(" ");
        Iterator<Student1> itr2 = students.iterator();//todo method 2
        for (int j = 0; j < students.size(); j++) {
            System.out.println(j + " Age is : " + itr2.next().getAge());
        }


        System.out.println(" ");
        Iterator<Student1> itr3 = students.iterator();//todo method 3
        for (int j = 0; j < students.size(); j++) {
            System.out.println(j + " Section is : " + itr3.next().getSection());
        }


        System.out.println(" ");
        Iterator<Student1> itr4 = students.iterator();//todo method 4
        for (int j = 0; j < students.size(); j++) {
            System.out.println(j + " Roll_no is : " + itr4.next().getRoll_no());
        }


        System.out.println(" ");
        System.out.println("Iterate over hashset in while loop :");
        System.out.println("****Using while loop****");
        System.out.println(" ");


        Iterator<Student1> itr5 = students.iterator();//todo method 5
        int k = 0;
        while (itr5.hasNext()) {
            System.out.println(k + " Name is : " + itr5.next().getName());
            k++;
        }


        System.out.println(" ");
        int l = 0;
        Iterator<Student1> itr6 = students.iterator();//todo method 6
        while (itr6.hasNext()) {
            System.out.println(l + " Age is : " + itr6.next().getAge());
            l++;
        }


        System.out.println(" ");
        int m = 0;
        Iterator<Student1> itr7 = students.iterator();//todo method 7
        while (itr7.hasNext()) {
            System.out.println(m + " Section is : " + itr7.next().getSection());
            m++;
        }


        System.out.println(" ");
        int n = 0;
        Iterator<Student1> itr8 = students.iterator();//todo method 8
        while (itr6.hasNext()) {
            System.out.println(n + " Roll_no is : " + itr8.next().getRoll_no());
            n++;
        }


        System.out.println(" ");
        System.out.println("Iterate over hashset in do while loop :");
        System.out.println("****Using do while loop****");
        System.out.println(" ");


        int o = 0;
        Iterator<Student1> itr9 = students.iterator();//todo method 9
        do {
            System.out.println(o + " Name is : " + itr9.next().getName());
            o++;
        } while (itr9.hasNext());


        System.out.println(" ");
        int p = 0;
        Iterator<Student1> itr10 = students.iterator();//todo method 10
        do {
            System.out.println(p + " Age is : " + itr10.next().getAge());
            p++;
        } while (itr10.hasNext());


        System.out.println(" ");
        int q = 0;
        Iterator<Student1> itr11 = students.iterator();//todo method 12
        do {
            System.out.println(q + " Name is : " + itr11.next().getSection());
            q++;
        } while (itr11.hasNext());


        System.out.println(" ");
        int r = 0;
        Iterator<Student1> itr12 = students.iterator();//todo method 12
        do {
            System.out.println(r + " Name is : " + itr12.next().getRoll_no());
            r++;
        } while (itr12.hasNext());


        return students;
    }

    public static void main(String[] args) {
        StudentHashSet obj = new StudentHashSet();
        HashSet<Student1> studentsData = obj.createStudentSet();
        System.out.println(" ");
        System.out.println("****Using Advanced for loop****");
        System.out.println(" ");
        int i = 0;
        for (Student1 var : studentsData) {
            System.out.println("Name is :" + var.getName() + "|" + " Age is : " + var.getAge() + "|" + " Section is : " + var.getSection() + "|" + " Roll_no is : " + var.getRoll_no() + "|" + " at INDEX " + i);
            i++;
        }

    }
}

