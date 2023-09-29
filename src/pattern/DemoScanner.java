package pattern;

import java.util.Scanner;

public class DemoScanner {

    public void readInputString(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Please Enter the Name :");
        String Name=obj.nextLine();
        System.out.println("You have Entered Name as :"+Name);

    }
    public void readInputInteger(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Please Enter the Age :");
        int Age=obj.nextInt();
        System.out.println("You have Entered Age as :"+Age);
    }
    public void readInputDecimal(){
        Scanner obj=new Scanner(System.in);
        System.out.println("Please Enter your Salary :");
        double Salary=obj.nextDouble();
        System.out.println("You have entered Salary as :"+Salary);

    }
    public static void main(String[] args) {
        DemoScanner obj=new DemoScanner();
        obj.readInputString();
        obj.readInputInteger();
        obj.readInputDecimal();

    }
}
