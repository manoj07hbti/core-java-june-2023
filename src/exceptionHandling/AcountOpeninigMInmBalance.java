package exceptionHandling;

public class AcountOpeninigMInmBalance {

    public void Acount(int Amount) throws LessAmountException {

        if (Amount < 5000) {

            throw new LessAmountException("Has customer minimum balance 5000 & equele");

        } else System.out.println("Welcome to HDFC Bank for opening Saving Account");

    }

    public static void main(String[] args) {

        AcountOpeninigMInmBalance obj = new AcountOpeninigMInmBalance();
        try {
            obj.Acount(5000);
        } catch (Exception e) {

            System.out.println("Exception occurred");
        }
    }

}
