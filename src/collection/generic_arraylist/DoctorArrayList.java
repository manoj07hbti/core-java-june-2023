package collection.generic_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

import collection.model.Doctor;

public class DoctorArrayList {
    static ArrayList<Doctor> doctorArrayList = new ArrayList<>();

    public static void main(String[] args) {
        String flag = "y";

        while (flag.equals("y")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter Doctor Name :");
            String name = scanner.nextLine();
            System.out.println("Please Enter Fees :");
            int fees = scanner.nextInt();


            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please Enter Doctor's Dept :");
            String specialist = scanner1.nextLine();

            Doctor doctor = new Doctor(name, fees, specialist);
            doctorArrayList.add(doctor);


            System.out.println(" ");

            System.out.println("Press Y to continue........and any key to Exit");
            Scanner scanner3 = new Scanner(System.in);
            flag = scanner3.nextLine();


        }
        int i = 0;
        for (Doctor doctor : doctorArrayList) {
            System.out.println("Name is : " + doctor.getDoctorName() + " | " + " Fess is : " + doctor.getFees() + " | " + " Department is : " + doctor.getSpecialist() + " at INDEX " + i);
            i++;
        }
    }
}






