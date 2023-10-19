package oops.inheritance.abstraction;

public abstract class Vehicle {



    String vehicle_name;

    String engine_no;

    double mileage;

    double price;

    public Vehicle(String vehicle_name, String engine_no, double mileage, double price) {
        this.vehicle_name = vehicle_name;
        this.engine_no = engine_no;
        this.mileage = mileage;
        this.price = price;
    }

    public void vehicleDetails(Vehicle vehicle){

        System.out.println("Vehicle name : "+ vehicle.vehicle_name +"engine_no :" +vehicle.engine_no +"mileage :" +vehicle.mileage +"price :" +vehicle.price);

        System.out.println(" ");
    }

    public abstract void pricing();

    public abstract void servicing();

}
