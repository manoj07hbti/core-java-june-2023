package scanner;

import java.util.Scanner;

public class ATM_Scanner {

    public boolean ATM(String user, String pin, int amount) {
        if (user.equals("1234") && pin.equals("1209")) {
            int i = 1;
            while (i < amount) {
                i++;
            }
            return true;

        }
        return false;
    }

    public static void main(String[] args) {
        ATM_Scanner obj = new ATM_Scanner();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Card Number :");
        String Card = scanner.nextLine();
        System.out.println("Please Enter your Pin ");
        String Password = scanner.nextLine();
        int Amount=0;
        boolean result = obj.ATM(Card, Password, Amount);
        System.out.println(result);
        if (result) {
            System.out.println("Welcome to Bank ATM..........Please Select your Transaction ");
        } else {
            System.out.println("Sorry.....Incorrect Details Entered ");
        }
        boolean result1 = obj.ATM(Card, Password, Amount);
        System.out.println(result1);
        System.out.println("Please Enter your Amount ");
        int Amount1 = scanner.nextInt();
        System.out.println("Transaction is Complete");
    }
}


