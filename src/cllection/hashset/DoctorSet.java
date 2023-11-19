package cllection.hashset;

import collection.model.Doctor;

import java.util.HashSet;

public class DoctorSet {

    public void createDoctorSet(){
        HashSet<Doctor> doctorHashSet = new HashSet<>();

        Doctor doctor1 = new Doctor("Sharma",45,"Dentist");
        Doctor doctor2 = new Doctor("Sharma",45,"Dentist");
        Doctor doctor3 = new Doctor("Oswal",34,"Gynecologist");
        Doctor doctor4 = new Doctor("Oswal",34,"Gynecologist");
        Doctor doctor5 = new Doctor("Harish",50,"Therapist");
        Doctor doctor6 = new Doctor("Harish",50,"Therapist");
        Doctor doctor7 = new Doctor("Vijay",26,"Surgeon");
        Doctor doctor8 = new Doctor("Vijay",26,"Surgeon");

    }
}
