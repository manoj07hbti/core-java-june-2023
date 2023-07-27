
package dowhileloop;

public class EvenOddWhile {
    public static void main(String[] args) {
        //SYNTAX
        //while(condition)
        //{
        //  code
        // increment/decrement
        // }
        int num=1;
        while (num<=100)
        {
            if (num%2==0)
            {
                System.out.println("Even no is \t" +num);
            }
            num++;
        }
    }
}
