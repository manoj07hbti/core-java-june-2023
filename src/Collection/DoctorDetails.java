package Collection;

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
        ArrayList<Doctor> Doctor = obj.DoctorList();
        for (int i = 0; i < Doctor.size(); i++) {
            System.out.println("Using For Loop Printing Doctor name is :" + Doctor.get(i).getDoctorName());
            System.out.println("Using For Loop Printing Doctor Degree  is :" + Doctor.get(i).getDoctorDegree());
            System.out.println("Using For Loop Printing Doctor Fees  is :" + Doctor.get(i).getDoctorFees());
            System.out.println("Using For Loop Printing Doctor Address is :" + Doctor.get(i).getDoctorAdd());
        }
        for (Doctor var : Doctor) {
            System.out.println("Using Advance for loop Printing doctor name : " + var.getDoctorName());
            System.out.println("Using Advance for loop Printing doctor Degree : " + var.getDoctorDegree());
            System.out.println("Using Advance for loop Printing doctor Fees : " + var.getDoctorFees());
            System.out.println("Using Advance for loop Printing doctor Address : " + var.getDoctorAdd());

        }
        int i = 0;
        while (i < Doctor.size()) {
            System.out.println("Using while loop Printing Doctor name is : " + Doctor.get(i).getDoctorName());
            System.out.println("Using while loop Printing Doctor Degree is : " + Doctor.get(i).getDoctorDegree());
            System.out.println("Using while loop Printing Doctor Fees is : " + Doctor.get(i).getDoctorFees());
            System.out.println("Using while loop Printing Doctor Address is : " + Doctor.get(i).getDoctorAdd());
            i++;
        }
        int j = 0;
        do {
            System.out.println("Using do while loop printing Doctor name is :" + Doctor.get(j).getDoctorName());
            System.out.println("Using do while loop printing Doctor Degree is :" + Doctor.get(j).getDoctorDegree());
            System.out.println("Using do while loop printing Doctor Fees is :" + Doctor.get(j).getDoctorFees());
            System.out.println("Using do while loop printing Doctor Address is :" + Doctor.get(j).getDoctorAdd());
            j++;


        } while (j < Doctor.size());


    }
}
