package class_and_object.Parameterized_Constructor_with_or_without_Get_Set;

public class EmployeeAccessSpec {

    //capabilities of employee is work,return,salary,etc

     /*TODO  Syntax : access_specifier return_type  method_name (parameter) { CODE..}
        ..
        access_specifier -> public , private , protected, default   THEORY PART
        return_type   -> output of function or method :  void : no return type
        method_name -> can be anything: it should be meaningful
        parameter ->  input parameter : optional*/

    public void WorkMethod(){
        System.out.println("This is Work Method");
    }
    public void ReturnMethod(){
        System.out.println("This is Return Method");
    }
    public void SalaryMethod(){
        System.out.println("This is Salary Method");
    }
    public void LoneSurvivorMethod(){
        System.out.println("This is Survivor Method");
    }

    public static void main(String[] args) {
       EmployeeAccessSpec obj=new EmployeeAccessSpec();

        obj.WorkMethod();
        obj.ReturnMethod();
        obj.SalaryMethod();
        obj.LoneSurvivorMethod();
    }
}
