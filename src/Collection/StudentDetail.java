package Collection;

import java.util.ArrayList;

public class StudentDetail {
    public void Student() {
        String StudentName = "Shiv Kumar";
        String FatherName = "Suresh Chandra Mathur";
        String StudentAdd = "Tundla";
        int RollNumber = 01;
        String StudentName1 = "Rohit Kumar";
        String FatherName1 = "Satish Chandra Mathur";
        String StudentAdd1 = "Agra";
        int RollNumber1 = 02;
        String StudentName2 = "Nitin Kumar";
        String FatherName2 = "Nirottam Chandra Mathur";
        String StudentAdd2 = "Kanpur";
        int RollNumber2 = 03;
        String StudentName3 = "Manish Kumar";
        String FatherName3 = "Mahesh Kumar";
        String StudentAdd3 = "Tundla";
        int RollNumber3 = 04;
        String StudentName4 = "Ramesh Kumar";
        String FatherName4 = "Ram Singh";
        String StudentAdd4 = "Firozabad";
        int RollNumber4 = 05;
        //* Create ArrayList Object;
        ArrayList Student = new ArrayList();
        Student.add("Shiv Kumar");
        Student.add("Suresh Chandra Mathur");
        Student.add("Tundla");
        Student.add(01);
        Student.add("Rohit Kumar");
        Student.add("Satish Chandra Mathur");
        Student.add("Agra");
        Student.add(02);
        Student.add("Nitin Kumar");
        Student.add("Nirottam Chandra Mathur");
        Student.add("Kanpur");
        Student.add(03);
        Student.add("Manish Kumar");
        Student.add("Mahesh Kumar");
        Student.add("Tundla");
        Student.add(04);
        Student.add("Ramesh Kumar");
        Student.add("Ram Singh");
        Student.add("Firozabad");
        Student.add(05);

        System.out.println("Printing Student Name is : " + Student.get(0));
        System.out.println("Printing Student Father Name is : " + Student.get(1));
        System.out.println("Printing Student Address is : " + Student.get(2));
        System.out.println("Printing Student Roll No. is : " + Student.get(3));

        for (int i = 0; i < Student.size(); i++) {
            System.out.println(" Before Delete Printing Student Detail is : " + Student.get(i) + "  Index :" + i);

        }
        // Remove Data
        Student.remove(1);
        for (int i = 0; i < Student.size(); i++) {
            System.out.println(" After Delete Printing Student Detail is : " + Student.get(i) + "  Index :" + i);

        }
        // Again Delete Data
        Student.remove(3);
        for (int i = 0; i < Student.size(); i++) {
            System.out.println(" Again after Delete Printing Student Detail is : " + Student.get(i) + "Index" + i);

        }
        // Using Do While Loop
        int i = 0;
        do {
            System.out.println("Using Do While Loop Student Data Printing Student Detail is : " + Student.get(i));
            i++;

        }

        while (i < Student.size());

        System.out.println();

    }


    public static void main(String[] args) {
        StudentDetail obj = new StudentDetail();
        obj.Student();

    }
}
