package collection;

import collection.model.Doctor;

import java.util.ArrayList;

import java.util.Scanner;

public class Demo_DoctorList {

    public ArrayList<Doctor> doctor() {

        ArrayList<Doctor> doctorsList = new ArrayList<>();

        Doctor doctor1 = new Doctor("Rajesh", 35, "Neurologist", 500, "Firozabad");

        Doctor doctor2 = new Doctor("Ganesh", 25, "Cardiologist", 300, "Agra");

        doctorsList.add(doctor1);
        doctorsList.add(doctor2);

        return doctorsList;
    }

    public Doctor createDoctorDataWithUserInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter doctor name:");
        String name = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter doctor Age:");
        int Age = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please enter doctor Specialist:");
        String Specialist = scanner2.nextLine();

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please enter doctor fees:");
        int Fees = scanner3.nextInt();

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Please enter doctor Address:");
        String Address = scanner4.nextLine();

        Doctor doctor1 = new Doctor(name, Age, Specialist, Fees, Address);

        return doctor1;
    }


    public static void main(String[] args) {

        Demo_DoctorList obj = new Demo_DoctorList();

        ArrayList<Doctor> doctors = obj.doctor();
        // using for loop:

        for (int i = 0; i < doctors.size(); i++) {

            System.out.println("Name: " + doctors.get(i).getName() + "Age: " + doctors.get(i).getAge() + "Specialist: " + doctors.get(i).getSpecialist() + "Fees: " + doctors.get(i).getFees() + "Address: " + doctors.get(i).getAddress());
        }
        // using Advanced loop:
        for (Doctor var : doctors) {

            System.out.println("Name: " + var.getName() + "Age: " + var.getAge() + "Specialist: " + var.getSpecialist() + "Fees: " + var.getFees() + "Address: " + var.getAddress());
        }
        // using while loop:

        int n = 0;
        while (n < doctors.size()) {

            System.out.println("Name " + doctors.get(n).getName() + "Age: " + doctors.get(n).getAge() + "Specialist: " + doctors.get(n).getSpecialist() + "Fees: " + doctors.get(n).getFees() + "Address: " + doctors.get(n).getAddress());
            n++;
        }
        // using do while loop:
        int k = 0;
        do {
            System.out.println("Name:" + doctors.get(k).getName() + "Age: " + doctors.get(k).getAge() + "Specialist: " + doctors.get(k).getSpecialist() + "Fees: " + doctors.get(k).getFees() + " Address: " + doctors.get(k).getAddress());
            k++;
        } while (n < doctors.size());

        Doctor doctor = obj.createDoctorDataWithUserInput();

        System.out.println("Created Data for " + doctor.getName() + "," + doctor.getAge() + " ," + doctor.getSpecialist() + " ," + doctor.getFees() + " , " + doctor.getAddress());


    }
}