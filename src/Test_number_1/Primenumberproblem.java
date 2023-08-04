package Test_number_1;

public class Primenumberproblem {
    public static void main(String[] args) {

        int number=7;
        boolean isprime=true;

        for(int i=2; i<number; i++) {

            if (number % i == 0) {

                isprime = false;
                break;
            }
        }

                if(isprime) {
                    System.out.println("number is prime:" + number);
                }else{

                    System.out.println("number is not prime:"+ number);

                    }
                }


            }



























