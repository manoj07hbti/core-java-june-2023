package loops;

public class TableOfEightDoWhileLoop {
    public static void main(String[] args) {
        int number = 8;
        int i=0;
        do {
            System.out.println(number+"X"+i+" = "+number*i);
            i++;
        }while (i<=10);
    }
}
