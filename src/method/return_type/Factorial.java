package method.return_type;

public class Factorial {

    public int findFactorial(int number){       //TODO<---------with input
        int fact=1;
        for (int i=2;i<=number;i++){
            fact=fact*i;
        } return fact;
    }
    public int findFactorial2(){             //TODO<-----------without input
         int fact=1;
         int number=6;
         for (int i=2;i<=number;i++){
             fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Factorial obj=new Factorial();
        System.out.println(obj.findFactorial(5));
        int output=obj.findFactorial2();
        System.out.println(output);
    }
}

