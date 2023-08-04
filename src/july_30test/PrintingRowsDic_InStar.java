package july_30test;

public class PrintingRowsDic_InStar {
    public static void main(String[] args) {

        for (int i =1; i <=5; i++) {
            for (int j =1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j =1-1; j >= 1; j--) {
            for (int j1 =1; j <= j; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}