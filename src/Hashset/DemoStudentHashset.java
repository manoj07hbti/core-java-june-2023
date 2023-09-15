package Hashset;

import java.util.HashSet;

public class DemoStudentHashset {

    public  HashSet<Student> createStuSet(){

        HashSet<Student>Students=new HashSet<>();

        Student student1=new Student("raj",1,"cs","gwalior",34);
        System.out.println("hashcode of student1"+student1.hashCode());
        Student student2=new Student("Yash",2,"civil","indore",77);
        System.out.println("hashcode of student2"+student2.hashCode());
        Student student3=new Student("aman",3,"mechanical","guna",97);
        System.out.println("hashcode of student3"+student3.hashCode());
        Student student4=new Student("Raghu",4,"electrical","Datia",66);
        System.out.println("hashcode of student4"+student4.hashCode());
        Student student5=new Student("Darsh",5,"Finance","Bhind",44);
        System.out.println("hashcode of student5"+student5.hashCode());
        Student student6=new Student("Shivam",6,"marketing","khandwa",55);
        System.out.println("hashcode of student6"+student6.hashCode());
        Student student7=new Student("Shivam",6,"marketing","khandwa",55);
        System.out.println("hashcode of student7"+student7.hashCode());
        Student student8=new Student("Yash",2,"civil","indore",77);
        System.out.println("hashcode of student8"+student8.hashCode());

        Students.add(student1);
        Students.add(student2);
        Students.add(student3);
        Students.add(student4);
        Students.add(student5);
        Students.add(student6);
        Students.add(student7);
        Students.add(student8);


        return Students;

    }

    public static void main(String[] args) {

        DemoStudentHashset obj=new DemoStudentHashset();
        HashSet<Student>students=obj.createStuSet();

        for (Student student:students){
            System.out.println( "name of student" + student.getName() + "roll no of student"  +student.getRollNo() + "branch of student" +student.getBranch() + "city of student" +student.getCity() + "marks of student"+student.getMarks());
        }


    }

}
