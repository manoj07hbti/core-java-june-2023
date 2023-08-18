package methodandfunction;

public class MethodDayFirst {

    //*TODO WRITE A CODE TOO CALCULATE CUBE OOF NUMBER

    public void calculateCube ()
    {
            int number=3;
        System.out.println("Cube of number is:\t"+ (number*number*number));
    }


    //*TODO WRITE A METHOD T CHECK NO IS PRIME

    public void checkPrimeNo()
    {
        int number=19;
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
    public void findFactorial()
    {
        int number=5;
        int fact=1;
        for (int i=1;i<=number;i++)
        {
           fact=fact*i;


        }
        System.out.println("factorial is\t"+fact);
    }

    public void calculatePercentage(){
        int marks=350;
        System.out.println("percentage is\t"+(marks*100)/600);
    }

    public void calculator()
    {
        int a=8;
        int b=5;
        double result= (double)a/b;
        System.out.println("addition is:"+(a+b));
        System.out.println("subtraction is:"+(a-b));
        System.out.println("multiplication is:"+(a*b));
       // System.out.println("division is:"+(double)(a/b));
        System.out.println(+result);

    }


    public static void main(String[] args) {
        MethodDayFirst obj=new MethodDayFirst();
        obj.calculateCube();
        obj.checkPrimeNo();
        obj.findFactorial();
        obj.calculatePercentage();
        obj.calculator();
    }
}
