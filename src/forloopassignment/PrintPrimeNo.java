package forloopassignment;

public class PrintPrimeNo {
    public static void main(String[] args) {
        int number=1;

        for (int i=1;i<=100;i++)

            if (i%2==0 && i%i==0 && i%1==0)
            {
                System.out.println("this is prime number " +i);
            }
    }
}
