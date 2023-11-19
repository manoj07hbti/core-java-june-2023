package sep10test;

import collection.model.Student;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Senior {

    // 1. write a method which will create list of 10 students:

    public ArrayList<Student> createStudentList(){

        ArrayList<Student> studentdata = new ArrayList<>();

        Student student1 = new Student("Mayank",1,600,"Sc");
        Student student2 = new Student("Rohan",2,100,"HM");
        Student student3 = new Student("AAshu",3,98,"Reso");
        Student student4 = new Student("Palak",4,65,"IT");
        Student student5 = new Student("Naman",5,85,"Sc");
        Student student6 = new Student("Ritwik",6,55,"Ec");
        Student student7 = new Student("Abeer",7,600,"Metric");
        Student student8 = new Student("Prem",8,400,"Metric");
        Student student9 = new Student("Kreyansh",9,98,"MI");
        Student student10 = new Student("Aham",10,600,"Med");

        studentdata.add(student1);
        studentdata.add(student2);
        studentdata.add(student3);
        studentdata.add(student4);
        studentdata.add(student5);
        studentdata.add(student6);
        studentdata.add(student7);
        studentdata.add(student8);
        studentdata.add(student9);
        studentdata.add(student10);

        return studentdata;

    }
    public static void main(String args []){
        Senior obj = new Senior();
        ArrayList<Student> Student = obj.createStudentList();

        // 2. find student with branch "CS":

        System.out.println(" Using advanced loop : ");
        System.out.println(" ");
        System.out.println(" Those students whose related to CS branch : ");

        for (Student student: Student){
            if (student.getBranch().equals("CS")){
                System.out.println("Name is : "+student.getName()+" roll no: "+student.getRollno()+" branch : "+ student.getBranch()+" marks: "+student.getMarks());

            }
        }
        // 3.find out student with highest and lowest marks:
         System.out.println(" ");
         System.out.println(" using advanced for loop : ");
         System.out.println(" Finding highest and lowest marks : ");
         System.out.println(" ");
         Student max = Student.get(0);
         Student min = Student.get(0);

         for (Student student : Student){
             if (student.getMarks()>max.getMarks()){
                 max = student;
                 System.out.println("Student with highest marks: "+max.getMarks());
             }

         }
         for (Student student : Student){
             System.out.println("Student with highest marks: "+max.getMarks());
             System.out.println(" ");
             System.out.println(" Student with lowest mark :"+min.getMarks());

             // find and print student between roll no 3 to 7 :
             System.out.println(" ");
             System.out.println(" Finding student between roll no 3 to 7 : ");
             System.out.println(" ");
             System.out.println(" Using advanced for loop : ");
             System.out.println(" ");
             for (Student student1: Student){
                 if (student.getRollno()>= 3 && student1.getRollno()<= 7){
                     System.out.println(" Name of student : "+student.getName()+" roll no: "+student.getRollno()+" branch: "+student.getBranch()+" marks: "+student.getMarks());
                 }
             }
             // 5. Print all students with for ,while,do while,and advanced loop:
             System.out.println(" ");
             System.out.println(" using for loop");
             System.out.println(" ");

             int i = 0;
             for (int i1 = 0; i< Student.size(); i++){
                 System.out.println(" Name is : "+Student.get(i).getName()+" roll no: "+Student.get(i).getRollno()+" ");
             }
             System.out.println(" Using while loop : ");
             System.out.println(" ");
             int j = 0;
             while (j> Student.size()){
                 System.out.println("Name is : "+Student.get(j).getName()+" roll no : "+ Student.get(j).getRollno()+" branch : "+ Student.get(j).getBranch()+" marks : "+ Student.get(j).getMarks());
                 j++;
             }
             System.out.println(" ");
             System.out.println(" Using do while loop : ");

             int k = 0;
             do {
                 System.out.println("Name is : "+Student.get(k).getName()+" roll no: "+Student.get(k).getRollno()+" branch : "+Student.get(k).getBranch()+"marks: "+Student.get(k).getMarks());
                 k++;
             }while (k < Student.size());

             System.out.println(" ");
             System.out.println(" using advanced loop : ");

             System.out.println(" ");
             for (Student student1: Student){
                 System.out.println(" Name is : "+student.getName()+" roll no : "+student.getRollno()+" branch : "+student.getBranch()+" marks: "+student.getMarks());
             }

         }










        }

    }


