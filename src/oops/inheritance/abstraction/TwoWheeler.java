package oops.inheritance.abstraction;

public class TwoWheeler extends Vehicle {

    public TwoWheeler(String vehicle_name, String engine_no, double mileage, double price) {
        super(vehicle_name, engine_no, mileage, price);
    }

    @Override
    public void pricing() {

        System.out.println("This is TwoWheeler pricing.......");

    }

    @Override
    public void servicing(){

        System.out.println("This is Four Wheeler pricing.......");

    }

    public static void main(String[] args) {

        TwoWheeler obj = new TwoWheeler("Raider","AAA2312cc",34.2,1200000);

        obj.vehicleDetails(obj);

        obj.pricing();
        obj.servicing();
    }
}
