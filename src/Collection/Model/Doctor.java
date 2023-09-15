package Collection.Model;

import java.util.Objects;

public class Doctor {
    String DoctorName;
    String DoctorDegree;
    String DoctorFees;
    String DoctorAdd;

    public Doctor(String doctorName, String doctorDegree, String doctorFees, String doctorAdd) {
        DoctorName = doctorName;
        DoctorDegree = doctorDegree;
        DoctorFees = doctorFees;
        DoctorAdd = doctorAdd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(DoctorName, doctor.DoctorName) && Objects.equals(DoctorDegree, doctor.DoctorDegree) && Objects.equals(DoctorFees, doctor.DoctorFees) && Objects.equals(DoctorAdd, doctor.DoctorAdd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DoctorName, DoctorDegree, DoctorFees, DoctorAdd);
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String doctorName) {
        DoctorName = doctorName;
    }

    public String getDoctorDegree() {
        return DoctorDegree;
    }

    public void setDoctorDegree(String doctorDegree) {
        DoctorDegree = doctorDegree;
    }

    public String getDoctorFees() {
        return DoctorFees;
    }

    public void setDoctorFees(String doctorFees) {
        DoctorFees = doctorFees;
    }

    public String getDoctorAdd() {
        return DoctorAdd;
    }

    public void setDoctorAdd(String doctorAdd) {
        DoctorAdd = doctorAdd;
    }
}
