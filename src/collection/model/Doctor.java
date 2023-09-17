package collection.model;

import java.util.Objects;

public class Doctor {
    String drName;
    String degree;
    String specialization;
    double experience;
    double mSal;


    public Doctor(String drName, String degree, String specialization, double experience, double mSal) {
        this.drName = drName;
        this.degree = degree;
        this.specialization = specialization;
        this.experience = experience;
        this.mSal = mSal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Double.compare(doctor.experience, experience) == 0 && Double.compare(doctor.mSal, mSal) == 0 && Objects.equals(drName, doctor.drName) && Objects.equals(degree, doctor.degree) && Objects.equals(specialization, doctor.specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drName, degree, specialization, experience, mSal);
    }

    public String getDrName() {
        return drName;
    }

    public void setDrName(String drName) {
        this.drName = drName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getmSal() {
        return mSal;
    }

    public void setmSal(double mSal) {
        this.mSal = mSal;
    }
}
