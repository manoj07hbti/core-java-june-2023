package conditional_statements;

public class Demo_nested_if {
    public static void main(String[] args) {

        int num = 30;
        if (num > 0) {
            if (num % 3 == 0) {
                System.out.println("number is divisible by 3: " + num);
            } else {
                System.out.println("number is not divisible by 3: " + num);
            }
        } else {
            System.out.println("please enter valid number");
        }
        num = 80;
        if (num > 0) {
            if (num % 8 == 0) {

                System.out.println("Number is Divisible by 8: " + num);
            } else {
                System.out.println("Number is not Divisible by 8: " + num);
            }
        } else {
            System.out.println("Please Enter Valid Number");
        }
        num = 10;
        if (num > 0) {
            if (num % 1 == 0) {

                System.out.println("Number is Divisible by 1: " + num);
            } else {
                System.out.println("Number is not Divisible by 1: " + num);
            }
        } else {
            System.out.println("Please Enter Valid Number");
        }
        num = 120;
        if (num > 0) {
            if (num % 12 == 0) {

                System.out.println("Number is Divisible by 12: " + num);
            } else {
                System.out.println("Number is not Divisible by 12: " + num);
            }
        } else {
            System.out.println("Please Enter Valid Number");
        }
        num = 150;
        if (num > 0) {
            if (num % 15 == 0) {

                System.out.println("Number is Divisible by 15: " + num);
            } else {
                System.out.println("Number is not Divisible by 15: " + num);
            }
        } else {
            System.out.println("Please Enter Valid Number");
        }

            }
        }





