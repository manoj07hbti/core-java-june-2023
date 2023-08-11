package class_and_object.Parameterized_Constructor_with_or_without_Get_Set;

public class EngineerAccessSpec {


    //capabilities of engineer is work,travel,read,write,etc


     /*TODO  Syntax : access_specifier return_type  method_name (parameter) { CODE..}
        ..
        access_specifier -> public , private , protected, default   THEORY PART
        return_type   -> output of function or method :  void : no return type
        method_name -> can be anything: it should be meaningful
        parameter ->  input parameter : optional*/

    public void WorkMethod(){
        System.out.println("This is Work Method");
    }
    public void TravelMethod(){
        System.out.println("This is Travel Methos");
    }
    public void ReadMethod(){
        System.out.println("This is Read Method");
    }
    public void WriteMethod(){
        System.out.println("This is Write Method ");
    }

    public static void main(String[] args) {

        EngineerAccessSpec obj=new EngineerAccessSpec();
        obj.WorkMethod();
        obj.TravelMethod();
        obj.ReadMethod();
        obj.WriteMethod();
    }

   }



