package paramitraised_constructar;

public class Dr_class {
    public void name() {

        System.out.println("dr name is suja");
    }

    public void degrree() {

        System.out.println("Dr is MBBS, MD");
    }

    public void work() {

        System.out.println("work is patent treatment");
    }

    public void department() {
        System.out.println("departmnet is gyncology ");
    }

    public static void main(String[] args) {
        Dr_class obj = new Dr_class();

        obj.name();
        obj.degrree();
        obj.department();
        obj.work();

    }
}
