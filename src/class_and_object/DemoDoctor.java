package class_and_object;

public class DemoDoctor {

    // capabilities of doctor:

    // eat:
    // operation:
    // Medicine:

    // SYNTAX: Access_specifier return_type method_name (parameter) { code...}

    public void eatMethod(){
        System.out.println("This is eat Method");

    }
    public void operationMethod(){
        System.out.println("This is operation Method");
    }
    public void MedicineMethod(){
        System.out.println("This is Medicine Method");
    }
    public static void main(String args []){
      DemoDoctor demoDoctor = new DemoDoctor();
      demoDoctor.eatMethod();
      demoDoctor.operationMethod();
      demoDoctor.MedicineMethod();
    }
}
