package Scanner;

import java.util.Scanner;

public class Demoatm {

    public void readinputString(){

        Scanner scanner1=new Scanner(System.in);

        System.out.println("we have entered your name: ");

        String name=scanner1.nextLine();
        System.out.println("you have entered name as:"+name);



    }
    public void readinteger(){

        Scanner scanner2=new Scanner(System.in);

        System.out.println("we have enter your code: ");

        Integer password=scanner2.nextInt();
        System.out.println("you have entered your code:"+password);
    }

    public void readinteger2(){
        Scanner scanner3=new Scanner(System.in);

        System.out.println("we have enter your age: ");

        Integer age=scanner3.nextInt();
        System.out.println("you have entered your age:"+age);


    }
    public void readinputstring2(){
        Scanner scanner4=new Scanner(System.in);

        System.out.println("we have enter your city:");

        String city=scanner4.nextLine();

        System.out.println("you have entered your city:"+city);

    }

    public static void main(String[] args) {
        Demoatm atm1=new Demoatm();
        atm1.readinputString();
        atm1.readinteger();
        atm1.readinteger2();
        atm1.readinputstring2();
    }
}
