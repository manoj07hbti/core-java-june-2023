package oops.inheritance.abstraction;

public class TwoWheeler extends Vehicle{
    public TwoWheeler(String vehicle_name, String engine_no, double price, double mileage) {
        super(vehicle_name, engine_no, price, mileage);
    }

    @Override
    public void pricing() {
        System.out.println("This is Two Wheeler Pricing....");

    }

    @Override
    public void servicing() {
        System.out.println("This is Two Wheeler Servicing....");

    }

    public static void main(String[] args) {
        TwoWheeler obj=new TwoWheeler("Ducati","AAA3212cc",7500000,23.3);
        obj.vehicleInfo(obj);
        obj.pricing();
        obj.servicing();
    }
}
