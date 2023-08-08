package class_and_object.parameterise_constructor;

import class_and_object.Laptop;

public class MyLaptop {

    String product;
    String company;
    double price;

    // parameterised constructor:


    public MyLaptop(String product, String company, double price) {
        this.product = product;
        this.company = company;
        this.price = price;
    }

    public static void main(String args []){

        MyLaptop MyLaptop1 = new MyLaptop("Laptop","hp",40000.0);
        System.out.println("Print my product1 is:"+MyLaptop1.product+"  company: "+ MyLaptop1.company+"  price: "+ MyLaptop1.price);
        MyLaptop MyLaptop2 = new MyLaptop("  Laptop: ","  Dell: ",45000.0);
        System.out.println("Print my product2 is:"+MyLaptop2.product+"  company: "+ MyLaptop2.company+"  price: "+ MyLaptop2.price);
        MyLaptop MyLaptop3 = new MyLaptop("  Laptop: ","  Apple: ",200000.0);
        System.out.println("Print my product3 is:"+MyLaptop3.product+"  company: "+ MyLaptop3.company+"  price: "+ MyLaptop3.price);


    }
}
