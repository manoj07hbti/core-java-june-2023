package oops.inheritance.abstraction;

public class GooglePay implements Payment{

    @Override
    public void CheckBalance() {

        System.out.println("GooglePay: This method is to GooglePay check  balance....");

    }

    @Override
    public void doPayment() {

        System.out.println("GooglePay: This method is to GooglePay check  balance....");

    }

    @Override
    public void DigitalPayment() {

        System.out.println("This is completely DigitalPayment....");

    }

    public static void main(String[] args) {
        GooglePay obj = new GooglePay();
        obj.DigitalPayment();
        obj.CheckBalance();
    }
}
