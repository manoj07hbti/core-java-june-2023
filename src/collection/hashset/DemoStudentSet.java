package collection.hashset;

import collection.model.Student;

import java.util.HashSet;

public class DemoStudentSet {

    public HashSet<Student> createStudentSet(){

        HashSet<Student> studentHashSet= new HashSet<>();

        // create data
        Student student1= new Student("Raj",21,"CS");

        System.out.println("Hashcode of 1 student "+student1.hashCode());

        Student student2= new Student("Rajat",21,"IT");

        System.out.println("Hashcode of 2 student "+student2.hashCode());

        Student student3= new Student("Mohit",20,"CS");
        System.out.println("Hashcode of 3 student "+student3.hashCode());
        Student student4= new Student("Raj",21,"CS");
        System.out.println("Hashcode of 4 student "+student4.hashCode());
        Student student5= new Student("Rajat",21,"IT");
        System.out.println("Hashcode of 5 student "+student5.hashCode());
        Student student6= new Student("Mohit",20,"CS");
        System.out.println("Hashcode of 6 student "+student6.hashCode());

        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        studentHashSet.add(student5);
        studentHashSet.add(student6);

        return studentHashSet;
    }

    public static void main(String[] args) {

        DemoStudentSet obj= new DemoStudentSet();
        HashSet<Student> students= obj.createStudentSet();

        for(Student var: students){

            System.out.println("Name: "+var.getName() + " Age: "+var.getAge()+" Section:"+var.getSection());
        }
    }
}
