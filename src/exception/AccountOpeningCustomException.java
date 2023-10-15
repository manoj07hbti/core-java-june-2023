package exception;

public class AccountOpeningCustomException {

    public void account(int amount) throws LessAmountException {

        if (amount > 5000) {

            System.out.println("Welcome to BlackRock Corporation Bank pvt.ltd.");

        } else {
            throw new LessAmountException("Amount should be greater than or equal to 5000..");
        }
    }

    public static void main(String[] args) {
        AccountOpeningCustomException obj = new AccountOpeningCustomException();
        try {
            obj.account(500);
        } catch (Exception e) {
            System.out.println("Exception Occurred :" + e);
        }
    }
}
