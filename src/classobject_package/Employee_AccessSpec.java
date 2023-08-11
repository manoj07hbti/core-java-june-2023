package classobject_package;

public class Employee_AccessSpec {

    // capabilities of employee are: work, salary ,companyName, etc.


    /*TODO  Syntax : access_specifier return_type  method_name (parameter) { CODE..}
        ..
    access_specifier -> public , private , protected, default   THEORY PART
    return_type   -> output of function or method :  void : no return type
    method_name -> can be anything: it should be meaningful
    parameter ->  input parameter : optional*/

    public void WorkMethod() {
        System.out.println("method of work employee");
    }

    public void SalaryMethod() {
        System.out.println("method of salary employee");
    }

    public void companyNameMethod() {
        System.out.println("method of companyName");
    }

    public static void main(String[] args) {
        Employee_AccessSpec obj = new Employee_AccessSpec();
        obj.WorkMethod();
        obj.SalaryMethod();
        obj.companyNameMethod();
    }
}
