package test_27august;

import java.util.Scanner;

public class Aug27Test {


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
        String Flag = "Y";
        Aug27Test obj = new Aug27Test();

        while (Flag.equals("Y")) {
            double a, b;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter Your Choice :\n8.Addition\n9.Subtraction\n10.Multiplication\n11.Division\n12.Percentage");
            int choice = scanner.nextInt();


            System.out.println("Please Enter Value of a :");
            a = scanner.nextDouble();
            System.out.println("Please Enter Value of b :");
            b = scanner.nextDouble();


            if (choice == 8) {
                System.out.println("Addition is :" + obj.addition(a, b));
            } else if (choice == 9) {
                System.out.println("Subtraction is :" + obj.subtraction(a, b));
            } else if (choice == 10) {
                System.out.println("Multiplication is :" + obj.multiplication(a, b));
            } else if (choice == 11) {
                System.out.println("Division is :" + obj.division(a, b));
            } else if (choice == 12) {
                System.out.println("Percentage is :" + obj.percentage(a, b) + "%");
            }
            System.out.println("Press Y to continue....and any key to Exit");
            Scanner scanner1 = new Scanner(System.in);
            Flag = scanner1.nextLine();
        }

    }
}
