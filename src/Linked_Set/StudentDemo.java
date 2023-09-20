package Linked_Set;

import java.util.LinkedHashSet;

public class StudentDemo {

    public LinkedHashSet<Student> createStudentList(){
        LinkedHashSet<Student>list=new LinkedHashSet<>();
        list.add(new Student("Raman","Gurugram",1,11));
        list.add(new Student("RAj","Haryana",2,12));
        list.add(new Student("harpal","Indore",3,13));
        list.add(new Student("Jack","Khandwa",4,14));
        list.add(new Student("jill","Punjab",5,15));
        list.add(new Student("gagan","Datia",6,16));
        list.add(new Student("Shreyas","Gwalior",7,17));
        list.add(new Student("Kapil","Khargone",8,18));
        list.add(new Student("Harjeet","Surat",9,19));
        list.add(new Student("Happy","Dabra",10,20));
        return list;
    }

    public static void main(String[] args) {
        StudentDemo obj=new StudentDemo();
        LinkedHashSet<Student>result=obj.createStudentList();

        for (Student var:result){
            System.out.println("printing student name :" +var.getName()+ "address :" +var.getAddress()+ "roll no :" +var.getRollNo()+ "studentId :" +var.getStudentId());
        }
    }
}
