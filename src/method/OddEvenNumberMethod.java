package method;

public class OddEvenNumberMethod {


    // TODO find the odd number
    // TODO  Syntax : access_specifier return_type  method_name (parameter) { CODE..}
    public void findEvenOdd() {

        int number = 6;
        if (number % 2 == 0) {
            System.out.println("Even number is found :" + number);
        } else {
            System.out.println("Odd number is found :" + number);
        }

    }

    public static void main(String[] args) {

        OddEvenNumberMethod obj = new OddEvenNumberMethod();
        obj.findEvenOdd();
    }

}