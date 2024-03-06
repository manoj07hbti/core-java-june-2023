package opps;

public class DemoLion  extends DemoAnimals{

    public void killAnimals(){
        System.out.println("The lion kills and eats animals");

    }
    public static void main(String[] args) {

        // ON EXTENDS.
        // There is nothing in Lion class....
        // IF THE LION CLASS MAKE THE ANIMAL CLASS ITS PARENTS
        // ON CREATING PARENTS, THE DATA OF ANIMAL CLASS WILL COME TO THE LION CLASS..

        DemoLion obj = new DemoLion();
        obj.eat();
        obj.roar();
        obj.killAnimals();

    }
}
