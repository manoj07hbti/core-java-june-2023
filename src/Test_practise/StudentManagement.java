package Test_practise;

import java.util.ArrayList;

public class StudentManagement {

    public ArrayList<Student> CreateStudentList(){
        ArrayList<Student>students=new ArrayList<>();

        students.add(new Student("Gagan","Civil",1,23));
        students.add(new Student("Deepak","cs",2,76));
        students.add(new Student("Piyush","Sociology",3,98));
        students.add(new Student("Gagan","Civil",4,33));
        students.add(new Student("Tapan","cs",5,66));
        students.add(new Student("Happy","cs",6,43));
        students.add(new Student("Rohan","Electrical",7,22));
        students.add(new Student("Vipin","cs",8,13));
        students.add(new Student("Ankit","Geography",9,73));
        students.add(new Student("Krishna","history",10,63));

        return students;

    }

    public static void main(String[] args) {
        StudentManagement obj=new StudentManagement();
        ArrayList<Student>studentList=obj.CreateStudentList();

        // student related cs branch//
        System.out.println("student with cs branch");
        for (Student student:studentList){
            if (student.branch.equals("cs")){
                System.out.println(student.name);
            }

        }

       // find out student with highest and lowest marks//
        Student highestMarkStudent = studentList.get(0);
        Student LowestMarkStudent  = studentList.get(0);

        for (Student student:studentList){
            if (student.marks < highestMarkStudent.marks){
                highestMarkStudent=student;
            }

            if (student.marks > LowestMarkStudent.marks){
                LowestMarkStudent=student;
            }
        }
        System.out.println("student with highest marks"+highestMarkStudent.name);
        System.out.println("student with lowest marks"+LowestMarkStudent.name);

        // find student rollNo  3 to 7//
        System.out.println("student between roll no 3 to 7");
        for (Student student:studentList){
            if (student.rollNo > 3 && student.rollNo < 7){
                System.out.println(student.name);
            }
        }

        // print all loops //
        System.out.println("student using while loop");
       int i=0;
       while (i < studentList.size()){
           System.out.println(studentList.get(i).name);
           i++;
       }
        System.out.println("student using do while loop");
       int j=0;
       do {
           System.out.println(studentList.get(j).name);
           j++;
       } while (j < studentList.size());

       System.out.println("using student advanced loop");
       for (Student student:studentList){
           System.out.println(student.name);
       }



    }
}
