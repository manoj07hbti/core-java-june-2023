package collection.hashset;

import collection.model.Doctor;

import java.util.HashSet;

public class Doctorlist {

    public HashSet<Doctor> DoctrorWork() {

        HashSet<Doctor> doctor = new HashSet<>();

        Doctor D1 = new Doctor("Arun Mishra", "MD", "Medicine", 350000);
        Doctor D2 = new Doctor("Abhishek", "MBBS", "Pediatric", 250000);
        Doctor D3 = new Doctor("RP.Yadav", "MS", "Surgery", 350000);
        Doctor D4 = new Doctor("Yusuf", "MD", "Psychiatrist", 250000);
        Doctor D5 = new Doctor("Ravi", "MBBS", "Ortho", 320000);
        Doctor D6 = new Doctor("Jayesh Jain", "MD DNB", "Radiology", 450000);
        Doctor D7 = new Doctor("Arun Mishra", "MD", "Medicine", 350000);
        Doctor D8 = new Doctor("Abhishek", "MBBS", "Pediatric", 250000);
        Doctor D9 = new Doctor("RP.Yadav", "MS", "Surgery", 350000);
        Doctor D10 = new Doctor("Yusuf", "MD", "Psychiatrist", 250000);


        doctor.add(D1);
        doctor.add(D2);
        doctor.add(D3);
        doctor.add(D4);
        doctor.add(D5);
        doctor.add(D6);
        doctor.add(D7);
        doctor.add(D8);
        doctor.add(D9);
        doctor.add(D10);

        return doctor;
    }

    public static void main(String[] args) {


        collection.hashset.Doctorlist obj = new collection.hashset.Doctorlist();

        HashSet<Doctor> Result = obj.DoctrorWork();

        System.out.println("Print Advanced loops");

        for (Doctor doctor : Result) {

            System.out.println("Print Name : " + doctor.getName() + " Degree: " + doctor.getDegree() + " Department: " + doctor.getDepartment() + " Salary :" + doctor.getSalary());
        }

    }
}








