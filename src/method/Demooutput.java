package method;

public class Demooutput {

    public int cube(int number) {

        int cube = number * number * number;

        return cube;
    }

    public String welcome() {


        return "welcome to java programing  ";
    }

    public String inputwelcome(String name) {

        return "welcome to java programing:" + name;

    }

    public int EvenOdd(int number) {

        return number;
    }
public int EvenoDD1(){

        int number=23;

        return number;
}
    public static void main(String[] args) {


        Demooutput obj = new Demooutput();

        int output = obj.cube(3);
        System.out.println("print cube:" + output);
        output = obj.cube(2);
        System.out.println("print cube:" + output);
        String Name = obj.welcome();
        System.out.println(Name);
        System.out.println(obj.cube(4));
        System.out.println(obj.inputwelcome("uday"));
        System.out.println(obj.inputwelcome("santosh"));

        int number = obj.EvenOdd(6);

        if (number % 2 == 0) {
            System.out.println("print even number:" + number);

        } else {
            System.out.println("print odd number:" + number);

        }

        }
    }
