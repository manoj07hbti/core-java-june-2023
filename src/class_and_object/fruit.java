package class_and_object;

public class fruit {

    String name;
    int price;
    String subName;

    public fruit(String name, int price, String subName) {
        this.name = name;
        this.price = price;
        this.subName = subName;
    }

    public static void main(String[] args) {
        fruit f1 = new fruit("mango", 100, "aam");

        System.out.println("print name:" + f1.name + " price:" + f1.price + " subName:" + f1.subName);

        fruit fruit2 = new fruit("banana", 40, "kela");

        System.out.println("fruit name:" + fruit2.name + " price: " + fruit2.price + " subName:" + fruit2.subName);

        fruit fruit3 = new fruit("apple", 200, "seb");

        System.out.println("fruit name:" + fruit3.name + " price:" + fruit3.price + "subName:" + fruit3.subName);


    }
}
