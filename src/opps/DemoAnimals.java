package opps;

public class DemoAnimals {

    public void eat(){

        System.out.println("Some Animals eat the grass");
    }

    public void roar(){
        System.out.println("All Animals Roar");
    }

    public static void main(String[] args) {
        DemoAnimals obj = new  DemoAnimals();
        obj.eat();
        obj.roar();
    }
}
