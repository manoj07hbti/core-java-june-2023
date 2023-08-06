package class_and_object;

public class Laptop {

    String laptopName="lenovo Yoga";
    String generation=" 5th generation";
    int price= 95000;
    String rame="8th gb rame";
    int memory= 256;

    public static void main(String[] args) {
        Laptop Laptop1 = new Laptop();

        System.out.println(" print laptop name:" + Laptop1.laptopName);
        System.out.println(" print laptop generation:"+Laptop1.generation);
        System.out.println("laptop price:"+Laptop1.price);
        System.out.println("laptop rame:"+Laptop1.rame);
        System.out.println(" laptop memory:"+ Laptop1.memory);


    }

}
