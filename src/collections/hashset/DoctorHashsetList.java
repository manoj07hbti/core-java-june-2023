package collections.hashset;

import collections.model.Doctor;
import collections.model.Employee;

import java.util.HashSet;

public class DoctorHashsetList {

    public HashSet createDoctorList() {

        HashSet<Doctor> doctorHashSet = new HashSet<>();

        Doctor doctor1 = new Doctor("Dr.Bhatiya", "Hair", 38);
        Doctor doctor2 = new Doctor("Dr Zakir ", "Skin", 35);
        Doctor doctor3 = new Doctor("Dr.Manoj Jain", "Bone", 40);
        Doctor doctor4 = new Doctor("Dr.Bhatiya", "Hair", 38);
        Doctor doctor5 = new Doctor("Dr Zakir ", "Skin", 35);
        Doctor doctor6 = new Doctor("Dr.Manoj Jain", "Bone", 40);

        doctorHashSet.add(doctor1);
        doctorHashSet.add(doctor2);
        doctorHashSet.add(doctor3);
        doctorHashSet.add(doctor4);
        doctorHashSet.add(doctor5);
        doctorHashSet.add(doctor6);

        return doctorHashSet;

    }

    public static void main(String[] args) {

        DoctorHashsetList obj = new DoctorHashsetList();

        HashSet<Doctor> doctors = obj.createDoctorList();

        for (Doctor var : doctors) {

            System.out.println("Using Advance loop " + var.getName() + " Specialist " + var.getSpecialist() + " Age " + var.getAge());

        }

    }
}