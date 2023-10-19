package OOPs.inheritance.abstraction;

public class Seller implements Customer{

    @Override
    public void product() {
        System.out.println("Customer needs 10 kg rice......");
    }

    @Override
    public void price() {
        System.out.println("Rice price is 110 /kg ....");

    }

    public static void main(String[] args) {
        Seller obj=new Seller();
        obj.product();
        obj.price();
    }
}
