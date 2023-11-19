package cllection.hashset;

import collection.model.Student;

import java.util.HashSet;

public class StudentHashSet {

    public HashSet<Student> createStudentSet(){
        HashSet<Student> studentshashset = new HashSet<>();

        Student student1 = new Student("Raj",1,400,"SC");
        System.out.println("Hashcode of student1 : "+student1.hashCode());
        Student student2 = new Student("Raj",2,400,"SC");
        System.out.println("Hashcode of student2 : "+student2.hashCode());
        Student student3 = new Student("Shobhit",3,100,"Metric");
        System.out.println("Hashcode of student3 : "+student3.hashCode());
        Student student4 = new Student("Shobhit",4,100,"Metric");
        System.out.println("Hashcode of student4 : "+student4.hashCode());
        Student student5 = new Student("Rishi",5,200,"CS" );
        System.out.println("Hashcode of student5 : "+student5.hashCode());
        Student student6 = new Student("Rishi",6,200,"CS");
        System.out.println("Hashcode of student6 : "+student6.hashCode());
        Student student7 = new Student("Pankaj",7,600,"Reso");
        System.out.println("Hashcode of student7 : "+student7.hashCode());
        Student student8 = new Student("Pankaj",8,600,"Reso");
        System.out.println("Hashcode of student8 : "+student8.hashCode());
        Student student9 = new Student("Anuj",9,99,"CM" );
        System.out.println("Hashcode of student9 : "+student9.hashCode());
        Student student10 = new Student("Anuj",10,99,"CM");
        System.out.println("Hashcode of student10 : "+student10.hashCode());


        studentshashset.add(student1);
        studentshashset.add(student2);
        studentshashset.add(student3);
        studentshashset.add(student4);
        studentshashset.add(student5);
        studentshashset.add(student6);
        studentshashset.add(student7);
        studentshashset.add(student8);
        studentshashset.add(student9);
        studentshashset.add(student10);

        return studentshashset;

    }
    public static void main(String args []){
        StudentHashSet Obj = new  StudentHashSet();
       HashSet<Student> students = Obj.createStudentSet();

       System.out.println(" Printing Student data : ");

       System.out.println(" Using Advanced Loop : ");

       for (Student student : students){

           System.out.println(" Student name :"+student.getName()+ " Student roll no: "+student.getRollno());
       }
    }
}
