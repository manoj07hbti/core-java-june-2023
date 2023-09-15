package Collection;

import Collection.Model.Doctor;

import java.util.HashSet;

public class DoctorDemo {
    public HashSet<Doctor> CreateDoctor() {
        HashSet<Doctor> DoctorData = new HashSet<>();
        Doctor Doctor1 = new Doctor("Sanjeev Jain", "MBBS", "500", "Tundla");
        System.out.println("Hashcode of Doctor1 " + Doctor1.hashCode());
        Doctor Doctor2 = new Doctor("Sanjay Varma", "MBBS and MD", "600", "Tundla");
        System.out.println("Hashcode of Doctor2 " + Doctor2.hashCode());

        Doctor Doctor3 = new Doctor("Sanjeev Jain", "MBBS", "500", "Tundla");
        System.out.println("Hashcode of Doctor3 " + Doctor3.hashCode());

        Doctor Doctor4 = new Doctor("Sanjay Varma", "MBBS and MD", "600", "Tundla");
        System.out.println("Hashcode of Doctor4 " + Doctor4.hashCode());

        Doctor Doctor5 = new Doctor("Satish Chandra", "MBBS", "1000", "Agra");
        System.out.println("Hashcode of Doctor5 " + Doctor5.hashCode());

        Doctor Doctor6 = new Doctor("Sachin Sharma", "MBBS and MD", "1200", "Agra");
        System.out.println("Hashcode of Doctor6 " + Doctor6.hashCode());

        DoctorData.add(Doctor1);
        DoctorData.add(Doctor2);

        DoctorData.add(Doctor3);
        DoctorData.add(Doctor4);

        DoctorData.add(Doctor5);
        DoctorData.add(Doctor6);


        return DoctorData;
    }

    public static void main(String[] args) {
        DoctorDemo obj = new DoctorDemo();
        HashSet<Doctor> Doctors = obj.CreateDoctor();
        for (Doctor var : Doctors) {
            System.out.println(var.getDoctorName() + "Degree :" + var.getDoctorDegree() + " Fees : " + var.getDoctorFees() + "Address :" + var.getDoctorAdd());
        }
    }
}
