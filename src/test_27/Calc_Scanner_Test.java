package test_27;


import java.util.Scanner;

public class Calc_Scanner_Test {

    public int add(int c, int d) {
        return c + d;
    }

    public int sub(int c, int d) {
        return c - d;

    }

    public int multi(int c, int d) {
        return c * d;

    }

    public int div(int c, int d) {

        return c / d;
    }


    public static void main(String[] args) {
        String flag = "y";
        Calc_Scanner_Test obj = new Calc_Scanner_Test();
        while (flag.equals("y")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your choice:\n3.Addition\n6.subtraction\n9.multiply\n12.Division");
            int choice = scanner.nextInt();
            System.out.println("please enter your value c:");
            int c = scanner.nextInt();
            System.out.println("please enter your value d:");
            int d = scanner.nextInt();

            if (choice == 3) {
                int result = obj.add(c, d);
                System.out.println("Addition of Given Numbers is :" + result);
            } else if (choice == 6) {
                int result = obj.sub(c, d);
                System.out.println("Subtraction of Given Numbers is :" + result);
            } else if (choice == 9) {
                int result = obj.multi(c, d);
                System.out.println("Multiplication of Given Numbers is :" + result);

            } else if (choice == 12) {
                int result = obj.div(c, d);
                System.out.println("Division of Given Numbers is :"+ result);
            }
            System.out.println("press y to continue...any other key to exit");
            Scanner scanner1 = new Scanner(System.in);
            flag = scanner1.nextLine();
        }
    }
}
