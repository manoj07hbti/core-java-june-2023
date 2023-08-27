package aug_27_2023_test;

import java.util.Scanner;

public class Culappp {
    public static void main(String[] args) {
        int number, n1, n2;
        System.out.println(" 1 -add \n 2- sub \n 3- mul \n 4- div ");
        System.out.println("choice Condition : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        System.out.println("Enter First number : ");
        n1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        n2 = sc.nextInt();
        int result = 0;
        switch (number) {
            case 1:
                result = n1 + n2;
                break;
            case 2:
                result = n2 - n2;
                break;
            case 3:
                result = n1 * n2;
                break;
            case 4:
                result = n1 / n2;
                break;
            default:
                System.out.println("!!! Entered number is not valid!!!!");


        }
        System.out.println("result : " + result);

    }
}
