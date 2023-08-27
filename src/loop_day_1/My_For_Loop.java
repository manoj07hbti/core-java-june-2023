package loop_day_1;

public class My_For_Loop {

    public static void main(String args []){

        int i = 1;
        int rows = 5 ;
        for (int i1 = 1;i<=rows;i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        int i1 = 1;
        int rows1 = 4;

        for (int i2 = rows-1; i>=1;i--){
            for (int  j = 1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        int i3 = 1;
        int rows2 = 3;

        for (int i2 = 1; i<=rows; i++){
            for (int j1 = 1;j1<=i; j1++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
