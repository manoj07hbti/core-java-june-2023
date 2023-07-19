package conditional_statements;

public class DemoNestedIf {
    public static void main(String[] args) {
// marks=33
        int marks = 33;

        if (marks > 30) {
            if (marks % 2 == 0) {
                System.out.println("Whoever score more than 33 are passes in test:" + marks);
            } else {
                System.out.println("If not score more then it has fail in paper:" + marks);
            }
        } else {
            System.out.println(" Please say the right marks");
        }


// product= 5000
        int Product = 5000;

        if (Product > 4000) {
            if (Product % 1 == 0) {
                System.out.println("The product is to costly:" + Product);
            } else {
                System.out.println("The product is cheap:" + Product);
            }
        } else {
            System.out.println("Put the right product value");
        }

    }
}
