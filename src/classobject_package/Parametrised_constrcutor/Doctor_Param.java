package classobject_package.Parametrised_constrcutor;

public class Doctor_Param {
    String DoctorName;
    String Specialist;
    String address;
    int doctorAge;
    int fee;

    public Doctor_Param(String doctorName, String specialist, String address, int doctorAge, int fee) {
        DoctorName = doctorName;
        Specialist = specialist;
        this.address = address;
        this.doctorAge = doctorAge;
        this.fee = fee;
    }

    public void setDoctorName(String doctorName) {

        DoctorName = doctorName;
    }
    public String getDoctorName() {
        return DoctorName;
    }

    public String getSpecialist() {
        return Specialist;
    }

    public void setSpecialist(String specialist) {
        Specialist = specialist;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDoctorAge() {
        return doctorAge;
    }

    public void setDoctorAge(int doctorAge) {
        this.doctorAge = doctorAge;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public static void main(String[] args) {
        Doctor_Param obj = new Doctor_Param("Dr.veena jain", "gynecologist;", "fzd", 65, 500);
        System.out.println("Name of Doctor : " + obj.DoctorName);
        System.out.println("Specialist of Doctor : " + obj.Specialist);
        System.out.println("add of Doctor : " + obj.address);
        System.out.println("age of Doctor : " + obj.doctorAge);
        System.out.println("fee of Doctor : " + obj.fee);

        Doctor_Param obj1 = new Doctor_Param("Dr.Dharam", "eyes specialist", "fzd", 60, 300);
        System.out.println("Name of Doctor : " + obj1.DoctorName);
        System.out.println("Specialist of Doctor : " + obj1.Specialist);
        System.out.println("add of Doctor : " + obj1.address);
        System.out.println("Age of Doctor : " + obj1.doctorAge);
        System.out.println("fee of Doctor : " + obj1.fee);

        Doctor_Param obj2 = new Doctor_Param("Dr.Ganesh", "All Rounder", "fzd", 54, 400);
        System.out.println("Name of Doctor : " + obj2.DoctorName);
        System.out.println("Specialist of Doctor : " + obj2.Specialist);
        System.out.println("add of Doctor : " + obj2.address);
        System.out.println("age of Doctor : " + obj2.doctorAge);
        System.out.println("fee of Doctor : " + obj2.fee);

        System.out.println("Using Setter method used to......");

        obj.setDoctorName("Neeta jain");
        obj.setSpecialist("child specialist");
        obj.setAddress("Agra");
        System.out.println("Doctor change Name : " + obj.DoctorName);
        System.out.println("Doctor change Specialist : " + obj.Specialist);
        System.out.println("Doctor change Address : " + obj.address);

        obj1.setDoctorName("Dr Dharamendra");
        obj1.setSpecialist("nose specialist");
        obj1.setAddress("shikohabad");
        System.out.println("Doctor Update Name : " + obj1.DoctorName);
        System.out.println("Doctor Update Specialist : " + obj1.Specialist);
        System.out.println("Doctor Update Address : " + obj1.address);


    }
}
