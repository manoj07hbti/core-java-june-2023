package Method;

public class Doctor {

    String name;

    String expert;

    String city;

    String department;

    int age;

    public void prescriptionmethod(){
        System.out.println("this is prescription method of doctor");
    }
    public void administratingmethod(){
        System.out.println("this is administrating method of doctor");
    }
    public void understandingmethod(){
        System.out.println("this is understanding method of doctor");
    }
    public void Diagnosingmethod(){
        System.out.println("this is diagnosis method of doctor");
    }
    public void equipmentmethod(){
        System.out.println("this is equipment method of doctor");
    }

    public static void main(String[] args) {
        Doctor doctor1=new Doctor();
        doctor1.prescriptionmethod();
        doctor1.administratingmethod();
        doctor1.understandingmethod();
        doctor1.Diagnosingmethod();
        doctor1.equipmentmethod();
    }


}
