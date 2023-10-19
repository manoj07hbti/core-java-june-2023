package oops.inheritance.abstraction;

public class FourWheeler extends Vehicle{

    public FourWheeler(String vehicle_name, String engine_no, double mileage, double price) {
        super(vehicle_name, engine_no, mileage, price);
    }

    @Override
    public void pricing() {

        System.out.println("This is FourWheeler pricing.....");

    }

    @Override
    public void servicing() {

        System.out.println("This is FourWheeler servicing.....");

    }

    public static void main(String[] args) {
        FourWheeler obj = new FourWheeler("Verna ",  "CCC34a",32.2,1500000);
        obj.vehicleDetails(obj);

        obj.pricing();
        obj.servicing();
    }
}
