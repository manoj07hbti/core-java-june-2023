package loops;

public class OddNumberDoWhileLoop {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.println("Odd Number Are :"+i);
            i++;
            i+=1;   /*<--------------------------this is key point*/
            if(i%2!=0);
        }while (i <= 100);
    }
}
