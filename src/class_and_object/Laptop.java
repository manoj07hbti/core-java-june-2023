package class_and_object;

public class Laptop {

    String product = "Laptop";
    double price = 39400.00;
    String ram = "8 gb";
    String display = "15.6 Full HD ";
    String company = "Dell";

    public static void main(String args []){

        // class name object name = new class name() // default constructor

        Laptop Laptop1 = new Laptop();

        System.out.println("Printing Product name:    "+Laptop1.product);
        System.out.println("Printing Product price:   "+Laptop1.price);
        System.out.println("Printing Product ram:      "+Laptop1.ram);
        System.out.println("Printing Product display:   "+Laptop1.display);
        System.out.println("Printing Product company:   "+Laptop1.company);





    }
}
