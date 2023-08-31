package methods;


import java.util.Scanner;

public class DemoScanner {

    public void readInputString(){
        Scanner obj = new Scanner(System.in); // we have created scanner class object

        System.out.println("Please enter your name : ");
        String name= obj.nextLine(); // it reads String input and store to given variable

        System.out.println("You have entered Name as : "+name);

    }

    public void readInteger(){

        Scanner obj= new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age =obj.nextInt(); // it reads integer value and return

        System.out.println("you have entered Age as :"+age);
    }

    public void readDecimal(){
        Scanner obj= new Scanner(System.in);
        System.out.println("Please enter your salary :");
        double salary= obj.nextDouble(); // it reads decimal value and return
        System.out.println("you have entered salary as: "+salary);

    }

    public static void main(String[] args) {

        DemoScanner obj= new DemoScanner();
        obj.readInputString();
        obj.readInteger();
        obj.readDecimal();
    }
}
