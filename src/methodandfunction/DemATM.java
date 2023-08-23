package methodandfunction;

import java.util.Scanner;

public class DemATM {


    public boolean checkCard(String cardNumber,String pwd){

        if (cardNumber.equals("12345") && pwd.equals("55555"))
        {
            return true;
        }return false;

    }

    public static void main(String[] args) {
        DemATM da=new DemATM();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the card number:");
        String cardNumber=scanner.nextLine();

        System.out.println("Enter the password");
        String pwd= scanner.nextLine();

        boolean result=da.checkCard(cardNumber,pwd);
        System.out.println(result);


            if (result)
            {
                System.out.println("We-come to ATM....check yur transaction");

            }
            else {
                System.out.println("Please enter yur correct card number and password");
            }
    }

    }

