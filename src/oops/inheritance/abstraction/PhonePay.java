package oops.inheritance.abstraction;

public class PhonePay implements Payment{


    @Override
    public void CheckBalance() {

        System.out.println("PhonePay: This method is to PhonePay check  balance....");

    }

    @Override
    public void doPayment() {

        System.out.println("PhonePay: This method is to PhonePay check  balance....");

    }

    @Override
    public void DigitalPayment() {

        System.out.println("This is completely DigitalPayment....");

    }

    public static void main(String[] args) {
        PhonePay obj = new PhonePay();
        obj.CheckBalance();
        obj.DigitalPayment();
    }
}
