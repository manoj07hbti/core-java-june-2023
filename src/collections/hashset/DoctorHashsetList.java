package collections.hashset;

import collections.model.Doctor;
import collections.model.Employee;

import java.util.HashSet;

public class DoctorHashsetList {

    public HashSet createDoctorList() {

        HashSet<Doctor> doctorHashSet = new HashSet<>();

        Doctor doctor1 = new Doctor("Dr.Bhatiya", "Hair", 38);
        System.out.println("Hashcode of Doctor1 " + doctor1.hashCode());

        Doctor doctor2 = new Doctor("Dr Zakir ", "Skin", 35);
        System.out.println("Hashcode of Doctor2 " + doctor2.hashCode());

        Doctor doctor3 = new Doctor("Dr.Manoj Jain", "Bone", 40);
        System.out.println("Hashcode of Doctor3 " + doctor3.hashCode());

        Doctor doctor4 = new Doctor("Dr.Bhatiya", "Hair", 38);
        System.out.println("Hashcode of Doctor4 " + doctor4.hashCode());

        Doctor doctor5 = new Doctor("Dr Zakir ", "Skin", 35);
        System.out.println("Hashcode of Doctor5 " + doctor5.hashCode());

        Doctor doctor6 = new Doctor("Dr.Manoj Jain", "Bone", 40);
        System.out.println("Hashcode of Doctor6 " + doctor6.hashCode());

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