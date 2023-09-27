package Collection.EmployeesPractise;

import java.util.HashMap;
import java.util.HashSet;

public class DoctorClass {

    public  HashMap<String, HashSet<Doctor>> createDoctorData() {

        HashMap<String, HashSet<Doctor>> DoctorMap = new HashMap<>();

        HashSet<Doctor> aimsDoctorHashset = new HashSet<>();

        Doctor doctor1 = new Doctor("Gopal", "54ppw", 34500);
        Doctor doctor2 = new Doctor("Krishna", "54ppw", 78908);
        Doctor doctor3 = new Doctor("Hari", "54ppw", 80000);
        Doctor doctor4 = new Doctor("Madhav", "54ppw", 78943);
        Doctor doctor5 = new Doctor("Keshava", "54ppw", 3450);
        Doctor doctor6 = new Doctor("Devesh", "54ppw", 3500);
        Doctor doctor7 = new Doctor("Mohan", "54ppw", 67800);
        Doctor doctor8 = new Doctor("Radhesh", "54ppw", 11220);
        Doctor doctor9 = new Doctor("Gopal", "54ppw", 32300);
        Doctor doctor10 = new Doctor("Gopal", "54ppw", 34110);

        aimsDoctorHashset.add(doctor1);
        aimsDoctorHashset.add(doctor2);
        aimsDoctorHashset.add(doctor3);
        aimsDoctorHashset.add(doctor4);
        aimsDoctorHashset.add(doctor5);
        aimsDoctorHashset.add(doctor6);
        aimsDoctorHashset.add(doctor7);
        aimsDoctorHashset.add(doctor8);
        aimsDoctorHashset.add(doctor9);
        aimsDoctorHashset.add(doctor10);

        DoctorMap.put("AIMS", aimsDoctorHashset);

        System.out.println("printing AIMS DOCTOR salary  < 45000 ");

        for (Doctor doctor : aimsDoctorHashset) {
            if (doctor.getSalary() > 45000) {
                System.out.println("printing doctor name :" + doctor.getName() + " ID " + doctor.getID() + " salary " + doctor.getSalary());

            }
        }


        HashSet<Doctor> KalyanDoctorHashset = new HashSet<>();

        Doctor doctor11 = new Doctor("Narayan", "675t", 81098);
        Doctor doctor12 = new Doctor("kalki", "667t", 82098);
        Doctor doctor13 = new Doctor("Vaman", "905t", 83098);
        Doctor doctor14 = new Doctor("Achyut", "175t", 8098);
        Doctor doctor15 = new Doctor("Aarav", "375t", 8498);
        Doctor doctor16 = new Doctor("Ayush", "785t", 8708);
        Doctor doctor17 = new Doctor("Namish", "975t", 86098);
        Doctor doctor18 = new Doctor("anirudh", "6785t", 1098);
        Doctor doctor19 = new Doctor("Brahma", "780t", 89098);
        Doctor doctor20 = new Doctor("Brahma", "780t", 89098);

        KalyanDoctorHashset.add(doctor11);
        KalyanDoctorHashset.add(doctor12);
        KalyanDoctorHashset.add(doctor13);
        KalyanDoctorHashset.add(doctor14);
        KalyanDoctorHashset.add(doctor15);
        KalyanDoctorHashset.add(doctor16);
        KalyanDoctorHashset.add(doctor17);
        KalyanDoctorHashset.add(doctor18);
        KalyanDoctorHashset.add(doctor19);
        KalyanDoctorHashset.add(doctor20);

        DoctorMap.put("KALYAN", KalyanDoctorHashset);

        System.out.println("printing salary KALYAN HOSPITAL doctor  < 45000");

        for (Doctor doctor : KalyanDoctorHashset) {
            if (doctor.getSalary() > 45000) {
                System.out.println("printing doctor name :" + doctor.getName() + " ID :" + doctor.getID() + " salary :" + doctor.getSalary());

            }
        }

        HashSet<Doctor> VedantaDoctorHashset = new HashSet<>();

        Doctor doctor21 = new Doctor("Arvind", "11ty", 51189);
        Doctor doctor22 = new Doctor("Jayant", "68ty", 56789);
        Doctor doctor23 = new Doctor("Rohan", "6432ty", 141789);
        Doctor doctor24 = new Doctor("Piyush", "17ty", 78789);
        Doctor doctor25 = new Doctor("Gagan", "456ty", 76789);
        Doctor doctor26 = new Doctor("Tapan", "111ty", 11789);
        Doctor doctor27 = new Doctor("kapil", "877ty", 51089);
        Doctor doctor28 = new Doctor("Harshit", "88ty", 99789);
        Doctor doctor29 = new Doctor("Govind", "67ty", 56789);
        Doctor doctor30 = new Doctor("Govind", "67ty", 56789);

        VedantaDoctorHashset.add(doctor21);
        VedantaDoctorHashset.add(doctor22);
        VedantaDoctorHashset.add(doctor23);
       VedantaDoctorHashset.add(doctor24);
       VedantaDoctorHashset.add(doctor25);
        VedantaDoctorHashset.add(doctor26);
       VedantaDoctorHashset .add(doctor27);
        VedantaDoctorHashset.add(doctor28);
        VedantaDoctorHashset.add(doctor29);
        VedantaDoctorHashset.add(doctor30);

        DoctorMap.put("VEDANTA", VedantaDoctorHashset);

        System.out.println("printing doctor data vedanta Hospital"+VedantaDoctorHashset);

        for (Doctor doctor : VedantaDoctorHashset) {
            System.out.println("printing doctor name :" + doctor.getName() + " ID :" + doctor.getID() + " salary :" + doctor.getSalary());

        }
        return DoctorMap;


    }

    public static void main(String[] args) {
        DoctorClass obj=new DoctorClass();
        HashMap<String, HashSet<Doctor>> map=obj.createDoctorData();
    }





}
