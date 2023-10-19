package oops.inheritance.abstraction;

public class Paytm implements Payment {


    @Override
    public void CheckBalance() {

        System.out.println("Paytm: This method is to check Paytm balance....");

    }

    @Override
    public void doPayment() {

        System.out.println(" Paytm: This method is to check Paytm balance....");

    }

    @Override
    public void DigitalPayment() {

        System.out.println("This is completely DigitalPayment....");
    }

    public static void main(String[] args) {

        Paytm obj = new Paytm();
        obj.CheckBalance();
        obj.DigitalPayment();

    }
}
