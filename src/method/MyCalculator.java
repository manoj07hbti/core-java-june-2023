package method;


import java.util.Scanner;

public class MyCalculator {

    public int add(int c, int d) {
        return c + d;

    }

    public int sub(int c, int d) {
        return c - d;

    }

    public int multiple(int c, int d) {
        return c * d;

    }

    public int divide(int c, int d) {
        return c / d;
    }

    public int cube(int number) {
        int cube = number * number * number;
        return cube;
    }

    public int fact(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            int fact1 = fact * i;
        }
        return fact;

    }

    public double decimal(double per, int number) {
        double parc = number * 10 / 100;
        return parc;
    }

    public static void main(String[] args) {
        String flag = "Y";
        MyCalculator Obj = new MyCalculator();
        while (flag.equals("Y")){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter your choice: 1add. 2sub. 3multiple. 4divide. 5cube. 6fact. 7per:");
            int choice = scanner.nextInt();
            System.out.println("Please enter your value of c:");
            int c = scanner.nextInt();
            System.out.println("Please enter your value of d:");
            int d = scanner.nextInt();

            if (choice == 1) {
                int result = Obj.add(c,d);
                System.out.println("Print addition of given number : " + result);
            } else if (choice == 2) {
                int result = Obj.sub(c,d);
                System.out.println("Print subtraction: " + result);

            } else if (choice == 3) {
                int result = Obj.multiple(c,d);
                System.out.println("Print multiple: " + result);
            } else if (choice == 4) {
                int resul = Obj.divide(c,d);
                System.out.println("Print divide: " + resul);
            }else  if (choice == 5){
                int result = Obj.cube(5);
                System.out.println("cube of given number is:"+result);
            }else if (choice == 6){
                int result = Obj.fact(5);
                System.out.println("Factorial is given number of:"+result);
            }else if (choice == 7){
                double result = Obj.decimal(6,600);
                System.out.println("Print Percentage:"+result);

            }
            System.out.println("Press Y to continue.....any other kee to exit:");
            Scanner scanner1 = new Scanner(System.in);
            flag = scanner1.nextLine();
        }

    }
}