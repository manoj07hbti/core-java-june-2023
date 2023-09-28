package collection.arraylist;

import collection.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoStudentsList {

    public  ArrayList<Student> createStudentData(){

        ArrayList <Student> studentsList = new ArrayList<>();

        Student student1= new Student("Raj",21,"CS");
        Student student2= new Student("Rajat",21,"IT");
        Student student3= new Student("Mohit",20,"CS");

        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);

        return studentsList;
    }

    public Student studentDataWithUserInput(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter student name: ");
        String name= scanner.nextLine();

        System.out.println("Please enter student Age: ");
        int age= scanner.nextInt();

        Scanner scanner1= new Scanner(System.in);
        System.out.println("Please enter student Section: ");
        String section= scanner1.nextLine();

        Student student1= new Student(name,age,section);

        return student1;
    }

    public static void main(String[] args) {

        DemoStudentsList obj= new DemoStudentsList();

        ArrayList<Student> students= obj.createStudentData();

        for(int i=0; i<students.size(); i++){

            System.out.println("Name: "+students.get(i).getName() +" Age: "+students.get(i).getAge()+" Section:"+students.get(i).getSection());
        }

        for (Student var : students){

            System.out.println("Name: "+var.getName() + " Age: "+var.getAge()+" Section:"+var.getSection());
        }

        Student student=obj.studentDataWithUserInput();

        System.out.println("Created Data for "+student.getName() +" , "+student.getAge()+" , "+student.getSection());

    }



}
