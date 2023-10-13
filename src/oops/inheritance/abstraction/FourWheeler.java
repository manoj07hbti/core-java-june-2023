package oops.inheritance.abstraction;

public class FourWheeler extends Vehicle {

    public FourWheeler(String vehicle_name, String engine_no, double price, double mileage) {
        super(vehicle_name, engine_no, price, mileage);
    }

    @Override
    public void pricing() {
        System.out.println("This is Four Wheeler Pricing....");
    }

    @Override
    public void servicing() {
        System.out.println("This is Four Wheeler Servicing....");

    }

    public static void main(String[] args) {
        FourWheeler obj=new FourWheeler("MAZDA","4234AAv.2",5645555.55,13.5);
        obj.vehicleInfo(obj);
        obj.pricing();
        obj.servicing();
    }
}
