package method;

import java.util.Scanner;

public class Test27_08_2023 {
    public int addition(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a/b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Test27_08_2023 test = new Test27_08_2023();

        String flag = "y";
        while (flag == "y" || flag.equals("y")) {


            System.out.println("please enter value of a:");
            int a = scanner.nextInt();

            System.out.println("please enter value of b:");
            int b = scanner.nextInt();

            System.out.println("please enter your choice:10 addition,20 subtraction,30 multiply,40 divide");

            int choice = scanner.nextInt();

            if
            (choice == 10) {
                int result = test.addition(a, b);
                System.out.println("addition of given number:" + result);
            } else if (choice == 20) {
                int result = test.subtraction(a, b);
                System.out.println("subtraction of given number:" + result);
            } else if (choice == 30) {
                int result = test.multiply(a, b);
                System.out.println("multiply of given number:" + result);
            } else if (choice == 40) {
                int result = test.divide(a, b);
                System.out.println("divide og given number:" + result);
            }

            System.out.println("please press Y to continue....or any button to exit");
            Scanner scanner1 = new Scanner(System.in);
            flag = scanner1.nextLine();


        }

    }
}



