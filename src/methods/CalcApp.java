package methods;

import java.util.Scanner;

public class CalcApp {

    public int add(int a, int b) {

        return a + b;
    }

    public int sub(int a, int b) {

        return a - b;
    }

    public int multi(int a, int b) {

        return a * b;
    }

    public double divide(int a, int b) {

        return (double) a / b;
    }


    public static void main(String[] args) {
        String flag = "Y";
        int choice = 0;
        int a = 0;
        int b = 0;
        CalcApp obj = new CalcApp();
        while (flag.equals("Y")) {

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Welcome to Calculator App, Please enter value of a:");
            a = scanner1.nextInt();

            System.out.println("Please enter value of b:");
            b = scanner1.nextInt();

            System.out.println("Please enter you choice: 1 Add, 2 Sub, 3 multi and 4 Divide");

            choice = scanner1.nextInt();

            if (choice == 1) {
                int result = obj.add(a, b);
                System.out.println("Addition is : " + result);
            } else if (choice == 2) {
                System.out.println("Sub is :" + obj.sub(a, b));
            } else if (choice == 3) {
                // call multi
                System.out.println("Multi: " + obj.multi(a, b));
            } else {
                System.out.println("Divide: " + obj.divide(a, b));
                // call divide
            }

            System.out.println("Please press Y to continue.... or any other button to exit ");
            Scanner scanner = new Scanner(System.in);
            flag = scanner.nextLine();
        }


    }
}
