package scanner;

import java.util.Scanner;

public class _2_CalculatorApp {

    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public double percentage(double a, double b) {
        return a * b / 100;

    }

    public static void main(String[] args) {
        String flag = "y";

        _2_CalculatorApp obj = new _2_CalculatorApp();
        while (flag.equals("y")) {
            double a, b;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter your Choice :\n1.add\n2.sub\n3.multi\n4.div\n5.per");
            int choice = scanner.nextInt();
            System.out.println("Please Enter Value of a :");
            a = scanner.nextDouble();
            System.out.println("Please Enter Value of b :");
            b = scanner.nextDouble();


            if (choice == 1) {
                System.out.println("Addition is :" + obj.addition(a, b));
            } else if (choice == 2) {
                System.out.println("Subtraction is :" + obj.subtraction(a, b));
            } else if (choice == 3) {
                System.out.println("Multiplication is :" + obj.multiplication(a, b));
            } else if (choice == 4) {
                System.out.println("Division is :" + obj.division(a, b));

            } else
                System.out.println("Percentage is :" + obj.percentage(a, b) + "%");

            System.out.println("Press Y to continue........and any key to Exit");
            Scanner scanner1 = new Scanner(System.in);
            flag = scanner1.nextLine();
        }
    }

}
