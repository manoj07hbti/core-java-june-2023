package class_and_object.Parameterized_Constructor_with_or_without_Get_Set;

public class DoctorAccessSpec {

    //capabilities of doctor is operating a person,etc

     /*TODO  Syntax : access_specifier return_type  method_name (parameter) { CODE..}
        ..
        access_specifier -> public , private , protected, default   THEORY PART
        return_type   -> output of function or method :  void : no return type
        method_name -> can be anything: it should be meaningful
        parameter ->  input parameter : optional*/

    public void OperationMethod(){
        System.out.println("This is Operation Method");
    }
    public void SurgeryMethod(){
        System.out.println("This is Surgery Method");
    }
    public void PracticeMethod(){
        System.out.println("This is Practice Method");
    }
    public void StudyMethod(){
        System.out.println("This is Study Method");
    }

    public static void main(String[] args) {

        DoctorAccessSpec obj=new DoctorAccessSpec();
        obj.OperationMethod();
        obj.SurgeryMethod();
        obj.PracticeMethod();
        obj.StudyMethod();
    }
}
