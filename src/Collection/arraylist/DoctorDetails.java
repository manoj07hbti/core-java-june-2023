package Collection.arraylist;

import Collection.Model.Doctor;

import java.util.ArrayList;

public class DoctorDetails {
    public ArrayList<Doctor> DoctorList() {
        ArrayList<Doctor> Doctors = new ArrayList<>();
        Doctor Doctor1 = new Doctor("Manik Chndra", "MBBS", "500 Fees", "Ramkishan Tundla");
        Doctor Doctor2 = new Doctor("Sanjay Varma", "MBBS MD", "600 Fees", "Rail Way Station Road Tundla");
        Doctor Doctor3 = new Doctor("Sanjeev Jain", "MBBS MD", "400 Fees", " Tundla");
        Doctor Doctor4 = new Doctor("Pramod Kumar", "MBBS MD", "300 Fees", "Agra");
        Doctors.add(Doctor1);
        Doctors.add(Doctor2);
        Doctors.add(Doctor3);
        Doctors.add(Doctor4);
        return Doctors;


    }


    public static void main(String[] args) {
        DoctorDetails obj = new DoctorDetails();
        ArrayList<Doctor> Doctors = obj.DoctorList();
        for (int i = 0; i < Doctors.size(); i++) {
            System.out.println("Using For Loop Printing Doctor name is :" + Doctors.get(i).getDoctorName());
            System.out.println("Using For Loop Printing Doctor Degree  is :" + Doctors.get(i).getDoctorDegree());
            System.out.println("Using For Loop Printing Doctor Fees  is :" + Doctors.get(i).getDoctorFees());
            System.out.println("Using For Loop Printing Doctor Address is :" + Doctors.get(i).getDoctorAdd());
        }
        for (Doctor var : Doctors) {
            System.out.println("Using Advance for loop Printing doctor name : " + var.getDoctorName());
            System.out.println("Using Advance for loop Printing doctor Degree : " + var.getDoctorDegree());
            System.out.println("Using Advance for loop Printing doctor Fees : " + var.getDoctorFees());
            System.out.println("Using Advance for loop Printing doctor Address : " + var.getDoctorAdd());

        }
        int i = 0;
        while (i < Doctors.size()) {
            System.out.println("Using while loop Printing Doctor name is : " + Doctors.get(i).getDoctorName());
            System.out.println("Using while loop Printing Doctor Degree is : " + Doctors.get(i).getDoctorDegree());
            System.out.println("Using while loop Printing Doctor Fees is : " + Doctors.get(i).getDoctorFees());
            System.out.println("Using while loop Printing Doctor Address is : " + Doctors.get(i).getDoctorAdd());
            i++;
        }
        int j = 0;
        do {
            System.out.println("Using do while loop printing Doctor name is :" + Doctors.get(j).getDoctorName());
            System.out.println("Using do while loop printing Doctor Degree is :" + Doctors.get(j).getDoctorDegree());
            System.out.println("Using do while loop printing Doctor Fees is :" + Doctors.get(j).getDoctorFees());
            System.out.println("Using do while loop printing Doctor Address is :" + Doctors.get(j).getDoctorAdd());
            j++;


        } while (j < Doctors.size());


    }
}
