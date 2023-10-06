package oops.inheritance.abstraction;

public class FourWheeler extends Vehicle{
    public FourWheeler(String engine_no, double price, double mileage) {
        super(engine_no, price, mileage);
    }

    @Override
    public void pricing() {
        System.out.println("This is Four wheeler pricing .....");
    }

    @Override
    public void servicing() {
        System.out.println("This is Four wheeler servicing .....");
    }

    public static void main(String[] args) {

        FourWheeler obj = new FourWheeler("FOURWHEELER ENGINE",32242332.3,12.5);

        obj.vehicleInfo(obj);
        obj.pricing();
        obj.servicing();
    }
}
