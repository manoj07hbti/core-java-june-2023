package class_and_object;

public class Doctor {
    String drName="Prerana";
    String Degree="MBBS";
    String specialization="neurology";
    String city="Kolhapur";

    public static void main(String[] args) {
        Doctor doctor1=new Doctor();
        Doctor doctor2=new Doctor();
        Doctor doctor3=new Doctor();
        Doctor doctor4=new Doctor();
        Doctor doctor5=new Doctor();

        System.out.println("Doctor name is:"+doctor1.drName+"\tDegree:"+doctor1.Degree+"\tspecialization:"+doctor1.specialization+"\tcity:"+doctor1.city);
        System.out.println("Doctor name is:"+doctor2.drName+"\tDegree:"+doctor2.Degree+"\tspecialization:"+doctor2.specialization+"\tcity:"+doctor2.city);
        System.out.println("Doctor name is:"+doctor3.drName+"\tDegree:"+doctor3.Degree+"\tspecialization:"+doctor3.specialization+"\tcity:"+doctor3.city);
        System.out.println("Doctor name is:"+doctor4.drName+"\tDegree:"+doctor4.Degree+"\tspecialization:"+doctor4.specialization+"\tcity:"+doctor4.city);
        System.out.println("Doctor name is:"+doctor5.drName+"\tDegree:"+doctor5.Degree+"\tspecialization:"+doctor5.specialization+"\tcity:"+doctor5.city);




    }

}
