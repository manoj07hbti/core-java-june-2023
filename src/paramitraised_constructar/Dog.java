package paramitraised_constructar;

public class Dog {

    public void name() {
        System.out.println("name is tomy");

    }

    public void barck() {

        System.out.println("dog is barking");

    }

    public void biting() {
        System.out.println("dog is baiting");
    }

    public void eating() {

        System.out.println("dog is eating");
    }

    public void sleping() {

        System.out.println("dog is slepping");
    }

    public void runing() {

        System.out.println("dog is running very fast");
    }

    public static void main(String[] args) {

        Dog obj = new Dog();
        obj.name();
        obj.eating();
        obj.barck();
        obj.biting();
        obj.sleping();
        obj.runing();


    }

}
