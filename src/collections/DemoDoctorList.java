package collections;

import collections.model.Doctor;

import java.util.ArrayList;

public class DemoDoctorList {

    public ArrayList createDoctorList(){ // WE WILL CREATE A METHOD .(ArrayList is return type.)

    //CollectionName <Datatype> objName = new CollectionName<>();

        ArrayList<Doctor> DoctorList = new ArrayList<>();  // AFTER THAT WE CREATED AN OBJECT....

        // AFTER THAT WE CREATE DOCTOR DATA.

        Doctor doctor1 = new Doctor("Dr.Atul Jain","Hair",29);
        Doctor doctor2 = new Doctor("Dr.Vijay Gupta","Mind",35);
        Doctor doctor3 = new Doctor("Dr. Dev ","Skin",38);
        Doctor doctor4 = new Doctor("Dr.Manoj Jain ","Child",40);
        Doctor doctor5 = new Doctor("Dr.Divya Jha ","Bone",50);

        // NEXT WE WILL ADD THE DATA OF DOCTOR.......

        DoctorList .add(doctor1);
        DoctorList.add(doctor2);
        DoctorList.add(doctor3);
        DoctorList.add(doctor4);
        DoctorList.add(doctor5);

        return DoctorList;
    }
    // WE  WILL CREATE MAIN METHOD...

    public static void main(String[] args) {

        // BEFORE WE WILL CREATE AN OBJECT.

         DemoDoctorList obj = new DemoDoctorList();

       //  WE WILL CALL THE METHOD.

        ArrayList<Doctor> doctors = obj.createDoctorList();  // (STORE THE DATA , We WILL HAVE TO NAME A VARIABLE. WE WILL THE DOCTOR VARIABLE FOR THE STORE.....)

        // NOW WE WILL PROCESS. USING FOR LOOP..

        for (int i = 0 ; i<doctors.size();i++){

       // AFTER THAT WE WILL PRINT...
       // WE CANNOT PRINT DIRECTLY. BECAUSE IT HAS MORE THAN VALUE.
       // WE WILL USE GETTER AND SETTER HERE ....

            System.out.println("Name :" + doctors.get(i) .getName() + " Specialist: " +doctors.get(i).getSpecialist() + " Age : "+doctors.get(i).getAge());
        }

        //  USING ADVANCE  LOOP ...

        for (Doctor var : doctors){

            System.out.println("Using Advance Loop Name " + var.getName() + "Specialist: " + var.getSpecialist() + " Age " +var.getAge());
        }

    }
}
