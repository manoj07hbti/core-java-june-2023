package collection.arraylist;

import collection.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistUsingScanner {

  /*public  ArrayList<Student> student(){

      ArrayList<Student> studList=new ArrayList<>();
      Student student1=new Student("Raj",22,"Science");
      Student student2=new Student("Ratan",22,"Science");
      Student student3=new Student("Reva",22,"Science");
      Student student4=new Student("Rushi",22,"Science");

      studList.add(student1);
      studList.add(student2);
      studList.add(student3);
      studList.add(student4);

      return studList;
     // int i=0;
    //  while ( i<studList.size()){

      //    System.out.println(""+studList.get(i));
        //  i++;
      }
*/
      public ArrayList<Student> studentDataWithInput() {
          ArrayList<Student> studentArrayList=new ArrayList<>();
          String choice = "y";
          int rollNo = 0;
          String name;
          int age;
          String section;
          // Student student1 = null;
          // Student student1 = null;
         Student student1 =new Student();
          {
              while (choice.equals("y")) {
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter rollNoo");
                  rollNo= sc.nextInt();
                    Scanner sc3=new Scanner(System.in);
                  System.out.println("Enter the Student name");
                  name = sc3.nextLine();
                  Scanner sc2 = new Scanner(System.in);
                  System.out.println("Enter the age");
                  age = sc2.nextInt();
                  Scanner sc1 = new Scanner(System.in);
                  System.out.println("Enter the section");
                  section = sc1.nextLine();

                Student student=new Student(rollNo,name,age,section);
                  studentArrayList.add(student);
                  System.out.println("press  y to continue or exit too any key");
                  Scanner sc4 = new Scanner(System.in);
                  choice = sc4.nextLine();


                  //   return student1;

                  //    for (Student var:studentDataWithInput)
              }


          }
         /* System.out.println("All Students Data Entered:");
          for (Student student : studentArrayList) {
              System.out.println("Name: " + student.getName() + "Age: " + student.getAge() + "Section: " + student.getSection());
          }*/

          return studentArrayList;
      }





    public static void main(String[] args) {
        ArraylistUsingScanner obj = new ArraylistUsingScanner();
        ArrayList<Student> students = obj.studentDataWithInput();


        // Student studentArrayList=as.studentDataWithInput();
        //  System.out.println("created data for student"+":"+student1.getName()+","+student1.getAge()+","+student1.getSection());

        System.out.println("All Students Data Entered:");
        for (Student student : students) {
            System.out.println("rollNo: "+student.getRollNo()+"\tName: " + student.getName() + "\tAge: " + student.getAge() + "\tsection: " + student.getSection());
        }
    }

    }
