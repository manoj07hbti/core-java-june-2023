package methods;

import demo.Demo;

public class DemoATM {

    public boolean checkPassword(String carNumber, String password) {

        if (carNumber.equals("1234") && password.equals("3333")) {

            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        DemoATM obj= new DemoATM();

        boolean result=   obj.checkPassword("1234","3333");
        System.out.println(result);

        if(result){
            System.out.println("Welcome to BANK ATM...., please select your transaction");
        }else {
            System.out.println("Sorry... incorrect details entered ");
        }

    }

}
