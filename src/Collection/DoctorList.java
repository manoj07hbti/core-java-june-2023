package Collection;

import Collection.Model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorList {
    public ArrayList<DoctorList> doctorUserInput() {
        ArrayList<DoctorList> Doctor = new ArrayList<>();
        return Doctor;
    }

    public static void main(String[] args) {
        String flag = "y";
        DoctorList obj = new DoctorList();
        while (flag.equals("y")) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Please Enter Your Doctor Name : ");
            String DoctorName = sc.nextLine();
            System.out.println("Please Enter Your Doctor Degree : ");
            String DoctorDegree = sc.nextLine();
            System.out.println("Please Enter Your Doctor fees : ");
            int DoctorFees = sc.nextInt();
            System.out.println("Welcome to peasant at my Hospital");
            sc.nextLine();
            ArrayList<Doctor> Doctor = new ArrayList<>();

            for (Doctor var : Doctor) {
                System.out.println(" doctor list " + var.getDoctorName() + var.getDoctorDegree() + var.getDoctorFees());

            }
            System.out.println("continue press y otherwise exit");
            Scanner sc1 = new Scanner(System.in);
            flag = sc1.nextLine();

        }

    }
}

