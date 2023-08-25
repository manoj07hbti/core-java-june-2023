package method;

import java.util.Scanner;

public class CalcApp {

    public int add(int a,int b) {

        return a + b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public  int multiple(int a, int b){
        return a*b;
    }
    public int divide(int a,int b){
        return a/b;

    }
    public  int square(int number){
        int square = number*number;
        return square;

    }
    public double percentage(double number,double percentage){
        double per = number*10/100;
        return per;
    }
    public int cube(int number){
        int cube = number*number*number;
        return cube;
    }
    public int fact(int number ){
        int fact = 1;
        for (int i = 1; i<= number;i++){
            fact = fact*i;
        }
        return fact;
    }
        public static void main (String[]args ){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Print the value of a: ");
            int a=scanner.nextInt();
            System.out.println("Printing value of b: ");
            int b= scanner.nextInt();
            System.out.println("Please enter your choice:1 add 2 Sub 3 multiple 4 div 5 square 6 percentage 7 cube 8 fact.");

            CalcApp obj = new CalcApp();
            int choice= scanner.nextInt();
            if (choice==1){
                int result = obj.add(a,b);
                System.out.println("Addition is: "+result);
            }else if (choice ==2){
                int result = obj.sub(a,b);
                System.out.println("Subtraction is: "+result);
            }else if (choice == 3){
                int result = obj.multiple(a,b);
                System.out.println("Multiple is: "+result);

            }else if (choice == 4){
                int result = obj.divide(a,b);
                System.out.println("Divide is: "+result);
            }else if (choice == 5){
                int result = obj.square( 5 );
                System.out.println("Square of: "+result);
            }else if (choice ==6 ){
                double result = obj.percentage(600,6);
                System.out.println("Percentage is: "+result);
            }else if (choice == 7 ){
                int result = obj.cube(4);
                System.out.println("cube is:"+result);
            } else if (choice == 8) {
                int result = obj.fact(5);
                System.out.println("factorial is:"+result);
            }





        }


    }