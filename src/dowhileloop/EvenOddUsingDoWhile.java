package dowhileloop;

public class EvenOddUsingDoWhile {

    public static void main(String[] args) {
        int num=1;
        do{

            if (num%2==0)
            {
                System.out.println("Even no\t"+num);
            }

            num++;

        }
        while (num<=100);
    }
}
