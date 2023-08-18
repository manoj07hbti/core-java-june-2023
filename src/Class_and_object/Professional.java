package Class_and_object;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;

public class Professional {

    public static String Name = "Shree";
    private static double Salary = 100;
     String Company = "JIO";// it will come in default access specifier category
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

    public void Professionalmethod() {
        System.out.println("This is a Professional Method");

    }

    public void Namemethod(){
        System.out.println("The name of the professional holder is Shree");
    }
    public void Salarymethod(){
        System.out.println("The salary of Shree is 100");
    }

    public static void main(String[] args) {

        Professional obj = new Professional(); // STEP 1 OBJECT CREATED

        obj.Professionalmethod(); // STEP 2 ObjectName.MethodName();
        obj.Namemethod();
        obj.Salarymethod();

        }
}
