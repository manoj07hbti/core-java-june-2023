package methds;

import java.util.Scanner;

public class ATM_Machine {
    public boolean checkPassword(String cardNumber, String password) {
        if (cardNumber.equals("123456789") && password.equals("1948")) {
            System.out.println("yor are Correct card number  ");
            return true;

        }
        System.out.println(" ! wrong ");
        return false;
    }

    public static void main(String[] args) {
        ATM_Machine obj = new ATM_Machine();
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Please enter card number ");
        String card = obj1.nextLine();
        System.out.println("Please entered password " + card);
        String password = obj1.nextLine();
        boolean result = obj.checkPassword(card, password);
        System.out.println(result);
        if (result) {
            System.out.println("Welcome to Bank ATM ----> please select your transaction ");
        } else {
            System.out.println("sorry !!!!! incorrect details entered ");

        }
        int balance = 50000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Automated Teller Machine");
            System.out.println("choice 1 for Withdraw");
            System.out.println("choice 2 for Deposit");
            System.out.println("choice 3 for Check Balance ");
            System.out.println("choice 4 for EXIT ");
            System.out.print("Choose the operation you want to perform ");
            // get choice from user
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter money to be withdraw");
                    // get the withdrawal money from user
                    withdraw = sc.nextInt();
                    // check whether the balance is greater than or equal to the withdrawal amount
                    if (balance >= withdraw) {
                        balance = balance - withdraw;
                        System.out.println("please collect your money ");

                    } else {
                        // show custom error message
                        System.out.println("Insufficient Balance");

                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Enter money to be deposited ");
                    // get deposit amount from to user
                    deposit = sc.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your money has been deposited successfully ");
                    System.out.println("");
                    break;
                case 3:
                    // displaying the total balance of the user
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;
                case 4:
                    // exit from the manu
                    System.exit(0);
            }


        }
    }
}




