package class_and_object;

public class Student {
    String Name;
    String Age;
    int rollNo;
    String Subclass;

    public Student(String name, String age, int rollNo, String subclass) {
        Name = name;
        Age = age;
        this.rollNo = rollNo;
        Subclass = subclass;
    }

    public static void main(String[] args) {

        Student Student = new Student("imran", "32", 30, "A");

        System.out.println("student name:" + Student.Name + ":Age:" + Student.Age + ":Roll:" + Student.rollNo + ":Subclass:" + Student.Subclass);

        Student student2 = new Student("Rakul", "25", 21, "B");

        System.out.println("student nme:" + student2.Name + ":age:" + student2.Age);

        System.out.println("student roll no:" + student2.rollNo + ":subclass" + student2.Subclass);

        Student student1 = new Student("Pramod", "21", 23, "D");

        System.out.println("Student name:" + student1.Name + ": age:" + student1.Age);

        System.out.println("student rollno:" + student1.rollNo + ":subclass:" + student1.Subclass);

        Student student3 = new Student("Ankit", "20", 13, "E");

        System.out.println("Student name:" + student3.Name + ": age:" + student3.Age);

        System.out.println("student rollno:" + student3.rollNo + ":subclass:" + student3.Subclass);

    }

}
