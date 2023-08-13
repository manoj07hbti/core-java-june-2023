package access_specifier_package;

public class Teacher_AccessSpec {

    // capabilities of employee are work: salary , knowledge ,travel etc.

    /*TODO  Syntax : access_specifier return_type  method_name (parameter) { CODE..}
        ..
    access_specifier -> public , private , protected, default   THEORY PART
    return_type   -> output of function or method :  void : no return type
    method_name -> can be anything: it should be meaningful
    parameter ->  input parameter : optional*/
    public void WorkMethod() {
        System.out.println("this is work method");
    }
public void SalaryMethod(){
    System.out.println("this is salary method");

}
public void knowledge(){
    System.out.println("knowledge of method");
}
public void travel(){
    System.out.println("this is method of travel");
}

public static void main(String[] args) {
        Teacher_AccessSpec obj = new Teacher_AccessSpec();
        obj.WorkMethod();
        obj.SalaryMethod();
        obj.knowledge();
        obj.travel();
    }
}
