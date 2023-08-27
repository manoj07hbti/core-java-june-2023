package Method.scanner_method;

import java.util.Scanner;

public class Calc_Scanner {

    public int Add(int m, int n) {
        return m + n;
    }

    public int Subs(int m, int n) {
        return m - n;
    }

    public int Multiply(int m, int n) {
        return m * n;
    }

    public int Division(int m, int n) {

        return m / n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        System.out.println("Please Enter Value of m :");
        int m = scanner.nextInt();
        System.out.println("Please Enter Value of n :");
        int n = scanner.nextInt();


        Calc_Scanner obj = new Calc_Scanner();


        if (choice == 1) {
            int result = obj.Add(m, n);
            System.out.println("Addition of Given Numbers is :" + result);
        } else if (choice == 2) {
            int result = obj.Subs(m, n);
            System.out.println("Subtraction of Given Numbers is :" + result);
        } else if (choice == 3) {
            int result = obj.Multiply(m, n);
            System.out.println("Multiplication of Given Numbers is :" + result);
        } else {
            int result = obj.Division(m, n);
            System.out.println("Division of Given Numbers is :" + result);
        }
    }

}












