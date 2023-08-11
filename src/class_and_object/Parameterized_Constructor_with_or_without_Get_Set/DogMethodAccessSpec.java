package class_and_object.Parameterized_Constructor_with_or_without_Get_Set;

public class DogMethodAccessSpec {

//capabilities for dog method are bark,walk,sleep,eat,etc...


    String name = "xyz";

   /*TODO  Syntax : access_specifier return_type  method_name (parameter) { CODE..}
        ..
        access_specifier -> public , private , protected, default   THEORY PART
        return_type   -> output of function or method :  void : no return type
        method_name -> can be anything: it should be meaningful
        parameter ->  input parameter : optional*/


    public void BarkMethod() {
        System.out.println("This is Dog Bark Method");
    }

    public void WalkMethod() {
        System.out.println("This is Dog Walk Method");
    }

    public void SleepMethod() {
        System.out.println("This is Dog Sleep Method");
    }

    public void EatMethod() {
        System.out.println("This is Dog Eat Method");
    }
    public static void main(String[] args) {


        DogMethodAccessSpec obj = new DogMethodAccessSpec();
        obj.BarkMethod();
        obj.WalkMethod();
        obj.SleepMethod();
        obj.EatMethod();
    }
}