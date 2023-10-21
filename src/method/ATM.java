package method;

import java.util.Scanner;

public class ATM {
    public double perDayAmount;

    public boolean checkPassword(String carNumber, String password) {

        if (carNumber.equals("1234") && password.equals("3333")) {

            return true;
        }

        return false;
    }

    public boolean checkPerDayLimit(double perDayAmount){

        if(perDayAmount>=50500){
            return  true;
        }
        return false;

    }

    public static void main(String[] args) {

        ATM obj= new ATM();

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


        if(obj.checkPerDayLimit(5000)){

            System.out.println("Enter amount:");
        }
    }

}

