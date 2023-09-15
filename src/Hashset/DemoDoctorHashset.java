package Hashset;

import java.util.ArrayList;
import java.util.HashSet;

public class DemoDoctorHashset {

    public  HashSet<Doctor>createDocSet(){

        HashSet<Doctor>doctors=new HashSet<>();

        Doctor doctor1=new Doctor("rohan","Suresh nagar","gwalior",7890);
        System.out.println("hashcode of doctor1"+doctor1.hashCode());
        Doctor doctor2=new Doctor("ayush","sdm road","guna",8907);
        System.out.println("hashcode of doctor2"+doctor2.hashCode());
        Doctor doctor3=new Doctor("Gagan","ustad marg","Datia",7890);
        System.out.println("hashcode of doctor3"+doctor3.hashCode());
        Doctor doctor4=new Doctor("Happy","city center","ashok nagar",7890);
        System.out.println("hashcode of doctor4"+doctor4.hashCode());
        Doctor doctor5=new Doctor("Tapan","malay nagar","gwalior",7890);
        System.out.println("hashcode of doctor4"+doctor5.hashCode());
        Doctor doctor6=new Doctor("rohan","Suresh nagar","gwalior",7890);
        System.out.println("hashcode of doctor6"+doctor6.hashCode());
        Doctor doctor7=new Doctor("ayush","sdm road","guna",8907);
        System.out.println("hashcode of doctor7"+doctor7.hashCode());

        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);
        doctors.add(doctor5);
        doctors.add(doctor6);
        doctors.add(doctor7);

        return doctors;
    }

    public static void main(String[] args) {
        DemoDoctorHashset obj=new DemoDoctorHashset();
        HashSet<Doctor>doctors=obj.createDocSet();

        for (Doctor doctor:doctors){
            System.out.println("name of doctor :" + doctor.getName() + "address of doctor :" + doctor.getAddress() + "city of doctor :" + doctor.getCity() + "salary of doctor:" + doctor.getSalary());
        }


    }
}
