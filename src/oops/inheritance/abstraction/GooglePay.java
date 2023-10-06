package oops.inheritance.abstraction;

public class GooglePay implements Payment{
    @Override
    public void checkBalance() {
        System.out.println("This is Google check balance method");
    }

    @Override
    public void doPayment() {
        System.out.println("This is Google doPayment  method");
    }

    public static void main(String[] args) {

        GooglePay obj= new GooglePay();
        obj.checkBalance();
    }
}
