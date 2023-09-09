package Model;

import java.util.ArrayList;
import java.util.Scanner;

public class Demodoctorlist {

    public ArrayList<Doctor> createdoctorlist() {

        ArrayList<Doctor> doctorList = new ArrayList<>();

        Doctor doctor1 = new Doctor("Rajul", "cardiology", "ssims", 32);
        Doctor doctor2 = new Doctor("piyush", "neurology", "vedant", 30);
        Doctor doctor3 = new Doctor("ramesh", "ortho", "sundaram", 43);


        doctorList.add(doctor1);
        doctorList.add(doctor2);
        doctorList.add(doctor3);

        return doctorList;

    }


    public Doctor doctordatawithuserinput() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter name of doctor:");
        String name = scanner.nextLine();

        System.out.println("please enter department name:");
        String department = scanner.nextLine();

        System.out.println("please enter hospital :");
        String hospital = scanner.nextLine();

        System.out.println("please enter age:");
        int age = scanner.nextInt();

        Doctor doctor1 = new Doctor(name, department, hospital, age);

        return doctor1;
    }


    public static void main(String[] args) {

        String flag = "y";

        Demodoctorlist obj = new Demodoctorlist();
        ArrayList<Doctor> doctors = obj.createdoctorlist();

        while (flag.equals("y")) {

            for (int i = 0; i < doctors.size(); i++) {
                System.out.println("name" + doctors.get(i).getName() + "Department: " + doctors.get(i).getDepartment() + "hospital :" + doctors.get(i).getHospital() + "age :" + doctors.get(i).getAge());
            }
            for (Doctor var : doctors) {
                System.out.println("advanced loop" + "name:" + var.getName() + "Department:" + var.getDepartment() + "hospital:" + var.getHospital() + "age:" + var.getAge());
            }

            Doctor doctor = obj.doctordatawithuserinput();
            System.out.println("created data for " + doctor.getName() + doctor.getDepartment() + doctor.getHospital() + doctor.getAge());

            System.out.println("please enter y button to continue or any other button to exit");
            Scanner scanner2 = new Scanner(System.in);

            flag = scanner2.nextLine();


        }


    }
}
