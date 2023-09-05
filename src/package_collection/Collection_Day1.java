package package_collection;

import java.util.ArrayList;

public class Collection_Day1 {

    public void Student() {

        String StudentName = "Ambika Singh";
        String FatherName = "Mr Rajendra";
        String StudentAdd = "Tundla";
        int RollNumber = 01;
        String StudentName1 = "Deepak";
        String FatherName1 = "Mr Raju Singh";
        String StudentAdd1 = "Firozabad";
        int RollNumber1 = 02;
        String StudentName2 = "Neha";
        String FatherName2 = "Dinesh Chandra";
        String StudentAdd2 = "Shikohabad";
        int RollNumber2 = 03;
        String StudentName3 = "Manisha";
        String FatherName3 = "Narendra Pratap";
        String StudentAdd3 = "Sirsaganj";
        int RollNumber3 = 04;
        String StudentName4 = "Aabhya";
        String FatherName4 = "Hemant Raj";
        String StudentAdd4 = "Lucknow";
        int RollNumber4 = 05;
        //* Create ArrayList Object;
        ArrayList Student = new ArrayList();
        Student.add("Ambika Singh");
        Student.add("Mr Rajendra");
        Student.add("Tundla");
        Student.add(01);
        Student.add("Deepak");
        Student.add("Mr Raju Singh");
        Student.add("Firozabad");
        Student.add(02);
        Student.add("Manisha");
        Student.add("Narendra Pratap");
        Student.add("Sirsaganj");
        Student.add(03);
        Student.add("Neha");
        Student.add("Dinesh Chandra");
        Student.add("Shikohabad");
        Student.add(04);
        Student.add("Aabhya");
        Student.add("Hemant Raj");
        Student.add("Lucknow");
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
        Collection_Day1 obj = new Collection_Day1();
        obj.Student();


    }

}
