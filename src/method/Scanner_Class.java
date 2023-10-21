package method;

import java.util.Scanner;

public class Scanner_Class {

    public void readInputString(){
        Scanner obj= new Scanner(System.in);//  we have created scanner class object
        System.out.println("Please enter your name:");
        String name = obj.nextLine();// it reads String input and store to given variable
        System.out.println("You have entered your name as:"+name);
    }

    public void readInteger(){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = obj.nextInt();
        System.out.println("You have entered you age:"+age);
    }
    public void readDecimal(){
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter your expected salary:");
        double salary = obj.nextDouble();
        System.out.println("You have entered your salary expected");
    }

    public static void main(String[] args) {
        Scanner_Class obj= new Scanner_Class();
        obj.readInputString();
        obj.readInteger();
        obj.readDecimal();
    }
}
