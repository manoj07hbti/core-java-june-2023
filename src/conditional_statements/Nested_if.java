package conditional_statements;

public class Nested_if {

    public static void main(String[] args) {
        // odd number
        int number = 5;

        if (number > 0) {
            if (number % 2 == 0) {

                System.out.println(" the value of number is even : " + number);

            } else {
                System.out.println(" the value of number is ood : " + number);
            }
        } else {
            System.out.println(" the value of enter the valid number : " + number);
        }
        number = 4;

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("the value of number if even : " + number);
            } else {
                System.out.println(" the value of number is odd : " + number);
            }
        } else {
            System.out.println(" Enter the valid number ");
        }
        int age = 10;
        if (age > 0) {
            if (age >= 18) {
                System.out.println("person is eligible for voting : " + age);

            } else {
                System.out.println("person is not eligible for voting : " + age);
            }
        }else{
            System.out.println("enter the valid number " );

        }
        age=22;
        if(age>0) {
            if (age >= 18) {
                System.out.println("person is eligible for voting : " + age);
            } else {
                System.out.println("person is not eligible for voting : " + age);


            }
        }else{
            System.out.println("Enter te valid number");
        }
        age=-10;
        if(age>0){
            if(age>18){
                System.out.println("person is eligile for voting : " +age);
            }else{
                System.out.println("person is not eligible for voting : " + age);
            }
        }else{
            System.out.println("Enter the valid number");
        }
        number=30;
        if(number>0) {
            if (number % 3 == 0) {
                System.out.println("number is divisible by 3 : " + number);
            } else {
                System.out.println("number is not divisible by : " + number);
            }
        }else{
            System.out.println("Enter the valid number");
        }
    }
}