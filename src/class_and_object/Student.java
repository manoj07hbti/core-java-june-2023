package class_and_object;

public class Student {

    String name="Rahul";
    int rollNo=1;
    String section="CS";

    public static void main(String[] args) {

        Student student1= new Student();

        System.out.println("Printing Student name:"+student1.name+" Roll No:"+student1.rollNo+" Section:"+student1.section);
    }
}
