package Test_Calculator;

import Input_parameter.Percentage;

import java.util.Scanner;

public class Calculator_scanner {

    public double percentage(int a, int b){
        return (double) a*b/100;
    }
    public int addition(int a,int b){
        return a+b;
    }
    public int subtraction(int a,int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Calculator_scanner obj=new Calculator_scanner();

        String flag="y";
        while (flag=="y"||flag.equals("y")) {


            System.out.println("please enter value of a:");
            int a = scanner.nextInt();

            System.out.println("please enter value of b:");
            int b = scanner.nextInt();

            System.out.println("please enter your choice: 3 percentage,5 addition,10 subtraction,15 multiply,20 divide");

            int choice = scanner.nextInt();

            if (choice == 3) {
                double result = obj.percentage(a,b);
                System.out.println("percentage of given number:"+result);
            } else if(choice==5){
                int result=obj.addition(a,b);
                System.out.println("addition of given number:"+result);
            } else if(choice==10){
                int result =obj.subtraction(a,b);
                System.out.println("subtraction of given number:"+result);
            } else if (choice==15){
                int result=obj.multiply(a,b);
                System.out.println("multiply of given number:"+result);
            } else if (choice==20){
                int result=obj.divide(a,b);
                System.out.println("divide og given number:"+result);
            }

            System.out.println("please press Y to continue....or any button to exit");
            Scanner scanner1=new Scanner(System.in);
            flag = scanner1.nextLine();


        }

    }
}
