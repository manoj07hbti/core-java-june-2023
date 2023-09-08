package collecton;



import collection.model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoDoctorList {

    public DemoDoctorList() {
    }

    public ArrayList <Doctor> createDoctorData(){

        ArrayList <Doctor> DemoDoctorList = new ArrayList<>();

        Doctor doctor1 = new Doctor("Rahul",34,"Dentist");
        Doctor doctor2 = new Doctor("Monu",44,"Theripist");
        Doctor doctor3 = new Doctor("Saraswat",54,"Gynocholist");
        Doctor doctor4 = new Doctor("Kumar",28,"SkinSpecialist");
        Doctor doctor5 = new Doctor("Manish",29,"Sergan");
        Doctor doctor6 = new Doctor("Goyal",31,"HeartSpecialist");

        DemoDoctorList.add(doctor1);
        DemoDoctorList.add(doctor2);
        DemoDoctorList.add(doctor3);
        DemoDoctorList.add(doctor4);
        DemoDoctorList.add(doctor5);
        DemoDoctorList.add(doctor6);

        return DemoDoctorList;

    }
    public Doctor DoctorDataWithUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter Doctor name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter Doctor Age: ");
        int age = scanner.nextInt();
       Scanner scanner1 = new Scanner(System.in);

        System.out.println("Please enter Doctor dpt: ");
        String dpt = scanner1.nextLine();



        Doctor doctor1 = new Doctor(name,age,dpt);

        return doctor1;

    }
    public static void main(String args []) {

        DemoDoctorList Obj = new DemoDoctorList();
        ArrayList<Doctor> doctors = Obj.createDoctorData();

        System.out.println("Using for loop: ");
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println("Name: " + doctors.get(i).getName() + " Age: " + doctors.get(i).getAge() + " dpt: " + doctors.get(i).getDpt());
        }
        System.out.println("Using while loop: ");
        int i = 0;
        while (i < doctors.size()) {
            System.out.println("Name: " + doctors.get(i).getName() + " Age: " + doctors.get(i).getAge() + " dpt: " + doctors.get(i).getDpt());
            i++;
        }
        System.out.println("Using do while loop: ");
        int i1 = 0;
        do {
            System.out.println("Name: " + doctors.get(i1).getName() + "Age: " + doctors.get(i1).getAge() + " dpt: " + doctors.get(i1).getDpt());
            i1++;
        } while (i1 < doctors.size());

        System.out.println("Using Advanced loop: ");
        for (Doctor var: doctors){
            System.out.println("Name: "+var.getName()+" Age: "+var.getAge()+" dpt: "+var.getDpt());
        }
          Doctor doctor = Obj.DoctorDataWithUserInput();

          System.out.println("create data for: "+doctor.getName()+" name "+doctor.getAge()+" age "+doctor.getDpt()+" dpt ");

        }



        }



