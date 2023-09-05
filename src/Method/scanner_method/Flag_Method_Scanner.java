package Method.scanner_method;

import java.util.Scanner;

public class Flag_Method_Scanner {

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

        Flag_Method_Scanner obj = new Flag_Method_Scanner();

        while (flag.equals("y")) {

            double a, b;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to calculator App : Please Enter Your Choice :\\n3.Percentage\\n5.Addition\\n10.Subtraction\\n15.Multiplication\\n20.Division\"");

            int choice = scanner.nextInt();

            System.out.println("Please Enter Value of a :");
            a = scanner.nextDouble();
            System.out.println("Please Enter Value of b :");
            b = scanner.nextDouble();

            if (choice == 1) {
                System.out.println("Percentage is :" + obj.percentage(a, b) + "%");
            } else if (choice == 2) {
                System.out.println("Addition is :" + obj.addition(a, b));
            } else if (choice == 3) {
                System.out.println("Subtraction is :" + obj.subtraction(a, b));
            } else if (choice == 4) {
                System.out.println("Multiplication is :" + obj.multiplication(a, b));
            } else if (choice == 5) {
                System.out.println("Division is :" + obj.division(a, b));
            }
            System.out.println("Press y to continue....and any key to Exit");
            Scanner scanner1 = new Scanner(System.in);
            flag = scanner1.nextLine();


        }
    }
}
