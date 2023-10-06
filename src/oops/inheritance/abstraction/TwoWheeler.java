package oops.inheritance.abstraction;

public class TwoWheeler extends Vehicle{
    public TwoWheeler(String engine_no, double price, double mileage) {
        super(engine_no, price, mileage);
    }

    @Override
    public void pricing() {
        System.out.println("This is two wheeler pricing .....");
    }

    @Override
    public void servicing() {
        System.out.println("This is two wheeler servicing .....");
    }

    public static void main(String[] args) {
        TwoWheeler obj= new TwoWheeler("AXNA1213",324532.34,50);

        obj.vehicleInfo(obj);
        obj.pricing();
        obj.servicing();
    }
}
