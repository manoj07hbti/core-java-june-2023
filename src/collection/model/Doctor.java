package collection.model;

public class Doctor {

    public String DoctorName;
    public int fees;
    public String specialist;


    public Doctor(String doctorName, int fees, String specialist) {
        DoctorName = doctorName;
        this.fees = fees;
        this.specialist = specialist;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }
}























