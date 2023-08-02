package operete_rin_java;

public class SecondOuroperater {


    public static void main(String[] args) {

        int Price = 100;
        String bookName = "englis";
        if (Price >= 100 || bookName == "englis") {

            System.out.println("True: book price is higher ");
        } else {
            System.out.println("True this is english book+ bookName");
        }

        // TRUE || FALSE= TRUE,
        Price = 100;
        bookName = "biology";
        if (Price > 100 || bookName == "englis") {

            System.out.println("True: book price is higher ");
        } else {
            System.out.println("False this in not english book"+bookName);
        }

        //FALSE || TRUE = TRUE,

        Price = 90;
        bookName = "englis";
        if (Price > 100 || bookName == "englis") {

            System.out.println("false: book price is low ");
        } else {
            System.out.println("true: this is english book"+bookName);
        }
        // FALSE || FALSE =FALSE
        Price = 110;
        bookName = "math";
        if (Price >= 100 || bookName == "englis") {

            System.out.println("True: book price is higher ");
        } else {
            System.out.println("False: this is not english book"+bookName);
        }
        String fruit = "orange";
        int price = 120;
        if (price >= 100 || fruit == "orrange") {
            System.out.println("false: price is high");
        } else {
            System.out.println("true: this is orrange");
        }
        // TRUE || FALSE = TRUE

        fruit = "orange";
        price = 96;
        if (price >= 100 || fruit == "orange") {
            System.out.println("true: this is orrange");
        } else {
            System.out.println("false: price is low");
        }
        // FALSE || TRUE = TRUE

        fruit = "mango";
        price = 120;
        if (price >= 100 || fruit == "orange") {
            System.out.println("False: this is orrange");
        } else {
            System.out.println("True: price is high");
        }
// FALSE || FALSE = FALSE
        fruit = "mango";
        price = 90;
        if (price >= 100 || fruit == "orange") {
            System.out.println("False: this is not orrange");
        } else {
            System.out.println("False: price is low");
        }
        // && OPERATER TRUE && TRUE = TRUE
        int amount = 110;
        String name = "pen";

        if (amount > 100 && name == "pen") {
            System.out.println("True: price is high ");

        } else {
            System.out.println("True: this is pen");
        }

        // TRUE && FALSE = FALSE
        amount = 110;
        name = "balpen";

        if (amount > 100 && name == "pen") {
            System.out.println("True: price is high ");

        } else {
            System.out.println("False: this is not pen");
        }
        // FALSE && TRUE = FALSE
        amount = 95;
        name = "pen";

        if (amount > 100 && name == "pen") {
            System.out.println("False: price is low ");

        } else {
            System.out.println("True: this is pen");
        }
// FALSE && FALSE = FALSE
        amount = 95;
        name = "balpen";

        if (amount > 100 && name == "pen") {
            System.out.println("False: price is low");

        } else {
            System.out.println("this is not pen");
        }
    }
}