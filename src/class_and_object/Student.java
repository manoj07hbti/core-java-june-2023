package class_and_object;

public class Student {

    //data member or properties

    String name = "Jatin";

    int roll_no = 1222;

    String house = "Agni";

    public static void main(String[] args) {
        //ClassName objName=new ClassName(); DEFAULT CONSTRUCTOR


        Student student = new Student();
        //object.propertyName;

        System.out.println("Printing student Name:" + student.name);
        System.out.println("Printing student roll_no:" + student.roll_no);
        System.out.println("Printing student house:" + student.house);

        Student student1 = new Student();

        System.out.println("Printing student Name:" + student1.name + " Printing student roll_no:" + student1.roll_no + " Printing student house:" + student1.house);


    }


}
