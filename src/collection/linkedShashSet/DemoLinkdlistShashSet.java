package collection.linkedShashSet;

import collection.model.Employ;
import collection.model.Student;
import collection.model.StudentExam;
import method.Object;

import java.util.LinkedHashSet;

public class DemoLinkdlistShashSet {

    public LinkedHashSet<String> linkdlist() {


        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("APPLE");
        set.add("MANGO");
        set.add("ORANGE");
        set.add("PINEAPPLE");
        set.add("BANANA");
        set.add("LICHHY");
        set.add("PAPAYA");
        set.add("ANANIAS");
        set.add("GOA");
        set.add("POTATO");
        set.add("ONION");
        set.add("CHILLY");
        set.add("TOMATO");
        set.add("DRY FRUIT");

        return set;
    }

    public LinkedHashSet<Integer> numberlist() {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(12);
        set.add(13);
        set.add(14);
        set.add(15);
        set.add(16);
        set.add(17);
        set.add(18);
        set.add(19);
        set.add(20);
        set.add(21);
        set.add(22);
        set.add(23);
        set.add(24);
        set.add(25);
        set.add(26);
        set.add(27);
        return set;
    }

    public LinkedHashSet<StudentExam> Studentlist() {

        LinkedHashSet<StudentExam> studentset = new LinkedHashSet<>();
        StudentExam studentExam = new StudentExam("Uday", "CS", 24, 68);
        StudentExam studentExam1 = new StudentExam("sanju", "IT", 25, 73);
        StudentExam studentExam2 = new StudentExam("Ram", "EC", 27, 61);
        StudentExam studentExam3 = new StudentExam("sanju", "Civil", 85, 79);
        StudentExam studentExam4 = new StudentExam("Deleep", "Bsc IT", 54, 68);
        StudentExam studentExam5 = new StudentExam("Santosh", "Bac Bio", 25, 79);
        StudentExam studentExam6 = new StudentExam("Saurabh", "B Pharma", 24, 62);
        StudentExam studentExam7 = new StudentExam("Shushil", "D pharma", 25, 87);
        StudentExam studentExam8 = new StudentExam("Rajan", "BA", 23, 64);
        StudentExam studentExam9 = new StudentExam("Sajan", "BCA", 29, 75);
        StudentExam studentExam10 = new StudentExam("Ajay", "MCA", 43, 69);
        StudentExam studentExam11 = new StudentExam("Vijay", "MBBS", 65, 80);


        studentset.add(studentExam1);
        studentset.add(studentExam2);
        studentset.add(studentExam3);
        studentset.add(studentExam4);
        studentset.add(studentExam5);
        studentset.add(studentExam6);
        studentset.add(studentExam7);
        studentset.add(studentExam8);
        studentset.add(studentExam9);
        studentset.add(studentExam10);
        return studentset;

    }

    public LinkedHashSet<Employ> Employclass() {

        LinkedHashSet<Employ> employset = new LinkedHashSet<>();

        Employ employ1 = new Employ("Santosh", "TCS", 55000, 20);
        Employ employ2 = new Employ("Santosh", "ITC", 54000, 22);
        Employ employ3 = new Employ("Subham", "CS", 53000, 24);
        Employ employ4 = new Employ("Suresh", "EC", 52000, 26);
        Employ employ5 = new Employ("Chandan", "Britannia", 51000, 28);
        Employ employ6 = new Employ("Chandu", "TATA Motors", 59000, 30);
        Employ employ7 = new Employ("Saurabh", "Samsung", 51400, 32);
        Employ employ8 = new Employ("Ashutosh", "Vivo", 59500, 34);
        Employ employ9 = new Employ("Jitendra", "Apple", 56000, 36);
        Employ employ10 = new Employ("Suraj", "Facebook", 57800, 38);
        Employ employ11 = new Employ("Somesh", "Microsoft", 53600, 40);
        Employ employ12 = new Employ("Rahul", "Amazon", 55700, 43);

        employset.add(employ1);
        employset.add(employ2);
        employset.add(employ3);
        employset.add(employ4);
        employset.add(employ5);
        employset.add(employ6);
        employset.add(employ7);
        employset.add(employ8);
        employset.add(employ9);
        employset.add(employ10);
        employset.add(employ11);
        employset.add(employ12);

        return employset;
    }

    public LinkedHashSet<Double> Double() {

        LinkedHashSet<Double> salaryset = new LinkedHashSet<>();

        salaryset.add(20000.98);
        salaryset.add(21000.8);
        salaryset.add(23000.67);
        salaryset.add(24000.87);
        salaryset.add(24500.90);
        salaryset.add(24780.54);
        salaryset.add(25000.67);
        salaryset.add(25500.24);
        salaryset.add(25900.43);
        salaryset.add(26000.98);
        salaryset.add(27000.36);
        salaryset.add(27500.68);
        salaryset.add(28000.32);
        salaryset.add(28600.45);
        salaryset.add(29000.76);
        salaryset.add(29500.53);
        salaryset.add(300000.76);
        salaryset.add(45000.68);
        salaryset.add(54327.9855);
        salaryset.add(32558.76);
        salaryset.add(20000.98);
        salaryset.add(21000.8);
        salaryset.add(23000.67);
        salaryset.add(24000.87);
        return salaryset;


    }


    public static void main(String[] args) {

        DemoLinkdlistShashSet obj = new DemoLinkdlistShashSet();
        LinkedHashSet<String> result = obj.linkdlist();
        LinkedHashSet<Integer> integers = obj.numberlist();
        LinkedHashSet<Double> doubles = obj.Double();
        LinkedHashSet<StudentExam> Student = obj.Studentlist();
        LinkedHashSet<Employ> employs = obj.Employclass();

        System.out.println("****Print deta with advanced loops***");

        for (String set : result) {

            System.out.println("Name : " + set);
        }

        System.out.println("*****Print Integer data with advanced loops***** ");

        for (Integer integer : integers) {

            System.out.println("Print data :" + integer);
        }

        System.out.println("       ");
        System.out.println("*****Print DOUBLE data with advanced loops****");
        System.out.println("                     ");

        for (Double var : doubles) {

            System.out.println("Print double data :" + var);
        }

        System.out.println(" ");
        System.out.println("*****Print student data for advanced loops**** ");
        System.out.println(" ");
        for (StudentExam var : Student) {

            System.out.println("Print student exam data : " + var.getName() + " Branch: " + var.getBranchName() + " RollNo : " + var.getRollNo() + "Marks: " + var.getRollNo());
        }
        System.out.println(" ");
        System.out.println("*****Print employ data with advanced loops*** ");
        System.out.println(" ");
        for (Employ employ : employs) {

            System.out.println("Employ Name : " + employ.getName() + " :Company " + employ.getWorkPlace() + " :Salary " + employ.getSalary() + " :ID " + employ.getID());
        }

    }
}





