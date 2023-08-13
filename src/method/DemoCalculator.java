package method;

public class DemoCalculator {
    // method of qube:
    public void qube() {
        int qubeNumber = 4;
        int result = 4 * 4 * 4;
        System.out.println("printing is qube number  :" + result);
    }

    public void factorialNumber() {

        // method of factorial:
        int number = 5;
        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial = factorial * i;//5*4*3*2*1
        }
        System.out.println("Factorial:" + factorial);

    }
        public void calculator(){
        // calculator in use addition,subtraction,multiple,divide,Percentage:
            int a = 9;
            int b = 3;
            int result = a+b;
            System.out.println("Print Addition :"+result);

            int result1 = a-b;
            System.out.println("Printing subtraction:"+result1);

            int result2 = a*b;
            System.out.println("Printing Multiple:"+result2);

            int result3 = 9/3;
            System.out.println("Printing divide:"+result3);

            double number = 600;
            double percentage = 600 * 10 / 100;
            System.out.println("Percentage of "+number + " is " + percentage + "%");
        }
        public void percentage(){
        // Percentage:
            double number = 600;
            double percentage = 600 * 6 / 100;
            System.out.println("Percentage of "+number + " is "+ percentage + "%");

        }

        public void primeNumber() {
        // check prime number :9
            int number = 9;
            boolean isPrime = true;
            for (int i = 2; i<number; i++){
                if (number%i ==0) {
                    isPrime = true;
                }
            }
            if (isPrime){
                System.out.println("Number is prime :"+number);
            }else {
                System.out.println("Number is not prime"+number);
            }

        }
        public static void main(String args []){
            DemoCalculator demoCalculator = new DemoCalculator();
            demoCalculator.qube();
            demoCalculator.factorialNumber();
            demoCalculator.primeNumber();
            demoCalculator.calculator();
            demoCalculator.percentage();
        }

    }
