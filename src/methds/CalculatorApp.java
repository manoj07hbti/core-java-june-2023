package methds;

import java.util.Scanner;

public class CalculatorApp {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("please enter number of a : ");
        int a = obj.nextInt();
        System.out.println("Please enter Number of b : ");
        int b = obj.nextInt();
        System.out.println("please enter choice : 1 add ,2 sub , 3 mul , 4 div ");
        int choice = obj.nextInt();
        if (choice == 1) {
            CalculatorApp obj1 = new CalculatorApp();

            int add = obj1.add(a, b);
            System.out.println("Addition is : " + add);

        } else if (choice == 2) {
            // call sub
            CalculatorApp obj1 = new CalculatorApp();
            int sub = obj1.sub(a, b);
            System.out.println("Subtraction is : " + sub);
        } else if (choice == 3) {
            // call mul
            CalculatorApp obj1 = new CalculatorApp();
            int mul = obj1.mul(a, b);
            System.out.println("Multiplication is : " + mul);


        } else {
            // call div
            CalculatorApp obj1 = new CalculatorApp();
            double div = obj1.div(a, b);
            System.out.println("Division is : " + div);
        }


    }
}

