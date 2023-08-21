package methodandfunction;

public class MethdDayThree {
    public int calculateCube(int number) {

        int cube = number * number * number;
        return cube;
    }

    public boolean checkPrimeNumber(int number){

        int chk=0;
        for (int i=2;i<=number-1;i++)
        {
            while (number%i==0)
            {
                chk=chk+1;
                break;
            }
            if (chk==0)
            {
                return true;
            }
            return false;

        }
        return true;

    }
    public int findFactorial(int number)
    {

        int fact=1;
        for (int i=1;i<=number;i++)
        {
            fact=fact*i;


        }
       // System.out.println("factorial is\t"+fact);
        return fact;
    }


    public double calPercentage(int marks){
        double per=(double) marks*100/600;
        return per;

    }



    public static void main(String[] args) {
        MethdDayThree mt=new MethdDayThree();
        int ans= mt.calculateCube(3);
        System.out.println(ans);
        int ans2= mt.findFactorial(5);
        System.out.println(ans2);
        boolean ans3=mt.checkPrimeNumber(8);
        System.out.println(ans3);

        if (ans3)
        {
            System.out.println("prime");
        }
        else {
            System.out.println("nt prime");
        }

        double ans4= mt.calPercentage(387);
        System.out.println(ans4);



    }
}
