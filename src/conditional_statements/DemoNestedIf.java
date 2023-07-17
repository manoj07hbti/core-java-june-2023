package conditional_statements;

public class DemoNestedIf {

    public static void main(String[] args) {

        int number=4;

        if(number>0) {

            if (number % 2 == 0) {

                System.out.println("Given number is even number : " + number);
            } else {

                System.out.println("Given number is ODD number : " + number);
            }

        }else {

            System.out.println("Please enter valid natural number..");
        }


        int age=-1;

        if(age>0){

            if(age>=18){
                System.out.println("eligible for voting ....");
            }else {
                System.out.println("Not eligible for voting...");
            }


        }


    }
}
