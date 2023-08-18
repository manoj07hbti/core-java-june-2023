package Input_parameter;

public class Democalculator {

    public void addition(int a,int b){

        int result=a+b;

        System.out.println("sum of given number:"+result);

    }

    public void subtraction(int p,int q){

        int result=p-q;

        System.out.println("subtraction of given number:"+result);
    }

    public void multiplication(int y, int z){

        int result=y*z;

        System.out.println("multiplication of given number:"+result);
    }

    public void divide(int c, int d){

        int result=c/d;

        System.out.println("divide of given number:"+result);
    }

    public static void main(String[] args) {
        Democalculator calculator1=new Democalculator();
        calculator1.addition(9,9);
        calculator1.subtraction(8,4);
        calculator1.multiplication(7,9);
        calculator1.divide(6,3);
    }
}
