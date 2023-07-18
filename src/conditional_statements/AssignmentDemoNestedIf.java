package conditional_statements;

public class AssignmentDemoNestedIf {
    public static void main(String[] args) {

        int number=47;

        if(number>0) {

            if (number % 2 == 0) {

                System.out.println("Given number is even number : " + number);
            } else {

                System.out.println("Given number is ODD number : " + number);
            }

        }else {

            System.out.println("Please enter valid natural number..");
        }

        int age=25;
        if (age>=18){
            System.out.println("You are Eligible for Voting");

        } else {
            System.out.println("You are not Eligible for Voting");
        }
    }

}
