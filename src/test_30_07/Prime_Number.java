package test_30_07;

public class Prime_Number {
    public static void main(String[] args) {
        int i, j, chk;

        System.out.println("Printing Prime Numbers from 1 to 20");
        for(i=2; i<=20; i++)
        {
            chk = 0;
            for(j=2; j<i; j++)
            {
                if(i%j==0)
                {
                    chk++;
                    break;
                }
            }
            if(chk==0)
                System.out.println(i);
        }
    }
}
