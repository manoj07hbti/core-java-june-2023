package scanner;

import java.util.Scanner;

public class _1_CalculatorApp {


    public int add(int a, int b) {//TODO<---------with input and return
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please Enter Value of a :");
        int a = scanner.nextInt();
        System.out.println("Please Enter Value of b :");
        int b = scanner.nextInt();
        System.out.println("Please Enter your Choice :\n1.add\n2.sub\n3.multi\n4.div");
        int choice = scanner.nextInt();

        _1_CalculatorApp obj = new _1_CalculatorApp();


        if (choice == 1) {
            int result = obj.add(a, b);
            System.out.println("Addition of Given Numbers is :" + result);
        } else if (choice == 2) {
            int result = obj.sub(a, b);
            System.out.println("Subtraction of Given Numbers is :" + result);
        } else if (choice == 3) {
            int result = obj.multi(a, b);
            System.out.println("Multiplication of Given Numbers is :" + result);
        } else {
            double result = obj.div(a, b);
            System.out.println("Division of Given Numbers is :" + result);
        }
    }

}
