package loops;

public class TableOfSevenDoWhileLoop {
    public static void main(String[] args) {

        int number = 7;
        int i=1;
        do {
            System.out.println(number+"X"+i+" = "+number*i);
            i++;
        }while (i<=10);
    }
}
