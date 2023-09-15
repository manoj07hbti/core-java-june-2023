package Collection;

import Collection.Model.Student;

import java.util.HashSet;

public class StudentDemo {
    public HashSet<Student> CreateStudent() {
        HashSet<Student> StudentData = new HashSet<>();
        Student student1 = new Student("Shiv Kumar", "Suresh Chandra", 23, 1);
        System.out.println("Hashcode of Student1 " + student1.hashCode());
        Student student2 = new Student("Ravi Kant", "Teekam Singh", 33, 2);
        System.out.println("Hashcode of Student2 " + student2.hashCode());

        Student student3 = new Student("Shiv Kumar", "Suresh Chandra", 23, 1);
        System.out.println("Hashcode of Student3 " + student3.hashCode());

        Student student4 = new Student("Mukesh Kumar", "Shiv Lal", 37, 3);
        System.out.println("Hashcode of Student4 " + student4.hashCode());

        Student student5 = new Student("Sunil Kumar", "Shiv Charan", 30, 4);
        System.out.println("Hashcode of Student5 " + student5.hashCode());

        Student student6 = new Student("Shiv Kumar", "Suresh Chandra", 23, 1);
        System.out.println("Hashcode of Student6 " + student6.hashCode());

        StudentData.add(student1);
        StudentData.add(student2);
        StudentData.add(student3);
        StudentData.add(student4);
        StudentData.add(student5);
        StudentData.add(student6);
        return StudentData;


    }

    public static void main(String[] args) {
        StudentDemo obj = new StudentDemo();
        HashSet<Student> Students = obj.CreateStudent();
        for (Student var : Students) {
            System.out.println(var.getStudentName() + " Student Father name : " + var.getFatherName() + " Student Roll NUmber : " + var.getRollNumber() + "  Student Age : " + var.getAge());
        }
    }

}
