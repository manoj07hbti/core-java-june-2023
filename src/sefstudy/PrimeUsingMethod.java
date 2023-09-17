package sefstudy;

public class PrimeUsingMethod { public boolean primeNo(int n)
{
    int temp=0;

    for (int no = 2; no <=n; no++)
    {
       // int temp=0;
        for (int i = 2; i <= no-1; i++) {
            while (no % i == 0) {
                temp = temp + 1;
                break;
            }
        }
    }
    if(temp!=0)

    {

        return true;
    }
    return false;
}


    public static void main(String args[])

    {
        PrimeUsingMethod pum=new PrimeUsingMethod();
        boolean result=pum.primeNo(5);
        if(result)
        {
            System.out.println("Output is 1");
        }
        else
        {
            System.out.println("Output is 0");
        }
    }


}
