package conditional_statements;

public class NestesIf02ASS {

    public static void main(String[] args) {

        int number=3;
        if(number<9) {

            if (number % 1 == 0) {

                System.out.println("Given number 9 is divide by 3 : " );
            } else {

                System.out.println("Given number 9 is not divide by 3: ");
            }

        }else {

            System.out.println("Please enter valid number..");
        }

    }
    }

