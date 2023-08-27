package august_27_test;

import java.util.Scanner;

public class Aug27Test {


    public double addition(int a, int b) {
        return (double) a + b;
    }

    public double subtraction(int a, int b) {
        return (double) a - b;
    }

    public double multiplication(int a, int b) {
        return (double) a * b;
    }

    public double division(int a, int b) {
        return (double) a / b;
    }

    public double percentage(int a, int b) {
        return (double) a * b / 100;
    }

    public static void main(String[] args) {
        String Flag = "y";
        Aug27Test obj = new Aug27Test();

        while (Flag.equals("y")) {
            int a, b;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Enter Your Choice :\n3.Percentage\n5.Addition\n10.Subtraction\n15.Multiplication\n20.Division");
            int choice = scanner.nextInt();

            System.out.println("Please Enter Valid Number :");
            scanner.nextInt();
            System.out.println("Please Enter Value of a :");
            a = scanner.nextInt();
            System.out.println("Please Enter Value of b :");
            b = scanner.nextInt();


            if (choice == 3) {
                System.out.println("Percentage is :" + obj.percentage(a, b) + "%");
            } else if (choice == 5) {
                System.out.println("Addition is :" + obj.addition(a, b));
            } else if (choice == 10) {
                System.out.println("Subtraction is :" + obj.subtraction(a, b));
            } else if (choice == 15) {
                System.out.println("Multiplication is :" + obj.multiplication(a, b));
            } else if (choice == 20) {
                System.out.println("Division is :" + obj.division(a, b));
            }
            System.out.println("Press y to continue....and any key to Exit");
            Scanner scanner1 = new Scanner(System.in);
            Flag = scanner1.nextLine();
        }

    }
}
