package methods;

import java.util.Scanner;

    public class DemoATM {

        public boolean checkPassword(String cardNumber, String password) {

            if (cardNumber.equals("1234567") && password.equals("7777")) {

                return true;
            }

            return false;
        }

        public static void main(String[] args) {

            DemoATM obj= new DemoATM();

            Scanner scanner= new Scanner(System.in);

            System.out.println("Please enter card number");
            String card= scanner.nextLine();
            System.out.println("Please enter password: ");
            String pwd=scanner.nextLine();

            boolean result=   obj.checkPassword(card,pwd);
            System.out.println(result);

            if(result){
                System.out.println("Welcome to BANK ATM...., please select your transaction");
            }else {
                System.out.println("Sorry... incorrect details entered ");
            }

        }

    }

