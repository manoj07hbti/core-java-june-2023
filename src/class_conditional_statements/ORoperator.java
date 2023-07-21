package class_conditional_statements;

public class ORoperator {

    public static void main(String[] args) {

        String product="Tomato";
        double price=150;

        // TRUE || TRUE = TRUE

        if(product=="Tomato" || price>150){

            System.out.println("TRUE:Very high price");
        }else {
            System.out.println("Average price");
        }

        // TRUE || FALSE = TRUE

        price=90;
        if(product=="Tomato" || price>150){

            System.out.println("TRUE:Very high price");
        }else {
            System.out.println("Average price");
        }

        // FALSE || TRUE = TRUE


        product="APPLE";
        price=200;
        if(product=="Tomato" || price>150){

            System.out.println("TRUE:Very high price");
        }else {
            System.out.println("Average price");
        }

        // FALSE || FALSE = TRUE



        product="APPLE";
        price=20;

        if(product=="Tomato" || price>150){

            System.out.println("TRUE:Very high price");
        }else {
            System.out.println("FALSE:Average price");
        }
    }

}
