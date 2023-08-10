package class_and_object;

public class DemoLaptop {

    // capabilities of Laptop:
    // Movie:
    // Study:
    // Earn:

    // capabilities of Laptop:
    // SYNTAX: Access_specifier return_type method_name (parameter) { code...}
    public void movieMethod(){
        System.out.println("This is Movie Method ");
    }
    public void studyMethod(){
        System.out.println("This is Study Method ");
    }
    public void earnMethod(){
        System.out.println("This is Earn Method ");
    }
    public static void main(String args []){
        DemoLaptop demoLaptop =new  DemoLaptop();
        demoLaptop.movieMethod();
        demoLaptop.studyMethod();
        demoLaptop.earnMethod();
    }
}
