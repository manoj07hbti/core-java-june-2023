package Exception;

public class DemoCustomerAccount {
    public void OpenAccount(double Account) throws AccountOpening {
        if (Account < 7000) {
            throw new AccountOpening("Customer Account Opening must be minimum Balance 5000Rs ");
        } else {
            System.out.println("Welcome to our bank......");
        }

    }

    public static void main(String[] args) {
        DemoCustomerAccount obj = new DemoCustomerAccount();
        try {
            obj.OpenAccount(5000);

        } catch (Exception e) {
            System.out.println("Exception Occurred " + e);
        }
    }
}
