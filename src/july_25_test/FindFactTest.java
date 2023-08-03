package july_25_test;

public class FindFactTest {
    public static void main(String[] args) {
        int num = 5;
  int fact=1;
        for (int i=num; i>0; i--)
        {
            fact=fact*i;

        }
        System.out.print(+fact);

    }
}