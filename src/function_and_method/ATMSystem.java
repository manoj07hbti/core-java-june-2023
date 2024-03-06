package function_and_method;

import java.util.Scanner;

public class ATMSystem {
    public boolean checkPassword(String carNumber, String password) {

        if (carNumber.equals("1234") && password.equals("4444")) {

            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        ATMSystem obj= new ATMSystem();

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter card number");
        String card= scanner.nextLine();
        System.out.println("Please enter password: ");
        String pwd=scanner.nextLine();

        boolean result=   obj.checkPassword(card,pwd);
        System.out.println(result);

        if(result){
            System.out.println("Welcome to  SBI BANK * please select your transaction");
        }else {
            System.out.println("Sorry... incorrect details entered ");
        }

    }

}


