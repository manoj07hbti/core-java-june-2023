package methds;

import java.util.Scanner;

public class CulcuApp {
    public static void main(String[] args) {
        String flage = "y";

        while (flage.equals("y")) {


            int number, n1, n2;
            System.out.println(" 1. add \n 2. sub \n 3. mul \n 4. div");
            System.out.println("choice option : ");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            System.out.println("Enter first number ");
            n1 = sc.nextInt();
            System.out.println("Enter second number ");
            n2 = sc.nextInt();

            int Result = 0;
            switch (number) {
                case 1:
                    Result = n1 + n2;
                    System.out.println("Printing Result is : " + Result);
                    break;
                case 2:
                    Result = n1 - n2;
                    System.out.println("Printing Result is :" + Result);
                    break;
                case 3:
                    Result = n1 * n2;
                    System.out.println("Printing Result is :" + Result);
                    break;
                case 4:
                    Result = n1 / n2;
                    System.out.println("Printing Result is :" + Result);
                    break;
            }

            System.out.println("Please press y to continue.....or any other button to Exit ");
            Scanner sc1 = new Scanner(System.in);
            flage = sc1.nextLine();
        }
    }
}


