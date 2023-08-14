package class_and_object;

public class Assingment {


    public void calculaterSum() {

        int a = 12;
        int b = 6;
        int c = (a + b);
        System.out.println("print sum :" + c);
    }

    public void calculaterdevesion() {

        int a = 12;
        int b = 6;
        int c = (a / b);
        System.out.println("print devision: " + c);
    }

    public void calculaterMulti() {

        int a = 12;
        int b = 6;
        int c = (a * b);
        System.out.println("print multi: " + c);
    }

    public void calculatrSub() {

        int a = 12;
        int b = 6;
        int c = (a - b);
        System.out.println("print sub: " + c);
    }

    public void percentage() {

        int a = 1000 * 5 / 100;
        int c = 1000 * 5 / 100;
        System.out.println("print persentage:" + c);
    }

    public void cube() {

        int a = 4;
        int b = 4;
        int c = 4;
        int d = (a * b * c);
        System.out.println("print qube:" + d);
    }

    public void primeNumber() {
int t=9;
        for (int j = 1; j <=9; j++) {

            int number = j;

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
public void factorialNumber(){

    int number=6;

    long factorial=1;

    for(int i=number; i>0; i--){

        factorial=factorial*i;//4*3*2*1=24

    }

    System.out.println("Factorial: "+factorial);



}
        public static void main (String[]args){
            Assingment obj = new Assingment();
            obj.calculaterSum();
            obj.calculaterMulti();
            obj.calculatrSub();
            obj.calculaterdevesion();
            obj.percentage();
            obj.cube();
            obj.primeNumber();
            obj.factorialNumber();

    }


    }
