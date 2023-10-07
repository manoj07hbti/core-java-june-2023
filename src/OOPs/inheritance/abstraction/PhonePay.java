package OOPs.inheritance.abstraction;

public class PhonePay implements Payment {
    @Override
    public void checkBalance() {
        System.out.println("this is PhonePay check balance method : ");

    }

    @Override
    public void DoPayment() {
        System.out.println("this is PhonePay do payment method : ");
    }

    @Override
    public void ShowBalance() {
        System.out.println("this is PhonePay Show Balance method : ");

    }

    public static void main(String[] args) {
        PhonePay obj = new PhonePay();
        obj.checkBalance();
        obj.DoPayment();
        obj.ShowBalance();
    }
}
