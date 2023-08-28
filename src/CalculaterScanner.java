
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

    public double devidede(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CalculaterScanner obj = new CalculaterScanner();

        String flag = "y";
        while (flag == "y" || flag.equals("y")) {

            System.out.println("plese enter value of a: ");
            int a = scanner.nextInt();
            System.out.println("plese nter value of b: ");
            int b = scanner.nextInt();
            System.out.println("plese enter your choice:10 addition,20 substraction, 30 mltiply, 40 devidede");
            int Choice = scanner.nextInt();

            if (Choice == 10) {
                int result = obj.sum(a, b);
                System.out.println("addtion of given number:" + result);

            } else if (Choice == 20) {

                int result = obj.subtraction(a, b);
                System.out.println("substraction of given number:" + result);

            } else if (Choice == 30) {

                int result = obj.multiple(a, b);
                System.out.println("multiply of given number:" + result);

            } else if (Choice == 40) {

                double result = obj.devidede(a, b);

                System.out.println("devidede of given number:" + result);
            }
            System.out.println("plese press Y for contineue or .. any boton to exit");
            Scanner scanner1 = new Scanner(System.in);

            flag = scanner1.nextLine();
        }
    }


}



