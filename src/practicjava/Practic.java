package practicjava;

public class Practic {
    public static void main(String[] args) {
          int number=2;
          for(int i=1; i<=10; i++ ){
              System.out.println("2*" + i + " = " + number * i);
          }

          number=3;
          for(int i=1; i<=10; i++){
              System.out.println("3* " +i + " = " + number * i);
          }

          number=4;
          for( int i=1; i<=10; i++ ){
              System.out.println("4* " + i + " = " + number * i) ;
          }

          number=5;
          for(int i=1; i<=10; i++){
              System.out.println("5* " + i + " = " +number * i);
          }
          int i=2;
          int square=i*i;
        System.out.println("the square value of " + i + " is : " + square  );

        i=3;
        square=i*i;
        System.out.println("the square value of " + i + " is : " + square );

        i=4;
        square=i*i;
        System.out.println("the square value of " + i + " is : " +square );

        i=5;
        square=i*i;
        System.out.println("the square value of " + i + " is : " + square);

        i=6;
        int cube= i*i*i;
        System.out.println("the cube value of " + i+ " is : " +cube);

        i=7;
        cube=i*i*i;
        System.out.println("the cube value of " + i + " is : " + cube);

        i=8;
        cube=i*i*i;
        System.out.println("the cube value of " + i + " is : " + cube );
    }
}
