package oops.inheritance.abstraction;

public abstract class Vehicle {


    String engine_no;
    double price;
    double mileage;

    public Vehicle(String engine_no, double price, double mileage) {
        this.engine_no = engine_no;
        this.price = price;
        this.mileage = mileage;
    }

    public void vehicleInfo(Vehicle vehicle){

        System.out.println("Vehicle engine no- "+vehicle.engine_no +" Price: "+vehicle.price+" Mileage: "+vehicle.mileage);
    }


    public abstract void pricing();
    public abstract void servicing();
}
