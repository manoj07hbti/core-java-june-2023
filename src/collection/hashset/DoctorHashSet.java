package collection.hashset;

import collection.model.Doctor;
import collection.model.Engineer;

import java.util.HashSet;

public class DoctorHashSet {

    public HashSet<Doctor> createDoctorSet() {
        HashSet<Doctor> doctors = new HashSet<>();

        Doctor doctor1 = new Doctor("Jatin", 500, "Cardiologist");
        System.out.println("Hashcode of Doctor 1 is:" + doctor1.hashCode());
        Doctor doctor2 = new Doctor("Ojal", 600, "Oncologist");
        System.out.println("Hashcode of Doctor 2 is:" + doctor2.hashCode());
        Doctor doctor3 = new Doctor("Vandana", 700, "Pathologist");
        System.out.println("Hashcode of Doctor 3 is:" + doctor3.hashCode());
        Doctor doctor4 = new Doctor("Mukul", 800, "Neurologist");
        System.out.println("Hashcode of Doctor 4 is:" + doctor4.hashCode());
        Doctor doctor5 = new Doctor("Omiya", 900, "General Surgeon");
        System.out.println("Hashcode of Doctor 5 is:" + doctor5.hashCode());
        Doctor doctor6 = new Doctor("Jatin", 500, "Cardiologist");
        System.out.println("Hashcode of Doctor 6 is:" + doctor6.hashCode());
        Doctor doctor7 = new Doctor("Ojal", 600, "Oncologist");
        System.out.println("Hashcode of Doctor 7 is:" + doctor7.hashCode());
        Doctor doctor8 = new Doctor("Vandana", 700, "Pathologist");
        System.out.println("Hashcode of Doctor 8 is:" + doctor8.hashCode());
        Doctor doctor9 = new Doctor("Mukul", 800, "Neurologist");
        System.out.println("Hashcode of Doctor 9 is:" + doctor9.hashCode());
        Doctor doctor10 = new Doctor("Omiya", 900, "General Surgeon");
        System.out.println("Hashcode of Doctor 10 is:" + doctor10.hashCode());


        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);
        doctors.add(doctor5);
        doctors.add(doctor6);
        doctors.add(doctor7);
        doctors.add(doctor8);
        doctors.add(doctor9);
        doctors.add(doctor10);

        return doctors;

    }

    public static void main(String[] args) {
        DoctorHashSet obj = new DoctorHashSet();
        HashSet<Doctor> doctorsData = obj.createDoctorSet();


        int i = 0;
        for (Doctor var : doctorsData) {
            System.out.println("Name is : " + var.getDoctorName() + " | " + " Fess is : " + var.getFees() + " | " + " Department is : " + var.getSpecialist() + " at INDEX " + i);
            i++;
        }
    }
}
