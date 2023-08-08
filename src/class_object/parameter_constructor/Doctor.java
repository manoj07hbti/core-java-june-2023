package class_object.parameter_constructor;

public class Doctor {
    String DoctorName;
    String Specialist;
    String address;
    int doctorAge;
    int fees;

    public Doctor(String doctorName, String specialist, String address, int doctorAge, int fees) {
        DoctorName = doctorName;
        Specialist = specialist;
        this.address = address;
        this.doctorAge = doctorAge;
        this.fees = fees;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
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

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public static void main(String[] args) {
        Doctor obj = new Doctor("Dr. Manik Chandra", "All rounder", "Ramkishan Tundla", 100, 45);
        System.out.println("Detail of Doctor : " + obj.DoctorName);
        System.out.println("Detail of Doctor : " + obj.Specialist);
        System.out.println("Detail of Doctor : " + obj.address);
        System.out.println("Detail of Doctor : " + obj.doctorAge);
        System.out.println("Detail of Doctor : " + obj.fees);

        Doctor obj1 = new Doctor("Dr.Sanjay Varma", "All Rounder", "Station Road Tundla", 200, 47);
        System.out.println("Detail of Doctor : " + obj1.DoctorName);
        System.out.println("Detail of Doctor : " + obj1.Specialist);
        System.out.println("Detail of Doctor : " + obj1.address);
        System.out.println("Detail of Doctor : " + obj1.doctorAge);
        System.out.println("Detail of Doctor : " + obj1.fees);
        Doctor obj2 = new Doctor("Dr. Sanjeev Jain", "All Rounder", "Main Road Tundla", 150, 43);
        System.out.println("Detail of Doctor : " + obj2.DoctorName);
        System.out.println("Detail of Doctor : " + obj2.Specialist);
        System.out.println("Detail of Doctor : " + obj2.address);
        System.out.println("Detail of Doctor : " + obj2.doctorAge);
        System.out.println("Detail of Doctor : " + obj2.fees);

        System.out.println("Using Setter method used to  ----> ");

        obj.setDoctorName("Satish Chandra Agrawal");
        obj.setSpecialist("Skin Care");
        obj.setAddress("Agra");
        System.out.println("Doctor Update Name : " + obj.DoctorName);
        System.out.println("Doctor Update Specialist : " + obj.Specialist);
        System.out.println("Doctor Update Address : " + obj.address);


        obj1.setDoctorName("Manish Agrawal");
        obj1.setSpecialist("Cancer");
        obj1.setAddress("Delhi gate Agra");
        System.out.println("Doctor Update Name : " + obj1.DoctorName);
        System.out.println("Doctor Update Specialist : " + obj1.Specialist);
        System.out.println("Doctor Update Address : " + obj1.address);

        obj2.setDoctorName("Shiv Kumar Mathur");
        obj2.setSpecialist("Eyes Specialist");
        obj2.setAddress("London");
        obj1.setAddress("Delhi gate Agra");
        System.out.println("Doctor Update Name : " + obj2.DoctorName);
        System.out.println("Doctor Update Specialist : " + obj2.Specialist);
        System.out.println("Doctor Update Address : " + obj2.address);


    }
}
