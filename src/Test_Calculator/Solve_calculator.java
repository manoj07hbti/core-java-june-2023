package Test_Calculator;

import java.util.Scanner;

public class Solve_calculator {

    public int add(int p,int q){
        return p+q;
    }
    public int sub(int p,int q){
        return p-q;
    }
    public int multiply(int p,int q){
        return p*q;
    }
    public int divide(int p,int q){
        return p/q;
    }
    public double percentage(int p,int q){
        return (double) p*q/100;
        }
        public int square(int p,int q){
        return p*p;
        }
        public int cube(int p,int q){
        return p*p*p;
        }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Solve_calculator obj=new Solve_calculator();

        String flag="y";
        while (flag=="y"||flag.equals("y")){

            System.out.println("please enter value of a:");
            int p=scanner.nextInt();

            System.out.println("please enter value of b:");
            int q=scanner.nextInt();

            System.out.println("please enter your choice: 1 add,2 sub,3 multiply,4 divide,5 percentage,6 square,7 cube");

            int choice=scanner.nextInt();

            if (choice==1){
                int result=obj.add(p,q);
                System.out.println("value of given number:"+result);
            } else if(choice==2){
                int result=obj.sub(p,q);
            } else if (choice==3){
                int result=obj.multiply(p,q);
                System.out.println("value of given number:"+result);
            } else if(choice==4){
                int result=obj.divide(p,q);
                System.out.println("value of given number:"+result);
            } else if(choice==5){
                double result=obj.percentage(p,q);
                System.out.println("value of given number:"+result);
            } else  if(choice==6){
                int result=obj.square(p,q);
                System.out.println("value of given number:"+result);
            } else if(choice==7){
                int result=obj.cube(p,q);
                System.out.println("value of given number:"+result);
            }
            System.out.println("please enter y to continue........ or any other button to exit");
            Scanner scanner1=new Scanner(System.in);
            flag=scanner1.nextLine();


        }
    }
    }

