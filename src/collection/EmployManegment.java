package collection;

import collection.model.Employ;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployManegment {

    public ArrayList<Employ> Employ() {

        ArrayList<Employ> EmployList = new ArrayList<>();

        Employ E1 = new Employ("SANJAY", "AMUL MILK", 30000, 45);

        Employ E2 = new Employ("RAJU", "PHONIX MALL", 25000, 67);

        Employ E3 = new Employ("RAHUL", "HOSPITAL", 45000, 501);

        EmployList.add(E1);
        EmployList.add(E2);
        EmployList.add(E3);
        return EmployList;

    }

    public Employ datawithusarInput() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Employ Name :");
        String Name = scanner.nextLine();
        System.out.println("Employ WorkPlace  :");
        String WorkPlace = scanner.nextLine();
        System.out.println("Employ Salary :");
        int Salary = scanner.nextInt();
        System.out.println("Employ ID");
        int ID = scanner.nextInt();
        Employ employ1 = new Employ(Name, WorkPlace, Salary, ID);

        return employ1;
    }

    public static void main(String[] args) {

        EmployManegment obj = new EmployManegment();
        ArrayList<Employ> employs = obj.Employ();
        for (int i = 0; i < employs.size(); i++) {
            System.out.println("Name :" + employs.get(i).getName() + "  WorkPlace   " + employs.get(i).getWorkPlace() + "    Salary :" + employs.get(i).getSalary() + "ID : " + employs.get(i).getID());
        }
        for (Employ var : employs) {

            System.out.println("Name" + var.getName() + "WorkPlace :" + var.getWorkPlace() + "Salry:" + var.getSalary() + "ID :" + var.getID());
        }


        Employ employ1 = obj.datawithusarInput();

        for (int i = 0; i < employs.size(); i++) {
            System.out.println("Name :" + employs.get(i).getName() + "  WorkPlace   " + employs.get(i).getWorkPlace() + "    Salary :" + employs.get(i).getSalary() + "ID : " + employs.get(i).getID());

        }
        Scanner scanner = new Scanner(System.in);


    }


}
