package Collection.ArrayList;

import java.util.ArrayList;
import java.util.HashMap;

public class DoctorHashmap {

    public void createDoctorList(){

        HashMap<String,ArrayList<Doctor>>DoctorData=new HashMap<>();

        ArrayList<Doctor>AIMSDoctorList=new ArrayList<>();

        Doctor doctor1=new Doctor("mohit","Gwalior",16675);
        Doctor doctor2=new Doctor("Harshit","Indore",16575);
        Doctor doctor3=new Doctor("Kapil","khandwa",16775);
        Doctor doctor4=new Doctor("Naveen","Khargone",16875);
        Doctor doctor5=new Doctor("Chotu","Burhanpur",16275);
        Doctor doctor6=new Doctor("Deepak","Ujjain",16715);
        Doctor doctor7=new Doctor("Nikhil","Dhar",16075);
        Doctor doctor8=new Doctor("Vishal","Jhabua",16735);
        Doctor doctor9=new Doctor("","Guna",16755);
        Doctor doctor10=new Doctor("mohit","Shivpuri",161178);

        AIMSDoctorList.add(doctor1);
        AIMSDoctorList.add(doctor2);
        AIMSDoctorList.add(doctor3);
        AIMSDoctorList.add(doctor4);
        AIMSDoctorList.add(doctor5);
        AIMSDoctorList.add(doctor6);
        AIMSDoctorList.add(doctor7);
        AIMSDoctorList.add(doctor8);
        AIMSDoctorList.add(doctor9);
        AIMSDoctorList.add(doctor10);

        DoctorData.put("AIMS", AIMSDoctorList);


        ArrayList<Doctor>APOLODoctorsList=new ArrayList<>();

        Doctor doctor11=new Doctor("Sunil","Jhansi",9870);
        Doctor doctor12=new Doctor("anil","Niwari",9908);
        Doctor doctor13=new Doctor("Dinesh","Orchha",6546);
        Doctor doctor14=new Doctor("avi","Fatehabad",7650);
        Doctor doctor15=new Doctor("Praveen","Firojpur",6543);
        Doctor doctor16=new Doctor("abhi","Faghwara",7654);
        Doctor doctor17=new Doctor("rounak","Jalandhar",8654);
        Doctor doctor18=new Doctor("Ishant","Balaghat",6782);
        Doctor doctor19=new Doctor("Kishore","Seoni",9840);
        Doctor doctor20=new Doctor("Vipin","Tejpur",9070);

        APOLODoctorsList.add(doctor11);
        APOLODoctorsList.add(doctor12);
        APOLODoctorsList.add(doctor13);
        APOLODoctorsList.add(doctor14);
        APOLODoctorsList.add(doctor15);
        APOLODoctorsList.add(doctor16);
        APOLODoctorsList.add(doctor17);
        APOLODoctorsList.add(doctor18);
        APOLODoctorsList.add(doctor19);
        APOLODoctorsList.add(doctor20);

        DoctorData.put("APOLO",APOLODoctorsList);

        ArrayList<Doctor>KalyanDoctorsList=new ArrayList<>();

        Doctor doctor21=new Doctor("Happy","Itawa",566543);
        Doctor doctor22=new Doctor("Raymond","Chandigrah",9875);
        Doctor doctor23=new Doctor("Zayn","varansi",7654);
        Doctor doctor24=new Doctor("Piyush","Goa",5421);
        Doctor doctor25=new Doctor("Chetan","Goregaon",80980);
        Doctor doctor26=new Doctor("Rajan","Dhanwad",76541);
        Doctor doctor27=new Doctor("Manish","Damoh",12345);
        Doctor doctor28=new Doctor("Avinash","Narsinghpur",90821);
        Doctor doctor29=new Doctor("Tej","Bhopal",891111);
        Doctor doctor30=new Doctor("Ravi","Kerala",111456);

        KalyanDoctorsList.add(doctor21);
        KalyanDoctorsList.add(doctor22);
        KalyanDoctorsList.add(doctor23);
        KalyanDoctorsList.add(doctor24);
        KalyanDoctorsList.add(doctor25);
        KalyanDoctorsList.add(doctor26);
        KalyanDoctorsList.add(doctor27);
        KalyanDoctorsList.add(doctor28);
        KalyanDoctorsList.add(doctor29);
        KalyanDoctorsList.add(doctor30);

        DoctorData.put("Kalyan",KalyanDoctorsList);

        System.out.println("printing Doctor data"+DoctorData);

        for (String key: DoctorData.keySet()){
            System.out.println("printing doctor data");

            ArrayList<Doctor>doctors=DoctorData.get(key);

            for (int i=0; i<doctors.size(); i++){
                System.out.println("printing Doctor Data:"+key+" : "+doctors.get(i).getName()+" , "+doctors.get(i).getCity()+" ,"+doctors.get(i).getSalary());
            }

        }


    }

    public static void main(String[] args) {
        DoctorHashmap obj=new DoctorHashmap();
        obj.createDoctorList();
    }
}
