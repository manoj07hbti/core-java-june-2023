package class_and_object;

public class Student {

    // DATA MEMBERS
   public String name="Rahul";
   private int rollNo=1;
    String section="CS"; // it will come in default access specifier category

    //CAPABILITIES
   /* study
    eat
    play*/

   /*TODO  Syntax : access_specifier return_type  method_name (parameter) { CODE..}
        ..
        access_specifier -> public , private , protected, default   THEORY PART
        return_type   -> output of function or method :  void : no return type
        method_name -> can be anything: it should be meaningful
        parameter ->  input parameter : optional*/

    public void studyMethod(){

        System.out.println("This is study method ");
    }

    public void eatMethod(){

        System.out.println("This is eat method");
    }

    public void playMethod(){
        System.out.println("This is Play Method");
    }

    public static void main(String[] args) {

        Student obj= new Student(); // STEP 1 OBJECT CREATED

        obj.eatMethod(); // STEP 2 ObjectName.MethodName();

        obj.playMethod();

        obj.studyMethod();


    }
}
