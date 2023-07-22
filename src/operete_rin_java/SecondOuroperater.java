package operete_rin_java;

public class SecondOuroperater {


    public static void main(String[] args) {

        int Price = 100;
        String bookName = "englis";
        if (Price >= 100 || bookName == "englis") {

            System.out.println("TRUE: book price is higher ");
        } else {
            System.out.println("FALSE: Price is less");
        }

        // TRUE || FALSE= TRUE,
        Price = 100;
        bookName = "biology";
        if (Price >= 100 || bookName == "englis") {

            System.out.println("TRUE: book price is higher ");
        } else {
            System.out.println("FALSE: Price is less");
        }

        //FALSE || TRUE = TRUE,

        Price = 90;
        bookName = "englis";
        if (Price >= 100 || bookName == "englis") {

            System.out.println("TRUE: book price is higher ");
        } else {
            System.out.println("FALSE: Price is less");
        }
        // FALSE || FALSE =FALSE
        Price = 90;
        bookName = "biology";
        if (Price >= 100 || bookName == "englis") {

            System.out.println("TRUE: book price is higher ");
        } else {
            System.out.println("FALSE: Price is less");
        }
        String fruit = "orange";
        int price = 120;
        if (price >= 100 || fruit == "orange") {
            System.out.println("FRUTE: price is high");
        } else {
            System.out.println("FALSE: price is normal");
        }
        // TRUE || FALSE = TRUE

        fruit = "orange";
        price = 96;
        if (price >= 100 || fruit == "orange") {
            System.out.println("FRUTE: price is high");
        } else {
            System.out.println("FALSE: price is normal");
        }
        // FALSE || TRUE = TRUE

        fruit = "mango";
        price = 120;
        if (price >= 100 || fruit == "orange") {
            System.out.println("FRUTE: price is high");
        } else {
            System.out.println("FALSE: price is normal");
        }
// FALSE || FALSE = FALSE
        fruit = "mango";
        price = 90;
        if (price >= 100 || fruit == "orange") {
            System.out.println("FRUTE: price is high");
        } else {
            System.out.println("FALSE: price is normal");
        }
        // && OPERATER TRUE && TRUE = TRUE
        int amount = 110;
        String name = "pen";

        if (amount > 100 && name == "pen") {
            System.out.println("TRUE: price is high ");

        } else {
            System.out.println("TRUE: price is good");
        }

        // TRUE && FALSE = FALSE
        amount = 110;
        name = "balpen";

        if (amount > 100 && name == "pen") {
            System.out.println("TRUE: price is high ");

        } else {
            System.out.println("FALSE: price is good");
        }
        // FALSE && TRUE = FALSE
        amount = 95;
        name = "pen";

        if (amount > 100 && name == "pen") {
            System.out.println("TRUE: price is high ");

        } else {
            System.out.println("FALSE: price is good");
        }
// FALSE && FALSE = FALSE
        amount = 95;
        name = "balpen";

        if (amount > 100 && name == "pen") {
            System.out.println("TRUE: price is high ");

        } else {
            System.out.println("FALSE: price is good");
        }
    }
}