package class_and_object;

public class Assignment_Engineer_Param {

    String specialization = "Computer Science";
    String duration = "4 Year";
    String fees = "4 Lakh";

    public Assignment_Engineer_Param(String specialization, String duration, String fees) {
        this.specialization = specialization;
        this.duration = duration;
        this.fees = fees;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getFees() {
        return fees;
    }

    public void setFees(String fees) {
        this.fees = fees;
    }

    public static void main(String[] args) {
        Assignment_Engineer_Param Assignment_Engineer_Param1 = new Assignment_Engineer_Param("Computer Science", "4 Year", "4 Lakh");
        System.out.println("Engineer Specialization is " + Assignment_Engineer_Param1.specialization +
                " , Duration of Course is " + Assignment_Engineer_Param1.duration +
                " and Course full fees is " + Assignment_Engineer_Param1.fees);

        System.out.println("Printing Data after Setter Method");

        Assignment_Engineer_Param1.setSpecialization("Computer Science with Java");
        System.out.println("Engineer Specialization is " + Assignment_Engineer_Param1.specialization +
                " , Duration of Course is " + Assignment_Engineer_Param1.duration +
                " and Course full fees is " + Assignment_Engineer_Param1.fees);
    }
}
