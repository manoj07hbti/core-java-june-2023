package methodandfunction;

public class MethdDaySecond {

        //*TODO WRITE A CODE TOO CALCULATE CUBE OOF NUMBER

        public void calculateCube (int number)
        {

            System.out.println("Cube of number is:\t"+ (number*number*number));
        }


        //*TODO WRITE A METHOD T CHECK NO IS PRIME

        public void checkPrimeNo(int number)
        {

            int count=0;
            for (int i=2;i<=number-1;i++) {
                if (number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count==0)
            {
                System.out.println("number is prime\t"+number);
            }
            else
            {
                System.out.println("number is not prime\t"+number);
            }

        }

        //*TODO WRITE A METHOD TO FIND FACTRIAL
        public void findFactorial(int number)
        {

            int fact=1;
            for (int i=1;i<=number;i++)
            {
                fact=fact*i;


            }
            System.out.println("factorial is\t"+fact);
        }

        public void calculatePercentage(int marks){

            System.out.println("percentage is\t"+(marks*100)/600);
        }


    public void calculator(int a,int b)
    {

        double result= (double)a/b;
        System.out.println("addition is:"+(a+b));
        System.out.println("subtraction is:"+(a-b));
        System.out.println("multiplication is:"+(a*b));
        // System.out.println("division is:"+(double)(a/b));
        System.out.println(+result);

    }
        public static void main(String[] args) {
            MethdDaySecond obj=new MethdDaySecond();
            obj.calculateCube(5);
            obj.checkPrimeNo(29);
            obj.findFactorial(6);
            obj.calculatePercentage(400);
            obj.calculator(6,5);
        }
    }


