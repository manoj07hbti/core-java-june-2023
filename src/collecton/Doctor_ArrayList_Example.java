package collecton;

import java.util.ArrayList;
import java.util.Scanner;

class Doctor {
    String name;
    int age;
    String department;

    public Doctor(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
}

public class Doctor_ArrayList_Example {
    public static void main(String args[]) {
        ArrayList<Doctor> doctorsList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean addMoreDoctors = true;

        while (addMoreDoctors) {
            System.out.print("Enter Doctor's name : ");
            String name = scanner.nextLine();

            System.out.print("Enter Doctor's age : ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Doctor's department : ");
            String department = scanner.nextLine();

            Doctor doctor = new Doctor(name, age, department);
            doctorsList.add(doctor);

            System.out.print("Do you want to add another doctor? (yes/no) : ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("no")) {
                addMoreDoctors = false;
            }

        }

        System.out.println("List of doctors (using advanced for loop) : ");
        for (Doctor doctor : doctorsList) {
            System.out.println("Name: " + doctor.name);
            System.out.println("Age: " + doctor.age);
            System.out.println("Department: " + doctor.department);
            System.out.println();

        }
        System.out.println("List of doctors (using regular for loop): ");
        for (int i = 0; i < doctorsList.size(); i++) {
            Doctor doctor = doctorsList.get(i);
            System.out.println("Name: " + doctor.name);
            System.out.println("Age: " + doctor.age);
            System.out.println("Department: " + doctor.department);
            System.out.println();


        }
        scanner.close();

    }


}
