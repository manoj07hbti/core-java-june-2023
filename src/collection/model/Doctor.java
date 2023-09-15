package collection.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return fees == doctor.fees && Objects.equals(DoctorName, doctor.DoctorName) && Objects.equals(specialist, doctor.specialist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DoctorName, fees, specialist);
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























