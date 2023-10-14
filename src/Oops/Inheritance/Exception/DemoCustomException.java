package Oops.Inheritance.Exception;

public class DemoCustomException {

    public void MinimumBalance(double balance) throws AccountOpeningMinBalance{

        if (balance<5000){
            throw new AccountOpeningMinBalance("Amount should be greater or equal to 5000 to Open bank Account");

        } else {
            System.out.println("Welcome to account open");
        }

    }

    public static void main(String[] args) {
        DemoCustomException obj=new DemoCustomException();
        try {
            obj.MinimumBalance(4000);
        }
        catch (Exception e){
            System.out.println("Exception occurred"+e);
        }
    }
}
