package methods;

public class DemoReturnType {

    // create a method which will provide cube of given number

    public int makeCube(int number){

        int cube=number*number*number;

        return cube;

    }

    // create a method which sends welcome message to user
//Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public String welcome(){

        return "Welcome to Java Programming : ";
    }

    public String welcomeInput(String name){

        return "Welcome to Java Programming : "+name;
    }

    public static void main(String[] args) {

        DemoReturnType obj= new DemoReturnType();

        int output =  obj.makeCube(3);

        System.out.println("Cube of given number is: "+output);

        output=obj.makeCube(2);
        System.out.println("Cube of given number is: "+output);

        String message=  obj.welcome();

        System.out.println(message);

        System.out.println(obj.welcomeInput("Mukesh"));

    }


}
