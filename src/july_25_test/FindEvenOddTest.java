package july_25_test;
//WRITE CODE TO CHECK EVEN AND ODD NUMBER BETWEEN 3 TO 300
public class FindEvenOddTest {


    public static void main(String[] args) {
        int number=3;
        //methodI
        for (int i=3; i<=300; i++)
        {
            if(i%2==0)
            {
                System.out.println("* Even No is: \t" +i);
            }

            else {
                System.out.println("Odd No is : \t"  +i);
            }

        }
        System.out.println("Method II");

        System.out.println("Even Number");
        number=3;
        for (int i=3;i<=300;i++)
        {
            if (i%2==0)
            {
                System.out.println("Even No \t" +i);
            }

        }

        System.out.println("Odd Number");
        for (int i=3;i<=300;i++)
        {
            if (i%2==1)
            {
                System.out.println("Odd No \t" +i);
            }

        }
    }
}
