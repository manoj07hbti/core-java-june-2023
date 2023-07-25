package july_25_test;
//WRITE TO CODE TO PRINT EVEN NUMBER BETWEEN 1 TO 100
public class EvenNoTest {
    public static void main(String[] args) {
        int number=1;
        for (int i=1; i<=100; i++)
        {
            if (i%2==0)
            {
                System.out.println("Even Number \t" +i);
            }
        }
    }
}
