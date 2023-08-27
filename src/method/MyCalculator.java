package method;

import java.util.Scanner;

public class MyCalculator {

    public int add(int a,int b){
        return a+b;

    }
    public int sub(int a,int b){
        return a-b;

    }
    public  int multiple(int a,int b){
        return a*b;

    }
    public  int divide(int a,int b){
        return a/b;
    }
    public int cube(int number){
        int cube= number*number*number;
        return cube;
    }
    public int fact(int number){
        int fact = 1;
        for (int i = 1; i<=number; i++){
            int fact1 = fact*i;
        }
        return fact;

    }
    public double decimal(double percentage,int number){
        double parc =number*10/100;
        return parc;
    }
    public static void main(String [] args ){
        String flag = "Y";
        while (flag.equals("Y"))
            System.out.println("Please Press y");
        Scanner scanner=new Scanner(System.in);
        flag = scanner.nextLine();


        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please enter the value of a:");
        int a = scanner.nextInt();
        System.out.println("Please enter the value of b:");
        int b = scanner.nextInt();
        System.out.println("Please enter your choice 1add");

        MyCalculator obj = new MyCalculator();
        int choice = scanner.nextInt();
        if (choice == 1){
            int result =obj.add(a,b);
            System.out.println("Print addition: "+result);
        }else if (choice == 2){
            int result = obj.sub(a,b);
            System.out.println("Print subtraction: "+result);

        }else if (choice == 3){
            int result = obj.multiple(a,b);
            System.out.println("Print multiple: "+result);
        }else if (choice ==4 ){
            int resul = obj.divide(a,b);
            System.out.println("Print divide: "+resul);
        }
    }

}
