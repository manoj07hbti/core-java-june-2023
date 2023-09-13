package collection;

import collection.model.Doctor;
import com.sun.org.apache.xalan.internal.xsltc.dom.ArrayNodeListIterator;

import java.util.ArrayList;

import java.util.Scanner;

public class Demo_DoctorList {

    static ArrayList<Doctor> doctorArrayList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String flag = "X";

        while (flag.equals("X")) {

            System.out.println("Please enter doctor Name :");

            String name = scanner.nextLine();

            System.out.println("Please enter doctor Fees :");

            int fees = scanner.nextInt();

            System.out.println("Please enter doctor Specialist :");

            String specialist = scanner.nextLine();

            Doctor doctor = new Doctor(name, fees, specialist);

            doctorArrayList.add(doctor);

            System.out.println("Press Y to continue........and any key to Exit");
            Scanner scanner2 = new Scanner(System.in);
            flag = scanner2.nextLine();
        }

        for (Doctor doctor : doctorArrayList) {

            System.out.println("Data created As +" + doctor.getDoctorName() + "|" + "fees is :" + doctor.getFees() + "|" + "specialist is :" + doctor.getSpecialist());

        }

    }

}
