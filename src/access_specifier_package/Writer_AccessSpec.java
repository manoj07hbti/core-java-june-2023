package access_specifier_package;

public class Writer_AccessSpec {

    // capabilities of Writer are: write, publish ,Thinking,Explore etc.

    /*TODO  Syntax : access_specifier return_type  method_name (parameter) { CODE..}
        ..
    access_specifier -> public , private , protected, default   THEORY PART
    return_type   -> output of function or method :  void : no return type
    method_name -> can be anything: it should be meaningful
    parameter ->  input parameter : optional*/

    public void writeMethod() {

        System.out.println("method of write");
    }

    public void publishMethod() {
        System.out.println("method of publish");
    }

    public void exploreMethod() {
        System.out.println("method of explore");

    }

    public void thinkingMethod() {
        System.out.println("method of thinking");
    }
    public static void main(String[] args) {
        Writer_AccessSpec obj = new Writer_AccessSpec();
        obj.writeMethod();
        obj.publishMethod();
        obj.exploreMethod();
        obj.thinkingMethod();

    }
}
