package Method.scanner_method;

import java.util.Scanner;

public class ATM_Scanner {

        public boolean ATM(String user, String pin, int amount,String name) {
            if (user.equals("2222") && pin.equals("8888")&& name.equals("Aditi")) {
                for (int i = 1; i < 2000000; i++) {
                }
                return true;

            }
            return false;
        }

        public static void main(String[] args) {
            ATM_Scanner obj = new ATM_Scanner();
            Scanner scanner= new Scanner(System.in);
            System.out.println("Please enter your name");
            String Name=scanner.nextLine();
            System.out.println("Please Enter Card Number :");
            String Card = scanner.nextLine();
            System.out.println("Please Enter your Pin ");
            String Password = scanner.nextLine();
            int Amount=2000000;
            boolean result = obj.ATM(Card, Password, Amount,Name);
            System.out.println(result);
            if (result) {
                System.out.println("Welcome to Bank ATM..........Please Select your Transaction ");
            } else {
                System.out.println("Sorry.....Incorrect Details Entered ");
            }
            boolean result1 = obj.ATM(Card, Password, Amount,Name);
            System.out.println(result1);
            System.out.println("Please Enter your Amount ");
            int Amount1 = scanner.nextInt();
            System.out.println("Transaction is Complete");
        }
    }





