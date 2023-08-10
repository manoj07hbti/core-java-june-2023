package class_and_object;

public class DemoEmploy {

    // Work:
    // Go:
    // Sleep:
    // Eat:
    // Play:
    // Fight:
    // Weep:

    // SYNTAX: Access_specifier return_type method_name (parameter) { code...}
    public void workMethod(){
        System.out.println("This is work Method. ");
    }
    public void goMethod(){
        System.out.println("This is go Method. ");
    }
    public void sleepMethod(){
        System.out.println("This is sleep Method. ");
    }
    public void eatMethod(){
        System.out.println("This is eat Method .");
    }
    public void fightMethod(){
        System.out.println("This is fight Method .");
    }
    public void playMethod(){
        System.out.println("This is play Method.");
    }
    public void weepMethod(){
        System.out.println("This is weep Method.");
    }
    public static void main(String args []){
        DemoEmploy demoEmploy = new DemoEmploy();
        demoEmploy.workMethod();
        demoEmploy.fightMethod();
        demoEmploy.eatMethod();
        demoEmploy.goMethod();
        demoEmploy.weepMethod();
        demoEmploy.playMethod();
        demoEmploy.sleepMethod();

    }
}
