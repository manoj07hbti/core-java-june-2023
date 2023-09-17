package collection.hashset;

import collection.model.Employ;

import java.util.HashSet;

public class EmployHashset {

    public HashSet<Employ> Employ() {

        HashSet<Employ> Employ = new HashSet<>();
        Employ Employ1 = new Employ("UDAY", "Hospital", 45000, 12);
        Employ Employ2 = new Employ("Raj", "IT", 29000, 13);
        Employ Employ3 = new Employ("Rohit ", "Bank", 46000, 14);
        Employ Employ4 = new Employ("Shankar", "office", 15000, 23);
        Employ Employ5 = new Employ("Imtran", "Hospital", 55000, 65);
        Employ Employ6 = new Employ("Sanjay", "office", 57000, 78);
        Employ Employ7 = new Employ("Tarik", " Bank", 65000, 90);
        Employ Employ8 = new Employ("UDAY", "Hospital", 45000, 12);
        Employ Employ9 = new Employ("Raj", "IT", 29000, 13);
        Employ Employ10 = new Employ("Rohit ", "Bank", 46000, 14);
        Employ Employ11 = new Employ("Shankar", "office", 15000, 23);
        Employ Employ12 = new Employ("Imtran", "Hospital", 55000, 65);
        Employ Employ13 = new Employ("Sanjay", "office", 57000, 78);
        Employ Employ14 = new Employ("Tarik", "Bank", 65000, 90);

        Employ.add(Employ1);
        Employ.add(Employ2);
        Employ.add(Employ3);
        Employ.add(Employ4);
        Employ.add(Employ5);
        Employ.add(Employ6);
        Employ.add(Employ7);
        Employ.add(Employ8);
        Employ.add(Employ9);
        Employ.add(Employ10);
        Employ.add(Employ11);
        Employ.add(Employ12);
        Employ.add(Employ13);
        Employ.add(Employ14);


        return Employ;
    }


    public static void main(String[] args) {
        EmployHashset obj = new EmployHashset();
        HashSet<Employ> employs = obj.Employ();
        for (Employ var : employs) {
            System.out.println("print employ Name :" + var.getName() + "  Company:" + var.getWorkPlace() + "Salary:" + var.getSalary() + "Id :" + var.getID());
        }


    }
}
