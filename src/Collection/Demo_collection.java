package Collection;

import java.util.ArrayList;

public class Demo_collection {

    public void student() {
        String StudentName = "aditya";
        String FatherName = "Samarth agarwal";
        String StudentAdd = "Gwalior";
        int RollNumber = 01;
        String StudentName1 = "anubhav ";
        String FatherName1 = "prabhat sharma";
        String StudentAdd1 = "guna";
        int RollNumber1 = 02;
        String StudentName2 = "yash";
        String FatherName2 = "ravi sharma";
        String StudentAdd2 = "indore";
        int RollNumber2 = 03;
        String StudentName3 = "Aadesh";
        String FatherName3 = "narayan sharma";
        String StudentAdd3 = "ujjain";
        int RollNumber3 = 04;
        String StudentName4 = "Naman";
        String FatherName4 = "sanjay sharma";
        String StudentAdd4 = "khandwa";
        int RollNumber4 = 05;

        ArrayList Student = new ArrayList();

        Student.add("aditya");
        Student.add("samarth agarwal");
        Student.add("Gwalior");
        Student.add(01);
        Student.add("anubhav");
        Student.add("prabhat sharma");
        Student.add("guna");
        Student.add(02);
        Student.add("yash");
        Student.add("ravi sharma");
        Student.add("indore");
        Student.add(03);
        Student.add("Aadesh");
        Student.add("narayan sharma");
        Student.add("ujjain");
        Student.add(04);
        Student.add("Naman");
        Student.add("sanjay sharma");
        Student.add("khandwa");
        Student.add(05);


        System.out.println("printing student name is:" + Student.get(0));
        System.out.println("printing student father name:" + Student.get(1));
        System.out.println("Printing Student Address is : " + Student.get(2));
        System.out.println("Printing Student Roll No. is : " + Student.get(3));
        System.out.println("printing student name is: " + Student.get(4));

        for (int i = 0; i < Student.size(); i++) {
            System.out.println(" Before Delete Printing Student Detail is : " + Student.get(i) + "  Index :" + i);
        }

        Student.remove(1);
        for (int i = 0; i < Student.size(); i++){
            System.out.println(" After Delete Printing Student Detail is : " + Student.get(i) + "  Index :" + i);

        }
        int i=0;
        do {
            System.out.println("using do while loop student data printing student detail is:"+Student.get(i));
            i++;
        }
        while (i < Student.size());
        System.out.println();



        }

        public static void main (String[]args){
            Demo_collection obj = new Demo_collection();
            obj.student();

        }

    }

