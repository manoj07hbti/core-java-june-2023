package dowhileloop;

public class OddNoUsingWhile {
    public static void main(String[] args) {
        int num=1;
        while (num<=100)
        {
            if (num%2!=0)
            {
                System.out.println("Odd no is\t"+num);
            }
            num++;
        }
    }
}
