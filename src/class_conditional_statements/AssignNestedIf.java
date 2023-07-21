package class_conditional_statements;

public class AssignNestedIf {

    public static void main(String[] args) {
//1
        int num = 30;
        if (num > 0) {
            if (num % 3 == 0) {

                System.out.println("Number is Divisible by 3: " + num);
            } else {
                System.out.println("Number is not Divisible by 3: " + num);
            }
        } else {
            System.out.println("Please Enter Valid Number");
        }

//2
        num = 70;
        if (num > 0) {
            if (num % 7 == 0) {

                System.out.println("Number is Divisible by 7: " + num);
            } else {
                System.out.println("Number is not Divisible by 7: " + num);
            }
        } else {
            System.out.println("Please Enter Valid Number");
        }

//3
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

//4

        num = 40;
        if (num > 0) {
            if (num % 4 == 0) {

                System.out.println("Number is Divisible by 4: " + num);
            } else {
                System.out.println("Number is not Divisible by 4: " + num);
            }
        } else {
            System.out.println("Please Enter Valid Number");
        }

//5
        num = 50;
        if (num > 0) {
            if (num % 5 == 0) {

                System.out.println("Number is Divisible by 5: " + num);
            } else {
                System.out.println("Number is not Divisible by 5: " + num);
            }
        } else {
            System.out.println("Please Enter Valid Number");
        }

    }
}
