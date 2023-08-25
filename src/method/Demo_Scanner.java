package method;

import java.util.Scanner;

public class Demo_Scanner {

    public void readInputString(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = obj.nextLine();
        System.out.println("My name is Rahul: "+name);
    }
    public  void readInteger(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = obj.nextInt();
        System.out.println("My age is: "+age);
    }
    public void readString(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter your ATM card: ");
        String ATM = obj.nextLine();
        System.out.println("My card is: "+ATM);
    }
    public  void readDecimal() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter your salary: ");
        double salary = obj.nextDouble();
        System.out.println("My salary is: " + salary);

    }

    public static void main(String args []){
        Demo_Scanner obj = new Demo_Scanner();
        obj.readInputString();
        obj.readInteger();
        obj.readString();
        obj.readDecimal();
        obj.readString();
    }
}
