package OOPs.inheritance.abstraction;

public class FourWheeler  extends Vehicle{
    public FourWheeler(String engine_no, double price, double mileage) {
        super(engine_no, price, mileage);

    }

    @Override
    public void pricing() {
        System.out.println("this is four wheeler pricing:  ");
    }

    @Override
    public void Servicing() {
        System.out.println("this is four wheeler Servicing:  ");

    }

    public static void main(String[] args) {
        FourWheeler obj=new FourWheeler("MTXZZXZX19876",576767.98,30);
        obj.vehicleInfo(obj);
        obj.pricing();
        obj.Servicing();
    }
}
