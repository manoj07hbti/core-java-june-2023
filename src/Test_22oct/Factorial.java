package Test_22oct;

public class Factorial {

    public void factorial(){

        int i, fac=1;
        int number=5;

        for (i=1; i<=number; i++){
            fac=fac*i;
        }
        System.out.println("Factorial of given number :"+fac);
    }


    public static void main(String[] args) {
        Factorial obj=new Factorial();
        obj.factorial();
    }
}
