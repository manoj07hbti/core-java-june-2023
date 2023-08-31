package test_27_aug_method;

import java.util.Scanner;

public class CalcApp {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;

    }

    public int multiple(int a, int b) {
        return a * b;

    }

    public int divide(int a, int b) {
        return a / b;

    }

    public static void main(String[] args) {
        String flag = "y";
        CalcApp obj = new CalcApp();
        while (flag.equals("y")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your choice:\n3.Addition\n6.subtraction\n9.multiply\n12.Division");
            int choice = scanner.nextInt();
            System.out.println("please enter your value a:");
            int a = scanner.nextInt();
            System.out.println("please enter your value b:");
            int b = scanner.nextInt();

            if (choice == 3) {
                int result = obj.add(a, b);
                System.out.println("Addition of Given Numbers is :" + result);
            } else if (choice == 6) {
                int result = obj.sub(a, b);
                System.out.println("Subtraction of Given Numbers is :" + result);
            } else if (choice == 9) {
                int result = obj.multiple(a, b);
                System.out.println("Multiplication of Given Numbers is :" + result);

            } else if (choice == 12) {
                int result = obj.divide(a, b);
                System.out.println("Division of Given Numbers is :" + result);
            }
            System.out.println("press y to continue...any other key to exit");
            Scanner scanner1 = new Scanner(System.in);
            flag = scanner1.nextLine();


        }

    }
}


