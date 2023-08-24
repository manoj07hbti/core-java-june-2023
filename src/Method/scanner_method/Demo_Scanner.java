package Method.scanner_method;

import java.util.Scanner;

public class Demo_Scanner {

    public void readInputString() {

        Scanner obj = new Scanner(System.in);

        System.out.println("Please enter your Name...");
        String name = obj.nextLine();
        System.out.println("you have entered Name as..." + name);

        System.out.println("Please enter your Company name...");

        String CompanyName = obj.next();
        System.out.println("you have entered Name as..." + name);
    }

    public void readInteger(){

    Scanner obj = new Scanner(System.in);

        System.out.println("Please enter your Age....");
        int age= obj.nextInt();
        System.out.println("you have entered Age as "+age);
    }
    public void readDecimal(){

        Scanner obj= new Scanner(System.in);

        System.out.println("Please enter your Salary");
        double salary = obj.nextDouble();
        System.out.println("you have entered your salary...."+salary);
          }

    public static void main(String[] args) {

        Demo_Scanner obj = new Demo_Scanner();
        obj.readInputString();
        obj.readInteger();
        obj.readDecimal();

    }


}
