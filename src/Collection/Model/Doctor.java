package Collection.Model;

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
