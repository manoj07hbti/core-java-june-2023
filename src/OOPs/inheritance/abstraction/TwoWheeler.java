package OOPs.inheritance.abstraction;

public class TwoWheeler extends Vehicle {
    public TwoWheeler(String engine_no, double price, double mileage) {
        super(engine_no, price, mileage);
    }

    @Override
    public void pricing() {
        System.out.println("This is two wheeler pricing: ");
    }

    @Override
    public void Servicing() {
        System.out.println("This is two wheeler Servicing: ");

    }

    public static void main(String[] args) {
        TwoWheeler obj=new TwoWheeler("UPSSSTM1989",8087877.87,50.78);
        obj.vehicleInfo(obj);
        obj.pricing();
        obj.Servicing();

    }
}
