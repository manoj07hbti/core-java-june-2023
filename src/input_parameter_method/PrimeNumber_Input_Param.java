package input_parameter_method;

public class PrimeNumber_Input_Param {

    public void PrimeNumber(int number) {

        boolean isPrime = true;

        for (int j = 2; j < number; j++) {


            if (number % j == 0) {

                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println("Number is Prime :" + number);
        } else {
            System.out.println("Number is NOT Prime :" + number);

        }
    }


    public static void main(String[] args) {

        PrimeNumber_Input_Param obj = new PrimeNumber_Input_Param();
        obj.PrimeNumber(1);
        obj.PrimeNumber(2);
        obj.PrimeNumber(3);
        obj.PrimeNumber(4);
        obj.PrimeNumber(5);
        obj.PrimeNumber(6);
        obj.PrimeNumber(7);
        obj.PrimeNumber(8);
        obj.PrimeNumber(9);
        obj.PrimeNumber(10);


    }

}
