package oops.inheritance.abstraction;

public abstract class Vehicle {

    String vehicle_name;
    String engine_no;
    double price;
    double mileage;

    public Vehicle(String vehicle_name, String engine_no, double price, double mileage) {
        this.vehicle_name = vehicle_name;
        this.engine_no = engine_no;
        this.price = price;
        this.mileage = mileage;
    }

    public void vehicleInfo(Vehicle vehicle) {
        System.out.println("Vehicle Name is->" + vehicle.vehicle_name + "|" + "Vehicle Engine no is->" + vehicle.engine_no + "" + "|" +
                "Vehicle Price is->" + vehicle.price + "|" + "Vehicle Mileage is->" + vehicle.mileage);
    }

    public abstract void pricing() ;
    public abstract void servicing();
}
