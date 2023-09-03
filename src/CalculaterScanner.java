
import java.util.Scanner;

public class CalculaterScanner {

    public int sum(int a, int b) {

        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;

    }

    public int multiple(int a, int b) {

        return a * b;
    }

    public double divided(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalculaterScanner obj = new CalculaterScanner();

        String flag = "y";
        while (flag == "y" || flag.equals("y")) {

            System.out.println("please enter value of a: ");
            int a = scanner.nextInt();
            System.out.println("please enter value of b: ");
            int b = scanner.nextInt();
            System.out.println("please enter your choice:10 addition,20 subtraction, 30 multiply, 40 divided");
            int Choice = scanner.nextInt();

            if (Choice == 10) {
                int result = obj.sum(a, b);
                System.out.println("addition of given number:" + result);

            } else if (Choice == 20) {

                int result = obj.subtraction(a, b);
                System.out.println("subtraction of given number:" + result);

            } else if (Choice == 30) {

                int result = obj.multiple(a, b);
                System.out.println("multiply of given number:" + result);

            } else if (Choice == 40) {

                double result = obj.divided(a, b);

                System.out.println("divided of given number:" + result);
            }
            System.out.println("please press Y for continue or .. any baton to exit");
            Scanner scanner1 = new Scanner(System.in);

            flag = scanner1.nextLine();
        }
    }


}



