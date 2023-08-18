package methds;

public class PrimeNumberInputParameter {
    public void PrimeNumber(int number) {
        for (int j = 1; j <= number; j++) {

            boolean isPrime = true;

            for (int i = 2; i < number; i++) {

                if (number % i == 0) {

                    isPrime = false;
                    break;
                }

            }

            if (isPrime) {
                System.out.println("Number is Prime :" + number);
            } else {
                System.out.println("Number is NOT Prime :" + number);
            }


        }

    }

    public void factorialNumber(int number, int factorial) {
        for (int i = number; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println(" factorial number is : " + factorial);

    }


    public static void main(String[] args) {
        PrimeNumberInputParameter obj = new PrimeNumberInputParameter();
        obj.PrimeNumber(9);
        obj.factorialNumber(4, 5);
        obj.factorialNumber(4, 4);
        obj.factorialNumber(5, 6);
        obj.factorialNumber(4, 5);
    }


}

