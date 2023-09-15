package collection;

import collection.model.Doctor;

import java.util.HashSet;

public class DoctorHashSet {

    public HashSet createDoctorSet() {

        HashSet<Doctor> doctors = new HashSet<>();

        Doctor doctor1 = new Doctor("Arjun", 500, "Cardiologist");
        System.out.println("hashcode of student1" + doctor1.hashCode());

        Doctor doctor2 = new Doctor("Arjun", 500, "Cardiologist");
        System.out.println("hashcode of student2" + doctor2.hashCode());

        Doctor doctor3 = new Doctor("Rakesh", 300, "Neurologist");
        System.out.println("hashcode of student3" + doctor3.hashCode());

        Doctor doctor4 = new Doctor("Rakesh", 300, "Neurologist");
        System.out.println("hashcode of student4" + doctor4.hashCode());

        Doctor doctor5 = new Doctor("Anil", 200, "Dermatologist");
        System.out.println("hashcode of student5" + doctor5.hashCode());

        Doctor doctor6 = new Doctor("Anil", 200, "Dermatologist");
        System.out.println("hashcode of student6" + doctor6.hashCode());


        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);
        doctors.add(doctor5);
        doctors.add(doctor6);


        return doctors;

    }

    public static void main(String[] args) {

        DoctorHashSet obj = new DoctorHashSet();

        HashSet<Doctor> doctorsData = obj.createDoctorSet();

        for (Doctor doctor : doctorsData) {


            System.out.println(" Name :" + doctor.getDoctorName() + " fees :" + doctor.getFees() + " Specialist :" + doctor.getSpecialist());

        }


    }


}
