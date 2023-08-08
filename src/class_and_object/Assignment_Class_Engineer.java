package class_and_object;

public class Assignment_Class_Engineer {
    String specialization = "Computer science";
    String specialization2 = "Civil";
    String specialization3 = "Information Technology";
    String duration = "4 Year";
    String fees = "4 Lakh";

    public static void main(String[] args) {
        Assignment_Class_Engineer engineer1 = new Assignment_Class_Engineer();
        System.out.println("specialization :" + engineer1.specialization +
                " specialization 2 :" + engineer1.specialization2 +
                " specialization 3 :" + engineer1.specialization3 +
                " Course Duration :" + engineer1.duration +
                " Course Fees :" + engineer1.fees);
    }
}
