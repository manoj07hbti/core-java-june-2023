package Input_parameter;

public class Primenumber {

    public void findprimenumber(int number){



        int temp=0;

        for (int i=2; i<=number-1; i++){
            if (number % i==0){
                temp=temp+1;
            }
        }

        if (temp==0){
            System.out.println(number+" is prime number");
        }else{
            System.out.println(number+" is not prime number");
        }

        }

    public static void main(String[] args) {
        Primenumber prime1=new Primenumber();
        prime1.findprimenumber(17);
        prime1.findprimenumber(13);
        prime1.findprimenumber(19);
        prime1.findprimenumber(31);
        prime1.findprimenumber(41);
    }

    }

