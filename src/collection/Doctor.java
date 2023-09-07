package collection;

import collection.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Doctor {

    public ArrayList EmployDoctor() {

        ArrayList<collection.model.Doctor> DoctorList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Doctor Name :");

        String Name = sc.nextLine();

        System.out.println("Doctor Degree :");

        String Degree = sc.nextLine();
        System.out.println("Doctor Department :");

        String Department = sc.nextLine();

        System.out.println("Doctor Salary : ");

        int Salary = sc.nextInt();

        return DoctorList;

    }

    public static void main(String[] args) {


        Doctor obj = new Doctor();
        ArrayList doctor = obj.EmployDoctor();

        Scanner sc = new Scanner(System.in);


    }

}

