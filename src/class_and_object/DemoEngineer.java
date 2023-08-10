package class_and_object;

public class DemoEngineer {

    // capabilities of Engineer:

    // coding:
    // Software:
    // Money:

    // SYNTAX: Access_specifier return_type Method_name (parameter) { code...}

    public void codingMethod(){
        System.out.println("This is coding Method ");
    }
    public void softwareMethod(){
        System.out.println("This is Software Method ");
    }
    public void moneyMethod(){
        System.out.println("This is Money Method ");
    }
    public static void main(String args []){
        DemoEngineer demoEngineer = new DemoEngineer();
        demoEngineer.codingMethod();
        demoEngineer.softwareMethod();
        demoEngineer.moneyMethod();


    }
}
