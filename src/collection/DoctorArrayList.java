package collection;

import java.util.ArrayList;
import java.util.Scanner;

import collection.model.Doctor;

public class DoctorArrayList {


    public ArrayList<Doctor> doctorDataWithUserInput() {
        ArrayList<Doctor> doctorData = new ArrayList<>();
        return doctorData;
    }

    public static void main(String[] args) {
        String flag = "y";

        DoctorArrayList obj = new DoctorArrayList();

        while (flag.equals("y")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter Doctor Name :");
            String name = scanner.nextLine();
            System.out.println("Please Enter Fees :");
            int fess = scanner.nextInt();
            Scanner scanner1 = new Scanner(System.in);

            System.out.println("Please Enter Doctor's Dept :");
            String specialist = scanner1.nextLine();
            new Doctor(name, fess, specialist);


            ArrayList<Doctor> doctor = obj.doctorDataWithUserInput();

            for (Doctor value : doctor) {
                System.out.println("Created Data for " + value.getDoctorName() + " , " + value.getFees() + " , " + value.getSpecialist());

            }
            System.out.println("Press Y to continue........and any key to Exit");
            Scanner scanner2 = new Scanner(System.in);

            flag = scanner2.nextLine();

        }

    }
}