package methods;

import demo.Demo;

import java.util.Scanner;

public class DemoATM {

    public double perDayAmount;

    public boolean checkPassword(String carNumber, String password) {

        if (carNumber.equals("1234") && password.equals("3333")) {

            return true;
        }

        return false;
    }

    public boolean checkPerDayLimit(double perDayAmount){

        if(perDayAmount>=25000){
        return  true;
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


        if(obj.checkPerDayLimit(5000)){

            System.out.println("Enter amount:");
        }
    }

}
