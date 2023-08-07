package class_and_object;

public class Assignment_Doctor_Param {
    String specialization = "Neurologist";
    String time = "10 AM to 5 PM";
    int fees = 700;

    public Assignment_Doctor_Param(String specialization, String time, int fees) {
        this.specialization = specialization;
        this.time = time;
        this.fees = fees;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public static void main(String[] args) {
        Assignment_Doctor_Param Assignment_Doctor_Param1 = new Assignment_Doctor_Param("Neurologist", "10 AM to 5PM", 700);
        System.out.println(
                "Doctor Specialization : " + Assignment_Doctor_Param1.specialization +
                        " , Doctor time to Visit : " + Assignment_Doctor_Param1.time +
                        " and Doctor Fees : " + Assignment_Doctor_Param1.fees);

        Assignment_Doctor_Param Assignment_Doctor_Param2 = new Assignment_Doctor_Param("Nephrologist", "11 AM to 4PM", 1000);
        System.out.println(
                "Doctor Specialization : " + Assignment_Doctor_Param2.specialization +
                        " , Doctor time to Visit : " + Assignment_Doctor_Param2.time +
                        " and Doctor Fees : " + Assignment_Doctor_Param2.fees);

        Assignment_Doctor_Param1.setSpecialization("Neurologist (Mind Problem)");
        System.out.println("Printing data after Setter method");
        System.out.println("Doctor Specialization : " + Assignment_Doctor_Param1.specialization +
                " , Doctor time to Visit : " + Assignment_Doctor_Param1.time +
                " and Doctor Fees : " + Assignment_Doctor_Param1.fees);

        Assignment_Doctor_Param2.setFees(1100);
        System.out.println("Doctor Specialization : " + Assignment_Doctor_Param2.specialization +
                " , Doctor time to Visit : " + Assignment_Doctor_Param2.time +
                " and Doctor Fees : " + Assignment_Doctor_Param2.fees);
    }
}
