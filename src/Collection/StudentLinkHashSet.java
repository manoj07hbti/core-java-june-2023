package Collection;

import Collection.Model.Student;

import java.util.LinkedHashSet;

public class StudentLinkHashSet {
    public LinkedHashSet<Student> CreateStudentLinkHashSet() {
        LinkedHashSet<Student> StudentData = new LinkedHashSet<>();
        Student student1 = new Student("Ravi", "Rakesh Kumar ", 33, 123);
        Student student2 = new Student("Ravi Kuamr", "Mohit Kumar ", 34, 124);
        Student student3 = new Student("Shiv Kumar", "Manish Kumar ", 35, 125);
        Student student4 = new Student("Rakesh Sharma", "Sachin Sharma ", 37, 126);
        Student student5 = new Student("Rahul Mathur", "Satyveer Kumar ", 30, 127);
        Student student6 = new Student("Ravi Kant", "Ramesh Kumar ", 31, 128);

        StudentData.add(student1);
        StudentData.add(student2);
        StudentData.add(student3);
        StudentData.add(student4);
        StudentData.add(student5);
        StudentData.add(student6);


        return StudentData;
    }

    public static void main(String[] args) {
        StudentLinkHashSet obj = new StudentLinkHashSet();
        LinkedHashSet<Student> Students = obj.CreateStudentLinkHashSet();
        for (Student var : Students) {
            System.out.println("Printing Name : " + var.getStudentName() + "Father : " + var.getFatherName() + "age :" + var.getAge() + "Roll No. " + var.getRollNumber());
        }
    }
}
