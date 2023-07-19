package conditional_statements;

public class DemoOROperator {
    public static void main(String[] args) {

        String product="Tomato";
        double price=150.0;

      // 1.   TRUE  || TRUE = TRUE

        if(product=="Tomato" || price>100){

            System.out.println("TRUE : Very high price...");
        }
        else {
            System.out.println("Normal price...");
        }
       // 2.   TRUE  || FALSE= TRUE
         price=90.0;
        if(product=="Tomato" || price>100){

            System.out.println("TRUE : Very high price...");
        }
        else {
            System.out.println("Normal price...");
        }

      //3.   FALSE || TRUE=  TRUE

        product="Apple";
        price=200;
        if(product=="Tomato" || price>100){

            System.out.println("TRUE : Very high price...");
        }
        else {
            System.out.println("Normal price...");
        }

     //4.   FALSE || FALSE= FALSE
        product="Apple";
        price=99;
        if(product=="Tomato" || price>100){

            System.out.println("TRUE : Very high price...");
        }
        else {
            System.out.println("FALSE: Normal price...");
        }

    }
}
