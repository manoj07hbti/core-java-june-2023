package dowhileloop;

public class OddNoUsingDoWhile {
    public static void main(String[] args) {
        int num=1;
        do {
         if (num%2==1 && num%2!=0)
         {
             System.out.println("Odd no: \t"+num);
         }
         num++;
        }while (num<=100);
    }
}
