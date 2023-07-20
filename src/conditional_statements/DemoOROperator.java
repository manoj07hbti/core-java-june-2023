package conditional_statements;

public class DemoOROperator {
    public static void main(String[] args) {
        String product = "Laptop";
        double price = 150000.99;
        //1.TRUE || TRUE = TRUE
        if (product == "Laptop" || price > 140000) {
            System.out.println("True : Very high Price");

        } else {
            System.out.println("Normal Price");
        }
        //2. TRUE || FALSE = TRUE
        price = 90000;
        if (product == "Laptop" || price > 140000) {
            System.out.println("True : Very high Price");
        } else {
            System.out.println("Normal Price");
        }
        //3. FALSE || TRUE=  TRUE
        product="Desktop";
        price = 145000;
        if (product=="Laptop" || price>140000){
            System.out.println("True : Very high Price");
        } else {
            System.out.println("Normal Price");
        }
        // FALSE || FALSE= FALSE
        product="Desktop";
        price = 90000;
        if (product=="Laptop" || price>140000){
            System.out.println("True : Very high Price");
        } else
            System.out.println("Normal Price");
    }
}